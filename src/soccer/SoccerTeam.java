package soccer;

public class SoccerTeam extends Team{
    // Constructors
    public SoccerTeam() {
    }

    public SoccerTeam(String teamName) {
        super(teamName);
    }

    public SoccerTeam(String teamName, String managerName) {
        super(teamName, managerName);
    }

    public SoccerTeam(String teamName, String managerName, String mascot) {
        super(teamName, managerName, mascot);
    }

    public SoccerTeam(String teamName, String managerName, String mascot, int maxRoster) {
        super(teamName, managerName, mascot, maxRoster);
    }

    public SoccerTeam(String teamName, String managerName, String mascot, int maxRoster, int injuryReserve) {
        super(teamName, managerName, mascot, maxRoster, injuryReserve);
    }

    // implementing abstract methods from Abstract Team Class
    public String teamChant(){
        return "Ole-le, Ola-la, ser del Barça és el millor que hi ha!";
    }
    public String teamColors(){
        return "blue, red and gold";
    }

    //
    public void sport(){
        System.out.println("Soccer");
    }

    public void division(){
        System.out.println("La Liga Division 1");
    }
}
