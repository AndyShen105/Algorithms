package section1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Stack;

/**
 * Created by hang.shen@transwarp.io on 19-9-6.
 */
public class Dijkstra {

    private static final Logger log = LogManager.getLogger(Dijkstra.class);

    public static double calculate(String[] string) {
        Stack<Double> numbers = new Stack<>();
        Stack<String> flag = new Stack<>();
        String temp = "";
        double val = 0;
        for (int i = 0; i < string.length; i++) {
            temp = string[i];
            if (temp == "+" || temp == "-" || temp == "*" || temp == "/") {
                flag.push(temp);
            } else if (temp == ")") {
                double a = numbers.pop();
                double b = numbers.pop();
                String f = flag.pop();
                if (f == "+") {
                    val = a + b;
                } else if (f == "-") {
                    val = a - b;
                } else if (f == "*") {
                    val = a * b;
                } else if (f == "/") {
                    val = a / b;
                }
                numbers.push(val);
            } else if (temp == "(") {

            } else {
                numbers.push(Double.parseDouble(temp));
            }
        }
        while (!flag.empty()) {
            double a = numbers.pop();
            double b = numbers.pop();
            String f = flag.pop();
            if (f == "+") {
                val = a + b;
            } else if (f == "-") {
                val = a - b;
            } else if (f == "*") {
                val = a * b;
            } else if (f == "/") {
                val = a / b;
            }
            numbers.push(val);
        }
        return numbers.pop();
    }

    public static void main(String[] arg) {
        String[] strings = {"(", "1", "+", "(", "(", "2", "+", "3", ")", "*", "(", "4", "*", "5", ")", ")", ")"};
        log.info(calculate(strings));
    }
}

