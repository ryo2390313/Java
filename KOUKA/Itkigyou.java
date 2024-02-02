package KOUKA;
public class Itkigyou {
    private String name;
    private String employment;
    private String number;
    private String selection;
    private String welfare;

    public Itkigyou(String name, String employment, String number, String selection, String welfare) {
        this.name = name;
        this.employment = employment;
        this.number = number;
        this.selection = selection;
        this.welfare = welfare;
    }

    public String getName() {
        return name;
    }

    public String getEmployment() {
        return employment;
    }

    public String getNumber() {
        return number;
    }

    public String getSelection() {
        return selection;
    }

    public String getWelfare() {
        return welfare;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Employment: " + employment + ", Number: " + number + ", Selection: " + selection + ", Welfare: " + welfare;
    }
}

