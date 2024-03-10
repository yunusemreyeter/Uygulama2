public class ogrenci {

    private String ad;
    private String bolum;
    private int girisYili;
    private String ogrNo;
    private double gano;
    private String bolumKodu;
    private static int girisSirasi = 0;
    public ogrenci(String ad, String bolum, int girisYili) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.ogrNo = OgrenciNoolustur();
    }

    public ogrenci(String ad, String bolum, int girisYili, String bolumKodu,double gano) {
        this(ad, bolum, girisYili);
        this.bolumKodu = bolumKodu;
        this.ogrNo = OgrenciNoolustur();
        this.gano=gano;
    }

    public String getAd() { return ad; }
    public void setAd(String ad) { this.ad = ad; }

    public String getBolum() { return bolum; }
    public void setBolum(String bolum) { this.bolum = bolum; }

    public int getGirisYili() { return girisYili; }
    public void setGirisYili(int girisYili) { this.girisYili = girisYili; }

    public String getOgrNo() { return ogrNo; }
    public void setOgrNo(String ogrNo) { this.ogrNo = ogrNo; }

    public double getGano() { return gano; }
    public void setGano(double gano) {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano 0 ile 4 arasında olmalıdır!");
        }
        this.gano = gano;
    }

    public String getBolumKodu() { return bolumKodu; }
    public void setBolumKodu(String bolumKodu) { this.bolumKodu = bolumKodu; }


    public double harcHesapla(int dersSayisi) {

        return dersSayisi * 20;
    }

    public double harcHesapla(int dersSayisi, int GirisYılı) {
        int sure = 2024 - GirisYılı;
        return dersSayisi * 20 + sure * 100;
    }


    private String  OgrenciNoolustur() {
        String ogrNo = String.format("%04d", girisYili);
        ogrNo += bolumKodu;
        ogrNo += String.format("%03d", girisSirasi++ );
        return ogrNo;
    }

}