public class match {
    String wt,lt;
    int wg,lg,totalGoals, day;
    String date;
    public match(String wt, String lt,int wg, int lg,String date) {
        this.wt = wt;
        this.lt = lt;
        this.wg = wg;
        this.lg = lg;
        this.totalGoals = wg + lg;
        this.date = date;
        int day;
        setDay();   
    }
    void setDay(){
        char[] temp = this.date.toCharArray();
        if(temp[1] == '-'){
             this.day = Character.getNumericValue(temp[0]);      
        }
        else{
            String t1 = String.valueOf(temp[0]);
            String t2 = String.valueOf(temp[1]);
            String t = t1+t2;
            this.day= Integer.parseInt(t);
        }
    }
    public int getDay(){
        return this.day;
    }
    public String getDate() {
        return date;
    }
    public String getWT() {
        return wt;
    }
    public String getLT() {
        return lt;
    }
    public int getWG() {
        return wg;
    }
    public int getLG() {
        return lg;
    }
    public int getTotal() {
        return totalGoals;
    }
}
