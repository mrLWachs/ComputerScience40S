/** Required package class namespace */
package testing.extras.more;



import collections.LinkedList;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import testing.extras.searching.Search;
import testing.extras.sorting.Sort;
import testing.extras.storage.FileHandler;
import testing.extras.utility.Dialogs;

 
/**
 * LogicController.java - description
 *
 * @author Mr. Wachs
 * @since Dec. 19, 2024
 */
public class LogicController
{
    
    private JList<String> pointsList;
    private JPanel        pointsPanel;
    private JScrollPane   pointsScrollPane;
    private JSpinner      pointsSpinner;
    private JSpinner      threadTimeSpinner;
    private JList<String> threadsList;
    private JScrollPane   threadsScrollPane;
    private GUI           gui;
    
    private DefaultListModel<String> pointsListModel;
    private DefaultListModel<String> threadsListModel;
    
    
    private GraphLogic graph;
    private ThreadMaker threads;
    private FileHandler file;
    private Dialogs dialog;
    private Sort sort;
    private Search search;
    private TreeMaker trees;
    
    private int pointsSelected;
    private String point1;
    private String point2;
    
    
    /**
     * Default constructor, set class properties
     */
    public LogicController(
            JList<String> pointsList, 
            JPanel        pointsPanel, 
            JScrollPane   pointsScrollPane, 
            JSpinner      pointsSpinner, 
            JSpinner      threadTimeSpinner, 
            JList<String> threadsList, 
            JScrollPane   threadsScrollPane, 
            GUI           gui) {
        this.pointsList        = pointsList;
        this.pointsPanel       = pointsPanel;
        this.pointsScrollPane  = pointsScrollPane;
        this.pointsSpinner     = pointsSpinner;
        this.threadTimeSpinner = threadTimeSpinner;
        this.threadsList       = threadsList;
        this.threadsScrollPane = threadsScrollPane;
        this.gui               = gui;        
        pointsListModel  = new DefaultListModel<>();
        threadsListModel = new DefaultListModel<>();  
        pointsList.setModel(pointsListModel);
        threadsList.setModel(threadsListModel); 
        pointsSelected   = 0;
        graph            = new GraphLogic(pointsPanel,pointsScrollPane,pointsList,pointsListModel);    
        threads          = new ThreadMaker(threadsScrollPane,threadsList,threadsListModel);
        trees            = new TreeMaker(pointsPanel);
        file             = new FileHandler();
        dialog           = new Dialogs("Extras", gui);
        sort             = new Sort();
        search           = new Search();             
        gui.setSize(1225, 650);
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
    }

    public void enterButton() {
        int points = (int) pointsSpinner.getValue();
        if (points <= 0) {
            JOptionPane.showMessageDialog(gui, 
                    "Please enter the number of points to plot",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
        else {
            graph.plot(points);
        }
    }

    public void calculatePathButton() {
        JOptionPane.showMessageDialog(gui, 
                    "Please select the first point from the list of points",
                    "Select",JOptionPane.INFORMATION_MESSAGE);
        pointsSelected++;
    }

    public void pointsListMouse() {
        String value = pointsList.getSelectedValue().toString();
        if (value == null || value.equals("")) {
            JOptionPane.showMessageDialog(gui, 
                    "Please start over!", "Error", JOptionPane.ERROR_MESSAGE);
            pointsSelected = 0;
        }
        else {
            if (pointsSelected == 1) {
                point1 = value;
                pointsSelected++;
            }
            else if (pointsSelected == 2) {
                point2 = value;  
                pointsSelected = 0;
                String results = graph.getSortestPath(point1, point2);
                JOptionPane.showMessageDialog(gui,results,"Results",
                        JOptionPane.INFORMATION_MESSAGE);
            }            
        }
    }
    
    public void sortListButton() {
        LinkedList<Point> allPoints = graph.getAllPoints();
        sort.quick(allPoints);
        pointsList.removeAll();        
        for (int i = 0; i < allPoints.size(); i++) {
            pointsListModel.addElement(allPoints.get(i).toString());
        }
    }

    public void searchListButton() {
        LinkedList<Point> allPoints = graph.getAllPoints();
        String name = JOptionPane.showInputDialog(gui, 
                "Please enter the name of the point to search for", 
                "Search", JOptionPane.QUESTION_MESSAGE);
        if (name != null || !name.equals("")) {
            int index = search.linear(name, allPoints);
            JOptionPane.showMessageDialog(gui,
                        name + "found at index " + index,"Results",
                        JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void saveListButton() {
        LinkedList<Point> allPoints = graph.getAllPoints();
        File saveFile = dialog.saveFile(gui);
        if (saveFile != null) file.saveObject(allPoints, saveFile);
    }

    public void openListButton() {
        File openFile = dialog.openFile(gui);
        if (openFile != null) {
            LinkedList<Point> allPoints = (LinkedList<Point>)
                    file.openObject(openFile);
            graph.plot(allPoints);
        }
    }

    public void createThreadButton() {
        int time = (int) threadTimeSpinner.getValue();
        if (time <= 0) {
            JOptionPane.showMessageDialog(gui, 
                    "Please enter a time for the thread",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
        else {
            threads.create(time);
        }
    }

    public void stopThreadsButton() {
        threads.stopAll();
    }
    
    public void createTreeButton() {
        int choice = JOptionPane.showConfirmDialog(gui, 
                "Are you sure you want to clear the points and "
              + "build a random binary tree?", "Confirm?",
              JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) trees.build();
    }

    public void learnPythonButton() {
        final String SITES[] = {
            "https://www.learnpython.org/",
            "https://www.udemy.com/",
            "https://brilliant.org/",
            "https://try.codecademy.com/"
        };
        try {
            for (String site : SITES) {
                URI uri = new URI(site);
                java.awt.Desktop.getDesktop().browse(uri);
            }
        } 
        catch (URISyntaxException ex) {
            JOptionPane.showMessageDialog(gui, "Syntax error in URL",
                    "Error",JOptionPane.ERROR_MESSAGE);
        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(gui, "Input/output error",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
    }

}