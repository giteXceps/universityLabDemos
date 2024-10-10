public class PersonelHareket {

    private Personel[] dizi;
    private int elemanSayisi;

    public PersonelHareket(int max) {
        dizi = new Personel[max];
        elemanSayisi = 0;
    }

    public Personel find(String soyad){
        int i;
        for (i = 0; i < elemanSayisi; i++) {
            if (dizi[i].getSoyad().equals(soyad)) {
                break;
            }
        }
        if(elemanSayisi == i){
            return null;
        }
        else{
            return dizi[i];
        }
    }

    public void insert(String soyad, String ad, int yas){
        dizi[elemanSayisi] = new Personel(soyad,ad,yas);
        elemanSayisi++;
    }

    public boolean delete(String soyad){
        int i;
        for (i = 0; i < elemanSayisi; i++) {
            if (dizi[i].getSoyad().equals(soyad)) {
                break;
            }
        }
        if(elemanSayisi == i){
            return false;
        }
        else{
            for (int j = i; j < elemanSayisi; j++)
                dizi[j] = dizi[j + 1];
            elemanSayisi--;
            return true;
        }
    }

    public void display(){
        for (int i = 0; i < elemanSayisi; i++) {
            dizi[i].displayPersonal();
        }
    }
    
}
