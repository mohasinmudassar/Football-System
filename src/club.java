//This Class holds all the info about the Sports Club
public class club extends SportsClub {
    private int wins=0,draws=0,defeats=0,score=0,recieved=0,points=0,
            totalMatches=0;
    private String teamName,location;
    
    club(String name,String loc){
        this.teamName = name;
        this.location = loc;
    }
    public void displayStatictics(){
        System.out.println("Team Name: " + this.getTeamName() + "\nLocation: " + this.getLocation()
        + "\nTotal Matches: " + this.getTotalMatches() + ", Wins: " + this.getWins() + ", Defeats: " + this.getDefeats()
        + ", Draws: " + this.getDraws() + "\nScore: " + this.getScore() + "Recieved: " + this.getRecieved()
        + "\nPoints: " + this.getPoints());
    }
    public void matchPLayed(String res,int score,int recieved){
        this.totalMatches += 1;
        this.score += score;
        this.recieved += score;
        if(res.equals("w")){
            this.matchWon();
        }
        else if(res.equals("d")){
            this.matchDrawn();
        }
        else if(res.equals("l")){
            this.matchLost();
        }
    }
    public void matchDrawn(){
        this.draws += 1;
    }
    public void matchLost(){
        this.defeats += 1;
    }
    public void matchWon(){
        this.wins += 1;
        this.points += 1;
    }
    public int getWins() {
        return wins;
    }
    public int getDraws() {
        return draws;
    }
    public int getDefeats() {
        return defeats;
    }
    public int getScore() {
        return score;
    }
    public int getRecieved() {
        return recieved;
    }
    public int getPoints() {
        return points;
    }
    public int getTotalMatches() {
        return totalMatches;
    }
    public String getTeamName() {
        return teamName;
    }
    public String getLocation() {
        return location;
    }
    public void setMatches(int total){
        this.totalMatches = total;
    }
    public void setWins(int wins){
        this.wins = wins;
    }
    public void setDefeats(int def){
        this.defeats = def;
    }
    public void setDraws(int d){
        this.draws = d;
    }
    public void setScore(int s){
        this.score = s;
    }
    public void setRecieved(int r){
        this.recieved = r;
    }
    public void setPoints(int p){
        this.points = p;
    }
}
