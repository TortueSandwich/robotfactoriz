public class Aireprod extends Component {

    public Aireprod(float longueur, float largeur, String name) {
        super(longueur, largeur, name);
    }

    @Override
    public String toString() {
        return "Aireprod " + getName() + "positionnée en " + getCoord();
    }



}
