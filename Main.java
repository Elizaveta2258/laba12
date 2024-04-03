interface User{
    void DisplayMany();
    void Displaygod();
}
abstract class People implements User {
    String FIO;
    int Age;
    String Position;
    People(String FIO, int Age, String Position){
        this.FIO = FIO;
        this.Age = Age;
        this.Position = Position;
    }
}
class Teacher extends People{
    int Many;
    int god;
    Teacher(String FIO, int Age, String Position, int Many, int god) {
        super(FIO, Age, Position);
        this.Many=Many;
        this.god=god;
    }

    @Override
    public void DisplayMany() {
        System.out.println("Зарплата преподавателя: "+FIO+": "+Many);
    }

    @Override
    public void Displaygod() {
        System.out.println("Год начала работы преподавателя: "+FIO+": "+god);
    }
}
class Student extends People{

    int Many;
    int god;
    Student(String FIO, int Age, String Position, int Many, int god) {
        super(FIO, Age, Position);
        this.Many=Many;
        this.god=god;
    }

    @Override
    public void DisplayMany() {
        System.out.println("Стипедния студента "+FIO+": "+Many);
    }
    @Override
    public void Displaygod() {
        System.out.println("Год рождения студента "+FIO+": "+god);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Уханов А.А", 17, "Студент", 871, 2006);
        Teacher  teacher1= new Teacher("Ермохин Д.Е", 18, "Учитель", 23000, 1999);
        Teacher teacher = new Teacher("Лапицкий Д.В", 17, "Учитель", 34000, 2017);
        Student student1 = new Student("Воронова Е.А", 18, "Студент", 1020, 2006);
        student.DisplayMany();
        student.Displaygod();
        teacher.DisplayMany();
        teacher.Displaygod();
    }
}