package hw_objects;

public class Main {

    public static void main(String[] args) {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Author fedorDostoevskiy = new Author("Fedor", "Dostoevskiy");
        Book idiot = new Book ("Idiot", fedorDostoevskiy, 1852);
        Book besy = new Book ("Besy", fedorDostoevskiy, 1850);
        idiot.setYear(1860);

    }
}
