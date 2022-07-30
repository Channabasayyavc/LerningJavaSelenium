package day2;

public class Calculators {

    public static void main(String[] args) {

        Calculators calculators =  new Calculators(); // class object
        calculators.addnumber(30,70);
        calculators.multiplication(60,50);
        calculators.division(80,2);

    }

    // AccessModifier  return type Method name (Parm) {logic}
    public void addnumber(int x , int y ){
        int sum = x + y ;
        System.out.println("Addtion of two numbers: "+sum);
    }

    public void multiplication(int x , int y ){
        int mul = x * y ;
        System.out.println(" multiplication of two numbers: "+mul);
    }

    public void division(int x , int y ) {
        int div = x / y;
        System.out.println(" division of two numbers: " + div);
    }

}

