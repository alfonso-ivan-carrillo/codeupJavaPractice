package soccer;

public class Barca implements TeamBuilder{
    public String teamName;
    public String manager;

    public Barca() {
    }

    public Barca(String teamName) {
        this.teamName = teamName;
    }

    public Barca(String teamName, String manager){
        this.teamName = teamName;
        this.manager = manager;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void roster(){
        System.out.println("Max roster allowed is 24.");
    }

    public int starters(int numOfPlayers){
        System.out.printf("Do we have %d starting players?", numOfPlayers);
        return numOfPlayers;
    }

    public void bench(){
        System.out.println("Do we have 13 players on the bench?");
    }
}
