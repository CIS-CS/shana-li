/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewtonCalc;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Shana Li
 */
public class NewtonCalcUI extends javax.swing.JFrame {
    
    private double initVel = 0;
    private double mass = 0;
    private double massBase = 0;
    private int massPow = 0;
    private double g = 0;
    private double gBase = 0;
    private int gPow = 0;
    private double radius = 0;

    
    private final Persister persister;
    private final Queue queue;
    
    

    /**
     * Creates new form Interface
     * @throws java.lang.Exception
     */
    public NewtonCalcUI() throws Exception {
        
        initComponents();
        clearImages();
        
        persister = new Persister();
        queue = new Queue();
        
        loadData();
        
        orbitVelField.setEditable(false);
        escVelField.setEditable(false);
        gForceField.setEditable(false);
        trajTypeField.setEditable(false);
        
        massBaseField.setText("5.97");
        massPowField.setText("24");
        gBaseField.setText("6.67");
        gPowField.setText("-11");
        radiusField.setText("6371");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        gLabel = new javax.swing.JLabel();
        inputLabel = new javax.swing.JLabel();
        initVelLabel = new javax.swing.JLabel();
        radiusLabel = new javax.swing.JLabel();
        radiusField = new javax.swing.JTextField();
        massLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        inputSeparator = new javax.swing.JSeparator();
        massPowField = new javax.swing.JTextField();
        gBaseField = new javax.swing.JTextField();
        initVelField = new javax.swing.JTextField();
        outputLabel = new javax.swing.JLabel();
        outputSeparator = new javax.swing.JSeparator();
        orbitVelLabel = new javax.swing.JLabel();
        orbitVelField = new javax.swing.JTextField();
        escVelLabel = new javax.swing.JLabel();
        escVelField = new javax.swing.JTextField();
        gForceLabel = new javax.swing.JLabel();
        gForceField = new javax.swing.JTextField();
        trajTypeLabel = new javax.swing.JLabel();
        trajTypeField = new javax.swing.JTextField();
        calcButton = new javax.swing.JButton();
        pathTypeLabel = new javax.swing.JLabel();
        gUnitLabel = new javax.swing.JLabel();
        initVelUnitLabel = new javax.swing.JLabel();
        massPowLabel = new javax.swing.JLabel();
        radiusUnitLabel = new javax.swing.JLabel();
        orbitVelUnitLabel = new javax.swing.JLabel();
        escVelUnitLabel = new javax.swing.JLabel();
        gForceUnitLabel = new javax.swing.JLabel();
        viewPrevButton = new javax.swing.JButton();
        massBaseField = new javax.swing.JTextField();
        massUniteLabel = new javax.swing.JLabel();
        fallImage = new javax.swing.JLabel();
        orbitImage = new javax.swing.JLabel();
        escImage = new javax.swing.JLabel();
        gPowField = new javax.swing.JTextField();
        massPowLabel1 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        gLabel.setText("Univ. G Constant");
        getContentPane().add(gLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        inputLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        inputLabel.setText("Input");
        getContentPane().add(inputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, 30));

        initVelLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        initVelLabel.setText("Initial Velocity");
        getContentPane().add(initVelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        radiusLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        radiusLabel.setText("Radius of Planet");
        getContentPane().add(radiusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 130, -1, -1));

        radiusField.setToolTipText("The radius of the planet (6371km for Earth).");
        getContentPane().add(radiusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 121, 83, 36));

        massLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        massLabel.setText("Mass of Planet");
        getContentPane().add(massLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 89, -1, -1));

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        titleLabel.setText("Newton's Cannonball Calculator");
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        getContentPane().add(inputSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 50, 565, -1));

        massPowField.setToolTipText("The mass of the planet from which the ball is fired, in scientific notation.");
        getContentPane().add(massPowField, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 80, 40, 36));

        gBaseField.setToolTipText("The Universal Gravitational Constant of the planet. In our universe it is about 6.67 x 10^-11.");
        getContentPane().add(gBaseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 121, 52, 36));

        initVelField.setToolTipText("The initial firing velocity of the cannonball, horizontally to the Earth's surface.");
        getContentPane().add(initVelField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 84, 83, 36));

        outputLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        outputLabel.setText("Output");
        getContentPane().add(outputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, 30));
        getContentPane().add(outputSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 560, -1));

        orbitVelLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orbitVelLabel.setText("Orbital Velocity");
        getContentPane().add(orbitVelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 284, -1, -1));

        orbitVelField.setBackground(new java.awt.Color(204, 204, 204));
        orbitVelField.setToolTipText("The minimum projectile speed (less than esc. v) for a steady orbit.");
        getContentPane().add(orbitVelField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 274, 127, 36));

        escVelLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        escVelLabel.setText("Escape Velocity");
        getContentPane().add(escVelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 324, -1, -1));

        escVelField.setBackground(new java.awt.Color(204, 204, 204));
        escVelField.setToolTipText("The minimum projectile speed to escape the gravitational field.");
        getContentPane().add(escVelField, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 314, 126, 36));

        gForceLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        gForceLabel.setText("Gravitational Force");
        getContentPane().add(gForceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 364, -1, -1));

        gForceField.setBackground(new java.awt.Color(204, 204, 204));
        gForceField.setToolTipText("Gravitational force of the planet.");
        getContentPane().add(gForceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 354, 127, 36));

        trajTypeLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        trajTypeLabel.setText("Trajectory Type");
        getContentPane().add(trajTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 404, -1, -1));

        trajTypeField.setBackground(new java.awt.Color(204, 204, 204));
        trajTypeField.setToolTipText("Whether the projectile falls back to the planet, orbits the planet, or escapes orbit.");
        getContentPane().add(trajTypeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 394, 127, 36));

        calcButton.setText("Calculate");
        calcButton.setToolTipText("Calculate!!");
        calcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonActionPerformed(evt);
            }
        });
        getContentPane().add(calcButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, 40));

        pathTypeLabel.setText("Path Type");
        pathTypeLabel.setToolTipText("The path that the projectile takes.");
        getContentPane().add(pathTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 260, -1, -1));

        gUnitLabel.setText("N⋅m2/kg2");
        getContentPane().add(gUnitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 129, -1, 20));

        initVelUnitLabel.setText("m/s");
        getContentPane().add(initVelUnitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 94, -1, -1));

        massPowLabel.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        massPowLabel.setText("x 10^");
        getContentPane().add(massPowLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 129, -1, 20));

        radiusUnitLabel.setText("km");
        getContentPane().add(radiusUnitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 131, -1, -1));

        orbitVelUnitLabel.setText("m/s");
        getContentPane().add(orbitVelUnitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 284, -1, -1));

        escVelUnitLabel.setText("m/s");
        getContentPane().add(escVelUnitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 324, -1, -1));

        gForceUnitLabel.setText("N");
        getContentPane().add(gForceUnitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 364, -1, -1));

        viewPrevButton.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        viewPrevButton.setText("View Previous Entries");
        viewPrevButton.setToolTipText("Veiw a list of your previous 10 entries.");
        viewPrevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPrevButtonActionPerformed(evt);
            }
        });
        getContentPane().add(viewPrevButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 152, 40));

        massBaseField.setToolTipText("The mass of the planet from which the ball is fired, in scientific notation.");
        getContentPane().add(massBaseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 80, 40, 36));

        massUniteLabel.setText("kg");
        getContentPane().add(massUniteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 88, -1, 20));

        fallImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewtonCalc/fallback.png"))); // NOI18N
        fallImage.setText("[fallimage]");
        fallImage.setToolTipText("The ball will fall back to the planet's surface.");
        getContentPane().add(fallImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 170, -1));
        fallImage.getAccessibleContext().setAccessibleName("fallImage");

        orbitImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewtonCalc/orbit.png"))); // NOI18N
        orbitImage.setText("[orbitimage]");
        orbitImage.setToolTipText("The ball will orbit around the planet.");
        getContentPane().add(orbitImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 170, -1));
        orbitImage.getAccessibleContext().setAccessibleName("orbitImage");
        orbitImage.getAccessibleContext().setAccessibleDescription("");

        escImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewtonCalc/exorbit.png"))); // NOI18N
        escImage.setText("[escimage]");
        escImage.setToolTipText("The ball will escape orbit, never to be seen again.");
        getContentPane().add(escImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 170, -1));
        escImage.getAccessibleContext().setAccessibleName("escImage");

        gPowField.setToolTipText("The Universal Gravitational Constant of the planet. In our universe it is about 6.67 x 10^-11.");
        getContentPane().add(gPowField, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 121, 39, 36));

        massPowLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        massPowLabel1.setText("x 10^");
        getContentPane().add(massPowLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 88, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean isNumeric(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } 
        catch (NumberFormatException e) {
            return false;
        }
    }
    
    private boolean isInt(String input){
        try {
            Integer.parseInt(input);
            return true;
        } 
        catch (NumberFormatException e) {
            return false;
        }
    }
    
    private void clearImages() {
        orbitImage.setVisible(false);
        fallImage.setVisible(false);
        escImage.setVisible(false);
    }
    
    private void loadData() throws Exception {
        File f = new File("data_do_not_modify.txt");
        
        if (f.exists()) {
            queue.add(persister.read());
        }
    }
    
    private boolean checkValues() {    
        
        boolean isDataValid = true;
        
        if ("".equals(initVelField.getText()) || "".equals(massBaseField.getText()) 
        || "".equals(massPowField.getText()) || "".equals(gBaseField.getText()) 
        || "".equals(gPowField.getText()) || "".equals(radiusField.getText())){
            
            isDataValid = false;
            
            JOptionPane.showMessageDialog(null,"Fields cannot remain blank. "
                    + "Please fill out all the information.","Invalid Data",
                    JOptionPane.WARNING_MESSAGE);
        }
                
        else if (!isNumeric(initVelField.getText()) || !isNumeric(massBaseField.getText()) || 
                !isInt(massPowField.getText()) || !isNumeric(gBaseField.getText()) || 
                !isInt(gPowField.getText()) || !isNumeric(radiusField.getText())) {
            
            isDataValid = false;
            
            JOptionPane.showMessageDialog(null,"Fields must be numeric. \n"
                + "Power fields must contain integers.",
                "Invalid Data", JOptionPane.WARNING_MESSAGE);
        } 
        else {
            initVel = Math.round(Double.parseDouble(initVelField.getText()) * 100.0) / 100.0;
            massBase = Double.parseDouble(massBaseField.getText());
            massPow = Integer.parseInt(massPowField.getText());
            mass = (Math.round(massBase * 100.0) / 100.0) * Math.pow(10, massPow);
            gBase = Double.parseDouble(gBaseField.getText());
            gPow = Integer.parseInt(gPowField.getText());
            g = (Math.round(gBase * 100.0) / 100.0) * Math.pow(10, gPow);
            radius = Math.round(Double.parseDouble(radiusField.getText()) * 100.0) / 100.0;
            
            if (initVel <= 0 || initVel > 1000000000 || mass < Math.pow(10, 5) || mass > Math.pow(10, 50) 
                || g < Math.pow(10, -20) || g > Math.pow(10, -5) || radius <= 0 || radius > 500000) { 
                
                isDataValid = false;
            
                JOptionPane.showMessageDialog(null,"Fields cannot be zero, too small, or too big. \n"
                    + "Values that are too small may lead to inaccurately rounded results. \n"
                    + "The range (inclusive) of calculable values are as follows: \n \n"
                    + "Initial Velocity: 1 - 1000000000 m/s \n"
                    + "Mass: 10^5 - 10^30 kg \n"
                    + "G: 10^-20 - 10^-5 N⋅m2/kg2 \n"
                    + "Radius: 1 - 500000 km"
                    ,"Invalid Data", JOptionPane.WARNING_MESSAGE);
            } 
            else {
                initVelField.setText(String.valueOf(initVel));
                radiusField.setText(String.valueOf(radius));
            }
        }
        
        return isDataValid;
    }
    
    private void displayValues(Universe universe) {       
       orbitVelField.setText(Double.toString(universe.getPlanet().getOrbitVel()));
       escVelField.setText(Double.toString(universe.getPlanet().getEscVel()));
       gForceField.setText(Double.toString(universe.getPlanet().getGForce()));
       trajTypeField.setText(universe.getBall().getPathType());

        switch (universe.getBall().getPathType()) {
            case "Fall Back":
                fallImage.setVisible(true);
                break;
            case "Orbit":
                orbitImage.setVisible(true);
                break;
            case "Escape":
                escImage.setVisible(true);
                break;
        }
    }
       
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int choice = JOptionPane.showConfirmDialog(this,
        "Are you sure you want to exit?", "Exit Application",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (choice == JOptionPane.OK_OPTION) {
            try {
                persister.clear();
            } 
            catch (IOException e) {
            }
            
            if(!queue.getEmptiness()) {
                for (int i = 0; i <= queue.getLength(); i++) {
                    try {
                        persister.write(queue.dq());
                    } 
                    catch (IOException e) {
                    }
                }
            }
            
            System.exit(0);
        }
        else {
        }
    }//GEN-LAST:event_formWindowClosing

    private void viewPrevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPrevButtonActionPerformed
        JOptionPane.showMessageDialog(null, queue.toString(), "Previous Entries",
            JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_viewPrevButtonActionPerformed

    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        if (checkValues()) {
            clearImages();
            Universe universe = new Universe(initVel, g, massBase, massPow, mass, radius);
            displayValues(universe);
            queue.add(universe);
        }
    }//GEN-LAST:event_calcButtonActionPerformed

    
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
        } catch (ClassNotFoundException | InstantiationException | 
                IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewtonCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new NewtonCalcUI().setVisible(true);
            } 
            catch (Exception ex) {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcButton;
    private javax.swing.JLabel escImage;
    private javax.swing.JTextField escVelField;
    private javax.swing.JLabel escVelLabel;
    private javax.swing.JLabel escVelUnitLabel;
    private javax.swing.JLabel fallImage;
    private javax.swing.JTextField gBaseField;
    private javax.swing.JTextField gForceField;
    private javax.swing.JLabel gForceLabel;
    private javax.swing.JLabel gForceUnitLabel;
    private javax.swing.JLabel gLabel;
    private javax.swing.JTextField gPowField;
    private javax.swing.JLabel gUnitLabel;
    private javax.swing.JTextField initVelField;
    private javax.swing.JLabel initVelLabel;
    private javax.swing.JLabel initVelUnitLabel;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JSeparator inputSeparator;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField massBaseField;
    private javax.swing.JLabel massLabel;
    private javax.swing.JTextField massPowField;
    private javax.swing.JLabel massPowLabel;
    private javax.swing.JLabel massPowLabel1;
    private javax.swing.JLabel massUniteLabel;
    private javax.swing.JLabel orbitImage;
    private javax.swing.JTextField orbitVelField;
    private javax.swing.JLabel orbitVelLabel;
    private javax.swing.JLabel orbitVelUnitLabel;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JSeparator outputSeparator;
    private javax.swing.JLabel pathTypeLabel;
    private javax.swing.JTextField radiusField;
    private javax.swing.JLabel radiusLabel;
    private javax.swing.JLabel radiusUnitLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField trajTypeField;
    private javax.swing.JLabel trajTypeLabel;
    private javax.swing.JButton viewPrevButton;
    // End of variables declaration//GEN-END:variables
}
