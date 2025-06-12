import java.util.Scanner;

public class Ltd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE EMPLOYEE ID:");
        String empId = sc.nextLine();

        System.out.println("ENTER THE EMPLOYEE NAME:");
        String empName = sc.nextLine();

        System.out.println("ENTER THE SALARY:");
        int salary = Integer.parseInt(sc.nextLine());

        // ... rest of your code
        sc.close();
    }
}
