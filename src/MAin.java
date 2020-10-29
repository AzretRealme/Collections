import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import java.util.List;
public class MAin {
    public static void main(String[] args) {

      /*  ArrayList<String> books = new ArrayList<>(5);
        books.add("Том Сойер");
        books.add("Джек Лондон");
        books.add("Витязь в тигровой шкуре");
        books.add("Алхимик");
        books.add("Маленький принц");
        books.add("Маленький принц");
        books.add("Маленький принц");


        //books.forEach(System.out::println);

        Collections.sort(books);
        books.forEach(System.out::println);

        System.out.println("-----------------------------");*/

        /*int position = Collections.binarySearch(books, "Алхимик");

        System.out.println(position);*/
       /*
        Collections.reverse(books);   //сортирует с низу вверх
        books.forEach(System.out::println);

        Collections.shuffle(books);     //сортирует вразброс
        books.forEach(System.out::println);

        Collections.fill(books, "Маленький принц"); //клонирует весь список тоист заменяет на все своей строчкой
        books.forEach(System.out::println);

        */
        //Collections.copy(books, books);     //kopieren
        //Collections.rotate(books, 1); //andern nach ein

        /*List<String> a = Collections.unmodifiableList(books);
        a.add("Маленький принц"); //BUdet owibka
        books.add("Маленький принц"); //budet rabotat*/

        /*int count = Collections.frequency(books, "Маленький принц");
        System.out.println(count); //erzhalt, wie viel haben wir element*/

        //Collections.swap(books, 0, 2); //Wir haben swap gemacht
        //gibt es noch mal variant
        //Collections.swap(books, books.indexOf("Витязь в тигровой шкуре"), books.indexOf("Том Сойер"));
        //books.forEach(System.out::println);
       /* boolean a = Collections.disjoint(books, books);
        System.out.println(a); //Es Prufungt, ob es richtig oder falsch*/
        //"Секунды в часе" "Секунды в сутках" "Секунды в неделе" "Секунды в месяце"

        List<Integer> time = new ArrayList<>(5);
        time.add(60); //в минуту
        time.add(1200);  //  в час
        time.add(86400);  //в сутки
        time.add(604800);  // в неделю
        time.add(2592000);  // в месяц
        //time.forEach(System.out::println);

        Collections.sort(time);
        time.forEach(System.out::println);

        int position = Collections.binarySearch(time, 60 );
        System.out.println(" с помошью бин поиска нашли кол-во секунд в минуте. " + position);
        System.out.println("------------------------------------");

        Collections.reverse(time);
        time.forEach(System.out::println);
        System.out.println("Отсортировали в обратном порядке ");
        System.out.println("------------------------------------");

        Collections.shuffle(time);     //сортирует вразброс
        time.forEach(System.out::println);
        System.out.println("сортируем вразброс");
        System.out.println(" Затем находим макс-е и минимальное значение в списке");
        System.out.println(Collections.max(time));
        System.out.println(Collections.min(time));

        System.out.println("------------------------------------");
        Collections.fill(time, 60); //заменяем  весь список на один и тот же эелемент
        time.forEach(System.out::println);
        System.out.println(" заменяем  весь список на один и тот же эелемент");


        //System.out.println(Collections.max(time));
        //System.out.println(Collections.min(time));

    }
}
