/**
 * Employee
 */
public class Employee {

    String name, lastName;
    int salary;
    int workHours;
    int hireYear;
    int year = 2021;

    public Employee(String name, String lastName, int salary, int workHours, int hireYear) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int raiseSalary() {
        if (year - hireYear < 10) {
            return salary * 105 / 100;
        }
        if (year - hireYear >= 10 && year - hireYear < 20) {
            return salary * 110 / 100;
        }
        if (year - hireYear >= 20) {
            return salary * 115 / 100;
        } else {
            return 0;
        }

    }

    public int tax() {
        if (this.salary >= 1000) {
            return (salary * 3 / 100);
        } else {
            return 0;
        }

    }

    public int bonus() {

        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    public void showInfos() {

        System.out.println("Adi: " + this.name);
        System.out.println("Maas :" + this.salary);
        System.out.println("Soyadi: " + this.lastName);
        System.out.println("Calisma saati: " + this.workHours);
        System.out.println("Baslangic yili: " + this.hireYear);
        System.out.println("Vergi:  " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Vergi ve bonuslarla maas: " + (bonus() - tax() + salary));
        System.out.println("Toplam maas: " + (bonus() - tax() + raiseSalary()));
    }

}