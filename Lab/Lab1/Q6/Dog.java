class Dog extends Animal
{
    String type ;
    Dog (String type){
        super(); //calls the constructor of parent i.e of class Animal;
        this.type= type;
    }

    void classify(){
        System.out.println("type:"+this.type);
    }

    public static void main(String [] args){

        Dog d1 = new Dog("labrador");
        d1.classify();
    }
}