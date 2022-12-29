

class Main {
  public static void main(String[] args) {
    
    //TESTS

    System.out.println(reverse(123456)); // 654321
    System.out.println(reverse(-123456)); // -654321
    System.out.println(reverse(1147483647)); // 0  -> because -p;l
   // 7463847411 is out of range for int 
    System.out.println(reverse(2110000002)); // 2000000112
    System.out.println(reverse(-1366899991)); //-1999986631
    System.out.println(reverse(-2147321113)); // 0  -> because -3111237412 is out of range for int

  }




  public static int reverse(int x){
  
    String numToStr = String.valueOf(x);
    String newValue;

    int sign =1;


    if(numToStr.startsWith("-")){

      newValue = new StringBuilder(numToStr.substring(1)).reverse().toString();
      sign = -1;
      
    }
    else
      newValue = new StringBuilder(numToStr).reverse().toString();

    long number = sign* Long.parseLong(newValue);
    System.out. println("Number Is:" + number);
    System.out.println("Max value : " + Integer.MAX_VALUE);
    if(number > Integer.MAX_VALUE/10)
    return 0;

    return (int) number;
    
    

    
  }
    
}