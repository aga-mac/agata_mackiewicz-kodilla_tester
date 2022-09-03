import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
    public List<Integer> numbersList = new ArrayList<>();

    public void generateRandomNumbers () {
        Random randomGenerator = new Random();
        int sum = 0;
        int randomNumber = randomGenerator.nextInt (31);
        do {
          sum += randomNumber;
          numbersList.add(randomNumber);
        } while (sum < 5000);
        Collections.sort(numbersList);
        System.out.println("Suma = " + sum);
    }
    public Integer getMin () {
        return numbersList.get(0);
    }
    public Integer getMax () {
        return numbersList.get(numbersList.size() - 1);
    }

    public static void main(String[] args) {
        RandomNumbers x = new RandomNumbers ();
        x.generateRandomNumbers();
        Integer min = x.getMin();
        Integer max = x.getMax();
        System.out.println(min);
        System.out.println(max);
    }
}
