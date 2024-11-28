import java.util.Scanner;


class WrongAge extends Exception {
    
    public WrongAge() {
        super("Age Error");
    }
    public WrongAge(String message) {
        super(message);
    }
}
class Father {
    protected int fatherAge;
    public Father(Scanner scanner) throws WrongAge {
        System.out.print("Enter father's age: ");
        fatherAge = scanner.nextInt();
        if (fatherAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }
    public void display() {
        System.out.println("Father's Age: " + fatherAge);
    }
}
class Son extends Father {
    private int sonAge;
    public Son(Scanner scanner) throws WrongAge {
        super(scanner);
        System.out.print("Enter son's age: ");
        sonAge = scanner.nextInt();
        if (sonAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to father's age");
        }
    }
    public void display() {
        super.display();
        System.out.println("Son's Age: " + sonAge);
    }
}
public class java_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Son son = new Son(scanner);
            son.display();
        } catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
