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
        /**
         * read from user keyboard input and suppose user will input 7 different polygons
         * */
        for(int i=0;i<7;i++){
            runTest(i);
        }


        // test joint cross segment
//        SimplePolygon sim  = new SimplePolygon();
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

        //testDelta
//        Point2D.Double y1 = new Point2D.Double(5,8);
//        Point2D.Double y2 = new Point2D.Double(9,5);
//        Point2D.Double u1 = new Point2D.Double(6,1);
//        sim.delta(y1,y2,u1);

//        sim.getVertex(5);

//       SimplePolygon sim1 = SimplePolygon.getNewPoly();
//       System.out.println(sim1.toString());
//       System.out.println(sim1.isSimple());

       //test of a simple polygon with 4 edges
//       SimplePolygon sim2 = new SimplePolygon(4);
//       double arr1[] = {8.9,21.8,29.1,8.8,39.2,20.3,28,25};
//
//       sim2.setVertices(convertArrToPoint2D(arr1,4));
//       System.out.println(sim2.toString());
//       System.out.println("is simple: " +sim2.isSimple());
//       System.out.println("perimeter: " +sim2.perimeter());
//       try{
//           System.out.println("area: "+sim2.area());
//       }catch (Exception e){
//           System.out.println(e.toString());
//       }
//       //test of the same polygon which also convex
//       ConvexPolygon sim2c = new ConvexPolygon(4);
//       sim2c.setVertices(convertArrToPoint2D(arr1,4));
//       System.out.println("is convex:"+sim2c.isConvex());


//      // test of a simple polygon with 7 edges
//        SimplePolygon sim3 = new SimplePolygon(7);
//        double arr2[] = {28,2,31,5,28,10,14,14,5,10,8,4,18,1};
//
//        sim3.setVertices(convertArrToPoint2D(arr2,7));
//        System.out.println(sim3.toString());
//        System.out.println("is simple: " +sim3.isSimple());
//        System.out.println("perimeter: " +sim3.perimeter());
//        try{
//            System.out.println("area: "+sim3.area());
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }
//        //test of the same polygon which also convex
//        ConvexPolygon sim3c = new ConvexPolygon(7);
//        sim3c.setVertices(convertArrToPoint2D(arr2,7));
//        System.out.println("is convex:"+sim3c.isConvex());
//
//
//
//        //non simple polygon with 9 edges
//
//        SimplePolygon sim4 = new SimplePolygon(9);
//        double arr3[] = {6,10,20,3,23,3,23,8,27,3,30,3,20,15,16,5,20,14};
//
//        sim4.setVertices(convertArrToPoint2D(arr3,9));
//        System.out.println(sim4.toString());
//        System.out.println("is simple: " +sim4.isSimple());
//        System.out.println("perimeter: " +sim4.perimeter());
//        try{
//            System.out.println("area: "+sim4.area());
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }
//        //test of the same polygon which also not convex
//        ConvexPolygon sim4c = new ConvexPolygon(9);
//        sim4c.setVertices(convertArrToPoint2D(arr3,9));
//        System.out.println("is convex:"+sim4c.isConvex());
//
//
//        // none simple polygon with 13 edges
//        SimplePolygon sim5 = new SimplePolygon(13);
//        double arr4[] = {5,6,13,2,12,6,20,2,16,12,17,11,19,5,13,11,19,15,8,12,14,7,5,11,9,6};
//
//        sim5.setVertices(convertArrToPoint2D(arr4,13));
//        System.out.println(sim5.toString());
//        System.out.println("is simple: " +sim5.isSimple());
//        System.out.println("perimeter: " +sim5.perimeter());
//        try{
//            System.out.println("area: "+sim5.area());
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }
//        //test of the same polygon which is none convex
//        ConvexPolygon sim5c = new ConvexPolygon(13);
//        sim5c.setVertices(convertArrToPoint2D(arr4,13));
//        System.out.println("is convex:"+sim5c.isConvex());
//
//        // simple polygon with 13 edges
//        SimplePolygon sim8 = new SimplePolygon(13);
//        double arr7[] = {5,6,13,2,12,6,20,2,18,12,17,11,19,5,13,11,19,15,8,12,14,7,5,11,9,6};
//
//        sim8.setVertices(convertArrToPoint2D(arr7,13));
//        System.out.println(sim8.toString());
//        System.out.println("is simple: " +sim8.isSimple());
//        System.out.println("perimeter: " +sim8.perimeter());
//        try{
//            System.out.println("area: "+sim8.area());
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }
//        //test of the same polygon which is none convex
//        ConvexPolygon sim8c = new ConvexPolygon(13);
//        sim8c.setVertices(convertArrToPoint2D(arr7,13));
//        System.out.println("is convex:"+sim8c.isConvex());
//        //simple polygon with 22 edges
//        SimplePolygon sim6 = new SimplePolygon(22);
//        double arr5[] = {14,7,15,8,17,7,17,5,15,6,14,4,12,6,11,9,15,11,7,12,8,11,7,9,10,11,8,6,10,5,
//                11,3,16,3,18,4,19,8,16,9,14,9,13,8};
//
//        sim6.setVertices(convertArrToPoint2D(arr5,22));
//        System.out.println(sim6.toString());
//        System.out.println("is simple: " +sim6.isSimple());
//        System.out.println("perimeter: " +sim6.perimeter());
//        try{
//            System.out.println("area: "+sim6.area());
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }
//        //test of the same polygon which is none convex
//        ConvexPolygon sim6c = new ConvexPolygon(22);
//        sim6c.setVertices(convertArrToPoint2D(arr5,22));
//        System.out.println("is convex:"+sim6c.isConvex());
//
//        //simple polygon with 4 edges
//
//        SimplePolygon sim7 = new SimplePolygon(4);
//        double arr6[] = {6,1,9,5,5,8,2,4};
//
//        sim7.setVertices(convertArrToPoint2D(arr6,4));
//        System.out.println(sim7.toString());
//        System.out.println("is simple: " +sim7.isSimple());
//        System.out.println("perimeter: " +sim7.perimeter());
//        try{
//            System.out.println("area: "+sim7.area());
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }
//        //test of the same polygon which is  convex
//        ConvexPolygon sim7c = new ConvexPolygon(4);
//        sim7c.setVertices(convertArrToPoint2D(arr5,4));
//        System.out.println("is convex:"+sim7c.isConvex());






    }


    public static void runTest(int i){
        System.out.println("====Test of Polygon"+(i+1)+"====");
        SimplePolygon sim = SimplePolygon.getNewPoly();
        System.out.println(sim.toString());
        System.out.println("is simple: " +sim.isSimple());
        System.out.println("perimeter: " +sim.perimeter());
        try{
            System.out.println("area: "+sim.area());
        }catch (Exception e){
            System.out.println(e.toString());
        }
        //test of the same polygon whether convex
        System.out.println();
        System.out.println("input the same polygon again for testing convex");
        ConvexPolygon simc = ConvexPolygon.getNewPoly();
        System.out.println("is convex:"+simc.isConvex());
        System.out.println("=====End OF TEST Polygon"+(i+1)+"====");
        System.out.println();

    }




    public static Point2D.Double[] convertArrToPoint2D (double list[],int size){
        Point2D.Double[] p = new Point2D.Double[size];
        int j=0;
        for(int i=0;i<size;i++){
            p[i] = new Point2D.Double();
            p[i].x = list[j];
            p[i].y = list[j+1];
            j=j+2;
        }
        return p;
    }

}