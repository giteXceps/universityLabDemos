public class Personel {

    private String soyad;
    private String ad;
    private int yas;

    public Personel(String soyad, String ad, int yas) {
        this.soyad = soyad;
        this.ad = ad;
        this.yas = yas;
    }

    public void displayPersonal(){
        System.out.print("Adi:"+ad);
        System.out.print(" Soyadi:"+soyad);
        System.out.print(" Yasi:"+yas);
        System.out.println();
    }

    public String getSoyad(){
        return soyad;
    }
}
