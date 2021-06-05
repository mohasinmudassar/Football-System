import java.util.*;
import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
public class PremierLeagueManager implements LeagueManager{
    Scanner sc = new Scanner(System.in);
    ArrayList <club> currentTeam  = new ArrayList<club>();
    ArrayList <match> matchesData = new ArrayList<match>();
    PremierLeagueManager(){
        readTeamData();    
        readMatchData();
    }
    public void updateMatchFile(){
        //As the name suggest,updating the file
        try{
            FileWriter myWriter = new FileWriter("matchFile.txt");
            for(int i=0;i<matchesData.size();i++){
                myWriter.write(matchesData.get(i).getWT() + " " +  matchesData.get(i).getLT() + 
                       " " + matchesData.get(i).getWG() + " " + matchesData.get(i).getLG() + 
                       " " + matchesData.get(i).getDate() + "\n");
            }
            myWriter.close();
            //System.out.println("Successfully wrote to the file.");
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void updateFile(){
        try{
            FileWriter myWriter = new FileWriter("teamFile.txt");
            for(int i=0;i<currentTeam.size();i++){
                myWriter.write(currentTeam.get(i).getTeamName() + " " + currentTeam.get(i).getLocation() + " " +
                        currentTeam.get(i).getTotalMatches() + " " + currentTeam.get(i).getWins() +
                        " " + currentTeam.get(i).getDefeats() + " " + currentTeam.get(i).getDraws() + 
                        " " + currentTeam.get(i).getScore() +" " + currentTeam.get(i).getRecieved() + " " + 
                                currentTeam.get(i).getPoints() +"\n");
            }
            myWriter.close();
            //System.out.println("Successfully wrote to the file.");
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    //This method is used to get the footbal teams from the file!
    public void newTeam(String name,String loc,int match,int wins,int losses,int draws,int gs,int gr,
            int points){
        club newClub = new club(name,loc);
        newClub.setMatches(match);
        newClub.setWins(wins);
        newClub.setDefeats(losses);
        newClub.setDraws(draws);
        newClub.setScore(gs);
        newClub.setRecieved(gr);
        newClub.setPoints(points);
        currentTeam.add(newClub);
        
    }
    //This method is used to create football team from the console
    public void newTeam(){
        System.out.println("Team Name: ");
        String name = sc.nextLine();
        //nextLine();
        String[] correctName = name.split(" ");
        int nCheck =0,lCheck =0;
        String n = null;
        if(correctName.length > 1){
            nCheck++;
            n = correctName[0];
            for(int i=1;i<correctName.length;i++){
                n += "_"  + correctName[i];
            }
        }
        //sc.nextLine();
        System.out.println("Team Location: ");
        String loc = sc.nextLine();
        String l = null;
        String[] correctLoc = loc.split(" ");
        if(correctLoc.length > 1){
            lCheck++;
            l = correctLoc[0];
            for(int i=1;i<correctLoc.length;i++){
                l += "_" + correctLoc[i];
            }
            
        }
        String nameFinal = null,locFinal = null;
        if(nCheck == 0){
            nameFinal = name;
        }
        else if(nCheck > 0){
            nameFinal = n;
        }
        if(lCheck == 0){
            locFinal = loc;
        }
        else if(lCheck > 0){
            locFinal = l;
        }
        club newClub = new club(nameFinal,locFinal);
        this.currentTeam.add(newClub);
        this.updateFile();
    }
    public void removeTeam(){
        System.out.println("Team you want to delete: ");
        String toDelete = sc.nextLine();
        int c=0;
        for(int i=0;i<currentTeam.size();i++){
            if(toDelete.equalsIgnoreCase(currentTeam.get(i).getTeamName())){
                currentTeam.remove(i);
                System.out.println(toDelete + " Removed from the League!");
                c++;
            }
        }
        if(c==0){
            System.out.println("Invalid Team name!!");
        }
        this.updateFile();
    }
    //Displaying the statistics of a specific team
    public void displaySpecific(String f){
        int c=0;
        for(int i=0;i<currentTeam.size();i++){
            if(f.equalsIgnoreCase(currentTeam.get(i).getTeamName())){
                currentTeam.get(i).displayStatictics();
                c++;
            }
        }
        if(c==0){
            System.out.println("Invalid Team Name!");
        }
    }
    //Dispay the table on the console
    public void displayAllTeams(){
        final Object[][] table = new String[this.currentTeam.size() + 1][];
        table[0] = new String[]{"Name","Location","Total Matches","Wins","Defeats","Draws",
        "Score","Recieved","Points"};
        for(int i=0;i<this.currentTeam.size();i++){
            table[i+1] = new String[]{currentTeam.get(i).getTeamName(),currentTeam.get(i).getLocation(),
                String.valueOf(currentTeam.get(i).getTotalMatches()),
                String.valueOf(currentTeam.get(i).getWins()),String.valueOf(currentTeam.get(i).getDefeats()),
            String.valueOf(currentTeam.get(i).getDraws()),String.valueOf(currentTeam.get(i).getScore()),
            String.valueOf(currentTeam.get(i).getRecieved()),String.valueOf(currentTeam.get(i).getPoints())};
        }
        for(final Object[] row: table){
            System.out.format("%15s%15s%15s%15s%15s%15s%15s%15s%15s\n",row);
        }
    }
   
   void check(){
       System.out.println(this.currentTeam.get(0));
   }
   
    public void playMatch(){
        if(this.currentTeam.size() == 1){
            System.out.println("Please add more teams to generate match!");
        }
        else{
            String date = JOptionPane.showInputDialog("What's the date today?(dd/mm/yy): ");
            Random rand = new Random();
            int t1 = rand.nextInt(this.currentTeam.size());
            int t2;
            while(true){
                t2 = rand.nextInt(this.currentTeam.size());
                if(t1 != t2){
                    break;
                }
            }
            System.out.println(currentTeam.get(t1).getTeamName() + " v.s " + currentTeam.get(t2).getTeamName());
            int g1 = rand.nextInt(5);
            int g2 = rand.nextInt(5);
            if(g1 > g2){
                System.out.println(currentTeam.get(t1).getTeamName() + "Won!, Loosing Team: " + currentTeam.get(t2).getTeamName());
                currentTeam.get(t1).matchPLayed("w", g1, g2);
                currentTeam.get(t2).matchPLayed("l", g2, g1);
                match m = new match(currentTeam.get(t1).getTeamName(),currentTeam.get(t2).getTeamName()
                            ,g1,g2,date);
             
                this.matchesData.add(m);
            }
            else if(g2>g1){
                System.out.println(currentTeam.get(t2).getTeamName() + "Won!, Loosing Team " + currentTeam.get(t1).getTeamName());
                currentTeam.get(t1).matchPLayed("l", g1, g2);
                currentTeam.get(t2).matchPLayed("w", g2, g1);
                match m = new match(currentTeam.get(t2).getTeamName(),currentTeam.get(t1).getTeamName(),g2,g1,date);
                this.matchesData.add(m);
            }
            else{
                currentTeam.get(t1).matchPLayed("d", g1, g2);
                currentTeam.get(t2).matchPLayed("d", g2, g1);
            }
            this.updateMatchFile();
            this.updateFile();
        }
    }
    void readMatchData(){
        try  {  
            //the file to be opened for reading  
            FileInputStream fis=new FileInputStream("matchFile.txt");       
            Scanner sc=new Scanner(fis);     
            while(sc.hasNextLine()){  
                  String data = sc.nextLine();
                  String[] matchFile = data.split(" ");
                  match m = new match(matchFile[0],matchFile[1],Integer.parseInt(matchFile[2]),
                          Integer.parseInt(matchFile[3]),matchFile[4]);
                  this.matchesData.add(m);
            }  
            sc.close();     
            }catch(IOException e){  
            e.printStackTrace();  
            }
    }
    void readTeamData(){
        try  {  
            //the file to be opened for reading  
            FileInputStream fis=new FileInputStream("teamFile.txt");       
            Scanner sc=new Scanner(fis);     
            while(sc.hasNextLine()){  
                  String data = sc.nextLine();
                  String[] teamFile = data.split(" ");
                  this.newTeam(teamFile[0], teamFile[1], Integer.parseInt(teamFile[2]),
                          Integer.parseInt(teamFile[3]),Integer.parseInt(teamFile[4]), Integer.parseInt(teamFile[5]),
                          Integer.parseInt(teamFile[6]), Integer.parseInt(teamFile[7]), Integer.parseInt(teamFile[8]));   
            }  
            sc.close();     
            }catch(IOException e){  
            e.printStackTrace();  
            }
    }
    //THis is the only main method of this System. This is where user can actually interact with the system!
    public static void main(String[] args){
        PremierLeagueManager FPL = new PremierLeagueManager();
        Scanner sc = new Scanner(System.in);
        
        int ask;
        try{
            while(true){
                System.out.println("Press 1 to enter new team\nPress 2 to generate a random match \n"
                + "Press 3 to Display Specific Team Date\nPress 4 to Display Entire Table"
                + "\nPress 5 to Delete a Team \nPress 6 to Open GUI\nPress 7 to Exit!");
                System.out.println("What do you want?");
                ask = sc.nextInt();
                if(ask == 1){
                    FPL.newTeam();
                }
                else if(ask == 2){
                    FPL.playMatch();
                }
                else if(ask == 3){
                    System.out.println("Team you want to display: ");
                    FPL.displaySpecific(sc.next());
                }
                else if(ask == 4){
                    FPL.displayAllTeams();
                }
                else if(ask == 5){
                    FPL.removeTeam();
                }
                else if(ask == 6){
                    FootballGUI fg = new FootballGUI();
                    fg.setVisible(true);
                }
                else if(ask == 7){
                    System.out.println("Program is exiting");
                    break;
                }
                else{
                    System.out.println("Please Enter a valid number!");
                }

            }
        }catch(Exception e){
            System.out.println("Invalid Input!");
        }
    }
}
