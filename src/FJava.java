/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gamer
 */
public class FJava extends javax.swing.JFrame {

    /**
     * Creates new form FJava
     */
    public FJava() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jli1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jli1.setBackground(new java.awt.Color(204, 204, 204));
        jli1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jli1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "<html><body><u>UNIT - 1</u></body></html>", " ", "<html><body><u>UNIT - 2</u></body></html>", " ", "<html><body><u>UNIT - 3</u></body></html>", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jli1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 180, 140, 200);

        jButton1.setText("OPEN ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 290, 150, 57);

        jLabel1.setText("* Please Select The Unit And Click Open");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 430, 230, 45);

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel2.setText("CONTENTS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(367, 61, 140, 26);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Risav Chaudhary\\Pictures\\j2.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 900, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 int a = jli1.getSelectedIndex();
        if (a==0)
        {
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"F:\\Semester 3\\jaVA\\UNIT1.pptx");
            }
            catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null,e);
        }
        }
        else if (a==1)
        {
         try
            {
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"F:\\Semester 3\\jaVA\\UNIT2.pptx");
            }
            catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null,e);
        }}
        else if(a==3)
        {try
            {
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"F:\\Semester 3\\jaVA\\UNIT3.pptx");
            }
            catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null,e);
        }}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jli1;
    // End of variables declaration//GEN-END:variables
}
