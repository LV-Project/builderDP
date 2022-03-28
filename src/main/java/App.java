public class App {
    public static void main(String[] args) {

//        RobotCreation robot1 = new RobotCreation.Builder()
//                                                .name("Rupenstisky")
//                                                .arms(1)
//                                                .hasWings(true)
//                                                .build();
//


//        System.out.println(robot1);
//        System.out.println(robot2);


        Director director = new Director();
        RobotCreation builderRo = new RobotCreation();
        director.constructorRobot(builderRo);

        Robot robot1 = builderRo.getRobot();
        System.out.println("Robot built:\n" + robot1);



        MonsterCreation builderMO = new MonsterCreation();
        director.constructorMonster(builderMO);

        Monster monster1 = builderMO.getMonster();
        System.out.println("Monster built:\n" + monster1);



    }
}
