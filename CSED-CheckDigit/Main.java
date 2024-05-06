class Main 
{
  public static void main(String[] args) 
  {
    System.out.println("\nMATCH ? \n");
    System.out.println("6 2 1 2 true false\n");

    // ===== PART A =====
    int x = CheckDigit.getNumberOfDigits(283415);
    // 6 The number 283415 has 6 digits.
    System.out.print(x+" ");
    
    x = CheckDigit.getDigit(283415, 1);
    // 2 The first digit of 283415 is 2.
    System.out.print(x+" ");
    
    x = CheckDigit.getDigit(283415, 5);
    // 1 The fifth digit of 283415 is 1.
    System.out.print(x+" ");
    
    x = CheckDigit.getCheck(159);
    //2 The check digit for 159 is 2.
    System.out.print(x+" ");

    // ===== PART B =====

    boolean y = CheckDigit.isValid(1592); 
      // true The number 1592 is a valid combination of a number (159) and its check digit (2).
    System.out.print(y+" ");

    y = CheckDigit.isValid(1593);
    // The number 1593 is not a valid combination of a number (159) and its check digit (3) because 2 is the check digit for 159.
    System.out.println(y);

    
  }
}