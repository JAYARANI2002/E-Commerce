import java.io.FileDescriptor;
import java.io.FileOutputStream;


public class MainProgram{
    public static void main(String[] args) throws Exception {
        FileOutputStream os = new FileOutputStream("Nofilename");
        FileDescriptor fd = os.getFD();
        os.write(1);
        os.flush();
        fd.sync();
    }
}
