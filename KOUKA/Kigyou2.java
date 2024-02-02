package KOUKA;

public class Kigyou2 extends Itkigyou {
    private String services;

    public Kigyou2(String name, String employment, String number, String selection, String welfare, String services) {
        super(name, employment, number, selection, welfare);
        this.services = services;
    }

    public String getServices() {
        return services;
    }

    @Override
    public String toString() {
        return super.toString() + ", Services: " + services;
    }
}
