package Logica;

public class Person {
    protected String name, surname;
    protected int age, id;
    
    public Person(String name, String surname, int age, int id){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }
    
    
    //  <! -------------------  Getters and Setters  ------------------- !>
    public String getName(){
        return name;
    }
    public void setName(String value){
        this.name = value;
    }
    
    public String getSurname(){
        return surname;
    }
    public void setSurname(String value){
            this.surname = value;
    }
    
        public int getAge(){
        return age;
    }
    public void setAge(int value){
        this.age = value;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int value){
            this.id = value;
    }
    
    
    //  <! -------------------  Methods  ------------------- !>
    public void saludar(){
        System.out.println("My name is " + name);
    }
    
    
    
}
