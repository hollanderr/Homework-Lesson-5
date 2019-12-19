class Employee{

    private String Name;
    private String Position;

    private String Email;
    private String Telephone;
    private long Age;
    private long Salary;

    public Employee(String name, String position, String email, String phone, long age, long salary){
        this.Name = name;
        this.Position = position;
        this.Email = email;
        this.Telephone = phone;
        this.Age = age;
        this.Salary = salary;
    }
    public String getName()
    { return Name;}
    public String getPosition()
    { return Position;}
    public String getEmail()
    { return Email;}
    public String getTelephone()
    {return Telephone;}
    public long getAge()
    {return Age;}
    public long getSalary()
    {return Salary;}

}
public class Main {
    public static void main(String[] args) {
        Employee[] staff = new Employee[5];
        staff[0]=new Employee("Иванов И.И.","Engineer", "ivanov@mail.ru",
                "+7921-555-00-00", 45, 80000);
        staff[1]=new Employee("Сидоров С.С.","Architect", "sidorov@mail.ru",
                "+7921-777-00-00", 33, 75000);
        staff[2]=new Employee("Мозгоклюева А.А.","Жена Директора", "mozgoklueva@mail.ru",
                "+7921-666-00-00", 48, 98000);
        staff[3]=new Employee("Петров П.П.","Помощник Боширова", "fsb666ivanov@mail.ru",
                "+7921-333-03-03", 38, 88000);
        staff[4]=new Employee("Боширов И.Ш.","Спец. 'Новичок'", "fsb777@mail.ru",
                "+7921-333-02-02", 43, 90000);

        for(int i=0; i<staff.length; i++)
            System.out.println("\n\tФИО: "+staff[i].getName() + ", Должность: " + staff[i].getPosition() +
              ", Тел: " + staff[i].getTelephone() + ", Email: " + staff[i].getEmail() +
                    ", Возраст: " + staff[i].getAge() + ", З/плата: " + staff[i].getSalary());


    }
}