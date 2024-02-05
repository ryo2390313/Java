package KOUKA;
public class Itkigyou {
    private String name;        //企業名
    private String employment;  //職種
    private String number;      //従業員数
    private String selection;   //代表取締役
    private String welfare;     //資本金

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

