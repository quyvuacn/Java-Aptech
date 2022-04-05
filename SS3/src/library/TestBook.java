package library;

public class TestBook {
    public static void main(String[] args) {
        Author author_NguyenDu = new Author("Nguyễn Du","daithihaonguyendu@gmail.com",'m');
        System.out.println(author_NguyenDu);

        Book book_TruyenKieu = new Book("Truyện Kiều",author_NguyenDu,25000,50);
        System.out.println(book_TruyenKieu);

        book_TruyenKieu.setQty(100);

    }



}
