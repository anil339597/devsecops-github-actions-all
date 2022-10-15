/*
#Added a Java File for Demonstration of Code Coverage Percentage update on SonarCloud Dashboard
#By Anil test program ttttetet
*/
public class Calculator {

    public int addition(String arguments) {

        int sum = 0;
        for (String add : arguments.split("\\+"))
            sum += Integer.valueOf(add);
            return sum;
    }
}
