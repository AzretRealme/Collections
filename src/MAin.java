import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import java.util.List;
public class MAin {
    public static void main(String[] args) {

        List<Integer> time = new ArrayList<>();
        System.out.println("----находим количество секунд (минута)----");
        time.add(1 * 60); // находим количество секунд (минута)
        System.out.println("----находим количество секунд (час)----");
        time.add(60 * 60); // находим количество секунд (час)
        System.out.println("----находим количество секунд (день)----");
        time.add(1440 * 60);  // находим количество секунд (день)
        System.out.println("----находим количество секунд (неделя)----");
        time.add(10080 * 60);  // находим количество секунд (неделя)
        System.out.println("----находим количество секунд (30 дней)----");
        time.add(43200 * 60);  // находим количество секунд (30 дней)
        //time.forEach(System.out::println);

        Collections.sort(time);
        time.forEach(System.out::println);

        int position = Collections.binarySearch(time, 60);
        System.out.println(" --с помошью бин поиска нашли кол-во секунд в минуте. " + position);
        System.out.println("------------------------------------");

        Collections.reverse(time);
        time.forEach(System.out::println);
        System.out.println("---Отсортировали в обратном порядке ");
        System.out.println("------------------------------------");

        Collections.shuffle(time);     //сортирует вразброс
        time.forEach(System.out::println);
        System.out.println("---сортируем вразброс");
        System.out.println(" ---Затем находим макс-е и минимальное значение в списке");
        System.out.println(Collections.max(time));
        System.out.println(Collections.min(time));

        System.out.println("------------------------------------");
        Collections.fill(time, 42); //заменяем  весь список на один и тот же эелемент
        time.forEach(System.out::println);
        System.out.println(" ---заменяем  весь список на один и тот же эелемент");


        //System.out.println(Collections.max(time));
        //System.out.println(Collections.min(time));

    }
}
