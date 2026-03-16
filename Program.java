public class Program {
    public static void main(String[] args) {
        Advert a1 = new Advert("ARBUZ", 20, "SOCHIY", "NOVIY", "+79271234567" );

        a1.save();
        a1.loadNote("advert.txt");
    }
    
}
