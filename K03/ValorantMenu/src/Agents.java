import java.util.ArrayList;

public class Agents {

    String name;
    String role;

    public Agents() {
    }

    public Agents(String name) {
        this.name = name;
        this.role = "Duelist";
    }
    public Agents (String name, String role) {
        this.name = name;
        this.role = role;
    }

    public static ArrayList<Agents> getAgents() {
        ArrayList<Agents> agents = new ArrayList<Agents>();
        agents.add(new Agents("Brimstone", "Controller"));
        agents.add(new Agents("Phoenix"));
        agents.add(new Agents("Sage", "Sentinel"));
        agents.add(new Agents("Sova", "Initiator"));
        agents.add(new Agents("Viper", "Controller"));
        agents.add(new Agents("Cypher", "Sentinel"));
        agents.add(new Agents("Reyna"));
        agents.add(new Agents("Killjoy", "Sentinel"));
        agents.add(new Agents("Breach", "Initiator"));
        agents.add(new Agents("Omen", "Controller"));
        agents.add(new Agents("Jett"));
        agents.add(new Agents("Raze"));
        agents.add(new Agents("Skye", "Initiator"));
        agents.add(new Agents("Yoru"));
        agents.add(new Agents("Astra", "Controller"));
        agents.add(new Agents("Kay/o", "Initiator"));
        agents.add(new Agents("Chamber", "Sentinel"));
        agents.add(new Agents("Neon"));
        agents.add(new Agents("Fade", "Initiator"));
        agents.add(new Agents("Harbor", "Controller"));
        return agents;
    }

    public void getRoleDescription(String role) {
    }

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
