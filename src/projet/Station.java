package projet;

import fr.tp.inf112.projects.canvas.model.RectangleShape;
import fr.tp.inf112.projects.canvas.model.Shape;

public class Station extends Component{

    public Station(float longueur, float largeur, String name) {
        super(longueur, largeur, name);
    }

    @Override
    public String toString() {
        return "Station " + getName() + "positionnée en " + getCoord();
    }

    @Override
    public Shape getShape() {
        return new RectangleShape() {
            @Override
            public int getHeight() {
                return Station.this.getHeightInPixels();
            }
            @Override
            public int getWidth() {
                return Station.this.getWidthInPixels();
            }
        };
    }
    
}
