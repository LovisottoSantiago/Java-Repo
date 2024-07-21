package Logica;

public class User extends Person {
    private String userName, userPassword;
    
    public User(String name, String surname, int age, int id, String userName, String userPassword){
        super(name, surname, age, id);
        this.userName = userName;
        this.userPassword = userPassword;
    }
    
     //  <! -------------------  Getters and Setters  ------------------- !>
    public String getUserName(){
        return userName;
    }
    public void setUserName(String value){
        this.userName = value;
    }
    
    public String getUserPassword(){
        return userPassword;
    }
    public void setUserPassword(String value){
        this.userName = value;
    }
    
    
     //  <! -------------------  Methods  ------------------- !>
    @Override
    public void saludar(){
        super.saludar();
        System.out.println("My username is " + userName);
        
    }
    
}
