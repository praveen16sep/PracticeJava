import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;

//Use File Chooser (Optional Debug Tool)
//If you're still stuck, use a FileDialog to pick the file at runtime:
public class FileChooserDebug {
	
    public static void main(String[] args) {
        FileDialog dialog = new FileDialog((Frame) null, "Select input.txt");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);

        String file = dialog.getFile();
        String dir = dialog.getDirectory();

        File selectedFile = new File(dir + file);
        System.out.println("Selected: " + selectedFile.getAbsolutePath());
        System.out.println("Exists: " + selectedFile.exists());
    }
}