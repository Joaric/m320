public class Duelist extends Agents {
    public Duelist (String name) {
        super(name, "Duelist");
    }
    @Override
    public void getRoleDescription() {
        System.out.println("Duelists are self-sufficient fraggers who their team expects, through abilities and skills, to get high frags and seek out engagements first.");
    }
}
