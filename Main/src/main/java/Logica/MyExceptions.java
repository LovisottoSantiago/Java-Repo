package Logica;
import javax.swing.JOptionPane;

public class MyExceptions extends Exception{
    
    public MyExceptions(String message){
        JOptionPane.showMessageDialog(null, message, "Error 404", JOptionPane.ERROR_MESSAGE);
    }
}
