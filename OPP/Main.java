class Main {
  public static void main(String[] args) {
    Book jurassicPark = new Book("Jurassic Park", "Michael Crichton", 420);

    AudioBook theAlchemist = new AudioBook("El Alquimista", "Paulo Coelho", 3000);

    Ebook jeeves = new Ebook("Carry On Jeeves", "P. G.", 280, "PDF");

    System.out.println(jeeves.toString());
  }
}