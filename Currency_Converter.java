import java.util.*;
import java.text.DecimalFormat;

public class Currency_Converter{

    public static void main(String[] args) {

        double rupee,dollar,pound,code,euro,KWD;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\t*** Welcome to Currency Converter Project ***\n\nEnter the Currenecy code:\n1:Rupees\n\n2:Dollar\n\n3:Pound\n\n4:Euro\n\n5:Kuwaiti dinar\n");
        code = sc.nextInt();

        if(code == 1){
            System.out.println("\nEnter amount in rupees:");
            rupee = sc.nextDouble();
           dollar = rupee / 77.34;
           System.out.println("Dollar : "+f.format(dollar));
           pound = rupee / 94.46;
           System.out.println("Pound : "+f.format(pound));
           euro = rupee / 80.36;
           System.out.println("Euro : "+f.format(euro));
           KWD = rupee / 251.92;
           System.out.println("Kuwaiti dinar : "+f.format(KWD));
        }

        else if(code == 2){
            System.out.println("Enter amount in dollar: \n");
            dollar = sc.nextDouble();
            rupee = dollar * 77.34;
            System.out.println("Rupees : "+f.format(rupee));
            pound = dollar * 0.82;
            System.out.println("Pound : "+f.format(pound));
            euro = dollar * 0.31;
            System.out.println("Euro : "+f.format(euro));
            KWD = dollar * 0.31;
            System.out.println("Kuwaiti Dinar : "+f.format(KWD));
        }

        else if (code == 3){
            System.out.println("Enter amount in Pound : \n");
            pound = sc.nextDouble();
            rupee = pound * 94.43;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = pound * 1.17;
            System.out.println("Dollar : "+f.format(dollar));
            euro = pound * 1.17;
            System.out.println("Euro : "+f.format(euro));
            KWD = pound * 0.3748;
            System.out.println("Kuwaiti Dinar : "+f.format(KWD));
        }

        else if (code == 4){
            System.out.println("Enter amount in Euro : \n");
            euro = sc.nextDouble();
            rupee = euro * 80.43;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = euro * 1.04;
            System.out.println("Dollar : "+f.format(dollar));
            pound = euro * 0.85;
            System.out.println("Pound : "+f.format(pound));
            KWD = euro * 0.318949;
            System.out.println("Kuwaiti Dinar : "+f.format(KWD));
        }

        else if (code == 5){
            System.out.println("Enter amount in Kuwaiti Dinar : \n");
            KWD = sc.nextDouble();
            rupee = KWD * 251.96;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = KWD * 3.26;
            System.out.println("Dollar : "+f.format(dollar));
            euro = KWD * 3.13;
            System.out.println("Euro : "+f.format(euro));
            pound = KWD * 2.67;
            System.out.println("Pound : "+f.format(KWD));
        }

        else{
            System.out.println("Invalid Input !!!");
        }

    }
}
