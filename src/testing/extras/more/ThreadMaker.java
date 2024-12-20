/** Required package class namespace */
package testing.extras.more;

/** Required API imports */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.Timer;

 
/**
 * ThreadMaker.java - description
 *
 * @author Mr. Wachs
 * @since Dec. 19, 2024
 */
public class ThreadMaker 
{
    
    private JScrollPane              threadsScrollPane;
    private JList<String>            threadsList;
    private LinkedList<Thread>       threads;
    private LinkedList<Timer>        timers;
    private DefaultListModel<String> threadsListModel;
    private int                      count;
    
    
    /**
     * Constructor method, sets class properties and connects parameters to 
     * class properties
     * 
     * @param threadsScrollPane
     * @param threadsList
     * @param threadsListModel 
     */
    public ThreadMaker(
            JScrollPane              threadsScrollPane, 
            JList<String>            threadsList,
            DefaultListModel<String> threadsListModel) {
        this.threadsScrollPane = threadsScrollPane;
        this.threadsList       = threadsList;
        this.threadsListModel  = threadsListModel;        
        threads = new LinkedList<>();
        timers  = new LinkedList<>();      
        count   = 0;
    }

    public void create(int time) {
        count++;
        Thread thread = new Thread("Thread " + count);
        Timer timer = new Timer(time, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tick(thread);
            }
        });
        timer.start();
        timers.add(timer);
        threads.add(thread);
    }
    
    private void tick(Thread thread) {
        threadsListModel.addElement(thread.getName() + " running");
    }

    public void stopAll() {
        for (Timer timer : timers) {
            timer.stop();
        }
        for (Thread thread : threads) {
            thread.interrupt();
        }
        threadsListModel.removeAllElements();
    }
    
}