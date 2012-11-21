package umltask;

/**
 *
 * @author Alex
 */
public class CList {

    private int nCount;
    private C3DFigure[] array;

    public CList(C3DFigure[] array) {
        this.array = array;
        this.nCount = array.length;
    } 

    public int getnCount() {
        return nCount;
    }

    public void setnCount(int nCount) {
        this.nCount = nCount;
    }

    public C3DFigure[] getArray() {
        return array;
    }

    public void setArray(C3DFigure[] array) {
        this.array = array;
    }
    
    public CIterator Begin()
    {
        throw new UnsupportedOperationException("Not clear UML diagram");
    }
    
    public CIterator End()
    {
        throw new UnsupportedOperationException("Not clear UML diagram");
    }
}
