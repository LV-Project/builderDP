public class Robot {

    private String name;
    private int arms;
    private int legs;
    private boolean hasWings;
    private int hasLasers;
    private final CreationType type;


    public Robot(String name, int arms, int legs, boolean hasWings, int hasLasers, CreationType type){
        this.name = name;
        this.arms = arms;
        this.legs = legs;
        this.hasWings = hasWings;
        this.hasLasers = hasLasers;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getArms() {
        return arms;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isHasWings() {
        return hasWings;
    }

    public int getHasLasers() {
        return hasLasers;
    }

    public CreationType getType() {
        return type;
    }
    @Override
    public String toString() {

        return "name: " + this.name + "," + "Legs: " + this.legs + "," + "Arms: " + this.arms + "," + "Fly: " + this.hasWings + "," + "Lasers: " + this.hasLasers + "type: " + this.type;
    }
}
