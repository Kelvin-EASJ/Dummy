public class Dummy {
    static int dumbo;

    public static void main(String[] args) {
        dumbo = 5;

        // statisk metoder behøver ikke at have et objekt instance.
        Dummy.staticHej();

        //ikke statisk metoder skal have en objekt instance.
        Dummy dummy = new Dummy();
        dummy.hej();
    }

    private void hej() {
    }

    public static void staticHej() {
        System.out.println("Hej!");
    }
}
