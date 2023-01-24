public class Sentinel extends Agents {

    public Sentinel (String name) {
        this.name = name;
        this.role = "Sentinel";
    }
    @Override
    public void getRoleDescription() {
        System.out.println("Sentinels are defensive experts who can lock down areas and watch flanks, both on attacker and defender rounds.");
        }
    }
