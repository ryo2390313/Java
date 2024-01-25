// package Rensyuu.program13;
// import java.util.Scanner;



// abstract class Person2 {
//     /** 名前 */
//     String name = "";

//     /** 職業 */
//     String job = "";

//     /**
//      * コンストラクタ
//      * 
//      * @param name 名前
//      * @param job 職業
//      */
//     public Person2(String name, String job) {
//         this.name = name;
//         this.job = job;
//     }

//     /**
//      * 自己紹介
//      */
//     public void introduce() {
//         System.out.println("氏名 :" + name + " 職業 :" + job);
//     }
// }

// /**
//  * 教員クラス
//  */
// class Teacher extends Person2 {

//     /** 担当科目 */
//     String subject = "";

//     /**
//      * コンストラクタ
//      * 
//      * @param name     名前
//      * @param job      職業
//      * @param subject  担当科目
//      */
//     public Teacher(String name, String job, String subject) {
//         super(name, job);
//         this.subject = subject;
//     }

//     /**
//      * 自己紹介
//      */
//     public void introduce() {
//         super.introduce();
//         System.out.println("担当科目 :" + subject);
//     }
// }

// /**
//  * 料理人クラス
//  */
// class Cook extends Person2 {

//     /** 得意料理 */
//     String specialities = "";

//     /**
//      * コンストラクタ
//      * 
//      * @param name          名前
//      * @param job           職業
//      * @param specialities  得意料理
//      */
//     public Cook(String name, String job, String specialities) {
//         super(name, job);
//         this.specialities = specialities;
//     }

//     /**
//      * 自己紹介
//      */
//     public void introduce() {
//         super.introduce();
//         System.out.println("得意料理 :" + specialities);
//     }
// }

// class Sample13_1 {
//     public static void main(String[] args) {
//         Scanner stdIn = new Scanner(System.in);

//         // 教員クラスのインスタンスを生成
//         Teacher teacher = new Teacher(" 竹井一馬", " 教員", " 情報処理");
//         // 自己紹介の実行
//         teacher.introduce();

//         System.out.println("");

//         // 料理人クラスのインスタンスを生成
//         Cook cook = new Cook(" 大原太郎", " シェフ", " オムライス");
//         // 自己紹介の実行
//         cook.introduce();

//         stdIn.close();
//     }
// }

