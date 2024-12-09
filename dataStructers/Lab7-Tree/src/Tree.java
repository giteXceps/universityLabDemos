import java.util.Stack;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public void insert(long data) {
        Node newNode = new Node();
        newNode.data = data;
        if (root == null) {
            root = newNode;
        }
        // root doluysa
        else {
            Node current = root;
            Node parent;
            while (true) {
                // parent -> su an dikkate alinan konum
                parent = current;
                // deger kokten kucukse sol alt agaca
                current = current.leftChild;
                // sol alt agac bos mu yani sol alt agac bos mu
                // yer var -> yeni dugum buraya yerlesir
                if (current == null) {
                    // sola ekle
                    parent.leftChild = newNode;
                    return;
                }
                // deger kokten buyukse veya esitse sag alt agaca
                else {
                    current = current.rightChild;
                    if (current == null) {
                        // saga ekle
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node find(long data) {
        Node current = root;
        while (current.data != data) {
            if (data < current.data) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1: {
                System.out.println("\n Preorder:");
                preOrder(root);
            }
            case 2: {
                System.out.println("\n Inorder:");
                inOrder(root);
            }
            case 3: {
                System.out.println("\n Postorder:");
                postOrder(root);

            }
        }
        System.out.println(" ");
    }

    public void preOrder(Node localRoot) {
        if (localRoot != null) {
            // once kok
            System.out.println(localRoot.data + " ");
            // sonra alt sol
            preOrder(localRoot.leftChild);
            // en son sağ alt
            preOrder(localRoot.rightChild);
        }
    }

    public void inOrder(Node localRoot) {
        if (localRoot != null) {
            // once sol alt
            System.out.println(localRoot.data + " ");
            // sonra kok
            inOrder(localRoot.leftChild);
            // en son sağ alt
            inOrder(localRoot.rightChild);
        }
    }

    public void postOrder(Node localRoot) {
        if (localRoot != null) {
            // once sol alt
            postOrder(localRoot.leftChild);
            // sonra sag alt
            preOrder(localRoot.rightChild);
            // en son kok
            System.out.println(localRoot.data + " ");
        }
    }

    public Node minimum() {
        // roottan baslanir
        Node current = root;
        Node last = null;
        // sona kadar gidilir
        // son dal boyunca ilerlenir
        while (current != null) {
            // son ziyaret edilen dugumu sakla
            last = current;
            // sol cocuga gec
            current = current.leftChild;
        }
        // en sol dugumdeyiz
        // bu dugum, agacın en kucuk elemanı

        return last;
    }

    public boolean delete(long key) {
        Node current = root;
        Node parent = root;
        // varsaydik
        boolean isLeftChild = true; // silinecek dugum leftindeymis gibi

        // silinecek dugumun konumu buluyor
        while (current.data != key) {
            // silinecek dugumuhnn parenti
            parent = current;
            // aranan deger current.datadan kucuk ise
            if (key < current.data) {
                // silinecek sol cocuk
                isLeftChild = true;
                current = current.leftChild;

            }
            // aranan deger current.datadan buyuk yada esit ise sag tarafta ara
            else {
                // silinecek sag cocuk
                isLeftChild = false;
                current = current.rightChild;
            }
            // agacın sonuna kadar gidilmiş ama deger bulunamamıs
            if (current == null) {
                return false;
            }
        } // end while
          // silinecek dugum bulundu

        // ---------Durum 1 Child yoksa sadece sil----------
        if (current.leftChild == null && current.rightChild == null) {
            // silinecek dugumun sag ve sol child dugumlerini bossa
            // dugum kokse
            if (current == root) {
                root = null;
            }
            // silinecek sol cocuksa
            else if (isLeftChild) {
                // parentin sol cocugu silindigi icin null
                // silinecek current =? parent.leftchild
                parent.leftChild = null;

            } else {
                // parentin sag cocugu silindigi icin null
                // silinecek current = parent.rightchild
                parent.rightChild = null;
            }
        }
        // ------------Durum 2 Sag child yok sol child varsa----------
        // ------------sag child yoksa sol alt agacla yer degistirir-------
        else if (current.rightChild == null) {
            // dugum kokse
            if (current == root) {
                // root sol cocuk
                root = current.leftChild;
            }
            // silinecek parentin sol cocuguysa
            else if (isLeftChild) {
                // parent sol cocuguna silinecek dugumun sol cocugunu ata
                parent.leftChild = current.leftChild;
            }
            // silinecek parentin sag cocuguysa
            else {
                // parent sag cocuguna silinecek dugumun sol cocugunu ata
                parent.rightChild = current.leftChild;
            }
        }
        // ----------durum 3 sol child yok sag child varsa ------------------
        // sol child yoksa sag alt agacla yer degistirir
        else if (current.leftChild == null) {

            // dugum kokse
            if (current == root) {
                // root = sag cocuk
                root = current.rightChild;

            }
            // silinecek parentin sol cocuguysa
            else if (isLeftChild) {
                // parent sol cocuguna silinecek dugumun sag cocugunu ata
                parent.leftChild = current.rightChild;

            } else {
                // parent sag cocuguna silinecek dugumun sag cocugunu ata
                parent.rightChild = current.rightChild;
            }
        }

        // -----------Durum 3: Silinecek dugumun hem sag hem sol cocuguda varsa
        // -----------------
        else {
            //current silinecek dugum, silinecek dugum yerine gececek succesor bul successor varis dügüm diye gecer
            Node successor = getSuccessor(current);
            if (current == root){
                root = successor;
            }
        //silinecek parentin sol cocuguysa
            else if (isLeftChild){
                parent.leftChild = successor;
            }
            //silinecek sag cocuyusa parentin rightchildına successor ata
            else{
                parent.rightChild = successor;
            }
            //successorin sol cocugu silinen dugumun sol cocugu yap
            successor.leftChild = current.leftChild;
            //successor geçici olarak silinecek elemanın yerini alır
        }
        return true;
    }    

    private Node getSuccessor(Node delNode){
        Node successorParent = delNode;
        Node successor = delNode;
        //once silinecek dugum
        Node current =delNode.rightChild;

        while (current != null){
            successorParent = successor;
            successor = current;
            //sonra surekli sol cocuga git
            current = current.leftChild;
        } //sol cocuk null olunca dur successor bulundu
        //successor sag alt cocugu degilde sag cocugun sol torunuysa

        if (successor!= delNode.rightChild){
            //successor parent sol cocugunu , successor sag cocugu yap
            successorParent.leftChild = successor.rightChild;
            //successor sag cocugunu, silinecek dugumun sag cocugu yap
            successor.rightChild = delNode.rightChild;
        }
        return successor;

        //gecici dugum tutar localstack
        //o anda işlenecek dugumları tutar globalstack
        //satırda islenecek veri kalmayana kadar calısacak while
    }

    public void displayTree(){
        //Global Stack nesne tipi node
        Stack<Node> globalStack = new Stack<Node>();
        //global stack baslangıcı olarak root yerlestirir
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;

        while (!isRowEmpty){
            //localstacck
            Stack<Node> localStack = new Stack<Node>();
            //varsayılan deger olarak satir bos diye ata
            isRowEmpty = true;
            for (int j = 0; j <nBlanks ; j++) {
                // 32 karakter bosluk koy
                System.out.print(' ');

            }
            while(!globalStack.isEmpty()){
                Node temp=(Node)globalStack.pop();
                if(temp != null){

                    System.out.println(temp.data);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);

                    if (temp.leftChild != null || temp.rightChild !=null){
                        isRowEmpty = false;
                    }
                }
                else{
                    //bossa 2 tire ata
                    System.out.println("--");
                    localStack.push(null);
                    localStack.push(null);

                }
                for (int j = 0; j<nBlanks*2-2 ; j++){
                    System.out.println(' ');

                }
                //end while -> globalStack bos degil
                System.out.println();
                nBlanks/= 2;
                while(!localStack.isEmpty()){
                    globalStack.push(localStack.pop());
                }
            } //end while -> isRowEmpty false
            System.out.println(".....................................................................................");
        }
    }
    //satır bastan farklıysa calis
    //yani false oldugunda calis
}
