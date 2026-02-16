public class Station extends Component{

    public Station(float longueur, float largeur, String name) {
        super(longueur, largeur, name);
    }

    @Override
    public String toString() {
        return "Station " + getName() + "positionnée en " + getCoord();
    }
    
}
