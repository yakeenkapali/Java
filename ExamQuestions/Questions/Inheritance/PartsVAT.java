public class PartsVAT extends Parts{
    PartsVAT(int sn, String m, String n, double p){
        super(sn, m, n, p);
    }

    public void calcVAT(Parts obj){
        System.out.println("VAT is " + obj.price*0.13);
    }
}