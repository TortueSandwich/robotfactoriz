package projet;

import fr.tp.inf112.projects.canvas.model.RectangleShape;
import fr.tp.inf112.projects.canvas.model.Shape;

public class Porte extends Component{

    public Porte(float longueur, float largeur, String name) {
        super(longueur, largeur, name);
    }

    @Override
    public String toString() {
        return "Porte " + getName() + "positionnée en " + getCoord();
    }
    @Override
    public Shape getShape() {
        return new RectangleShape() {
            @Override
            public int getHeight() {
                return Porte.this.getHeightInPixels();
            }
            @Override
            public int getWidth() {
                return Porte.this.getWidthInPixels();
            }
        };
    }
    
}
