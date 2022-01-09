package polymorphism;

public class Payroll {

String name;


public int adjustSalary() {
System.out.println("need to calculate salary depends on its position");
return 0;
}




public Payroll(String name) {
super();
this.name = name;
}




public Payroll() {
super();
// TODO Auto-generated constructor stub
}




}



public class Academic extends Payroll {
	int workingDays;
    int dailyWages;
@Override
public int adjustSalary() {
int salary = workingDays*dailyWages;
return salary;
}
public String giveLecture() {
return name+" will conduct lecture on 10th std";
}
public Academic(String name, int workingDays, int dailyWages) {
super(name);
this.workingDays = workingDays;
this.dailyWages = dailyWages;

}
}

public class Admin extends Payroll{
int workingDays;
int dailyWages;
@Override
public int adjustSalary() {
int salary = workingDays*dailyWages;
return salary;
}
public String doAdminStuff() {
return "Admin need to add some employee list and its work according to position";
}public Admin(String name, int workingDays, int dailyWages) {
super(name);
this.workingDays = workingDays;
this.dailyWages = dailyWages;
}}

public class Main {public Main() {
// TODO Auto-generated constructor stub
}public static void main(String[] args) {
// TODO Auto-generated method stub
Academic academic = new Academic("Prathamesh", 23, 500);
Admin admin = new Admin("raju", 28, 1000);
System.out.println("Academic salary is "+academic.adjustSalary());
System.out.println("given lecture is "+academic.giveLecture());
System.out.println("Admin salary is "+admin.adjustSalary());
System.out.println("admin work is "+admin.doAdminStuff());
}
}


