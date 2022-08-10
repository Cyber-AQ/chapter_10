package example1;

import java.util.*;

public class phoneNumber {
    public static void main(String[] args) {
        // format is XXX-L
        boolean good = true;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your employee number in format of XXX-L");
        String employeeNumber = scan.nextLine();

        if (employeeNumber.length() != 5){
            good = false;
        }
        while(good == true && count < 3){ //for XXX
            if(!Character.isDigit(employeeNumber.charAt(count))){
                good = false;
            }
            count++;
        }

        while(good == true && count < 4){
            if(!((employeeNumber.charAt(count)) == '-')){
                good = false;
            }
            count++;
        }

        while(good == true && count < 5){ //for XXX
            if(!Character.isLetter(employeeNumber.charAt(count))){
                good = false;
            }
            count++;
        }

        if(good == true){
            System.out.println(employeeNumber+" was entered correctly.");
            System.out.println("Based to the format: XXX-L");
        }else{
            System.out.println(employeeNumber+" was entered wrongly.");
            System.out.println("Not based to the format: XXX-L");
        }
    }
}
