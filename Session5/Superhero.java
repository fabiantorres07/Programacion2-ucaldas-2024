public class Superhero {
    public String superhero_name;
    public int superpowers_number;
    public String[] superpowers = new String[superpowers_number];
    public boolean isAlive = false;
    public int universe;

    public Superhero(String superhero_name_pharam, int superpowers_number_pharam, String[] superpowers_pharam,
            boolean isAlive_pharam, int universe_pharam) {
        this.superhero_name = superhero_name_pharam;
        this.superpowers_number = superpowers_number_pharam;
        this.superpowers = superpowers_pharam;
        this.isAlive = isAlive_pharam;
        this.universe = universe_pharam;
    }

    public String getSuperhero_name() {
        return this.superhero_name;
    }

    public void setSuperhero_name(String superhero_name) {
        this.superhero_name = superhero_name;
    }

    public int getSuperpowers_number() {
        return this.superpowers_number;
    }

    public void setSuperpowers_number(int superpowers_number) {
        this.superpowers_number = superpowers_number;
    }

    public String[] getSuperpowers() {
        return this.superpowers;
    }

    public void setSuperpowers(String[] superpowers) {
        this.superpowers = superpowers;
    }

    public boolean isIsAlive() {
        return this.isAlive;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public int getUniverse() {
        return this.universe;
    }

    public void setUniverse(int universe) {
        this.universe = universe;
    }

    public void showPowers() {
        for (int i = 0; i < superpowers_number; i++) {
            System.out.println(superpowers[i]);
        }
    }
}