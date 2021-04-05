import java.util.Scanner;
public class soNguyento {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        while (number < 100) {
            count = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    count++;
            }
            if (count == 0 || number == 2)
                System.out.println(number);
            number++;
        }
    }
}
