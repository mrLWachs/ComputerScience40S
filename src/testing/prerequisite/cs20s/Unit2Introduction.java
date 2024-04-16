
/** Required package class namespace */
package testing.prerequisite.cs20s;

/** Required API imports */
import java.awt.Font;


/**
 * Unit2Introduction.java - this is a Visual Studio (C#) Windows Form
 * adaptation into NetBeans (Java) JFrame (some code may not translate)
 *
 * @author Mr. Wachs
 * @since Feb 22, 2024, 2:09:54 p.m.
 */
public class Unit2Introduction extends javax.swing.JFrame {

    // <editor-fold defaultstate="collapsed" desc="NetBeans Generated Code">
    
    /**
     * Creates new form Unit2Introduction
     */
    public Unit2Introduction() {
        initComponents();
        this.getContentPane().setLayout(null);
        this.setTitle("Unit 2 Introduction");
        this.setSize(450, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        picSweaterVest.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHello = new javax.swing.JLabel();
        picSweaterVest = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHello.setText("Hello World");

        picSweaterVest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/prerequisite/cs20s/image.png"))); // NOI18N

        btnChange.setText("Change the World");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(picSweaterVest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblHello, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHello, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(picSweaterVest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // </editor-fold>
    
    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        // Original C# code....................................................
        /*
        lblHello.Text = "I've changed the world";            
        picSweaterVest.Visible = true;
        btnChange.Enabled = false;
        lblHello.Font = new Font("Algerian", 30);
        lblHello.Font = new Font(lblHello.Font, FontStyle.Underline);
        frmIntroductionToProgrammingExample.ActiveForm.WindowState = FormWindowState.Maximized;
        */
        
        // Adapted Java code...................................................
        lblHello.setText("I've changed the world");
        picSweaterVest.setVisible(true);
        btnChange.setEnabled(false);
        lblHello.setFont(new Font("Algerian", Font.PLAIN, 30));        
    }//GEN-LAST:event_btnChangeActionPerformed

    // <editor-fold defaultstate="collapsed" desc="NetBeans Generated Code">  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JLabel lblHello;
    private javax.swing.JLabel picSweaterVest;
    // End of variables declaration//GEN-END:variables
    
    // </editor-fold>
    
}