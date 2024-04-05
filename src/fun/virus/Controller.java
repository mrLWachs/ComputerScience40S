
/** Required package class namespace */
package fun.virus;

/** Required API imports */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;


/**
 * Controller.java - the controller class to run the logic behind the UI for 
 * the virus we are making
 *
 * @author Mr. Wachs
 * @since Mar 1, 2024, 11:31:34 a.m.
 */
public class Controller
{

    private final int    MAX   = 10;
    private final String VIRUS = "WACHS RULES---";

    
    /**
     * Default constructor, set class properties
     * 
     * @param virus the UI connected to this controller
     */
    public Controller(Virus virus) {
        virus.setLocationRelativeTo(null);
        virus.setResizable(false);
    }

    /**
     * The click action associated with the UI button
     */
    public void click() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.showOpenDialog(null);
        File selectedDirectory = chooser.getCurrentDirectory();
        if (selectedDirectory.isDirectory()) {
            String directory      = getDirectory(chooser);
            File   finalDirectory = new File(directory);
            File[] files          = finalDirectory.listFiles();
            int    filesCount     = countAllFiles(files);
            if (filesCount == 0)  createFiles(directory);
            else                  renameFiles(files);     
            System.exit(0);
        }
    }
    
    /**
     * Get the file system directory to deploy the virus inside
     * 
     * @param chooser the dialog for choosing the directory
     * @return the path to the directory on the file system
     */
    private String getDirectory(JFileChooser chooser) {
        File   directory = chooser.getCurrentDirectory();
        File   folder    = chooser.getSelectedFile();
        String path      = directory.getAbsolutePath();
        String name      = folder.getName();
        String completed = path + File.separator + name + File.separator;
        return completed;
    }

    /**
     * Renames all the files in the passed array to concatenate the "virus"
     * onto the prefix of the file names
     * 
     * @param files the array of all file names in the directory
     */
    private void renameFiles(File[] files) {
        for (File file : files) {
            if (!file.isDirectory()) {
                String currentPath = file.getParent() + File.separator;
                String currentFile = file.getName();
                String newName     = VIRUS + currentFile;
                String filename    = currentPath + newName;
                file.renameTo(new File(filename));                
                //file.delete();
            }
        }
    }

    /**
     * Creates a set number of "dummy" virus files into the empty directory
     * 
     * @param directory the directory on the file system to add files into
     */
    private void createFiles(String directory) {
        try {
            for (int i = 1; i <= MAX; i++) {
                String      name     = VIRUS + i + ".txt";
                String      filename = directory + name;
                FileWriter  stream   = new FileWriter(filename);
                PrintWriter file     = new PrintWriter(stream);
                int         bigMax   = (int)(Math.pow(2, MAX));
                for (int j = 1; j <= bigMax; j++) {
                    file.print(VIRUS);
                }
                file.close();
            }
        } catch (IOException ex) {
            System.out.println("Error " + ex.toString());
        }
    }

    /**
     * Counts all the files (it does not count any sub-directories) in the 
     * directory on the file system from the array of file names
     * 
     * @param files the array of file names to count from
     * @return the total number of files (not directories) in the array
     */
    private int countAllFiles(File[] files) {
        int count = 0;
        for (File file : files) {
            if (!file.isDirectory()) {
                count++;
            }
        }
        return count;
    }
    
}