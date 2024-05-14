public abstract class YemekTarifi {
    protected String yemekAdi;
    protected int pisirmeSuresi;
    protected int kisiSayisi;
    
    public YemekTarifi(String yemekAdi, int pisirmeSuresi, int kisiSayisi) {
        this.yemekAdi = yemekAdi;
        this.pisirmeSuresi = pisirmeSuresi;
        this.kisiSayisi = kisiSayisi;
    }

    public String getYemekAdi() {
        return yemekAdi;
    }

    public int getPisirmeSuresi() {
        return pisirmeSuresi;
    }

    public int getKisiSayisi() {
        return kisiSayisi;
    }

    public abstract void hazirla();
    public abstract void pisir();
    public abstract void servisYap();
}
