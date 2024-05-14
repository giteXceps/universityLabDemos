public class Kebap extends YemekTarifi implements IAnaYemekTarifi {
    private String etTur;
    private String sebzeTur;
    
    public Kebap(String yemekAdi, int pisirmeSuresi, int kisiSayisi, String etTur, String sebzeTur) {
        super(yemekAdi, pisirmeSuresi, kisiSayisi);
        this.etTur = etTur;
        this.sebzeTur = sebzeTur;
    }

    @Override
    public void dogra() {
        System.out.println("Kebap malzemeleri dograniyor...");
    }

    @Override
    public void hazirla() {
        System.out.println("Kebap hazirlaniyor...");
    }

    @Override
    public void pisir() {
        System.out.println("Kebap pisiriliyor...");
    }

    @Override
    public void servisYap() {
        System.out.println("Kebap servis ediliyor...");
    }

    public String getEtTur() {
        return etTur;
    }

    public String getSebzeTur() {
        return sebzeTur;
    }

}
