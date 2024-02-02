import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintAsciiToFile {

  public static void main(String[] args) throws IOException {
  //  FileInputStream fw = new FileInputStream("ascii.txt");
    FileOutputStream pw = new FileOutputStream("ascii.txt");

    for (int i = 0; i < 128; i++) {
      pw.write((char) i+" ");
    }

    pw.close();
    fw.close();
  }
}
