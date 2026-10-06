/*
============================ READ FILES ============================

Java provides different classes for reading data from files.

1. BUFFEREDREADER + FILEREADER
- Used for reading character/text files.
- BufferedReader provides efficient buffered reading.
- Especially useful for reading a file line-by-line.

Example:
BufferedReader reader =
    new BufferedReader(new FileReader(filePath));

METHODS:

readLine()
- Reads one complete line from the file.
- Returns null when the end of the file is reached.

Example:
String line;

while ((line = reader.readLine()) != null) {
    System.out.println(line);
}

---------------------------------------------------------------

2. RANDOMACCESSFILE
- Allows reading and writing data at specific positions
  in a file.
- Useful when only a particular portion of a large file
  needs to be accessed.
- Unlike normal sequential reading, the file pointer can
  move to any position.

Example:
RandomAccessFile file =
    new RandomAccessFile(filePath, "r");

MODES:

"r"
- Opens the file for reading only.

"rw"
- Opens the file for both reading and writing.

METHODS:

read()
- Reads one byte from the current file position.
- Returns -1 when the end of the file is reached.

readLine()
- Reads one line from the current file position.

seek(position)
- Moves the file pointer to a specific byte position.

getFilePointer()
- Returns the current position of the file pointer.

length()
- Returns the size of the file in bytes.

write()
- Writes data at the current file position.
- Available when the file is opened using "rw".

Example:
file.seek(10);

- Moves the pointer to byte position 10.

---------------------------------------------------------------

3. FILEINPUTSTREAM
- Reads raw BYTE data from a file.
- Mainly used for binary files.

Examples:
- Images
- Audio
- Video
- PDF
- ZIP
- Other binary data

Example:
FileInputStream input =
    new FileInputStream(filePath);

METHODS:

read()
- Reads one byte from the file.
- Returns the byte value as an int.
- Returns -1 when the end of the file is reached.

read(byte[])
- Reads multiple bytes into a byte array.

Example:
byte[] buffer = new byte[1024];
int bytesRead;

while ((bytesRead = input.read(buffer)) != -1) {
    // process bytes
}

---------------------------------------------------------------

TRY-WITH-RESOURCES:

try (BufferedReader reader =
         new BufferedReader(new FileReader(filePath))) {

    // read file
}

- Automatically closes the file after use.
- Prevents resources from remaining open.

---------------------------------------------------------------

EXCEPTION HANDLING:

FileNotFoundException
- Occurs when the requested file cannot be opened/found.

IOException
- General input/output error during file operations.

---------------------------------------------------------------

QUICK COMPARISON:

BufferedReader + FileReader
→ Text files
→ Character-based
→ Efficient line-by-line reading

RandomAccessFile
→ Read/write
→ Can access any position in a file
→ Useful for specific portions of large files

FileInputStream
→ Binary files
→ Byte-based
→ Useful for images, audio, videos, etc.

IMPORTANT:
- Reader classes → character/text data.
- InputStream classes → byte/binary data.
- RandomAccessFile → supports both reading and writing
  and allows random positioning.

===============================================================
*/

package FileHandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Read {
    public static void main(String[] args) {
        System.out.println("READ FILES\n");

        String FilePath = "D:\\ULTRON\\JAVA\\FileHandling\\text.txt";

        // 1. BufferedReader + FileReader
        try (BufferedReader r = new BufferedReader(new FileReader(FilePath)) ) {

            String line;
            System.out.println("READ BY BufferedReader + FileReader");
            
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("\n\n");
            
        }
        
        catch (FileNotFoundException e) {
            System.out.println("File not found !");
        }
        
        catch (IOException e) {
            System.out.println("Could not read file !");
        }
        
        
        
        // 3. RandomAccessFile
        try (RandomAccessFile file = new RandomAccessFile(FilePath,"r")) {
            
            System.out.println("READ BY RandomAccessFile");
            int data;

            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println("\n\n");
        }
        
        catch (IOException e) {
            System.out.println("Could not read file.");
        }



        // 3. FileInputStream
        String filePath = "D:\\ULTRON\\JAVA\\FileHandling\\data.bin";

        try (FileInputStream input = new FileInputStream(filePath)) {

            int data;
            System.out.printf("This is FileInputStream\n");
            while ((data = input.read()) != -1) {
                System.out.println(data + " ");
            }

        }
        
        catch (FileNotFoundException e) {
            System.out.println("File not found !");
        }

        catch (IOException e) {
            System.out.println("Could not read file !");
        }
    }
}
