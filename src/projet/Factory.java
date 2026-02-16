package projet;

import java.util.ArrayList;

public class Factory {
    final private String name;
    private ArrayList<Component> components;

    public Factory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public boolean addComponent(Component c) {
        return components.add(c);
    }

    /** parcourir la liste des robots pour vérifier qu'aucun d'entre eux n'a le même nom que celui passé en paramètre */
    private boolean checkComponentName(String name) {
        for (Component component : components) {
            if (component.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void printToConsole() {
        System.out.println("Factory: " + name);
        System.out.println("Components:");
        for (Component c : components) {
            System.out.println(c);
        }
    }
}
