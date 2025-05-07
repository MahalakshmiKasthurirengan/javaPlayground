class Book{
    Book() {
        this("Beloved");
        System.out.println("The Book collection");
    }
    Book(String book1){
        this("Dune", "Blink");
        System.out.println("The Book collection is : " + book1);
    }

    Book(String book1, String book2) {
        System.out.println("The Book collection is : " + book1 + ", " + book2);
    }
}

public class constructorChaining {
    public static void main(String [] args){
        Book book = new Book();
    }
}
