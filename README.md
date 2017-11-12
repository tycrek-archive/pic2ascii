# pic2ascii
Java tool to display an ASCII representation of an image

## What does it do?
It takes an existing image and replaces all the pixels to ASCII characters.

## How do I run it?
1. Run `java -jar pic2ascii.jar <filename>` in your terminal, replacing `<filename>` with the actual name of your file.
2. When prompted, enter a scale value (higher value = smaller result).
3. When prompted, enter a character to represent pixels

## Can I use it as a library?
Yes! Import it into your project, then add one of these lines of code:
>`BufferedImage image1 = new P2A().getImage(String filename, String character, int scale);`

>`BufferedImage image2 = new P2A().getImage(File file, String character, int scale);`

>`BufferedImage image3 = new P2A().getImage(BufferedImage image, String character, int scale);`

Any of those will return a BufferedImage object.

## Known problems:
- Depending on the size of your image for low scale values, you may need to increase the amount of RAM available to the Java VM. A 16 megapixel image with a scale of 1 used 5.8 Gigabytes of RAM during testing, for example.
- The only characters the program is capable of saving are those available on a standard US keyboard. Characters with accents or other languages are not supported (though, if you want to contribute more characters, get a pull request and we'll make it happen).
- If your system is slow, this program will take a **very** long time for large images and/or low scale values.
- If you are using a large image with low scale values, the resulting file could have a **much** higher file size than the original.

*Read the License for any information on modifying or using it. You can pretty much do what you want, all I ask is that I (Joshua Moore) get quoted as the original author, and that you do not add payment or ads.*