/*
 * Created by JFormDesigner on Mon May 08 17:15:52 CEST 2017
 */

package Vista;

import java.awt.*;
import javax.swing.*;

/**
 * @author Tatiana CÃ¡ceres
 */
public class Prova4 extends JPanel {

    private JLabel label3;
    private JLabel label1;
    private JLabel label2;
    private Registre jpRegistre;
    private IniciarSessio jpIniciar;

    public Prova4(){
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Tatiana CÃ¡ceres
        label3 = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        jpRegistre = new Registre();
        jpIniciar = new IniciarSessio();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0};
        ((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

        //---- label3 ----
        label3.setText(" ");
        add(label3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 25, 25), 0, 0));

        //---- label1 ----
        label1.setText("Registra't");
        label1.setFont(new Font("Akrobat Bold", Font.PLAIN, 24));
        add(label1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 25, 25), 0, 0));

        //---- label2 ----
        label2.setText("Inicia Sessió"); //\u00f3
        label2.setFont(new Font("Akrobat Bold", Font.PLAIN, 22));
        add(label2, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 25, 25), 0, 0));

        //======== panel1 ========

        add(jpRegistre, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 25, 25), 0, 0));

        //======== panel2 ========

        add(jpIniciar, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 25, 25), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

}