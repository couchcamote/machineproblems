package com.alexiesracca.excercises.numbers;

public class QuadrarticPolynomial {


    public static void main(String[] args) {
        test();
    }

    public static void test(){
        System.out.println("\n==[Quadractic Polynomiall -_Solve for x ==");
        
        double a =12;
        double b = -9.6;
        double c = 1.44;

        solve(a, b, c);
        solve2(a, b, c);
    }

    public static void solve(double a, double b, double c){

        b/=a;
        c/=a;

        double uSqr = Math.pow(b/2,2) - c;
        double u = Math.sqrt(uSqr);
        double x1 = -1 * ((b/2) - u);
        double x2 = -1 * ((b/2) + u);
        System.out.println("x="+ x1 + ", x="+x2+"") ;

    }

    public static void solve2(double a, double b, double c){

        double x1 = (-1*b + (Math.sqrt(Math.pow(b, 2) - 4*a*c))) / (2*a);
        double x2 = (-1*b - (Math.sqrt(Math.pow(b, 2) - 4*a*c))) / (2*a);
        System.out.println("x=" + x1 + ", x="+x2);

    }


}