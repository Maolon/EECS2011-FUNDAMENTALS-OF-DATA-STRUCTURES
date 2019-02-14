public class Lights {
    private static int step;

    Lights(){
        step = 0;
        System.out.println();
    }

    public static void turnOff(int n){
        if(n < 1) return;

        if( n == 1){
            System.out.println("step "+step+ " Turn off " + n);
            step++;
        }
        else{
            if( n > 2){
                turnOff( n - 2);
            }
            System.out.println("step "+step+ " Turn off " + n);
            step++;
            if( n > 2){
                turnOn( n -2);
            }
            turnOff(n - 1);
        }
    }

    public static void turnOn(int n){
        if(n < 1) return;

        if(n == 1){
            System.out.println("step "+step+ " Turn On  " + n);
            step++;
        }else{
            turnOn(n - 1);
            if( n > 2){
                turnOff( n - 2);
            }
            System.out.println("step "+step+ " Turn On  " + n);
            step++;
            if(n > 2){
                turnOn(n - 2);
            }
        }
    }

    //@param s : true = on , false = off
    public static void flipswitch(int n,boolean s){
        if(n < 1) return;

        if(n == 1) {
            if(s){
                System.out.println("step "+step+ " Turn On  " + n);
            }else{
                System.out.println("step "+step+ " Turn off " + n);
            }
            step++;
        }else{
            if(s) flipswitch(n-1,true);
            if(n > 2){
                flipswitch(n-2 ,false);
            }
            if(s){
                System.out.println("step "+step+ " Turn On  " + n);
            }else{
                System.out.println("step "+step+ " Turn off " + n);
            }
            step++;
            if(n > 2){
                flipswitch(n-2,true);
            }
            if(!s) flipswitch(n - 1,false);
        }


    }

    public static void main(String args[]){
        Lights lt1 = new Lights();
        lt1.turnOff(1);
        Lights lt2 = new Lights();
        lt2.turnOff(2);
        Lights lt3 = new Lights();
        lt3.turnOff(3);
        Lights ltfp1 = new Lights();
        ltfp1.flipswitch(5,false);
    }
}
