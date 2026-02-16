package projet;

import fr.tp.inf112.projects.canvas.model.RectangleShape;
import fr.tp.inf112.projects.canvas.model.Shape;
import fr.tp.inf112.projects.canvas.model.Style;

public class Aireprod extends Component {

    @Override
    public Style getStyle() {
        return null;
    }

    public Aireprod(float longueur, float largeur, String name) {
        super(longueur, largeur, name);
    }

    @Override
    public String toString() {
        return "Aireprod " + getName() + "positionnée en " + getCoord();
    }

    @Override
    public Shape getShape() {
        return new RectangleShape() {
            @Override
            public int getHeight() {
                return Aireprod.this.getHeightInPixels();
            }
            @Override
            public int getWidth() {
                return Aireprod.this.getWidthInPixels();
            }
        };
    }



}
