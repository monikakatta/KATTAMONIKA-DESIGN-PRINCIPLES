class Caluculator{
    public static void main(String [] args){
        Add a1=new Add(5,6);
        System.out.println("sum of "+a1.num1+" and "+a1.num2+"  is :"+a1.addtwonumbers());
        Subtract s1=new Subtract(7,2);
         System.out.println("Difference of "+s1.num1+" and "+s1.num2+"  is :"+s1.subtwonumbers());
         Multiply m1=new Multiply(5,9);
          System.out.println("product of "+m1.num1+" and "+m1.num2+"  is :"+m1.prodtwonumbers());
          Divide d1=new Divide(6,7);
          System.out.println("division of "+d1.num1+" and "+d1.num2+"  is :"+d1.dividetwonumbers());
          Divide d2=new Divide(6,0);
          System.out.println("division of "+d2.num1+" and "+d2.num2+"  is :"+d2.dividetwonumbers());
    }
}