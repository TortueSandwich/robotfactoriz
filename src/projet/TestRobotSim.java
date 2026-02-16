package projet;

public class TestRobotSim {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Factory factory = new Factory("Ma factory ");

        factory.addComponent(new Robot("Alpha", 100)); 
        factory.addComponent(new Robot("Beta", 75));
        factory.addComponent(new Robot("Alpha", 80));
        factory.addComponent(new Robot("Gamma", 90));
        factory.addComponent(new Robot("Beta", 85));

        factory.printToConsole();
        System.err.println(new Robot("Beta", 85));

    }
}
