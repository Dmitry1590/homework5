package homework5;


public class Employer {

        public String Person;// если скобок нет это "поле"
        public String Position;
        public String email;
        public String telephone_number; //предварительно обявляю переменную строкового типа (если понадобится сделаем числового)
        public String salary;
        public int age;

        public void Employ_info () {
            System.out.println("Имя Фамилия Отчетсво: " + Person);
            System.out.println("Должность: " + Position);
            System.out.println("Почта: " + email);
            System.out.println("Телефон: " + telephone_number);
            System.out.println("Зарплата: " + salary);
            System.out.println("Возраст: " + age);

        }


    }

