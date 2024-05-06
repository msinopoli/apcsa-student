public class CheckDigit
{
  /** Returns the check digit for num, as described in part (a).
  * Precondition: The number of digits in num is between one and
  * six, inclusive.
  * num >= 0
  */
  public static int getCheck(int num)
  {
    int length = getNumberOfDigits(num);
    int mult = 7;
    int sum = 0;
    for (int i = 1; i <= length; i++)
    {
      sum += mult * getDigit(num, i);
      mult--;
    }
    return sum % 10;
  }
  
  /** Returns true if numWithCheckDigit is valid, or false
  * otherwise, as described in part (b).
  * Precondition: The number of digits in numWithCheckDigit
  * is between two and seven, inclusive.
  * numWithCheckDigit >= 0
  */
  public static boolean isValid(int numWithCheckDigit)
  {
    int t = getNumberOfDigits(numWithCheckDigit);
    int check = getDigit(numWithCheckDigit,t);

    
    int num = numWithCheckDigit / 10;
    if (check == getCheck(num))
    {
      return true;
    }
    else
    {
      return false;
    }

  }
  
  /** Returns the number of digits in num. */
  public static int getNumberOfDigits(int num)
  {
    int count = 0;
    while (num > 0)
    {
      num = num/10;
      count++;
    }
    return count;
  }
  
  /** Returns the nth digit of num.
  * Precondition: n >= 1 and n <= the number of digits in num
  */
  public static int getDigit(int num, int n)
  {    
    int digs = getNumberOfDigits(num);

    for (int i = 0; i<digs-n; i++)
    {
      num = num / 10;
    }
    return num % 10;
  }
  
  // There may be instance variables, constructors, and methods not shown.
}