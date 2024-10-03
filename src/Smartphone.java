public class Smartphone extends Phone implements Printable {
    private String operatingSystem;

    public Smartphone(String model, int storage, String operatingSystem) {
        super(model, storage);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public void print() {
        System.out.println("Smartphone Model: " + getModel());
        System.out.println("Storage: " + getStorage() + " GB");
        System.out.println("Operating System: " + getOperatingSystem());
    }
}
