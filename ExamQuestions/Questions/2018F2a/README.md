### Alternative(Without toString() method) :

```

public static void main(String[] args){
        Employee e1 = new Employee(1, "Yakeen", "BESE", 10000);
        Employee e2 = new Employee(2, "Dhiraj", "BECE", 20000);

        System.out.println(e1.id + e1.name + e1.post + e1.salary);
        System.out.println(e2.id + e2.name + e2.post + e2.salary);
    }

```