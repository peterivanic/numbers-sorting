import java.util.Random;

public class TernaryOperator {

    public static void main(String[] args) {

        Random i = new Random();
        int randomNumber = i.nextInt(999);

        System.out.println(randomNumber);

        randomNumber = (randomNumber % 2 == 0) ? randomNumber * 2 : randomNumber * -2;

        System.out.println(randomNumber);

        System.out.println(randomNumber = (randomNumber > 0) ? randomNumber * 2 : randomNumber * -2);

    }
}
