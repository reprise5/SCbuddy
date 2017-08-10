package scbuddy;

/**
 * @author Miss Prism (Reprise)
 */
public class Main {

    public static void main(String[] args) {
        /*Set the look and feel.  Primary is GnomeToolKit+, secondary is Nimbus, otherwise fallback.*/
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
                else if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SCform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        SCform form1 = new SCform();
        form1.setVisible(true);
    }  
}
