import java.util.ArrayList;

/**
 * Agents and Role lists are delivered
 * @author Joao, Aryan
 * @version 1.1
 * @since 13-12-2022
 */

public class Agents {

    String name;
    String role;

    public Agents() {
    }

    /**
     *
     * @param name
     * @param role
     * we define fields
     */
    public Agents(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public static ArrayList<Agents> getAgents() throws WrongInputException {
        ArrayList<Agents> agents = new ArrayList<Agents>();
        agents.add(new Agents("Brimstone", "Controller"));
        agents.add(new Agents("Phoenix", "Duelist"));
        agents.add(new Agents("Sage", "Sentinel"));
        agents.add(new Agents("Sova", "Initiator"));
        agents.add(new Agents("Viper", "Controller"));
        agents.add(new Agents("Cypher", "Sentinel"));
        agents.add(new Agents("Reyna", "Duelist"));
        agents.add(new Agents("Killjoy", "Sentinel"));
        agents.add(new Agents("Breach", "initiator"));
        agents.add(new Agents("Omen", "Controller"));
        agents.add(new Agents("Jett", "Duelist"));
        agents.add(new Agents("Raze", "Duelist"));
        agents.add(new Agents("Skye", "Initiator"));
        agents.add(new Agents("Yoru", "Duelist"));
        agents.add(new Agents("Astra", "Controller"));
        agents.add(new Agents("Kay/o", "Initiator"));
        agents.add(new Agents("Chamber", "Sentinel"));
        agents.add(new Agents("Neon", "Duelist"));
        agents.add(new Agents("Fade", "Initiator"));
        agents.add(new Agents("Harbor", "Controller"));
        return agents;
    }

    /**
     *
     * @return name
     * we get name from the agents
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return role reciver
     * we recive each agents role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
