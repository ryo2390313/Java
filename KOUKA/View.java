package KOUKA;

public class View extends StartUp{
    public void displayOverview(Sabu directory) {
        System.out.println("=====Company Overview=====");
        for (Itkigyou company : directory.getCompanies()) {
            System.out.println(company.getName() + " - " + company.getEmployment());
        }
    }

    public void displayDetails(Itkigyou company) {
        System.out.println("======Company Details======");
        System.out.println(company);
    }
}
