package Rensyuu.program13;

class Cook implements Person3 {

    /** 得意料理 */
    String specialities = "";

    String name = "";

    String job = "";

    /**
     * コンストラクタ
     * 
     * @param name          名前
     * @param job           職業
     * @param specialities  得意料理
     */
    public Cook(String name, String job, String specialities) {
        
        this.specialities = specialities;
        this.name = name;
        this.job = job;
    }

    /**
     * 自己紹介
     */
    @Override public void introduce() {
        System.out.println("氏名 :" + name + " 職業 :" + job);
        System.out.println("得意料理 :" + specialities);
    }
}