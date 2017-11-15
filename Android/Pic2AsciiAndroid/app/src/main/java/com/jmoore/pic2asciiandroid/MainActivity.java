package com.jmoore.pic2asciiandroid;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int scale;
    private String abc = "";
    private static final int CAMERA_REQUEST = 1888;
    private static final int PICK_IMAGE = 1999;
    private Bitmap bitmap;

    private static int percentComplete = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());

        Button button = findViewById(R.id.button);
        Button choosePicB = findViewById(R.id.choosePictureB);
        Button confirmB = findViewById(R.id.confirmB);
        final EditText scaleET = findViewById(R.id.scaleET);
        final EditText abcET = findViewById(R.id.abcET);

        choosePicB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select an image"), PICK_IMAGE);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }
        });

        confirmB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abc = abcET.getText().toString() + abcET.getText().toString();
                scale = Integer.parseInt(scaleET.getText().toString());

                new Background(MainActivity.this).execute();
            }
        });
    }

    private File getOutputFile(String name) {
        File mediaStorageDir = new File("/storage/emulated/0/Pic2Ascii/Images");
        if(!mediaStorageDir.exists()) {
            if(!mediaStorageDir.mkdirs()) return null;
        }
        return new File(mediaStorageDir.getPath() + File.separator + name);
    }

    static void updatePercent(int percent) {
        percentComplete = percent;
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            bitmap = (Bitmap) data.getExtras().get("data");
        } else if(requestCode == PICK_IMAGE) {
            try {
                InputStream is = getApplication().getContentResolver().openInputStream(data.getData());
                bitmap = BitmapFactory.decodeStream(is);
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @SuppressWarnings("deprecation")
    class Background extends AsyncTask<String, Integer, String> {
        private ProgressDialog progressDialog;
        private int progressLength = 100;
        AlertDialog alertDialog;
        Bitmap image;

        Background(Context context) {
            progressDialog = new ProgressDialog(context);
            alertDialog = new AlertDialog.Builder(context).create();
        }

        protected void onPreExecute() {
            progressDialog.setTitle("Converting");
            progressDialog.setMessage("Converting to ASCII, please wait!");
            progressDialog.setIndeterminate(false);
            progressDialog.setMax(progressLength);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progressDialog.setCancelable(false);
            progressDialog.show();
        }

        @Override
        protected String doInBackground(String[] params) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true) {
                        progressDialog.setProgress(percentComplete);
                        if(percentComplete > 99) break;
                    }
                }
            });
            thread.start();
            image = new P2A().getImage(bitmap, abc, scale);
            if(image != null) return "0";
            else return "1";
        }

        protected void onPostExecute(String result) {
            if("0".equals(result)) {
                progressDialog.dismiss();
                String name = "ASCII_ART_" + new Random().nextInt(Integer.MAX_VALUE) + ".jpg";
                File f = getOutputFile(name);
                try(FileOutputStream fos = new FileOutputStream(f)) {
                    image.compress(Bitmap.CompressFormat.JPEG, 100, fos);
                    System.out.println("File has been saved.");
                } catch (Exception ex) {
                    System.out.println("File failed to save!");
                    ex.printStackTrace();
                }

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.fromFile(f), "image/jpeg");
                startActivity(intent);
            } else {
                alertDialog.setTitle("Error");
                alertDialog.setMessage("An error occurred, but I don't know what happened.");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        }
    }
}