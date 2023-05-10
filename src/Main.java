import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }

        System.out.println("");

        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new TreeSet<>();
        for (Integer num : nums1) {
            if (num % 2 == 0) {
                set.add(num);
            }
        }
        System.out.println(set);

        System.out.println("");

        List<String> nums2 = new ArrayList<>(List.of("qwerty", "uiop", "poiu", "qwerty", "asdf", "zxc", "asdf"));
        Set<String> set2 = new HashSet<>(nums2);
        System.out.println(set2);

        System.out.println("");

        List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (!map.containsKey(string)) {
                map.put(string, 1);
            } else {
                map.put(string, map.get(string) + 1);
            }
        }
        System.out.println(map.values());
    }
}