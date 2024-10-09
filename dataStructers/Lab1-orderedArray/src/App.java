public class App {
    public static void main(String[] args) throws Exception {
        int maxSize = 100;
        orderedArray dizi = new orderedArray(maxSize);

        dizi.insert(77);
        dizi.insert(99);
        dizi.insert(44);
        dizi.insert(55);
        dizi.insert(22);
        dizi.insert(88);
        dizi.insert(11);
        dizi.insert(81);
        dizi.insert(66);
        dizi.insert(33);
        dizi.display();

        if (dizi.find(55) != dizi.size()){
            System.out.println("55 found");
        }
        else{
            System.out.println("55 not found");
        }

        dizi.delete(81);
        dizi.delete(55);
        dizi.delete(99);
        dizi.display();
    }
}
