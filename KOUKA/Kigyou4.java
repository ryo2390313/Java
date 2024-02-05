package KOUKA;

public class Kigyou4 extends Itkigyou {
    private String product;

    public Kigyou4(String name, String employment, String number, String selection, String welfare) {
        super(name, employment, number, selection, welfare);
        
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return super.toString() + ", Product: " + product;
    }
}
