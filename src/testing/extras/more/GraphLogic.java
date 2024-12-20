/** Required package class namespace */
package testing.extras.more;

/** Required API imports */
import collections.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

 
/**
 * GraphLogic.java - description
 *
 * @author Mr. Wachs
 * @since Dec. 19, 2024
 */
public class GraphLogic 
{

    private JPanel                   pointsPanel;
    private JScrollPane              pointsScrollPane;
    private JList<String>            pointsList;
    private DefaultListModel<String> pointsListModel;
    private LinkedList<Point>        allPoints;
    
    
    /** 
     * Constructor method, sets class properties and connects parameters to 
     * class properties
     * 
     * @param pointsPanel
     * @param pointsScrollPane
     * @param pointsList
     * @param pointsListModel 
     */
    public GraphLogic(
            JPanel                   pointsPanel, 
            JScrollPane              pointsScrollPane, 
            JList<String>            pointsList,
            DefaultListModel<String> pointsListModel) {
        this.pointsPanel      = pointsPanel;
        this.pointsScrollPane = pointsScrollPane;
        this.pointsList       = pointsList;
        this.pointsListModel  = pointsListModel;
        allPoints             = new LinkedList<>();
    }

    public void plot(int points) {
        allPoints.clear();
        pointsPanel.repaint();
        pointsListModel.removeAllElements();
        for (int i = 0; i < points; i++) {
            Point point = new Point(pointsPanel);
            point.plot(pointsPanel);
            pointsListModel.addElement(point.toString());
        }
    }

    public LinkedList<Point> getAllPoints() {
        return allPoints;
    }

    public void plot(LinkedList<Point> allPoints) {
        this.allPoints = allPoints;
        pointsPanel.repaint();
        pointsListModel.removeAllElements();
        for (int i = 0; i < allPoints.size(); i++) {
            Point point = allPoints.get(i);
            point.plot(pointsPanel);
            pointsListModel.addElement(point.toString());
        }
    }
        
    public String getSortestPath(String point1, String point2) {
        System.out.println("TO DO!!!!!");
        return null;
    }
    
}