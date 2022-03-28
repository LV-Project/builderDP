package CreacionDeRobots;

public class CreacionDeMonstruos {

    //For immutable variables just add final
    private String name;
    private int arms;
    private int legs;
    private boolean hasWings;
    private int hasLasers;

    private CreacionDeMonstruos(Builder builder){
        this.name = builder.name;
        this.arms = builder.arms;
        this.legs = builder.legs;
        this.hasWings = builder.hasWings;
        this.hasLasers = builder.hasLasers;
    }

    public static class Builder {
        private String name;
        private int arms;
        private int legs;
        private boolean hasWings;
        private int hasLasers;

        public Builder name(final String name){
            this.name=name;
            return this;
        }

        public Builder arms (final int arms){
            return this;
        }
        public Builder legs (final int legs){
            return this;
        }
        public Builder hasWings(final boolean hasWings){
            this.hasWings = hasWings;
            return this;
        }
        public Builder hasLasers(final int hasLasers){
            this.hasLasers = hasLasers;
            return this;
        }
        public CreacionDeMonstruos build(){
            return new CreacionDeMonstruos(this);
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

    }

    @Override
    public String toString() {

        return "name: " + this.name + "," + "Legs: " + this.legs + "," + "Arms: " + this.arms + "," + "Fly: " + this.hasWings + "," + "Lasers: " + this.hasLasers;
    }
}

