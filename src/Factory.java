import java.util.ArrayList;

public class Factory {
    private String name;
    private ArrayList<Robot> robots;

    public Factory(String name) {
        this.name = name;
        this.robots = new ArrayList<>();
    }

    public boolean addRobot(Robot r) {
        return robots.add(r);
    }

    /** parcourir la liste des robots pour vérifier qu'aucun d'entre eux n'a le même nom que celui passé en paramètre */
    private boolean checkRobotName(String name) {
        for (Robot robot : robots) {
            if (robot.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void printToConsole() {
        System.out.println("Factory: " + name);
        System.out.println("Robots:");
        for (Robot robot : robots) {
            System.out.println("  - " + robot.getName());
        }
    }
}
