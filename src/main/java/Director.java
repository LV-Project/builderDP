public class Director {



    public void constructorRobot(Builder builder){

        builder.setName("Wilfredo");

        builder.setArms(2);
        builder.setLegs(1);
        builder.setType(CreationType.ROBOT);



    }
    public void constructorMonster(Builder builder){
        builder.setName("Dogix");
        builder.setArms(2);
        builder.setLegs(1);
        builder.setHasLasers(1);
        builder.setHasWings(true);
        builder.setType(CreationType.MONSTER);
    }

}
