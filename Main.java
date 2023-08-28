import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int r,a;
        double pi = 3.14, daireDilimiAlan;
        Scanner input = new Scanner(System.in);

        System.out.println("Yarı çap değerini giriniz: ");
        r = input.nextInt();
        System.out.println("Merkez açısının ölçüsünü giriniz: ");
        a = input.nextInt();

        daireDilimiAlan = (pi*(r*r) * a) / 360;
        System.out.println("Dairenin Dilim Alanı: " + daireDilimiAlan);

        }
    }
