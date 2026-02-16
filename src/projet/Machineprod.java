package projet;

import fr.tp.inf112.projects.canvas.model.RectangleShape;
import fr.tp.inf112.projects.canvas.model.Shape;

public class Machineprod extends Component{

    public Machineprod(float longueur, float largeur, String name) {
        super(longueur, largeur, name);
    }

    @Override
    public String toString() {
        return "Machineprod " + getName() + "positionnée en " + getCoord();
    }

    @Override
    public Shape getShape() {
        return new RectangleShape() {
            @Override
            public int getHeight() {
                return Machineprod.this.getHeightInPixels();
            }
            @Override
            public int getWidth() {
                return Machineprod.this.getWidthInPixels();
            }
        };
    }
    
}
