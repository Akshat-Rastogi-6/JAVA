class instruction{
    private int acc_no;
    private String name;
    double balance;


    instruction(){
        acc_no = 0;
        name = "";
        balance = 0;
    }

    void set(int ac, String n, double bal){
        acc_no = ac;
        name = n;
        balance = bal;
    }

    void showInfo(){
        System.out.println("Account Number : " + acc_no);
        System.out.println("Account Holder Name : " + name);
        System.out.println("Account Balance : " + balance);
    }

    void deposit(double amount){
        balance = balance + amount;
        System.out.println("The total Amount in the Account is : " + balance);
    }

    void withdrawn(double amount){
        if(balance>=amount){
            balance = balance - amount;
            System.out.println("The total Amount in the Account is : " + balance);
        }
        else{
            System.out.println("The total Amount in the Account is : " + balance);
        }
    }
}

class SavingAccount extends instruction{
    private double interestRate;

    SavingAccount(double rate){
        interestRate = rate;
    }

    void calculate(){
        double a = ((interestRate/100)*balance)+balance;
        System.out.println("After the interest : " + a);
    }
}

class CheckingAccount extends instruction{
    private int cout;
    private double fees = 51.265;

    CheckingAccount(int cnt){
        cout = cnt;
    }

    void deductf(){
        balance = balance - (cout*fees);
        System.out.println("The balance after transaction fees. " + balance);
    }
}

class bank {
    public static void main(String[] args) {
        SavingAccount acc = new SavingAccount(5);
        acc.set(1023125565,"Akshat",250000);
        acc.showInfo();
        acc.deposit(1000);
        acc.showInfo();
        acc.withdrawn(101000);
        acc.calculate();

        CheckingAccount can = new CheckingAccount(10);
        can.set(1023125565,"Akshat",250000);
        can.showInfo();
        can.deposit(1000);
        can.showInfo();
        can.withdrawn(101000);
        can.deductf();
    }
}