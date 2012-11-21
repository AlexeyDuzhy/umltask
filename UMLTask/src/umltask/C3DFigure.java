package umltask;

/**
 *
 * @author Alex
 */
public class C3DFigure {

    private double dHeight;
    private IShape base;

    public C3DFigure() {
    }

    public C3DFigure(double dHeight, IShape base) {
        this.dHeight = dHeight;
        this.base = base;
    }
    
    public double V()
    {
        return base.S() * dHeight;
    }
}
