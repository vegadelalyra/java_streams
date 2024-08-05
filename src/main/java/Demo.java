import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 9, 8, 6, 4, 7);

        // lambda!
        Predicate<Integer> predi = integer -> integer % 2 == 1;

        int result = nums
                .parallelStream()
                .filter(predi)
                .sorted()
                .map(n -> n * 2)
                .reduce(0, Integer::sum);

        System.out.println(result);

//    for (int n : nums) {
//            System.out.println(n*2);
//        }
    }
}