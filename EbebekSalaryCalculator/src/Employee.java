public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) return 0;

        return (this.salary * 0.03);
    }

    public double bonus() {
        if (this.workHours > 40) return ((workHours - 40) * 30);
        return 0;
    }

    public double raiseSalary() {
        int workYears = 2021 - this.hireYear;
        double netSalary = this.salary - tax() + bonus();

        if (workYears < 10) {
            return (netSalary * 0.05);
        } else if (workYears < 20) {
            return (netSalary * 0.10);
        }

        return (netSalary * 0.15);
    }

    public String toString() {
        return "---------------------------------------------" +
                "\nAdı: " + getName() +
                "\nMaaşı: " + getSalary() +
                "\nÇalışma saati: " + getWorkHours() +
                "\nBaşlangıç yılı: " + getHireYear() +
                "\nVergi: " + tax() +
                "\nBonus: " + bonus() +
                "\nMaaş artışı: " + raiseSalary() +
                "\nVergi ve bonuslarla birlikte maaş: " + (getSalary() - tax() + bonus()) +
                "\nToplam maaş: " + (getSalary() - tax() + bonus() + raiseSalary()) +
                "\n---------------------------------------------";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
