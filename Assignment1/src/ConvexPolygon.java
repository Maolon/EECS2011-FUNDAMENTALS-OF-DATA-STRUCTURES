/**********************************************************
 * EECS2011: Fundamentals of Data Structures,  Winter 2019
 * Assignment 1: Polygon Hierarchy
 * Section:  M  or  Z   ?
 * Student Name:   ?
 * Student eecs account:  ?
 * Student ID number:  ? 
 **********************************************************/
package A1;

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




}