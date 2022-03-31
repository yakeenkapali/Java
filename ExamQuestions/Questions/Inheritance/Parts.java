public class Parts{
    int sno;
    String model;
    String name;
    double price;

    public Parts(int sn, String m, String n, double p){
        sno = sn;
        model = m;
        name = n;
        price = p;
    }

    public void calcCommission(Parts obj){
        System.out.println("Commission is " + obj.price);
    }
}

