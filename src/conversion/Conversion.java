/**
 * Converter
 * Charlie Harpur
 * 30/04/2018
 * Converts Units of distance to other units
 **/

package conversion;

/**
 *
 * @author chhar9972
 */
public class Conversion extends javax.swing.JFrame {

    /**
     * Creates new form linearConversion
     */
    public Conversion() {
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

        labelTitle = new javax.swing.JLabel();
        comboStartingUnit = new javax.swing.JComboBox();
        labelTo = new javax.swing.JLabel();
        comboEndUnit = new javax.swing.JComboBox();
        fieldLength = new javax.swing.JTextField();
        labelOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setText("Linear Conversion");

        comboStartingUnit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Centimetres", "Metres", "Kilometres", "Inches", "Feet", "Yards", "Miles" }));
        comboStartingUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStartingUnitActionPerformed(evt);
            }
        });

        labelTo.setText("to");

        comboEndUnit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Centimetres", "Metres", "Kilometres", "Inches", "Feet", "Yards", "Miles" }));
        comboEndUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEndUnitActionPerformed(evt);
            }
        });

        fieldLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldLengthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboStartingUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboEndUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldLength)
                    .addComponent(labelOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboStartingUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTo)
                    .addComponent(comboEndUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldLengthActionPerformed
        try
        {
            int startingUnit = comboStartingUnit.getSelectedIndex();
            int endUnit = comboEndUnit.getSelectedIndex();
            double length = Double.parseDouble(fieldLength.getText());
            String[] units = {"cm", "m", "km", "\"", "'", "yd", "m"};
            labelOutput.setText("<html>" + length + units[startingUnit] + " is " + conversion(length, startingUnit, endUnit) + units[endUnit] + "</html>");
        }catch (NumberFormatException nfe)
        {
            //nfe only happens when a number isn't entered into the field and the field isn't empty
            if (! " ".equals(fieldLength.getText()))
            {
                labelOutput.setText("<html> You must enter a number into the field </html>");
            }
        }
    }//GEN-LAST:event_fieldLengthActionPerformed

    private void comboStartingUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStartingUnitActionPerformed
        try
        {
            int startingUnit = comboStartingUnit.getSelectedIndex();
            int endUnit = comboEndUnit.getSelectedIndex();
            double length = Double.parseDouble(fieldLength.getText());
            String[] units = {"cm", "m", "km", "\"", "'", "yd", "m"};
            labelOutput.setText("<html>" + length + units[startingUnit] + " is " + conversion(length, startingUnit, endUnit) + units[endUnit] + "</html>");
        }catch (NumberFormatException nfe)
        {
            //nfe only happens when a number isn't entered into the field and the field isn't empty
            if (! " ".equals(fieldLength.getText()))
            {
                labelOutput.setText("<html> You must enter a number into the field </html>");
            }
        }
    }//GEN-LAST:event_comboStartingUnitActionPerformed

    private void comboEndUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEndUnitActionPerformed
        try
        {
            int startingUnit = comboStartingUnit.getSelectedIndex();
            int endUnit = comboEndUnit.getSelectedIndex();
            double length = Double.parseDouble(fieldLength.getText());
            String[] units = {"cm", "m", "km", "\"", "'", "yd", "m"};
            labelOutput.setText("<html>" + length + units[startingUnit] + " is " + conversion(length, startingUnit, endUnit) + units[endUnit] + "</html>");
        }catch (NumberFormatException nfe)
        {
            //nfe only happens when a number isn't entered into the field and the field isn't empty
            if (! " ".equals(fieldLength.getText()))
            {
                labelOutput.setText("<html> You must enter a number into the field </html>");
            }
        }
    }//GEN-LAST:event_comboEndUnitActionPerformed

    public double conversion(double length, int start, int end)
    {
        /**
         * Converts input unit to Cm, then from Cm to other Units
         * @params length, starting unit, desired unit
         * @returns endLength
         */
            double centiLength;
            double[] conversionCoefficients = {/*Cm to Cm*/1,/*M to Cm*/ 100,/*Km to Cm*/ 100000, /*" to Cm*/2.54,/*' to Cm*/ 30.48, /*Yd to Cm*/91.44, /*Mi to Cm*/160934.4};
            //Uses the stored conversion coefficients to convert from the given unit to Cm
            centiLength = length * conversionCoefficients[start];
            /**
            * Converts From Centimeters to another unit by deviding centimeter length 
            * by coefficient of the desired length because if centiLength = length * conversionCoefficient
            * than length = centiLength / conversionCoeffivient
            */
            double endLength = centiLength / conversionCoefficients[end];
            return endLength;
    }
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
            java.util.logging.Logger.getLogger(Conversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboEndUnit;
    private javax.swing.JComboBox comboStartingUnit;
    private javax.swing.JTextField fieldLength;
    private javax.swing.JLabel labelOutput;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTo;
    // End of variables declaration//GEN-END:variables
}
