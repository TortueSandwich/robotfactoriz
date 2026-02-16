package projet;

import fr.tp.inf112.projects.canvas.model.RectangleShape;
import fr.tp.inf112.projects.canvas.model.Shape;

public class Salle extends Component{

    public Salle(float longueur, float largeur, String name) {
        super(longueur, largeur, name);
    }

    @Override
    public String toString() {
        return "Salle " + getName() + "positionnée en " + getCoord();
    }

    @Override
    public Shape getShape() {
        return new RectangleShape() {
            @Override
            public int getHeight() {
                return Salle.this.getHeightInPixels();
            }
            @Override
            public int getWidth() {
                return Salle.this.getWidthInPixels();
            }
        };
    }
    
}
