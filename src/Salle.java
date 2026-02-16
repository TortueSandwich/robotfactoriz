public class Salle extends Component{

    public Salle(float longueur, float largeur, String name) {
        super(longueur, largeur, name);
    }

    @Override
    public String toString() {
        return "Salle " + getName() + "positionnée en " + getCoord();
    }
    
}
