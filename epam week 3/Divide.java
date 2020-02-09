class Divide{
    int num1,num2;
    Divide(int a,int b){
        num1=a;
        num2=b;
    }
    public String dividetwonumbers(){
        int z=1;
        try{
        z =this.num1/this.num2;
        return Integer.toString(z);
      } 
      catch(ArithmeticException e) 
     {  
          return "Division by zero error."; 
      }
    }
}