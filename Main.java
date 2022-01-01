import java.util.Scanner;

public class Main{
    public static void main(String[]args){  
        // Değerleri tanımla
        int km;
        double ücret = 10;
        double perKm = 2.20;

        // Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan kilometre değerini al ve ücreti hesapla
        System.out.print("Gidlecek mesafeyi belirtiniz : ");
        km = inp.nextInt();

        ücret = ücret + km * perKm;

        // Ücret 20 tl'nin altında ise 20 tl olarak alınır
        ücret =  (ücret<20) ? 20 : ücret;
        
        

        // Ücreti ekrana yazdır
        System.out.println("Ücret = " + ücret);
        

    }
}