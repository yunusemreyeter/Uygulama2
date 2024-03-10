
public class Main {
    public static void main(String[] args) {

        ogrenci ogr1 = new ogrenci("Yunus", "Bilgisayar Mühendisliği", 2003,"123",3);
        System.out.println("Ogr-1 "+ogr1.getAd()+" "+ ogr1.getBolum()+" "+ogr1.getOgrNo()+" "+ogr1.getGano());

        ogrenci ogr2 = new ogrenci(" Emre ", "Bilgisayar Mühendisliği", 2023, "123",2.5);
        System.out.println("Ogr-2 "+ogr2.getAd()+" "+ ogr2.getBolum()+" "+ogr2.getOgrNo()+" "+ogr2.getGano());
        ogrenci ogr3 = new ogrenci(" Ayşe ", "Makina Mühendisliği", 2020, "350",1.98);
        System.out.println("Ogr-3 "+ogr3.getAd()+" "+ ogr3.getBolum()+" "+ogr3.getOgrNo()+" "+ogr3.getGano());
        System.out.println("2. Öğrencinin Ödeyeceği Harç :"  + ogr2.harcHesapla(5, 2023));
        System.out.println("3. Öğrencinin Ödeyeceği Harç :"  + ogr3.harcHesapla(5, 2020));

    }
}