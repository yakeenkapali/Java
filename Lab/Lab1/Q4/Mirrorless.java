interface Canon{

    default void print(){
        System.out.println("Canon EOS R5");
    }

}

interface Sony{

    default void print(){
        System.out.println("Sony A7 III");
    }

}

class Mirrorless implements Canon ,Sony{

    public void print(){

        Canon.super.print();
        Sony.super.print();

    }
    
    public static void main(String [] args){

        Mirrorless o1 = new Mirrorless();
        o1.print();
        
    }
}