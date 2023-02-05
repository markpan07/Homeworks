package hw_objects;

public class Main {

    public static void main(String[] args) {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Author fedorDostoevskiy = new Author("Fedor", "Dostoevskiy");
        Author fedorDostoevskiy2 = new Author("Fedor", "Dostoevskiy");
        Book idiot = new Book ("Idiot", fedorDostoevskiy, 1852);
        Book besy = new Book ("Besy", fedorDostoevskiy, 1850);
        Book besy1 = new Book ("Besy", fedorDostoevskiy, 1850);

        /*System.out.println(fedorDostoevskiy2.equals(fedorDostoevskiy));
        System.out.println(idiot.hashCode());
        System.out.println(besy.hashCode());
        System.out.println(besy1.hashCode());
        System.out.println(besy1.equals(besy));
        System.out.println(idiot.toString());
        System.out.println();
        System.out.println(besy.toString());
        System.out.println(besy.equals(besy1));
        System.out.println(besy.hashCode());*/
    }
}
