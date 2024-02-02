import java.io.*;
public class FilePermission
{
    public static void main(String args[])throws IOException
    {
        File file=new File("input.txt");
        new File("input").mkdir();
        FileWriter writer=new FileWriter(file);
        String data="hai";
        writer.write(data);
        file.setReadable(true);
        file.setExecutable(true);
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        File dir=new File("/home/zoho/jrani/FileHandling/input");
        File tempFile=File.createTempFile("inputFile",".txt",dir);
    }
}
