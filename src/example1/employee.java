package example1;

/*
1. Employee and ProductionWorker Classes
Design a class named Employee. The class should keep the following information in fields:
•	 Employee name
•	 Employee number in the format XXX–L, where each X is a digit within the range 0–9
and the L is a letter within the range A–M.
•	 Hire date
Write one or more constructors and the appropriate accessor and mutator methods for the class.
Next, write a class named ProductionWorker that extends the Employee class. The
ProductionWorker class should have fields to hold the following information:
•	 Shift (an integer)
•	 Hourly pay rate (a double)
The workday is divided into two shifts: day and night. The shift field will be an integer value
representing the shift that the employee works. The day shift is shift 1 and the night shift is
shift 2. Write one or more constructors and the appropriate accessor and mutator methods for
the class. Demonstrate the classes by writing a program that uses a ProductionWorker object.
 */
public class employee {
    private String employeeName;
    private String employeeNumber;
    private String hireDate;

    public employee(String employeeName, String employeeNumber, String hireDate) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    public employee() {
        this.employeeName = "";
        this.employeeNumber = "";
        this.hireDate = "";
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {

        this.employeeName = employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {

        if(isValid(employeeNumber)){
            this.employeeNumber = employeeNumber;
           /*
            System.out.println(employeeNumber+" was entered correctly.");
            System.out.println("Based to the format: XXX-L");

            */
        }else{
            this.employeeNumber = null;
        }
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public boolean isValid(String employeeNumber){

        // format is XXX-L
        boolean good = true;
        int count = 0;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your employee number in format of XXX-L");
//        String employeeNumber = scan.nextLine();

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

        return good;
    }
    public String toString(){
        String str;
        str = "The Employee name is: "+getEmployeeName();
        str += ", and hired date of: "+getHireDate()+"\n";

        if (isValid(getEmployeeNumber())){
            str += ", With his employee number of: "
                    +getEmployeeNumber();
        }else{
            str += getEmployeeNumber()+" was entered wrongly."+
            "Not based to the format: XXX-L";
        }


        return str;
    }
}
