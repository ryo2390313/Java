package KOUKA;

public class Kigyou3 extends Itkigyou {
    private String product;

    public Kigyou3(String name, String employment, String number, String selection, String welfare) {
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
