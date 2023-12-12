import java.util.Scanner;
public class KitleEndeksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double height,weight;

        System.out.println("Lütfen Boyunuzu metre cinsinden giriniz");
        height = input.nextDouble();

        System.out.println("Lütfen Kilonuzu giriniz");
        weight = input.nextDouble();

        double indeks = weight/ (height * height);

        System.out.println("Vücut Kitle İndeksiniz :" +indeks);


    }
}
