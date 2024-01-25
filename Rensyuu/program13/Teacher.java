package Rensyuu.program13;

class Teacher  implements Person3 {

    /** 担当科目 */
    String subject = "";
    String name = "";
    String job = "";
    /**
     *
     * 
     * @param name     名前
     * @param job      職業
     * @param subject  担当科目
     */
    //コンストラクタは初期化を行う
    public Teacher(String name, String job, String subject) {
        
        this.subject = subject;
        this.name = name;
        this.job = job;
    }

    @Override public void introduce() {
        System.out.println("氏名 :" + name + " 職業 :" + job);
        System.out.println("担当科目 :" + subject);
    }
}
