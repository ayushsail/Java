/*
=========================== WRITE FILES ===========================

Java provides different classes for writing data into files.

1. FILEWRITER
- Writes character/text data to a file.
- Suitable for small or medium-sized text files.

Syntax:
FileWriter writer = new FileWriter(filePath, append);

append:
- false → overwrite existing content.
- true  → append content to the end of the file.

Example:
FileWriter writer = new FileWriter(filePath, false);

---------------------------------------------------------------

FILEWRITER METHODS:

write(String)
- Writes the given text into the file.

Example:
writer.write("Hello Java");

---------------------------------------------------------------

2. BUFFEREDWRITER
- Writes text using an internal buffer.
- Useful when writing large amounts of text or many lines.
- Commonly used together with FileWriter.

Example:
BufferedWriter writer =
    new BufferedWriter(new FileWriter(filePath, true));

METHODS:

write(String)
- Writes text to the buffer.

newLine()
- Writes a platform-specific line separator.

flush()
- Forces buffered data to be written immediately.
- Usually not necessary before close() when using
  try-with-resources.

---------------------------------------------------------------

3. PRINTWRITER
- Convenient for writing formatted and structured text.
- Similar to System.out for file output.
- Useful for reports, logs, and formatted data.

Example:
PrintWriter writer =
    new PrintWriter(new FileWriter(filePath, true));

METHODS:

print()
- Writes data without automatically adding a new line.

println()
- Writes data and then moves to the next line.

printf()
- Writes formatted output using format specifiers.

Example:
writer.printf("Price: %.2f%n", price);

---------------------------------------------------------------

4. FILEOUTPUTSTREAM
- Writes raw BYTE data instead of characters.
- Mainly used for binary files.

Examples:
- Images
- Audio
- Video
- PDF
- ZIP
- Other binary data

Example:
FileOutputStream output =
    new FileOutputStream(filePath);

METHODS:

write(byte[])
- Writes an entire byte array to the file.

write(int)
- Writes one byte to the file.

---------------------------------------------------------------

TRY-WITH-RESOURCES:

try (FileWriter writer = new FileWriter(filePath)) {
    writer.write("Hello");
}

- Automatically closes the resource after use.
- Works with classes that implement AutoCloseable/Closeable.
- Prevents resources from remaining open accidentally.

---------------------------------------------------------------

EXCEPTION HANDLING:

IOException
- May occur during file input/output operations.
- Commonly handled using try-catch.

Example:
catch (IOException e) {
    System.out.println("File operation failed.");
}

---------------------------------------------------------------

QUICK COMPARISON:

FileWriter
→ Simple character/text writing.

BufferedWriter
→ Buffered text writing; useful for large/repeated writes.

PrintWriter
→ Convenient formatted/structured text writing.

FileOutputStream
→ Raw byte/binary file writing.

IMPORTANT:
- FileWriter / BufferedWriter / PrintWriter → mainly TEXT.
- FileOutputStream → mainly BINARY DATA.
- true in FileWriter → append mode.
- false in FileWriter → overwrite mode.

===============================================================
*/

package FileHandling;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Write {
    public static void main(String[] args) {
        System.out.println("WRITE FILES\n");

        String FilePath = "D:\\ULTRON\\JAVA\\FileHandling\\text.txt";

        // 1. FileWriter
        try (FileWriter w = new FileWriter(FilePath,false)) {       // false -> overwrite existing content

            w.write("Hello World !!\nMy name is Ayush Sail.\nThis is FileWriter");
            System.out.println("File has been written.");
        }
        
        catch (FileNotFoundException e) {
            System.out.println("File not found !");
        }
        
        catch (IOException e) {
            System.out.println("Could not write file !");
        }
        
        

        // 2. BufferedWriter + FileWriter
        try (BufferedWriter w = new BufferedWriter(new FileWriter(FilePath, true))) {       // true -> don't overwrite existing content
            w.newLine();
            w.newLine();
            w.write("Hello World !!");
            w.newLine();
            w.write("My name is Ayush Sail.");
            w.newLine();
            w.write("This is BufferedWriter");
            System.out.println("File has been written.");
            
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found !");
        }

        catch (IOException e) {
            System.out.println("Could not write file !");
        }
        


        // 3. PrintWriter + FileWriter
        try (PrintWriter w = new PrintWriter(new FileWriter(FilePath, true))) {         // true -> don't overwrite existing content
            w.println("\n\nHello World !!");
            w.printf("My name is Ayush Sail\n");
            w.print("This is PrintWriter\n");
            System.out.println("File has been written.");
            
        }
        
        catch (IOException e) {
            System.out.println("Could not write file !");
        }



        // 4. FileOutputStream 
        String filePath = "D:\\ULTRON\\JAVA\\FileHandling\\data.bin";

        try (FileOutputStream output =
                     new FileOutputStream(filePath)) {

            byte[] data = {65, 66, 67, 68, 69};

            output.write(data);

            System.out.println("Binary data written.");
        }

        catch (IOException e) {
            System.out.println("Could not write file.");
        }
    }

}
