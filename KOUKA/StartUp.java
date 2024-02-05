package KOUKA;

public class StartUp {

    public static void startup(String[] args) {
        
        Itkigyou[] companies = {
            new Kigyou1("トヨタ自動車株式会社", "事務職・技術職・業務職", "70710人", "豊田 章男", "6354億円"),
            new Kigyou2("株式会社zozo", "エンジニア職・ビジネス職・デザイナー職", "1418人", "澤田 宏太朗", "13億円"),
            new Kigyou3("ソニー株式会社", "技術職・事業職", "47400人", "槙 公雄", "30億円"),
        };
        Sabu directory =  new Sabu(companies);
        
        directory.displayAllCompanies();
        directory.displayDetails(directory.getCompanies()[0]);
        
    }
}
