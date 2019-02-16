
import java.util.*;

public class Expression {
    private List<String> arr;


    Expression() {
        arr = new ArrayList<>();
    }


    /**
     * Transform the RPIE to FPIE
     *
     * @throws IllegalArgumentException
     * @return: A string that represents the FPIE form of the equation
     */
    public String toFPIE() throws IllegalArgumentException {
        Stack<String> operand = new Stack<>();
        Stack<String> operator = new Stack<>();
        String str = "";

        for (String s : arr) {

            if (s.equals("/") || s.equals("*") || s.equals("+") || s.equals("-") || s.equals(")")) {
                if (!s.equals(")")) {
                    operator.push(s);
                }
            } else
                operand.push(s);

            if (s.equals(")")) {
                if (!operand.isEmpty()) {
                    str = operand.pop() +  str;
                } else {
                    throw new IllegalArgumentException("Input is not a valid RPIE.");
                }

                if (!operator.empty()) {
                    str = operator.pop() + " " + str;
                } else {
                    throw new IllegalArgumentException("Input is not a valid RPIE.");
                }

                if (!operand.isEmpty()) {
                    str = operand.pop() + " " + str;
                } else {
                    throw new IllegalArgumentException("Input is not a valid RPIE.");
                }

                str = "(" + str + ")";
                operand.push(str);
                str = "";
            }
        }
        if (operand.size() != 1 || !operator.isEmpty()) throw new IllegalArgumentException("Input is not a valid RPIE.");
        return operand.pop();
    }


    /**
     * read from the arr transform RPIE to UPPE
     *
     * @return A string represents the UPPE form of the equation
     * @throws IllegalArgumentException
     */
    public String toUPPE() throws IllegalArgumentException {
        Stack<String> operand = new Stack<>();
        Stack<String> operator = new Stack<>();
        String str = "";

        for (String s : arr) {

            if (s.equals("/") || s.equals("*") || s.equals("+") || s.equals("-") || s.equals(")")) {
                if (!s.equals(")")) {
                    operator.push(s);
                }
            } else
                operand.push(s);

            if (s.equals(")")) {
                if (!operator.isEmpty()) {
                    str = operator.pop() + " " + str;
                } else {
                    throw new IllegalArgumentException("Input is not a valid RPIE.");
                }

                if (!operand.isEmpty()) {
                    str = operand.pop() + " " + str;
                } else {
                    throw new IllegalArgumentException("Not RPIE");
                }

                if (!operand.isEmpty()) {
                    str = operand.pop() + " " + str;
                } else {
                    throw new IllegalArgumentException("Input is not a valid RPIE.");
                }

                operand.push(str);
                str = "";
            }
        }

        if (operand.size() != 1 || !operator.isEmpty()) throw new IllegalArgumentException("Input is not a valid RPIE.");

        return operand.pop();
    }

    /**
     * Receiving an user input then validate it and push to arr
     *
     * @param input: a String represent the user or system input
     */
    private void toRPIEArr(String input) {

        arr = new ArrayList<>();
        String tmp = "";
        printRPIE(input);

        for (int i = 0; i < input.length(); i++) {
            char s = input.charAt(i);
            if (s == '+' || s == '-' || s == '*' || s == '/' || s == ')' || s == ' ') {

                if (!tmp.equals("")) {
                    arr.add(tmp);
                    tmp = "";
                }
                if (s != ' ') {
                    arr.add(String.valueOf(s));
                }

            } else {
                tmp += s;
            }
        }
        if (!tmp.equals(""))
            arr.add(tmp);
    }

    /**
     * A test function for debugging, print all the elements in arr
     */
    private void printArr() {
        System.out.print("Input  RPIE: ");
        for (String s : arr) {
            System.out.print(s);
        }
        System.out.println();
    }

    /**
     * output the user input of RPIE string
     * @param s input RPIE string
     */
    private void printRPIE(String s){
        System.out.println("Input  RPIE: "+s);
    }

    protected void readFromUserInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your valid RPIE:");
        try{
            toRPIEArr(sc.nextLine());
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }


    /**
     * A test case set for expression
     */
    private static final String testcase[] = {
            "a+b",
            "a+b)",
            "a+b)*c+d)",
            "a+b)*c+d))",
            "a +b)* c+ d))",
            "5-7)*15*32)/3+5)))*8-3))",
            "5 + 734) / 4 + 9 +2))",
            "5 + 7) / 4 + 9))",
            "5 - 7) * 4 * 15 * 32)",
            "5 + ^%&&$$%@) / 40.532+ &&@&%))",
            "a+20)/(b-c)*53.4-d",
            "(A + B) * (C + D)",
    };


    public static void main(String args[]) {
        Expression exp1 = new Expression();

        //test for testcase
        for (String s : testcase)
            try {
                System.out.println();
                exp1.toRPIEArr(s);
                System.out.println("Output FPIE: " + exp1.toFPIE());
                System.out.println("Output UPPE: " + exp1.toUPPE());
            } catch (Exception e) {
                System.out.println(e.toString());
            }

            //test for user input
            try{
                exp1.readFromUserInput();
                System.out.println("Output FPIE: " + exp1.toFPIE());
                System.out.println("Output UPPE: " + exp1.toUPPE());
            }catch(Exception e) {
                System.out.println(e.toString());
            }

    }
}
