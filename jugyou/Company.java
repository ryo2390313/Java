public class Company {
    private String name;
    private String industry;
    // 他の企業情報のフィールドも追加可能

    // コンストラクタ、ゲッター、セッターなどを実装
}

// 企業の従業員情報を管理するクラス
class Employee {
    private String name;
    private int employeeId;
    // 他の従業員情報のフィールドも追加可能

    // コンストラクタ、ゲッター、セッターなどを実装
}

// 企業情報の例外処理を扱うクラス
class CompanyInfoException extends Exception {
    // 例外メッセージなどを追加
}

// インターフェースを使用して企業情報の表示を共通化
interface CompanyInfoDisplay {
    void displayInfo();
}

// 継承を使用して特定の種類の企業情報を拡張
class PublicCompany extends Company implements CompanyInfoDisplay {
    // 公開企業に特有の情報やメソッドを追加

    @Override
    public void displayInfo() {
        // 企業情報の表示処理
    }
}

class PrivateCompany extends Company implements CompanyInfoDisplay {
    // 非公開企業に特有の情報やメソッドを追加

    @Override
    public void displayInfo() {
        // 企業情報の表示処理
    }
}
