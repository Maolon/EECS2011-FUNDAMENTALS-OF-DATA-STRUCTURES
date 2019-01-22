/**********************************************************
 * EECS2011: Fundamentals of Data Structures,  Winter 2019
 * Assignment 1: Polygon Hierarchy
 * Section:  M  or  Z ?
 * Student Name:  Dongyao He
 * Student eecs account:  dhe16
 * Student ID number:  215917610
 **********************************************************/
package A1;

import java.awt.geom.Point2D;
import java.util.*;

/**
 * The class SimplePolygon implements the Polygon interface.
 *
 * It is intended to be further extended by ConvexPolygon.
 *
 * @author Andy Mirzaian
 */
public class SimplePolygon implements Polygon {

    /********* protected fields ************************/

    protected int n; // number of vertices of the polygon
    protected Point2D.Double[] vertices; // vertices[0..n-1] around the polygon boundary

    /********* protected constructors ******************/

    /**
     * constructor used in the static factory method getNewPoly()
     *
     * @param size
     *            number of edges (also vertices) of the polygon
     */
    protected SimplePolygon(int size) {
        n = size;
        // TODO: place the rest of your code here
        vertices = new Point2D.Double[n];

    }

    /** default no-parameter constructor */
    protected SimplePolygon() {
        // TODO: place your code here
        this(3);
    }

    /********* public getters & toString ***************/

    /**
     * static factory method constructs and returns an unverified simple-polygon, initialised
     * according to user provided input data. Runs in O(n) time.
     *
     * @return an unverified simple-polygon instance
     */
    public static SimplePolygon getNewPoly() {
        try{
            ArrayList<Double> list = readFromUserInput();
            double size = list.get(0); // TODO: replace this line with your code
            int j=1;
            SimplePolygon p = new SimplePolygon((int) size);
            // TODO: populate p.vertices[0..size-1] from input
            for(int i=0;i<size;i++){
                p.vertices[i] = new Point2D.Double();
                p.vertices[i].x = list.get(j);
                p.vertices[i].y = list.get(j+1);
                j=j+2;
            }
            return p;

        }catch(IllegalArgumentException e){
            System.out.println("Illegal num of edges ");
            return null;
        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }

    }
    /**
     * read from user input
     * @return Arraylist of vertex and num of polygons
     */
    private static ArrayList<Double> readFromUserInput() throws IllegalArgumentException{
        ArrayList <Double> list = new ArrayList<>();
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the num of edges of polygon");
        num = sc.nextInt();
        System.out.println("num of edges"+num);
        if(num < 3) throw new IllegalArgumentException();
        list.add(Double.valueOf(num));
        for(int i=0;i<num;i++){
            System.out.println("please input point"+i+" x " );
            list.add(sc.nextDouble());
            System.out.println("please input point"+i+" y " );
            list.add(sc.nextDouble());
        }
        return list;
    }

    /**
     *
     * @return n, the number of edges (equivalently, vertices) of the polygon.
     */
    public int getSize() {
        return n;
    }

    //test function remove it
    public void setVertices(Point2D.Double[] d){
        vertices = d;
    }

    /**
     *
     * @param i
     *            index of the vertex.
     * @return the i-th vertex of the polygon.
     * @throws IndexOutOfBoundsException
     *             if {@code i < 0 || i >= n }.
     */
    public Point2D.Double getVertex(int i) throws IndexOutOfBoundsException {

        try{
          if(i<0 || i>=n) throw new IndexOutOfBoundsException("Index out of Boundry");
          return vertices[i];

        }catch(Exception e){
            System.out.println(e.toString());
            throw new IndexOutOfBoundsException("Index out of Boundry");
        }

    }

    /**
     * @return a String representation of the polygon in O(n) time.
     */
    @Override
    public String toString() {
        String str = "Num of Edge " + String.valueOf(n);
        for(int i=0;i<vertices.length;i++){
            str += " | point"+i+" x "+vertices[i].x+","+"y "+vertices[i].y+" | ";
        }
        return str; // TODO: replace this line with your code
    }

    /************** utilities *********************/

    /**
     *
     * @param a
     * @param b
     * @param c
     *            three input points.
     * @return twice the signed area of the oriented triangle (a,b,c). Runs in O(1) time.
     */
    public static double delta(Point2D.Double a, Point2D.Double b,
                               Point2D.Double c) {

       // TODO: replace this line with your code
        double ret = (b.x-a.x)*(c.y-a.y)-(c.x-a.x)*(b.y-a.y);
        //System.out.println(ret);
        return ret;
    }

    /**
     * @param a
     * @param b
     *            end points of line-segment (a,b).
     * @param c
     * @param d
     *            end points of line-segment (c,d).
     * @return true if closed line-segments (a,b) and (c,d) are disjoint. Runs in O(1) time.
     */
    public static boolean disjointSegments(Point2D.Double a, Point2D.Double b,
                                           Point2D.Double c, Point2D.Double d) {
        double r1 = delta(a,b,c);
        double r2 = delta(a,b,d);
        double r3 = delta(c,d,a);
        double r4 = delta(c,d,b);

        //special case
        if(r1 == 0.0 && onSegment(a,b,c)) return false;
        if(r2 == 0.0 && onSegment(a,b,d)) return false;
        if(r3 == 0.0 && onSegment(c,d,a)) return false;
        if(r4 == 0.0 && onSegment(c,d,b)) return false;
        //general case
        if(r1*r2<0 && r3*r4<0 ) return false;


        return true; // TODO: replace this line with your code
    }

    /**
     * @param a
     * @param b
     * @param c
     *          three Point2D value
     * @return true if point c on segment a,b false if not
    * */
    private static boolean onSegment(Point2D.Double a, Point2D.Double b, Point2D.Double c){

            if(Math.min(a.x,b.x)<=c.x && Math.max(a.x,b.x)>=c.x && Math.min(a.y,b.y)<=c.y && Math.max(a.y,b.y)>=c.y)
                return true;
            else
                return false;
    }

    /**
     * @param i
     * @param j
     *            indices of two edges of the polygon.
     * @return true if the i-th and j-th edges of the polygon are disjoint. Runs in O(1) time.
     * @throws IndexOutOfBoundsException
     *             if i or j are outside the index range [0..n-1].
     */
    public boolean disjointEdges(int i, int j) throws IndexOutOfBoundsException {
        try{
            if(i<0 || j<0 || i>=n || j>=n) throw new IndexOutOfBoundsException("Index out of Boundry");

            int iEnd = (i+1)%n;
            int jEnd = (j+1)%n;
            return disjointSegments(getVertex(i),getVertex(iEnd),getVertex(j),getVertex(jEnd));

        }catch(Exception e){
            System.out.println(e.toString());
            throw new IndexOutOfBoundsException("Index out of Boundry");
        }
    }

    /**
     * This method verifies whether the claimed "simple-polygon" is indeed simple.
     *
     * @return true if the polygon is simple. Runs in O(n^2) time.
     */
    public boolean isSimple() {

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(j-i>1 && j-i<n-1){
                    System.out.println("i "+i+" j "+j+" "+disjointEdges(i,j));
                    if(!disjointEdges(i,j)) return false;
                }

            }
        }

        return true; // TODO: replace this line with your code
    }

    /************ perimeter & area ***************/

    /**
     *
     * @return the sum of the edge lengths of the polygon. Runs in O(n) time.
     */
    public double perimeter() {
        double sum = 0;
        for(int i=0;i<n;i++){
            Point2D.Double p1 = getVertex(i);
            Point2D.Double p2 = getVertex((i+1)%n);
            sum +=Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2));

        }
        return sum; // TODO: replace this line with your code
    }

    /**
     *
     * @return area of the polygon interior. Runs in O(n) time not counting the simplicity test.
     * @throws NonSimplePolygonException
     *             if the polygon is non-simple.
     */
    public double area() throws NonSimplePolygonException {
        double sum = 0;

        try{
           if(!isSimple()) throw new NonSimplePolygonException("NonSimplePolygon");
           int j = n-1;
           for(int i=0;i<n;i++){
               sum += (getVertex(j).x + getVertex(i).x) * (getVertex(j).y - getVertex(i).y);
               j = i;
           }
           return 0.5*Math.abs(sum) ;

       }catch(Exception e){

           System.out.println(e.toString());
           throw new NonSimplePolygonException("NonSimplePolygon");
       }
     // return 0; // TODO: replace this line with a try-catch code
    }



}