public class FoldablePhone extends Phone implements Printable {
    private double screenSize;

    public FoldablePhone(String model, int storage, double screenSize) {
        super(model, storage);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public void print() {
        System.out.println("FoldablePhone Model: " + getModel());
        System.out.println("Storage: " + getStorage() + " GB");
        System.out.println("Screen Size: " + getScreenSize() + " inches");
    }
}
