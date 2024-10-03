public class Main {
    public static void main(String[] args) {
        Phone smartphone = createObject("Smartphone");
        Phone featurePhone = createObject("FeaturePhone");
        Phone foldablePhone = createObject("FoldablePhone");

        Printable[] phones = { (Printable) smartphone, (Printable) featurePhone, (Printable) foldablePhone };

        for (Printable phone : phones) {
            phone.print();
            System.out.println();
        }
    }

    public static Phone createObject(String className) {
        switch (className) {
            case "Smartphone":
                return new Smartphone("iPhone 13 Pro", 256, "iOS");
            case "FeaturePhone":
                return new FeaturePhone("Nokia 3310", 16, true);
            case "FoldablePhone":
                return new FoldablePhone("Samsung Galaxy S22 Ultra", 512, 6.8);
            default:
                throw new IllegalArgumentException("Unknown class name: " + className);
        }
    }


}