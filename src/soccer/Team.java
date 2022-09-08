package soccer;

abstract class Team {
    // Fields/Variables
    public String teamName;
    public String managerName;
    public String mascot;
    public int maxRoster;
    public int injuryReserve;

    // Constructors
    public Team(){
    }
    public Team(String teamName){
        this.teamName = teamName;
    }
    public Team(String teamName, String managerName){
        this.teamName = teamName;
        this.managerName = managerName;
    }
    public Team(String teamName, String managerName, String mascot){
        this.teamName = teamName;
        this.managerName = managerName;
        this.mascot = mascot;
    }
    public Team(String teamName, String managerName, String mascot, int maxRoster){
        this.teamName = teamName;
        this.managerName = managerName;
        this.mascot = mascot;
        this.maxRoster = maxRoster;
    }
    public Team(String teamName, String managerName, String mascot, int maxRoster, int injuryReserve){
        this.teamName = teamName;
        this.managerName = managerName;
        this.mascot = mascot;
        this.maxRoster = maxRoster;
        this.injuryReserve = injuryReserve;
    }

    // Getters and Setters
    public String getManagerName(){
        return managerName;
    }
    public void setManagerName(String managerName){
        this.managerName = managerName;
    }
    public String getTeamName(){
        return teamName;
    }
    public void setTeamName(String teamName){
        this.teamName = teamName;
    }
    public String getMascot(){
        return mascot;
    }
    public void setMascot(String mascot){
        this.mascot = mascot;
    }
    public int getMaxRoster(){
        return maxRoster;
    }
    public void setMaxRoster(int maxRoster){
        this.maxRoster = maxRoster;
    }
    public int getInjuryReserve(){
        return injuryReserve;
    }
    public void setInjuryReserve(int injuryReserve){
        this.injuryReserve = injuryReserve;
    }

    // Abstract Methods
    public abstract String teamChant(String teamChant);
    public abstract String teamColors(String teamColors);


}
