// Q1. Write a program to demostrate all three types of constructor in java.

class Constructor{
    int id;
    String name;

    Constructor(){
        // default
        id = 48;
        name = "Yakeen Kapali";
        System.out.println("Default constructor called " + "name = " + name + "id = " + id);
    }

    Constructor( int id, String name){
        // parameterized constructor
        this.id = id;
        this.name = name;
        System.out.println("Parameterized constructor called " + name + id);
    }

    Constructor( Constructor c){
        // Copy Constructor
        id = c.id;
        name = c.name;
        System.out.println("Copy Constructor Called " + name + id);
    }
    
    public static void main(String[] args){
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(3, "Hari Prasad");
        Constructor c3 = new Constructor(c1);
    }   

}
