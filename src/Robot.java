public class Robot {

    private String name;

    private double speed;

    public Robot(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        if (name == null || name.isEmpty()) {
            return "Je m'appelle Anonyme et j'avance à " + speed + " km/h.";
        }
        return "Je m'appelle " + name + " et j'avance à " + speed + " km/h.";
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    
        
    
}

