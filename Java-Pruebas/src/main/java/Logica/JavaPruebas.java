package Logica;
import Igu.Pantalla;
import java.util.ArrayList;

public class JavaPruebas {

    public static void main(String[] args) {
        
        ArrayList<User> dataBase = new ArrayList<>();
        
        Pantalla panta = new Pantalla(dataBase);
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
        
        User loviUser = new User("Santiago", "Lovi", 20, 450, "loviSanti", "prueba1234");
        User baccleanUser = new User("Charles", "Bacclean", 20, 460, "charlesBacclean", "lavandina");
        dataBase.add(loviUser);
        dataBase.add(baccleanUser);
        

        
    }
    
     //  <! -------------------  Methods ------------------- !>

    
}
