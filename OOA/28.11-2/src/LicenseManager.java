public class LicenseManager {
    private static LicenseManager license;

    private String validLicenseKey = "ABC-123-XYZ";

    // Lisansın geçerli olup olmadığı
    private boolean isLicenseValid = false;

    private LicenseManager() {
    }

    // Singleton nesnesine erişim sağlayan metod
    public static LicenseManager getLicense() {
        if (license == null) {
            license = new LicenseManager();
        }
        return license;
    }

    // Lisans anahtarını doğrulayan metod
    public boolean validateLicense(String licenseKey) {
        if (licenseKey.equals(validLicenseKey)) {
            isLicenseValid = true;
            return true;
        }
        isLicenseValid = false;
        return false;
    }

    // Lisansı gecersiz yapan metod
    public void invalidateLicense() {
        isLicenseValid = false;
    }

    // Lisans gecerli mi degil mi
    public boolean isLicenseValid() {
        return isLicenseValid;
    }

}
