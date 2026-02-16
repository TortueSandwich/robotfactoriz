public class Machineprod extends Component{

    public Machineprod(float longueur, float largeur, String name) {
        super(longueur, largeur, name);
    }

    @Override
    public String toString() {
        return "Machineprod " + getName() + "positionnée en " + getCoord();
    }
    
}
