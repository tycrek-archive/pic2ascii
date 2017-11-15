import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Picker extends JFrame {

    private JTextField redTF, greenTF, blueTF;
    private JLabel redL, greenL, blueL, colorL;
    private JButton button;
    private BufferedImage color = new BufferedImage(200,200, BufferedImage.TYPE_INT_RGB);

    private Picker() {
        super("Color Picker");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new GridBagLayout());

        Color  col1 = new Color(128, 128, 128);
        for(int x = 0; x < color.getWidth(); x++) {
            for(int y = 0; y < color.getHeight(); y++) {
                color.setRGB(x, y, col1.getRGB());
            }
        }

        GridBagConstraints c = new GridBagConstraints();

        redL = new JLabel("Red");
        greenL = new JLabel("Green");
        blueL = new JLabel("Blue");
        colorL = new JLabel(new ImageIcon(color));

        redTF = new JTextField("128");
        greenTF = new JTextField("128");
        blueTF = new JTextField("128");

        button = new JButton("Change Color");

        c.gridx = 1; c.gridy = 0;
        add(colorL, c);

        c.gridx = 0; c.gridy = 1;
        add(redL, c);
        c.gridx = 1;
        add(greenL, c);
        c.gridx = 2;
        add(blueL, c);

        c.gridx = 0; c.gridy = 2;
        add(redTF, c);
        c.gridx = 1;
        add(greenTF, c);
        c.gridx = 2;
        add(blueTF, c);

        c.gridx = 1; c.gridy = 3;
        add(button, c);

        button.addActionListener(e -> {
            Color col = new Color(Integer.parseInt(redTF.getText()), Integer.parseInt(greenTF.getText()), Integer.parseInt(blueTF.getText()));
            for(int x = 0; x < color.getWidth(); x++) {
                for(int y = 0; y < color.getHeight(); y++) {
                    color.setRGB(x, y, col.getRGB());
                }
            }
            colorL.setIcon(new ImageIcon(color));
        });
    }

    public static void main(String[] args) {
        new Picker().setVisible(true);
    }
}
