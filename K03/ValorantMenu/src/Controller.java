public class Controller extends Agents {

    public Controller (String name) {
        super(name, "Controller");
    }
    @Override
    public void getRoleDescription() {
        System.out.println("Controllers are experts in slicing up dangerous territory to set their team up for success.");
    }
}
