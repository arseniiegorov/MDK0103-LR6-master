import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        List<String> list2 = new ArrayList<>();
        list2.add("Lol");
        list2.add("Keka");
        list2.add("Lal");

        System.out.println(numElements(list));
        System.out.println(numElements(list2));

        Integer[] array = new Integer[] { 1,2,3,4,5,6,7,8,9,0};
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(change(array, 1,5)));

    }

    public static <T> int numElements(Collection<T> c) {
        int i = 0;

        for (T t: c) {
            if (t instanceof Integer) {
                if (((Integer) t % 2) == 0) {
                    i++;
                }
            }
            else if (t instanceof String) {
                if (((String) t).contains("a")){
                    i++;
                }
            }
        }

        return i;
    }

    public static <T> T[] change(T[] array, int i, int i2) {

        T[] arr = array;

        T a = arr[i];
        arr[i] = arr[i2];
        arr[i2] = a;

        return arr;
    }
}
