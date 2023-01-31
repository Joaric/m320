import java.util.ArrayList;

abstract public class Agents {

    String name;
    String role;

    public Agents(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public static ArrayList<Agents> getAgents() {
        ArrayList<Agents> agents = new ArrayList<Agents>();
        agents.add(new Controller("Brimstone"));
        agents.add(new Duelist("Phoenix"));
        agents.add(new Sentinel("Sage"));
        agents.add(new Initiator("Sova"));
        agents.add(new Controller("Viper"));
        agents.add(new Sentinel("Cypher"));
        agents.add(new Duelist("Reyna"));
        agents.add(new Sentinel("Killjoy"));
        agents.add(new Initiator("Breach"));
        agents.add(new Controller("Omen"));
        agents.add(new Duelist("Jett"));
        agents.add(new Duelist("Raze"));
        agents.add(new Duelist("Skye"));
        agents.add(new Duelist("Yoru"));
        agents.add(new Controller("Astra"));
        agents.add(new Initiator("Kay/o"));
        agents.add(new Sentinel("Chamber"));
        agents.add(new Duelist("Neon"));
        agents.add(new Initiator("Fade"));
        agents.add(new Controller("Harbor"));
        return agents;
    }

    abstract public void getRoleDescription();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
