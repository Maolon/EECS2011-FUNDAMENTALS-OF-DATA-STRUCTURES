public class Test {
    public static void main(String args[]){
        for(int i=0;i<10;i++){
            System.out.println(tester(i));
        }

    }

    static double tester(int n){
       double x = (1/6)*Math.pow(-1,n)+(2/3)*Math.pow(2,n)-0.5;
       return x;
    }
}
