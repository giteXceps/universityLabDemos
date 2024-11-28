public class LicenseManagerTest {
    public static void main(String[] args) {
        // Aynı instance kullanımı kontrolü
        LicenseManager license1 = LicenseManager.getLicense();
        LicenseManager license2 = LicenseManager.getLicense();

        System.out.println("Ayni nesne mi? " + (license1 == license2));

        // Lisans kontrolü testi
        System.out.println("Lisans doğrulama sonucu (CCC-AAA-123): " + license1.validateLicense("CCC-AAA-123")); // false
        System.out.println("Lisans geçerli mi? " + license1.isLicenseValid()); // false

        System.out.println("Lisans doğrulama sonucu (ABC-123-XYZ): " + license1.validateLicense("ABC-123-XYZ")); // true
        System.out.println("Lisans geçerli mi? " + license1.isLicenseValid()); // true

        // Lisansı geçersiz yapma
        license1.invalidateLicense();
        System.out.println("Lisans geçerli mi (Lisans kullanildiktan sonra)? " + license1.isLicenseValid()); // false
    }
}

