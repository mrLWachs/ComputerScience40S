/** Required package class namespace */
package testing.extras.graphics;


/**
 * AdvancedUserInterface.java - often, developers separate the "logic" of the
 * app (engine, controller, etc.) from the "design" (look, feel, visual, etc.).
 * Controls/containers that come from the "swing library" (also named in the
 * visual designer palette) are "extension" libraries and swing is considered
 * a "lightweight" graphical library, those that come from the "AWT" library 
 * are a "core" or "heavyweight" library. Further resources for this topic can
 * be found here:
 *      - References on differences between Swing and AWT: 
 *              - https://bit.ly/3ZFM3eG
 *              - https://bit.ly/49xTmcA
 * 
 * We also used the designer for the purpose of adding controls to the 
 * container using the palettes, changing properties using the properties 
 * window, and adding action listener events using the NetBeans designer. This
 * optimized our work flow to create a "view" for the user to interact with. 
 * However, the main logic of what the interactivity does was diverted to a
 * "controller" class. The idea of separating the control from the view is one 
 * of many programming techniques or "paradigms" that programmers could use 
 * when working with user interfaces. Further resources for this topic can be
 * found here:
 *      - References on Software Design Patterns: 
 *              - https://bit.ly/3VyalWH
 *              - https://bit.ly/3ZQAd2A
 *              - https://bit.ly/3BCUrTX
 *              - Lecture Slides 24 - 28 here: https://bit.ly/3ZPKpIF
 *
 * @author Mr. Wachs
 * @since December 2024
 */
public class AdvancedUserInterface extends javax.swing.JFrame 
{
    
    // The controller class object to "link" to
    private AdvancedUIController controller;

    /** 
     * Constructor method, creates new frame/form AdvancedUserInterface 
     */
    public AdvancedUserInterface() {
        initComponents();
        // Now instantiate the controller object, linking (or "wiring") it to
        // the relevant controls the user will interact with through that 
        // class' constructor method
        controller = new AdvancedUIController(
                allNamesList, 
                enterButton, 
                nameTextField, 
                drawingPanel,
                this);
    }

    // <editor-fold defaultstate="collapsed" desc="NetBeans Designer Generated Method">  
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTextField = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        allNamesList = new java.awt.List();
        allNamesLabel = new javax.swing.JLabel();
        drawingPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enterButton.setText("ENTER");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Name:");

        allNamesLabel.setText("All Names:");

        drawingPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        drawingPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drawingPanelMouseDragged(evt);
            }
        });
        drawingPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                drawingPanelMouseWheelMoved(evt);
            }
        });
        drawingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drawingPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allNamesLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(allNamesList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(drawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drawingPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterButton))
                        .addGap(18, 18, 18)
                        .addComponent(allNamesLabel)
                        .addGap(6, 6, 6)
                        .addComponent(allNamesList, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // </editor-fold> 
    
    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        controller.buttonClick();             // Call method in controller class
    }//GEN-LAST:event_enterButtonActionPerformed

    private void drawingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanelMouseClicked
        controller.mouseClick(evt);
    }//GEN-LAST:event_drawingPanelMouseClicked

    private void drawingPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanelMouseDragged
        controller.mouseDragged(evt);
    }//GEN-LAST:event_drawingPanelMouseDragged

    private void drawingPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_drawingPanelMouseWheelMoved
        controller.mouseWheelMoved(evt);
    }//GEN-LAST:event_drawingPanelMouseWheelMoved

    // <editor-fold defaultstate="collapsed" desc="NetBeans Designer Declared Objects"> 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allNamesLabel;
    private java.awt.List allNamesList;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    // End of variables declaration//GEN-END:variables

    // </editor-fold> 
    
}