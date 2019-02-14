import java.util.*;

public class Expression {
  List<String> arr;


    Expression(){
        arr = new ArrayList<>();
    }


    public String toFPIE(){
        Stack<String> operand = new Stack<>();
        Stack<String> operator = new Stack<>();
        String str = "";

        for(String s:arr){

            if(s.equals("/")||s.equals("*")||s.equals("+")||s.equals("-")||s.equals(")")){
               if(!s.equals(")")){
                   operator.push(s);
               }
            }else
                operand.push(s);

            if(s.equals(")")){

                str = operand.pop() + str;
                if(!operator.empty()){
                   str =  operator.pop() + str;
                }
                str = operand.pop() + str;

                str = "(" + str +")";
                operand.push(str);
                str = "";
            }
        }
        return operand.pop();
    }



    public String toUPPE(){
        Stack<String> operand = new Stack<>();
        Stack<String> operator = new Stack<>();
        String str = "";

        for(String s:arr) {

            if (s.equals("/") || s.equals("*") || s.equals("+") || s.equals("-") || s.equals(")")) {
                if (!s.equals(")")) {
                    operator.push(s);
                }
            } else
                operand.push(s);

            if(s.equals(")")){
                str = operator.pop() +" "+ str;
                str = operand.pop() +" "+ str;
                str = operand.pop() +" "+ str;
                operand.push(str);
                str = "";

            }


        }

        return operand.pop();
     }

    private void toRPIEArr(String input){
        String str[] = input.split("\\s");
        arr = Arrays.asList(str);

    }

    private void printArr(){
        for(String s: arr){
            System.out.println(s);
        }
    }
    protected static String readFromUserInput()  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your expression:\n");

        return sc.nextLine();
    }


    public static void main(String args[]){
        Expression exp1 = new Expression();
        String str = "a + 20 ) / b - c ) * 53.4 - d ) ) ) ";
        exp1.toRPIEArr(str);
        //exp1.printArr();
        System.out.println(exp1.toFPIE());
        System.out.println(exp1.toUPPE());

    }
}
