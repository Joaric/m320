public class Duelist extends Agents {
    @Override
    public void getRoleDescription(String role) {
        System.out.println("Duelists are self-sufficient fraggers who their team expects, through abilities and skills, to get high frags and seek out engagements first.");
        switch (role) {
            case "Controller" -> System.out.println("Controllers are experts in slicing up dangerous territory to set their team up for success.");
            case "Initiator" -> System.out.println("Initiators challenge angles by setting up their team to enter contested ground and push defenders away.");
            case "Sentinel" -> System.out.println("Sentinels are defensive experts who can lock down areas and watch flanks, both on attacker and defender rounds.");
        }
    }
}
