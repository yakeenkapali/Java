class StaticDemo{

    static int count;

    StaticDemo(){
    
        count++;
    
    }

    static void showCount(){
    
        System.out.println("Total object of staticDemo:"+count);
    
    }

    public static void main(String [] args){
 
        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();
        StaticDemo s3 = new StaticDemo();
        StaticDemo.showCount();
 
    }

}