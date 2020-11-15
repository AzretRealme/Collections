import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import java.util.List;
public class MAin {
    public static void main(String[] args) {

        List<Integer> time = new ArrayList<>();
        time.add(1 * 60); //результат секунд в минуту
        time.add(60 * 60); // результат секунд в час
        time.add(1440 * 60);  //результат секунд в сутки
        time.add(10080 * 60);  // результат секунд в неделю
        time.add(43200 * 60);  // результат секунд в месяц
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
