
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithExtraCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int candies[] = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        kidsWithCandies(candies, extraCandies);
    }
}
