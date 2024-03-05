
package fun.virus;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;



class Controller
{

    private final int    MAX   = 10;
    private final String VIRUS = "WACHS RULES---";
    
    
    public Controller(Virus virus) {
        virus.setLocationRelativeTo(null);
        virus.setResizable(false);
    }

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
    
    private String getDirectory(JFileChooser chooser) {
        File   directory = chooser.getCurrentDirectory();
        File   folder    = chooser.getSelectedFile();
        String path      = directory.getAbsolutePath();
        String name      = folder.getName();
        String completed = path + File.separator + name + File.separator;
        return completed;
    }

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