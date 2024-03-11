import es1.InterException;
import es1.LimitiArray;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws InvalidLitri {

        int[] array = {1, 2, 3, 4, 5, 6};

        LimitiArray es1 = new LimitiArray(array);

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Dimmi un numero che vuoi mettere nell'array");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Dimmi in che posizione vuoi metterlo");
            int position = Integer.parseInt(scanner.nextLine());
            if (num1 == 0 ){
                scanner.close();
            }else {
                es1.replaceNumber(array, position, num1);
            }


        } catch (InterException e) {
            System.err.println(e.getMessage());
        }




        System.out.println("---------------------------------------------------------------------------------");



        try {
            System.out.println("Inserisci i km percorsi");
            double km = Double.parseDouble(scanner.nextLine());
            System.out.println("Inserisci i i litri consumati");
            double litri = Double.parseDouble(scanner.nextLine());
            KmLitro(km,litri);

        } catch (InvalidLitri e) {
            System.err.println(e.getMessage());


        } finally {
            scanner.close();
        }


    }


    public static void KmLitro(double km, double litri) throws InvalidLitri{
        if (litri <=0) throw new InvalidLitri(litri);
        System.out.println(km/litri);
    }
}










