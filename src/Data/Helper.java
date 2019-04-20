package Data;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Helper {

    public static boolean checkCode(String code) {
        if (code.isEmpty() || code.length() != 12) {
            JOptionPane.showMessageDialog(null, "El còdigo debe contener 12 dìgitos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            return true;
        }
    }
    public static boolean checkCode2(String code) {
        if (code.isEmpty() || code.length() != 12) {
            JOptionPane.showMessageDialog(null, "El còdigo debe contener 12 dìgitos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!code.substring(0,3).equals("978")){
            JOptionPane.showMessageDialog(null, "El código ISBN debe empezar por 978 siempre.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            return true;
        }
    }
   
   
    public static void instructions() {
        JOptionPane.showMessageDialog(null, "Debe digitar primero el código de 12 dígitos"
                + ", no puede contener letras ni tampoco puede contener"
                + " menos ni más de 12 dígitos.\n Luego de digitar el código"
                + " presione el icono para generar el código.", "Instrucciones", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean onlyNumber(char c){
        String typed = String.valueOf(c);
        return !typed.matches("[0-9]");
    }

}
