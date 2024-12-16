import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Ukoly zapnout = new Ukoly();

        for(int i = 0; i > -1; ){
            System.out.println();
            System.out.println("KTEROU METODU CHCEŠ ZAPNOUT?");
            System.out.println(" 1 = vypisAhoj");
            System.out.println(" 2 = vypisSlovo");
            System.out.println(" 3 = vypisCislo");
            System.out.println(" 4 = vypisNasobkyPeti");
            System.out.println(" 5 = urciPrvocislo //nejspíš nefunguje");
            System.out.println(" 6 = vetsiMensi");
            int cisloUrceni = sc.nextInt();
            switch (cisloUrceni) {
                case 1 -> zapnout.vypisAhoj();
                case 2 -> zapnout.vypisSlovo();
                case 3 -> zapnout.vypisCislo();
                case 4 -> zapnout.vypisNasobkyPeti();
                case 5 -> zapnout.urciPrvocislo();
                case 6 -> zapnout.vetsiMensi();
            }
        }
    }
}