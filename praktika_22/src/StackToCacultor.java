import java.util.Stack;
import java.util.Vector;


public class StackToCacultor{
    private static String[] textArr = new String[50];
    private static String[] textArr2 = new String[50];
    private final static int sizeofSum = 2;
    private final static int sizeofSub = 2;
    private final static int sizeofMul = 3;
    private final static int sizeofDiv = 3;
    private final static int sizeofLbra = 1;
    private final static int sizeofRbra = 0;

    public StackToCacultor() {
        for(int i = 0; i<textArr.length; i++) {
            textArr[i] = null;
            textArr2[i] = null;
        }
    }

    public static double ToCacultor(String Ctext) {
        int numkey = 0;
        int strkey = 0;
        String[] strArr = ToSuffix(toArr(Ctext));
        Stack<String> stack = new Stack<String>();
        double sum = 0;
        try {
            for(int i=0;i<strArr.length-1;i++) {
                numkey = 0;
                strkey = 0;
                if(strArr[i]==null) {
                    while(!stack.isEmpty()) {
                        String top = stack.pop();
                        if(isNum(top)) {
                            sum = Double.parseDouble(top);//*********//
                        }
                    }
                    break;
                }
                System.out.println("Суффикс"+strArr[i]);
                if(stack.empty()) {
                    stack.push(strArr[i]);
                }else {
                    for (String x : stack) {
                        if(isNum(x)) {
                            numkey++;
                        }else {
                            strkey++;
                        }
                    }
                    if(isNum(strArr[i])) {
                        if(numkey==1&&strkey==1) {
                            String str = stack.pop();
                            double num3 = Double.parseDouble(stack.pop());
                            double s2 = Double.parseDouble(strArr[i]);
                            double sum2 = 0;
                            switch (str) {
                                case "+":
                                    sum2 = num3 + s2;
                                    break;
                                case "-":
                                    sum2 = num3 - s2;
                                    break;
                                case "x":
                                    sum2 = num3 * s2;
                                    break;
                                case "/":
                                    sum2 = num3 / s2;
                                    break;
                            }
                            stack.push(String.valueOf(sum2));
                        }else {
                            stack.push(String.valueOf(strArr[i]));
                        }
                    }else {
                        if(numkey>=2) {
                            double num1 = Double.parseDouble(stack.pop());
                            double num2 = Double.parseDouble(stack.pop());
                            double s = 0;
                            switch (strArr[i]) {
                                case "+":
                                    s = num2 + num1;
                                    break;
                                case "-":
                                    s = num2 - num1;
                                    break;
                                case "x":
                                    s = num2 * num1;
                                    break;
                                case "/":
                                    s = num2 / num1;
                                    break;
                            }
                            stack.push(String.valueOf(s));
                        }else {
                            stack.push(String.valueOf(strArr[i]));
                        }
                    }
                }
            }
        }catch (Exception e) {
            System.err.println("Ошибка");
        }
        System.out.println("Результат:"+sum);
        return sum;


    }


    public static String[] toArr(String text) {
        int i = 0,j = 0;
        char c;
        while (i<text.length()) {
            c = text.charAt(i);
            if(c=='('||c==')'||c =='+'||c =='-'||c =='x'||c =='/') {
                textArr[j++] = String.valueOf(c);
                i++;
            }else {// number
                String num = "";
                while (true) {
                    if(i>=text.length()) {
                        break;
                    }
                    c = text.charAt(i);
                    if(c==')'||c =='+'||c =='-'||c =='x'||c =='/') {
                        break;
                    }
                    num += c;
                    i++;
                }
                textArr[j++] = num;
            }
        }
        return textArr;
    }


    public static String[] ToSuffix(String[] textArray) {
        int k=0;
        Stack stack = new Stack();
        for(int i=0;i<textArray.length-1;i++) {
            if(textArray[i]!=null) {
                System.out.println("Постфикс:"+textArray[i]);
                int priority = ToCampare(textArray[i]);
                if(isNum(textArray[i])) {
                    textArr2[k++] = textArray[i];
                }else {
                    if(!stack.empty()) {
                        if(textArray[i].equals("(")) {
                            stack.push(textArray[i]);
                            continue;
                        }else if(textArray[i].equals(")")){
                            System.out.println(String.valueOf(stack.peek()));
                            while (!String.valueOf(stack.peek()).equals("(")) {
                                textArr2[k++] = String.valueOf(stack.pop());
                            }
                            stack.pop();
                            continue;
                        }else if(priority>ToCampare(String.valueOf(stack.peek()))) {//Priority greater than top of stack
                            stack.push(textArray[i]);
                            continue;
                        }else {
                            while (priority<=ToCampare(String.valueOf(stack.peek()))) {
                                textArr2[k++] = String.valueOf(stack.pop());
                                if(stack.isEmpty()) {
                                    break;
                                }
                            }
                            stack.push(textArray[i]);
                            continue;
                        }
                    }else {
                        stack.push(textArray[i]);
                    }
                }
            }else {
                while (!stack.empty()) {
                    textArr2[k++] = String.valueOf(stack.pop());
                }
            }
        }

        return textArr2;
    }


    public static boolean isNum(char strNum) {
        if(strNum=='1'||strNum=='2'||strNum=='3'||strNum=='4'
                ||strNum=='5'||strNum=='6'||strNum=='7'
                ||strNum=='8'||strNum=='9'||strNum=='0') {
            return true;
        }else {
            return false;
        }
    }


    public static boolean isNum(String strNum) {
        if(!strNum.equals("+")&&!strNum.equals("-")&&!strNum.equals("x")
                &&!strNum.equals("/")&&!strNum.equals("(")&&!strNum.equals(")")) {
            return true;
        }else {
            return false;
        }
    }


    public static int ToCampare(String str1) {
        int key = -1;
        switch (str1) {
            case "(":
                key = 1;
                break;
            case ")":
                key = 0;
                break;
            case "+":
            case "-":
                key = 2;
                break;
            case "x":
            case "/":
                key = 3;
                break;
        }
        return key;
    }


    public static void main(String[] args) {
 String[] strings = toArr("(1222.2x231+232)/123123.23+(323.2+323)");


 for(int i=0;i<strings.length-1;i++) {
 if(strings[i]!=null) {
 System.out.println(strings[i]);
 }
 }
 System.out.println(" ");
 ToSuffix(strings);
 for(int i=0;i<textArr2.length-1;i++) {
 if(textArr2[i]!=null) {
 System.out.println(textArr2[i]);
 }
 }
 System.out.println(ToCacultor("2x(3+2)"));
 System.out.println(ToCacultor("1+1"));
    }
}