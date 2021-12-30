class Company{
    public String name;
    public String address;
    public String founder;
    public int employee;
}

class CompanyDetail{

    public static void main(String[] args){
        
        Company A = new Company();
        A.name = "Mandala";
        A.address = "Lakeside";
        A.founder = "Nishal";
        A.employee = 10;

        Company B = new Company();
        B.name = "Growfore";
        B.address = "Newroad";
        B.founder = "Sudip";
        B.employee = 5;

        Company C = new Company();
        C.name = "Zeron";
        C.address= "Zero";
        C.founder = "Hari";
        C.employee = 10;

        System.out.println(C.name);
    }
}