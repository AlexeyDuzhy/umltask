package umltask;

/**
 *
 * @author Alex
 */
public class CRectangle implements IShape{

    private CPoint cornerLeftTop;
    private double dWidth;
    private double dHeigth;

    public CRectangle(CPoint cornerLeftTop, double dWidth, double dHeigth) {
        this.cornerLeftTop = cornerLeftTop;
        this.dWidth = dWidth;
        this.dHeigth = dHeigth;
    }

    public CPoint getCornerLeftTop() {
        return cornerLeftTop;
    }

    public void setCornerLeftTop(CPoint cornerLeftTop) {
        this.cornerLeftTop = cornerLeftTop;
    }

    public double getdWidth() {
        return dWidth;
    }

    public void setdWidth(double dWidth) {
        this.dWidth = dWidth;
    }

    public double getdHeigth() {
        return dHeigth;
    }

    public void setdHeigth(double dHeigth) {
        this.dHeigth = dHeigth;
    }
    
    @Override
    public double S() {
        return dHeigth * dWidth;
    }
}
