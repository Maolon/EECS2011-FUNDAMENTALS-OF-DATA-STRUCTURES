public interface  Polygon {
    int getSize();
    java.awt.geom.Path2D.Double getVertex(int i)  throws java.lang.IndexOutOfBoundsException;
    double area()throws NonSimplePolygonException;
    double perimeter();

}
