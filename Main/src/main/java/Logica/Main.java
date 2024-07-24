package Logica;


import Gui.Login;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
         ArrayList<User> dataBase = new ArrayList<>();
        
         Login panta = new Login(dataBase);
         panta.setVisible(true);
         panta.setLocationRelativeTo(null);
        
         User loviUser = new User("Santiago", "Lovi", 20, 450, "loviSanti", "prueba1234");
         User baccleanUser = new User("Charles", "Bacclean", 20, 460, "charlesBacclean", "lavandina");
         dataBase.add(loviUser);
         dataBase.add(baccleanUser);
        

        
    }
    
     //  <! -------------------  Methods ------------------- !>

    
}
