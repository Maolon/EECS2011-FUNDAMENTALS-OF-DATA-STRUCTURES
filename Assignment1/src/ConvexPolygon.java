/**********************************************************
 * EECS2011: Fundamentals of Data Structures,  Winter 2019
 * Assignment 1: Polygon Hierarchy
 * Section:  M
 * Student Name:  Dongyao He
 * Student eecs account:  dhe16
 * Student ID number:  215917610
 **********************************************************/
package A1;

import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * The class ConvexPolygon extends SimplePolygon.
 *
 * TODO:_______ Add more Javadoc comments here. ______ ???
 *
 * @author Andy Mirzaian
 */
public class ConvexPolygon extends SimplePolygon {
    // TODO: add your code here
    public ConvexPolygon(int size){
        super(size);
    }

    public ConvexPolygon(){
        this(3);
    }

    public boolean isConvex(){
        if(!isSimple()) return false;
        boolean prev = delta(getVertex(0),getVertex(1),getVertex(2)) >0;
        boolean present;
        for(int i=0;i<n-2;i++){
            int j = (i+1)%n;
            int k = (i+2)%n;
            present = delta(getVertex(i),getVertex(j),getVertex(k)) >0;
            if(prev != present) return false;
        }

        return true;
    }

    /**
     * static factory method constructs and returns an unverified convex-polygon, initialised
     * according to user provided input data. Runs in O(n) time.
     *
     * @return an unverified simple-polygon instance
     */
    public static ConvexPolygon getNewPoly() {
        try{
            ArrayList<Double> list = readFromUserInput();
            double size = list.get(0); // TODO: replace this line with your code
            int j=1;
            ConvexPolygon p = new ConvexPolygon((int) size);
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





}