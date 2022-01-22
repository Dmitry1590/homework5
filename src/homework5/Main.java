package homework5;

public class Main {
    public static void main(String[] args) {

        Employer employer1 = new Employer("Иванов Иван Иванович", "разработчик Java","IvanIvan@yandex.ru", "88007002517", 1000, 55);
        /*employer1.Person = "Иванов Иван Иванович";
        employer1.Position = "разработчик Java";
        employer1.email = "IvanIvan@yandex.ru";
        employer1.telephone_number = "88007002517";
        employer1.salary = 1000;
        employer1.age = 55;*/

        Employer employer2 = new Employer("Петров Петр Петрович", "таксист","PetrPetr@yandex.ru", "88007005623", 400, 28 );
        /*employer2.Person = "Петров Петр Петрович";
        employer2.Position = "таксист";
        employer2.email = "PetrPetr@yandex.ru";
        employer2.telephone_number = "88007005623";
        employer2.salary = 400;
        employer2.age = 28;*/

        Employer employer3 = new Employer("Кузнецов Петр Петрович", "сборщик мебели","KuznecPetr@yandex.ru", "88007005656", 600, 45 );
        /*employer3.Person = "Кузнецов Петр Петрович";
        employer3.Position = "сборщик мебели";
        employer3.email = "KuznecPetr@yandex.ru";
        employer3.telephone_number = "88007005656";
        employer3.salary = 600;
        employer3.age = 45;*/

        Employer employer4 = new Employer("Кузнецова Ольга Петровна", "кассир","KuznecOP@yandex.ru", "88007001215", 400, 38 );

        /*employer4.Person = "Кузнецова Ольга Петровна";
        employer4.Position = "кассир";
        employer4.email = "KuznecOP@yandex.ru";
        employer4.telephone_number = "88007001215";
        employer4.salary = 400;
        employer4.age = 38;*/

        Employer employer5 = new Employer("Каськив Дмитрий Игоревич", "инженер-проектировщик","dmitry.kaskiv@yandex.ru", "8963844172", 2000, 29 );

        employer5.setTelephone_number("89638844172");
//employer5.info();
       // employer4.info();
        //employer3.info();

        //создаем массив работников (5шт)

        Employer[] employers = new Employer[5];
        // переопределяем элементы массива назначаем им ссылки на объекты employer

        //наше ДЗ в принципе выглядит сразу в эти строчки
        employers[0] = new Employer("Иванов Иван Иванович", "разработчик Java","IvanIvan@yandex.ru", "88007002517", 1000, 55);
        employers[1] = new Employer("Петров Петр Петрович", "таксист","PetrPetr@yandex.ru", "88007005623", 400, 28 );
        employers[2] = new Employer("Кузнецов Петр Петрович", "сборщик мебели","KuznecPetr@yandex.ru", "88007005656", 600, 45 );
        employers[3] = new Employer("Кузнецова Ольга Петровна", "кассир","KuznecOP@yandex.ru", "88007001215", 400, 38 );
        employers[4] = new Employer("Каськив Дмитрий Игоревич", "инженер-проектировщик","dmitry.kaskiv@yandex.ru", "8963844172", 2000, 29 );

   //теперь нужно вывести наш массив работников
       // for (int i= 0; i<employers.length; i++) {
        //    System.out.println(employers[i]);
      //  }
                //если не определить значения массива тогда выведется значение null так как коробка создалась но значение в ней не вложено

        // попробуем распечатать объект массива
       // System.out.println(employers[1]);

        //выведется ссылка на объект: homework5.Employer@4b67cf4d

        //как распечатать объект массива в читаемом виде?
        //используем метод toString (преобразует объек к строковому виду)
        for (int i= 0; i<employers.length; i++) {
            System.out.println(employers[i]);

            //в классе Employer добавляем метод to String с описанием вывода
        }

        //теперь выполним требование заказчика вывести информацию о сотрудниках старше 40 лет

        System.out.printf( "%nВыведи данные о работниках старше 40 лет: %n");
        for (int i= 0; i<employers.length; i++) {
            if (employers[i].getAge()>40){
                employers[i].info();
            }
        }

    }
}