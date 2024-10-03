public class FeaturePhone extends Phone implements Printable {
    private boolean hasCamera;

    public FeaturePhone(String model, int storage, boolean hasCamera) {
        super(model, storage);
        this.hasCamera = hasCamera;
    }

    public boolean hasCamera() {
        return hasCamera;
    }

    @Override
    public void print() {
        System.out.println("FeaturePhone Model: " + getModel());
        System.out.println("Storage: " + getStorage() + " MB");
        System.out.println("Has Camera: " + hasCamera());
    }
}

