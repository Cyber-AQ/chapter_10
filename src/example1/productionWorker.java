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

public class productionWorker extends employee {
    private int shift; // either day or night.
    private double hourlyPayRate;

    public productionWorker(String employeeName, String employeeNumber, String hireDate,
                            int shift, double hourlyPayRate){
        super(employeeName,employeeNumber,hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

@Override
    public String toString(){
        String str = super.toString();

        if(getShift() == 1) {
            str += ", Works on: " + "Day";
        }else if ((getShift() == 2)){
            str += ", Works at: " + "Night";
        }else{
            str += ", NO SUCH SHIFT";
        }
        str += ", and get paid hourly rate of: " + getHourlyPayRate();

        return str;
    }
}
