package example1;
import java.util.*;
public class exercise1 {
    public static void main(String[] args) {

        String employeeName, employeeNumber, hireDate;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        employeeName = scan.nextLine();

        System.out.print("Please enter your employee number: ");
        employeeNumber = scan.nextLine();

        System.out.print("Please enter the date you was hired: ");
        hireDate = scan.nextLine();

        int shift;
        double pay;

        System.out.println("1. Day \n"+ "2. Night");
        System.out.print("Enter shift value: ");
        shift = scan.nextInt();

        System.out.println("Enter pay rate");
        pay = scan.nextDouble();

        productionWorker prod = new productionWorker(employeeName,employeeNumber,hireDate,shift,pay);
        System.out.println(prod.toString());

    }
}
