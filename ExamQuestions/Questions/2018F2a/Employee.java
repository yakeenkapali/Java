class Employee{
    int id;
    String name;
    String post;
    double salary;

    Employee(int id, String name, String post, double salary ){
        this.id = id;
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public String toString(){
        return id+" "+name+" "+post+" "+salary; 
    }
    
    public static void main(String[] args){
        Employee e1 = new Employee(1, "Yakeen", "BESE", 10000);
        Employee e2 = new Employee(2, "Dhiraj", "BECE", 20000);

        System.out.println(e1);
        System.out.println(e2);
    }
}
