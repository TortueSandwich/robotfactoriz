public class Robot extends Component {
    private double speed;


    public Robot(String name, double speed) {
        this(name, speed, 0 ,0);
    }
    public Robot(String name, double speed, float x, float y) {
        super(10,10,name);
        this.speed = speed;
        this.set_coord(x, y);
    }

    @Override
    public String toString() {
        if (getName() == null || getName().isEmpty()) {
            return "Je m'appelle Anonyme et j'avance à " + speed + " km/h.";
        }
        return "Je m'appelle " + getName() + " et j'avance à " + speed + " km/h et je suis en " + getCoord();
    }


    public double getSpeed() {
        return speed;
    }

    
        
    
}

