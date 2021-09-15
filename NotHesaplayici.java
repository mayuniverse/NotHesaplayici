import java.util.Scanner; // import the Scanner class 

class ilkproje {
  public static void main(String[] args) {
    // değişkenleri tanımlayalım
    int mat,fizik,kimya,turkce,muzik,tarih;

    // Scanner sınıfını tanımlayalım
    Scanner inp = new Scanner(System.in);

    // kullanıcıdan inputları alalım
    System.out.print("Matematik notunuz = ");
    mat = inp.nextInt();
    System.out.println("Matematik notunuz = " + mat);

    System.out.print("Fizik notunuz = ");
    fizik = inp.nextInt();
    System.out.println("Fizik notunuz = " + fizik);

    System.out.print("Kimya notunuz = ");
    kimya = inp.nextInt();
    System.out.println("Kimya notunuz = " + kimya);

    System.out.print("Türkçe notunuz = ");
    turkce = inp.nextInt();
    System.out.println("Türkçe notunuz = " + turkce);

    System.out.print("Müzik notunuz = ");
    muzik = inp.nextInt();
    System.out.println("Müzik notunuz = " + muzik);

    System.out.print("Tarih notunuz = ");
    tarih = inp.nextInt();
    System.out.println("Tarih notunuz = " + tarih);

    double toplam = (mat + fizik + kimya + turkce + muzik + tarih);
    double sonuc = toplam / 6.0;
    System.out.println("Not ortalamanız = " + sonuc);

    boolean kosul1 = sonuc >= 60.0;
    boolean kosul2 = sonuc < 60.0;
    boolean gecmeDurumu = kosul1 || kosul2;

    String str = gecmeDurumu ? "Geçti" : "Kaldı";

    System.out.print(str);




  }
}