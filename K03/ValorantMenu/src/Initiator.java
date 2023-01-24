public class Initiator extends Agents {
    public Initiator (String name) {
        this.name = name;
        this.role = "Initiator";
    }
    @Override
    public void getRoleDescription() {
        System.out.println("Initiators challenge angles by setting up their team to enter contested ground and push defenders away.");
    }
}
