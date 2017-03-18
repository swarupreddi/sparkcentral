package org.sreddi;

import java.util.Scanner;

/**
 * SparkCentral assessment
 *
 * from the home directory:
 *    build: javac src/main/java/org/sreddi/*.java
 *    run:   java -classpath src/main/java/ org.sreddi.Assessment
 * or
 *    build: mvn clean install
 *    run:   java -cp target/sparkcentral-1.0-SNAPSHOT.jar org.sreddi.Assessment
 *
 * OBJECTIVE
 * Your assignment is to write a calculator library. A command- ​ line interface is fine, but don’t spend too much time on it.
 * You are supposed to take no more than an hour to an hour and a half to complete the test. The code running is much
 * less important than the architecture of the library. Pay close attention to the extensibility of your code!
 * REQUIREMENTS
 *  - Commit the code to an online publicly accessible Git repository (such as Github)
 *  - Handle binary operations, e.g. 5 ​ - 6, 8 * 4
 *  - The calculator should be able to handle a full arithmetic expression at once, for example:, e.g. 1 + 1 ​ - 4 * 4
 *  - The library must take ​ Order of Operations ​ into account
 *  - No need to handle parentheses, e.g. ( 1 + 1 - ​ 4 ) * 4
 *  - Must be extendable ​ so that it accepts user- ​ defined operators
 *
 * @author Swarup Reddi
 */
public class Assessment {

    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression (^d to exit) > ");
        while(sc.hasNextLine()) {
            String exp = sc.nextLine().trim();
            System.out.println(calculator.evaluate(exp, 0, exp.length()));
            System.out.print("Enter expression > ");
        }
        System.out.println("");
    }
}
