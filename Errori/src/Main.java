import es1.InterException;
import es1.LimitiArray;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};

        LimitiArray es1 = new LimitiArray(array);

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Dimmi un numero che vuoi mettere nell'array");
            int num1 = scanner.nextInt();
            System.out.println("Dimmi in che posizione vuoi metterlo");
            int position = scanner.nextInt();
            if (num1 == 0 ){
                scanner.close();
            }else {
                es1.replaceNumber(array, position, num1);
            }


        } catch (InterException e) {
            System.err.println(e.getMessage());


        } finally {
            scanner.close();
        }
    }
}








