package KOUKA;

public class Kigyou1 extends Itkigyou{
    private String techStack;

    public Kigyou1(String name, String employment, String number, String selection, String welfare) {
        super(name, employment, number, selection, welfare);
       
    }

    public String getTechStack() {
        return techStack;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tech Stack: " + techStack;
    }
}
