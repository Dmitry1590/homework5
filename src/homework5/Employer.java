package homework5;


public class Employer {

        private String Person;// если скобок нет это "поле"
        private String Position;
        private String email;
        private String telephone_number; //предварительно обявляю переменную строкового типа (если понадобится сделаем числового)
        private int salary;
        private int age;

// создаем конструктор Employer
    public Employer(String Person,String Position,String email, String telephone_number, int salary,int age){
        this.Person=Person;
        this.Position=Position;
        this.email=email;
        this.telephone_number=telephone_number;
        this.salary=salary;
        this.age=age;
    }


        public void info () {
           // System.out.println("Имя Фамилия Отчетсво: " + Person);
           // System.out.println("Должность: " + Position);
            //System.out.println("Почта: " + email);
           // System.out.println("Телефон: " + telephone_number);
           // System.out.println("Зарплата: " + salary);
           // System.out.println("Возраст: " + age);
            System.out.printf("%n Employer: %n ФИО: %s %n email: %s %n Должность: %s %n телефон: %s %n зарплата: %d %n Возраст: %d %n", Person, email, Position, telephone_number, salary, age);
                     //Position, email,telephone_number, salary, age);

        }
// сделаем геттеры (узнать значение переменной) и сеттеры (изменить значение переменной)
    public String getPerson() {
        return Person;
    }

    public String getPosition() {
        return Position;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setPerson(String person) {
        Person = person;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
    }

    public void setSalary(int salary) {
       if (salary<182) {
           System.out.println("Зарплата не может быть меньше прожиточного минимума");
           return;
       }
        this.salary = salary;
    }

    public void setAge(int age) {
        if (age<0) {
            System.out.println("Возраст не может быть отрицательным");
            return;
        }
        this.age = age;
    }
// добавим метод toString для вывода нашего объекта на экран в текстовом виде
    @Override
    public String toString() {
        return "Employer{" +
                "Person='" + Person + '\'' +
                ", Position='" + Position + '\'' +
                ", email='" + email + '\'' +
                ", telephone_number='" + telephone_number + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}

