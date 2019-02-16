import java.util.ArrayList;

public class Lights {
    private static int step;
    private static ArrayList<Integer> arr;

    Lights(){
        step = 0;
        arr = new ArrayList<>();
        System.out.println();
    }

    /**
     * initialized lights ,start the turn off recursion, reset the step
     * @param n number of lights
     */
    public static void switchLight(int n){
        initializeLights(n);
        turnOff(n);
        step = 0;
        System.out.println();
    }

    /**
     * recursively Turn off all the lights
     * @param n nth light
     */
    public static void turnOff(int n){
        if(n < 1) return;

        if( n == 1){
            turnOffLight(n);
            printCurrentLights();
            System.out.println("step "+step+ " Turn off " + n);
            step++;
        }
        else{
            if( n > 2){
                turnOff( n - 2);
            }
            turnOffLight(n);
            printCurrentLights();
            System.out.println("step "+step+ " Turn off " + n);
            step++;
            if( n > 2){
                turnOn( n -2);
            }
            turnOff(n - 1);
        }
    }

    /**
     * turnOn the n..1 light
     * @param n nth light
     */
    public static void turnOn(int n){
        if(n < 1) return;

        if(n == 1){
            turnOnLight(n);
            printCurrentLights();
            System.out.println("step "+step+ " Turn On  " + n);
            step++;
        }else{
            turnOn(n - 1);
            if( n > 2){
                turnOff( n - 2);
            }
            turnOnLight(n);
            printCurrentLights();
            System.out.println("step "+step+ " Turn On  " + n);
            step++;
            if(n > 2){
                turnOn(n - 2);
            }
        }
    }

    /**
     * Initialized the array to represent the lights
     * @param n number of lights
     */
    private static void initializeLights(int n){
        if(n > 0){
            arr = new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(1);
            }
            System.out.println(" "+n+" lights are initially on :");
            printCurrentLights();
            System.out.println();
        }
    }

    private static void turnOffLight(int n){
        if(arr != null)
            arr.set(n-1,0);
    }

    private static void turnOnLight(int n){
        if(arr !=null)
            arr.set(n-1,1);
    }

    private static void printCurrentLights(){
        if(arr != null){
            for(Integer i: arr){
                System.out.print(" "+i+" ");
            }
        }
    }

    /**
     * A Test sample for flipswitch
     * @param n the nth light
     * @param s  true = on , false = off
     */
    public static void flipswitch(int n,boolean s){
        if(n < 1) return;

        if(n == 1) {
            if(s){
                turnOnLight(n);
                printCurrentLights();
                System.out.println("step "+step+ " Turn On  " + n);
            }else{
                turnOffLight(n);
                printCurrentLights();
                System.out.println("step "+step+ " Turn off " + n);
            }
            step++;
        }else{
            if(s) flipswitch(n-1,true);
            if(n > 2){
                flipswitch(n-2 ,false);
            }
            if(s){
                turnOnLight(n);
                printCurrentLights();
                System.out.println("step "+step+ " Turn On  " + n);
            }else{
                turnOffLight(n);
                printCurrentLights();
                System.out.println("step "+step+ " Turn Off " + n);
            }
            step++;
            if(n > 2){
                flipswitch(n-2,true);
            }
            if(!s) flipswitch(n - 1,false);
        }
    }

    /**
     * Tester for Lights
     * @param args
     */
    public static void main(String args[]){
        Lights lt1 = new Lights();
        for(int i=0;i<=6;i++){
            lt1.switchLight(i);
        }
    }
}
