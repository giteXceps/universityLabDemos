public class CustomerValidator {

    public void CustomerNameValidator(String name) throws InvalidNameException {
        if(name.isEmpty()){
            throw new InvalidNameException("Isim bos olamaz");
        } 
    }

    public void CustomerEmailValidator(String email) throws InvalidEmailException{
        if(!email.contains("@")){
            throw new InvalidEmailException("Email '@' simgesine sahip olmak zorundadir!");
        } 
    }

    public void processOrder(int quantity) throws InvalidOrderQuantityException{
        if(quantity <=0 ){
            throw new InvalidOrderQuantityException("Siparis adedi 0'dan kucuk olamaz!");
        } else {
            System.out.println("Ilgili urunden " + quantity + "adet siparis verildi");
        }
    }
}
