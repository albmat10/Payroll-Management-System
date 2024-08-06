public class Payroll {
    private String employeeName;
    private int employeeId;
    private double hourlyPayRate;
    private double hoursWorked;

    public Payroll(String employeeName, int employeeId) throws InvalidNameException, InvalidIDException {
        if (employeeName.isEmpty()) throw new InvalidNameException();
        if (employeeId <= 0) throw new InvalidIDException("Invalid ID: ID must be positive.");
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    
    public void setHoursWorked(double hoursWorked) throws InvalidHoursException {
        if (hoursWorked < 0 || hoursWorked > 84) throw new InvalidHoursException();
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyPayRate(double hourlyPayRate) throws InvalidHourlyRateException {
        if (hourlyPayRate < 0 || hourlyPayRate > 25) throw new InvalidHourlyRateException();
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateGrossPay() {
        return hoursWorked * hourlyPayRate;
    }

    
}
