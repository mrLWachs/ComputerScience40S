/** Required package class namespace */
package testing.extras.more;

/**
 * GUI.java - 
 *
 * @author Mr. Wachs
 * @since December 2024
 */
public class GUI extends javax.swing.JFrame 
{
    
    private LogicController controller;

    /** 
     * Constructor method, creates new frame/form UserInterface 
     */
    public GUI() {
        initComponents();
        controller = new LogicController( 
            pointsList,
            pointsPanel,
            pointsScrollPane,
            pointsSpinner,
            threadTimeSpinner,
            threadsList,
            threadsScrollPane,
            this                
        );
    }

    // <editor-fold defaultstate="collapsed" desc="NetBeans Editor Generated Code"> 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pointsPanel = new javax.swing.JPanel();
        pointsInstructionsLabel = new javax.swing.JLabel();
        pointsSpinner = new javax.swing.JSpinner();
        enterButton = new javax.swing.JButton();
        pointsScrollPane = new javax.swing.JScrollPane();
        pointsList = new javax.swing.JList<>();
        calculatePathButton = new javax.swing.JButton();
        sortListButton = new javax.swing.JButton();
        searchListButton = new javax.swing.JButton();
        saveListButton = new javax.swing.JButton();
        openListButton = new javax.swing.JButton();
        threadInstructionsLabel = new javax.swing.JLabel();
        threadTimeSpinner = new javax.swing.JSpinner();
        createThreadButton = new javax.swing.JButton();
        stopThreadsButton = new javax.swing.JButton();
        threadsScrollPane = new javax.swing.JScrollPane();
        threadsList = new javax.swing.JList<>();
        createTreeButton = new javax.swing.JButton();
        learnPythonButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pointsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pointsPanel.setLayout(null);
        getContentPane().add(pointsPanel);
        pointsPanel.setBounds(280, 20, 700, 588);

        pointsInstructionsLabel.setText("Plot Random Points");
        getContentPane().add(pointsInstructionsLabel);
        pointsInstructionsLabel.setBounds(10, 20, 150, 16);
        getContentPane().add(pointsSpinner);
        pointsSpinner.setBounds(10, 40, 132, 22);

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(enterButton);
        enterButton.setBounds(150, 20, 120, 40);

        pointsScrollPane.setViewportView(pointsList);

        getContentPane().add(pointsScrollPane);
        pointsScrollPane.setBounds(12, 71, 255, 310);

        calculatePathButton.setText("Calculate Path");
        calculatePathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatePathButtonActionPerformed(evt);
            }
        });
        getContentPane().add(calculatePathButton);
        calculatePathButton.setBounds(10, 390, 255, 36);

        sortListButton.setText("Sort List");
        sortListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortListButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sortListButton);
        sortListButton.setBounds(12, 436, 255, 36);

        searchListButton.setText("Search List");
        searchListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchListButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchListButton);
        searchListButton.setBounds(12, 479, 255, 36);

        saveListButton.setText("Save List");
        saveListButton.setToolTipText("");
        saveListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveListButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveListButton);
        saveListButton.setBounds(12, 522, 255, 36);

        openListButton.setText("Open List");
        openListButton.setToolTipText("");
        openListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openListButtonActionPerformed(evt);
            }
        });
        getContentPane().add(openListButton);
        openListButton.setBounds(12, 565, 255, 36);

        threadInstructionsLabel.setText("Set Thread time (milliseconds)");
        getContentPane().add(threadInstructionsLabel);
        threadInstructionsLabel.setBounds(990, 20, 210, 16);
        getContentPane().add(threadTimeSpinner);
        threadTimeSpinner.setBounds(990, 50, 210, 22);

        createThreadButton.setText("Create Thread");
        createThreadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createThreadButtonActionPerformed(evt);
            }
        });
        getContentPane().add(createThreadButton);
        createThreadButton.setBounds(990, 80, 210, 30);

        stopThreadsButton.setText("Stop Threads");
        stopThreadsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopThreadsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(stopThreadsButton);
        stopThreadsButton.setBounds(990, 120, 210, 30);

        threadsScrollPane.setViewportView(threadsList);

        getContentPane().add(threadsScrollPane);
        threadsScrollPane.setBounds(990, 160, 210, 360);

        createTreeButton.setText("Create Tree");
        createTreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTreeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(createTreeButton);
        createTreeButton.setBounds(990, 530, 210, 36);

        learnPythonButton.setText("Learn Python");
        learnPythonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnPythonButtonActionPerformed(evt);
            }
        });
        getContentPane().add(learnPythonButton);
        learnPythonButton.setBounds(990, 570, 210, 36);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        controller.enterButton();
    }//GEN-LAST:event_enterButtonActionPerformed

    private void calculatePathButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatePathButtonActionPerformed
        controller.calculatePathButton();
    }//GEN-LAST:event_calculatePathButtonActionPerformed

    private void sortListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortListButtonActionPerformed
        controller.sortListButton();
    }//GEN-LAST:event_sortListButtonActionPerformed

    private void searchListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchListButtonActionPerformed
        controller.searchListButton();
    }//GEN-LAST:event_searchListButtonActionPerformed

    private void saveListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveListButtonActionPerformed
        controller.saveListButton();
    }//GEN-LAST:event_saveListButtonActionPerformed

    private void openListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openListButtonActionPerformed
        controller.openListButton();
    }//GEN-LAST:event_openListButtonActionPerformed

    private void stopThreadsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopThreadsButtonActionPerformed
        controller.stopThreadsButton();
    }//GEN-LAST:event_stopThreadsButtonActionPerformed

    private void learnPythonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learnPythonButtonActionPerformed
        controller.learnPythonButton();
    }//GEN-LAST:event_learnPythonButtonActionPerformed

    private void createTreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTreeButtonActionPerformed
        controller.createTreeButton();
    }//GEN-LAST:event_createTreeButtonActionPerformed

    private void createThreadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createThreadButtonActionPerformed
        controller.createThreadButton();
    }//GEN-LAST:event_createThreadButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculatePathButton;
    private javax.swing.JButton createThreadButton;
    private javax.swing.JButton createTreeButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton learnPythonButton;
    private javax.swing.JButton openListButton;
    private javax.swing.JLabel pointsInstructionsLabel;
    private javax.swing.JList<String> pointsList;
    private javax.swing.JPanel pointsPanel;
    private javax.swing.JScrollPane pointsScrollPane;
    private javax.swing.JSpinner pointsSpinner;
    private javax.swing.JButton saveListButton;
    private javax.swing.JButton searchListButton;
    private javax.swing.JButton sortListButton;
    private javax.swing.JButton stopThreadsButton;
    private javax.swing.JLabel threadInstructionsLabel;
    private javax.swing.JSpinner threadTimeSpinner;
    private javax.swing.JList<String> threadsList;
    private javax.swing.JScrollPane threadsScrollPane;
    // End of variables declaration//GEN-END:variables

    // </editor-fold>  
    
}