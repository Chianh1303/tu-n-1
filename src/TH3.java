import java.util.Scanner;

public class TH3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double cannang, chieucao, bmi;
            System.out.print("Cân nặng của bạn :");
            cannang = scanner.nextDouble();

            System.out.print("Chiều cao của bạn: ");
            chieucao = scanner.nextDouble();
            bmi = chieucao / Math.pow(cannang, 2);
            System.out.println( "bmi");

            if (bmi < 18)
                System.out.println(  "cảnh báo" );
            else if (bmi < 25.0)
                System.out.println( "Bình thường" + bmi);
            else if (bmi < 30.0)
                System.out.println( "Thừa cân"+ bmi);
            else
                System.out.println( "béo phì"+ bmi);
        }
    }
    

