/**********************************************************
 * EECS2011: Fundamentals of Data Structures,  Winter 2019
 * Assignment 1: Polygon Hierarchy
 * Section:  M  or  Z ?
 * Student Name:   ?
 * Student eecs account:  ?
 * Student ID number:  ? 
 **********************************************************/
package A1;

import java.awt.geom.Point2D;

/**
 * PolygonTester should enable a thorough testing of the polygon hierarchy.
 *
 * It should provide an easy to read input-output recording of the test cases.
 *
 * The student should also submit these recorded test results in TestIO.txt file as part
 * of Assignment1.
 *
 * @author Andy Mirzaian
 */
public class PolygonTester {

    // TODO: place additional test-helper methods here if you like
    public static void main(String[] args) {
        // TODO: place your tester code here
        // test joint cross segment
        SimplePolygon sim  = new SimplePolygon();
//        Point2D.Double p1 = new Point2D.Double(1,1);
//        Point2D.Double p2 = new Point2D.Double(-1,-1);
//        Point2D.Double q1 = new Point2D.Double(-1,1);
//        Point2D.Double q2 = new Point2D.Double(1,-1);
//
//        System.out.println("cross joint "+sim.disjointSegments(p1,p2,q1,q2));
//
//        //test cross disjiont segment
//        Point2D.Double i1 = new Point2D.Double(-0.5,-0.5);
//        Point2D.Double i2 = new Point2D.Double(-1,-1);
//        Point2D.Double j1 = new Point2D.Double(0.5,-0.5);
//        Point2D.Double j2 = new Point2D.Double(1,-1);
//
//        System.out.println("cross disjoint "+sim.disjointSegments(i1,i2,j1,j2));
//
//        // test line parallel
//        Point2D.Double o1 = new Point2D.Double(-1,0);
//        Point2D.Double o2 = new Point2D.Double(0,1);
//        Point2D.Double x1 = new Point2D.Double(0,-1);
//        Point2D.Double x2 = new Point2D.Double(1,0);
//
//        System.out.println("parallel disjoint "+sim.disjointSegments(o1,o2,x1,x2));
//
//        // test vertical joint segment
//        Point2D.Double a1 = new Point2D.Double(-1,1);
//        Point2D.Double a2 = new Point2D.Double(1,-1);
//        Point2D.Double b1 = new Point2D.Double(0,0);
//        Point2D.Double b2 = new Point2D.Double(1,1);
//
//        System.out.println("vertical joint  "+sim.disjointSegments(a1,a2,b1,b2));
//
//        // test vertical disjoint segment
//        Point2D.Double c1 = new Point2D.Double(-1,1);
//        Point2D.Double c2 = new Point2D.Double(1,-1);
//        Point2D.Double d1 = new Point2D.Double(0.5,0.5);
//        Point2D.Double d2 = new Point2D.Double(1,1);
//
//        System.out.println("vertical disjiont  "+sim.disjointSegments(c1,c2,d1,d2));
//
//        // test inline joint segment
//        Point2D.Double e1 = new Point2D.Double(-1,-1);
//        Point2D.Double e2 = new Point2D.Double(0,0);
//        Point2D.Double f1 = new Point2D.Double(0,0);
//        Point2D.Double f2 = new Point2D.Double(1,1);
//
//        System.out.println("colinear joint "+sim.disjointSegments(e1,e2,f1,f2));
//
//        // test inline disjoint segment
//        Point2D.Double g1 = new Point2D.Double(-1,-1);
//        Point2D.Double g2 = new Point2D.Double(0,0);
//        Point2D.Double h1 = new Point2D.Double(0.5,0.5);
//        Point2D.Double h2 = new Point2D.Double(1,1);
//
//        System.out.println("colinear disjoint "+sim.disjointSegments(g1,g2,h1,h2));

        sim.getVertex(5);
    }

}