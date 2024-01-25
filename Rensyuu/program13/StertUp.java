package Rensyuu.program13;

 class StertUp {
    public static void main(String[] args) {
       

        // 教員クラスのインスタンスを生成
        Teacher teacher = new Teacher(" 竹井一馬", " 教員", " 情報処理");
        // 自己紹介の実行
        teacher.introduce();

        System.out.println("");

        // 料理人クラスのインスタンスを生成
        //newが初期化の合図
        Cook cook = new Cook(" 大原太郎", " シェフ", " オムライス");
        // 自己紹介の実行
        cook.introduce();


    }
}
