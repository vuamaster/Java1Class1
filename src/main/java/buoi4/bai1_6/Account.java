package buoi4.bai1_6;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        balance = balance+amount; // nap tien
        return balance;
    }
    // thanh toan
    public int debit(int amount){
        if (amount <= balance){
            balance = balance- amount;
        }else {
            System.out.println("Amount exceeded balance ");
        }
        return balance;
    }
    // chuyen khoan
    public int transferTo(Account another,int amount){
        // A: balance 100$, b balance 80
        // A->B 30
        // A-30, B+30
        if(this.balance < amount){
            System.out.println("Amount exceeded balance");
        }
        else {
            // Tru Amount trong tai khoan hien tai
            this.balance = this.balance - amount;
            // Tang amount trong tai khoan con laij
            another.balance = another.balance + amount;
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id  +
                ", name='" + name  +
                ", balance=" + balance +
                ']';
    }
}
