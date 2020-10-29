import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import java.util.List;
public class MAin {
    public static void main(String[] args) {

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
