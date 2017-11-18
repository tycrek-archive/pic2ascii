# pic2ascii
Java tool to display an ASCII representation of an image

## What does it do?
It takes an existing image and replaces all the pixels to ASCII characters.

## How do I run it?
1. Run `java -jar pic2ascii.jar <filename>` in your terminal, replacing `<filename>` with the actual name of your file.
2. When prompted, enter 0 (benchmark), 1 (single thread), or 2 (multi thread).
3. When prompted, enter a scale value (higher value = smaller result).
4. When prompted, enter a character to represent pixels

## Examples
The first image is the original image (a mammoth). The second image is a converted image with a scale of 3 and using the M character. If you zoom in on the second image, you can see all the M's that make up the image.

<img src="http://roastytoasty.mooo.com/pic2ascii/mammoth.jpg" width=500>

<img src="http://roastytoasty.mooo.com/pic2ascii/mammoth.jpg_ASCII_M_0.jpg" width=500>

## Can I use it as a library?
Yes. Import it into your project, then add one of these lines of code:
>`BufferedImage image1 = new P2A().getImage(String filename, String character, int scale, boolean multi);`

>`BufferedImage image2 = new P2A().getImage(File file, String character, int scale, boolean multi);`

>`BufferedImage image3 = new P2A().getImage(BufferedImage image, String character, int scale, boolean multi);`

Any of those will return a BufferedImage object. The 'multi' parameter is whether or not to multithread.

## Known problems:
- Depending on the size of your image for low scale values, you may need to increase the amount of RAM available to the Java VM. A 16 megapixel image with a scale of 1 used 5.8 Gigabytes of RAM during testing, for example.
- The only characters the program is capable of saving are those available on a standard US keyboard. Characters with accents or other languages are not supported (though, if you want to contribute more characters, get a pull request and we'll make it happen).
- If your system is slow, this program will take a **very** long time for large images and/or low scale values.
- If you are using a large image with low scale values, the resulting file could have a **much** higher file size than the original.
- Some characters won't save in filenames due to operating system / file system restrictions. In these cases, a random file name will be generated.

*Read the License for any information on modifying or using it. You can pretty much do what you want, all I ask is that I (Joshua Moore) get quoted as the original author, and that you do not add payment or ads.*