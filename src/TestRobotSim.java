public class TestRobotSim {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Factory factory = new Factory("Ma factory ");

        factory.addRobot(new Robot("Alpha", 100));
        factory.addRobot(new Robot("Beta", 75));
        factory.addRobot(new Robot("Alpha", 80));
        factory.addRobot(new Robot("Gamma", 90));
        factory.addRobot(new Robot("Beta", 85));

        factory.printToConsole();
    }
}
