import java.util.Scanner;
public class Ukoly {
    static Scanner sc = new Scanner(System.in);

    private String slovo1;
    private int cislo1;
    private int nasobek;
    private int prvocislo1;
    private int kolikPrvocislo;
    private double c1;
    private double c2;
    private double c3;
    private double min;
    private double max;

    public void vypisAhoj(){
        for (int i=1; i<=30; i++) {
            System.out.println("Ahoj nadsvěte!");
        }
    }

    public void vypisSlovo(){
        System.out.println("NAPIŠ SLOVO");
        slovo1 = sc.nextLine();
    }

    public void vypisCislo(){
        System.out.println("NAPIŠ ČÍSLO");
        cislo1 = sc.nextInt();
        sc.nextLine();

        switch (cislo1){
            case 1 -> System.out.println("Jedna");
            case 2 -> System.out.println("Dva");
            case 3 -> System.out.println("Tři");
            case 4 -> System.out.println("Čtyři");
            case 5 -> System.out.println("Pět");
            case 6 -> System.out.println("Šest");
            case 7 -> System.out.println("Sedm");
            case 8 -> System.out.println("Osm");
            case 9 -> System.out.println("Devět");
            case 10 -> System.out.println("Deset");
            case 11 -> System.out.println("Jedenáct");
            case 12 -> System.out.println("Dvanáct");
            default -> System.out.println("ČÍSLO JE PŘÍLIŠ VELKÉ NEBO JE ZÁPORNÉ");
        }
    }

    public void vypisNasobkyPeti(){
        for(int j = 1; j == 20; j++){
            nasobek = j*5;
            System.out.println(nasobek);
        }
    }

//FIXPRVOCISLA FIXPRVOCISLA FIXPRVOCISLA FIXPRVOCISLA FIXPRVOCISLA
    public void urciPrvocislo() {
        System.out.println("NAPIŠ ČÍSLO (nejlépe prvočíslo pls)");
        prvocislo1 = sc.nextInt();

        for (int i3 = 1; i3 <= prvocislo1; i3++) {
            if (prvocislo1 % i3 == 0) {
                System.out.println("y");
                kolikPrvocislo++;
            }
        }
        System.out.println(kolikPrvocislo);
        if (kolikPrvocislo == 2) {
            System.out.println("Číslo je prvočíslo");
        } else {
            System.out.println("Číslo není prvočíslo");
        }
    }


    public void vetsiMensi(){
        System.out.println("NAPIŠ PRVÍ ČÍSLO");
        c1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("NAPIŠ DRUHÉ ČÍSLO");
        c2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("NAPIŠ TŘETÍ ČÍSLO");
        c3 = sc.nextDouble();
        sc.nextLine();

        if ((c1>c2)&&(c1>c3)){
             max = c1;
        }else if ((c2>c1)&&(c2>c3)){
             max = c2;
        }else{
             max = c3;
        }
        if ((c1<c2)&&(c1<c3)){
             min = c1;
        }else if ((c2<c1)&&(c2<c3)){
             min = c2;
        }else{
             min = c3;
        }

        System.out.println(max);
        System.out.println(min);

    }



















}
