public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax = 0;
        if (salary < 1000) {
            tax = 0;
        } else
            tax = (salary * 3) / 100;
        return tax;
    }

    double bonus() {
        double bonus = 0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    double raiseSalary() {
        double raise;
        if ((2021 - hireYear) < 10) {
            raise = salary / 20;
        }
        if ((2021 - hireYear) > 9 && (2021 - hireYear) < 20) {
            raise = salary / 10;
        } else
            raise = salary * 15 / 100;
        return raise;
    }

    public String toString() {
        System.out.println("Adı : " + name);
        System.out.println("Maaşı : " + salary);
        System.out.println("Çalışma Saati : " + workHours);
        System.out.println("Başlangıç Yılı : " + hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + ((salary + bonus()) - tax()));
        System.out.println("Toplam Maaş : " + (salary + raiseSalary()));

        return null;
    }


}
