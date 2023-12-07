package src;

public class CLients {
    String firstName;
    int age;
    int balance;
    
    CLients() {
        balance = 10;
    }

 

    void newAccount() {
        System.out.println(firstName + " Account created!");
        System.out.println(firstName + " the new balanced is $" + balance);
    }
}
