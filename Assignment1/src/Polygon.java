public interface  Polygon {
    int getSize();
    java.awt.geom.Path2D.Double getVertex(int i);
    double area();
    double perimeter();

}
