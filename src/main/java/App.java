public class App {
    public static void main(String[] args) {

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
