class demo {
    String[] books = new String[100];;
    int no_of_books = 0;

    void addbook(String book) {
        books[no_of_books] = book;
        no_of_books++;
        System.out.println("book has been added");
    }

    void avilablebook() {
        System.out.println("Available books are: ");
        for (int i = 0; i < books.length; i++) {

            if (books[i] == null) {
                continue;

            }
            System.out.println(books[i]);
        }
    }

    void issuebook(String book) {
        // System.out.println(books.length);
        for (int i = 0; i <no_of_books; i++) {
            
            if (books[i].equals(book)==true ) {
                System.out.println(books[i] + " issued");
                books[i] = null;
                return ;

            }
           
         
        }
        System.out.println("book is not found");
        return ;
    }

    void returnbook(String book) {
        addbook(book);
    }

}

public class library {
    public static void main(String[] args) {
        demo o1 = new demo();
        o1.addbook("C++");
        o1.addbook("Java");
        o1.addbook("python");
        o1.avilablebook();
        o1.issuebook("java");
        o1.issuebook("python");
        o1.avilablebook();
        o1.returnbook("R");
        o1.avilablebook();

    }

}