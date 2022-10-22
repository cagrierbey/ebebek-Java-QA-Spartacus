
public class Employee {
	
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;
	private double bonus;
	private double tax;
	private double raiseSalary;
	
	//Constructor method
	public Employee(String name, double salary, int workHours, int hireYear)
	{
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public void tax()
	{
		if (this.salary > 0 && this.salary < 1000) 
		{
			this.tax = 0;
		} 
		
		else 
		{
			this.tax = this.salary * 0.03;
		}
	}
	
	public void bonus()
	{
		if (this.workHours > 40) 
		{
			this.bonus = (this.workHours - 40) * 30;
		} 
		
		else 
		{
			this.bonus = 0;
		}
	}
	
	public void raiseSalary()
	{
		int currentYear = 2021;
		
		if (currentYear - this.hireYear < 10) 
		{
			this.raiseSalary = this.salary * 0.05;
		} 
		
		else if (currentYear - this.hireYear < 20)
		{
			this.raiseSalary = this.salary * 0.10;
		}
		
		else
		{
			this.raiseSalary = this.salary * 0.15;
		}
	}
	
	//toString method
	void printStatus()
	{
		System.out.println("********************************");
        System.out.println("Adý: " + this.name);
        System.out.println("Maaþý: " + this.salary);
        System.out.println("Çalýþma Saati: " + this.workHours);
        System.out.println("Baþlangýç Yýlý: " + this.hireYear);
        System.out.println("Vergi: " + this.tax);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Maaþ Artýþý: " + this.raiseSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte maaþ :" + (this.salary + this.bonus - this.tax));
        System.out.println("Toplam Maaþ: " + (this.salary + this.bonus + this.raiseSalary - this.tax));
        System.out.println("********************************");
	}

}
