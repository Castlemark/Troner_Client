
package Vista;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
//import com.jgoodies.forms.factories.*;
import controlador.ControladorJoc;
import controlador.Move;

/**
 * @author unknown
 */
public class Joc extends JPanel {
    public Joc() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pau Nonell
        label1 = new JLabel();
        rondes1 = new JLabel();
        label2 = new JLabel();
        rondes2 = new JLabel();
        label3 = new JLabel();
        rondes3 = new JLabel();
        label4 = new JLabel();
        rondes4 = new JLabel();
        panel1 = new VistaJoc();
        button1 = new JButton();

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel jpsuperior = new JPanel();
        jpsuperior.setLayout(new GridLayout(1, 8));
        jpsuperior.add(label1);
        jpsuperior.add(rondes1);
        jpsuperior.add(label2);
        jpsuperior.add(rondes2);
        jpsuperior.add(label3);
        jpsuperior.add(rondes3);
        jpsuperior.add(label4);
        jpsuperior.add(rondes4);
        jpsuperior.setMinimumSize(new Dimension(1000, 100));
        jpsuperior.setMaximumSize(new Dimension(1000, 100));
        add(jpsuperior);



        panel1.setMaximumSize(new Dimension(350, 350));
        panel1.setMinimumSize(new Dimension(350, 350));
        panel1.setBackground(new Color(255, 255, 255));
        panel1.setBorder(LineBorder.createBlackLineBorder());
        add(panel1);

        button1.setText("Abandonar");
        add(button1);

        //======== this ========
      /*  setLayout(new GridLayout(3, 1));

        JPanel jpsuperior = new JPanel(new GridLayout(1, 4));
        jpsuperior.add(label1);
        jpsuperior.add(label2);
        jpsuperior.add(label3);
        jpsuperior.add(label4);



        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {13, 79, 75, 76, 70, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {13, 26, 190, 31, 0};
        ((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText("");
        add(label1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label2 ----
        label2.setText("");
        add(label2, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label3 ----
        label3.setText("");
        add(label3, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label4 ----
        label4.setText("");
        add(label4, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 255, 255));
            panel1.setBorder(LineBorder.createBlackLineBorder());
          //  panel1.setLayout(new BorderLayout());
        }

        /*add(panel1, new GridBagConstraints(1, 2, 4, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- button1 ----
        button1.setText("Abandonar");
        add(button1, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents




*/
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pau Nonell
    private JLabel label1;
    private JLabel rondes1;
    private JLabel label2;
    private JLabel rondes2;
    private JLabel label3;
    private JLabel rondes3;
    private JLabel label4;
    private JLabel rondes4;
    private VistaJoc panel1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void registraControlador (ControladorJoc cj){
        panel1.registraControlador(cj);
        button1.addActionListener(cj);
        button1.setActionCommand("ABANDONA");

        panel1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("UP"), "up");
        panel1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("DOWN"), "down");
        panel1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("LEFT"), "left");
        panel1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("RIGHT"), "right");
        panel1.getActionMap().put("up", new Move(1, cj));
        panel1.getActionMap().put("down", new Move(2, cj));
        panel1.getActionMap().put("left", new Move(3, cj));
        panel1.getActionMap().put("right", new Move(4, cj));

    }

    public VistaJoc getPanel1() {
        return panel1;
    }

    public void iniciaJoc(){
        panel1.iniciar();
    }

    public void insereixJugador(String[] logins){
        switch (logins.length){
            case 2:
                label1.setText(logins[0]);
                label4.setText(logins[1]);
                break;
            case 3:
                label1.setText(logins[0]);
                label2.setText(logins[1]);
                label3.setText(logins[2]);
                break;
            case 4:
                label1.setText(logins[0]);
                label2.setText(logins[1]);
                label3.setText(logins[2]);
                label4.setText(logins[3]);
                break;

        }
    }

    public void setRondes(int[] rondes){
        switch (rondes.length){
            case 2:
                rondes1.setText(rondes[0]+"");
                rondes4.setText(rondes[1]+"");
                break;
            case 3:
                rondes1.setText(rondes[0]+"");
                rondes2.setText(rondes[1]+"");
                rondes3.setText(rondes[2]+"");
                break;
            case 4:
                rondes1.setText(rondes[0]+"");
                rondes2.setText(rondes[1]+"");
                rondes3.setText(rondes[2]+"");
                rondes4.setText(rondes[3]+"");
                break;
        }
    }
    public void aturar(){
        panel1.aturar();
    }

}
