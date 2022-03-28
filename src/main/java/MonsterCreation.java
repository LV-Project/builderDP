public class MonsterCreation implements Builder {

    //For immutable variables just add final
    private String name;
    private int arms;
    private int legs;
    private boolean hasWings;
    private int hasLasers;
    private CreationType type;

    public void setName(String name) {
        this.name = name;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    public void setHasLasers(int hasLasers) {
        this.hasLasers = hasLasers;
    }

    public void setType(CreationType type) {
        this.type = type;
    }

    public Monster getMonster (){
        return new Monster(name,arms, legs, hasWings, hasLasers, type);
    }

//    @Override
//    public String toString() {
//
//        return "name: " + this.name + "," + "Legs: " + this.legs + "," + "Arms: " + this.arms + "," + "Fly: " + this.hasWings + "," + "Lasers: " + this.hasLasers + "type: " + this.type;
//    }



}
