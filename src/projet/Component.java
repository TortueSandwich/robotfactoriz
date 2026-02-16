package projet;

import fr.tp.inf112.projects.canvas.model.Figure;

/**
 *
 * @author prez
 */
public abstract class Component implements Figure {
    private Coord coord;
    final private float longueur;
    final private float largeur;
    final private String name;

    public Component(float longueur, float largeur, String name) {
        this.coord = new Coord(0,0);
        this.longueur = longueur;
        this.largeur = largeur;
        this.name = name;
    }

    public void set_coord(int x, int y){
        coord = new Coord(x,y);
    }

    public Coord getCoord(){
        return this.coord;
    }

    public float getLongueur() {
        return longueur;
    }

    public float getLargeur() {
        return largeur;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getxCoordinate() {
        return coord.x();
    }

    @Override
    public int getyCoordinate() {
        return coord.y();
    }

    public int getWidthInPixels(){
        return (int)(this.largeur*50.0);
    }
    public int getHeightInPixels(){
        return (int)(this.longueur*50.0);
    }
    
}
