package CreacionDeRobots;

public class appDos {
    public static void main(String[] args) {

        CreacionDeRobots robot1 = new CreacionDeRobots.Builder()
                .name("Perritox")
                .legs(4).hasWings(true)
                .hasLasers(3)
                .build();

        System.out.println(robot1);

        CreacionDeMonstruos monster1 = new CreacionDeMonstruos.Builder()
                .name("LaCosa")
                .arms(4)
                .legs(4)
                .build();
        System.out.println(monster1);
    }
}
