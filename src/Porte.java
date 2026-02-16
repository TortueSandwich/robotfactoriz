public class Porte extends Component{

    public Porte(float longueur, float largeur, String name) {
        super(longueur, largeur, name);
    }

    @Override
    public String toString() {
        return "Porte " + getName() + "positionnée en " + getCoord();
    }
    
}
