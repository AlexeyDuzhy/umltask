package umltask;

/**
 * Circle class that implements IShape interface.
 * 
 * @author Alex
 */
public class CCircle implements IShape{

    private CPoint center;
    private double dR;

    public CCircle(CPoint center, double dR) {
        this.center = center;
        this.dR = dR;
    }

    public CPoint getCenter() {
        return center;
    }

    public void setCenter(CPoint center) {
        this.center = center;
    }

    public double getdR() {
        return dR;
    }

    public void setdR(double dR) {
        this.dR = dR;
    }
    
    @Override
    public double S() {
        return Math.PI * dR * dR;
    }

}
