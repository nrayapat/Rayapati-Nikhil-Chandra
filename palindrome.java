package rossi1;
public class palindrome
{
static void main(String[] args) {
public 
    int num = 121, reversedInteger = 0, remainder, originalInteger;

    originalInteger = num;

    // reversed integer is stored in variable
    for( ;num != 0; num /= 10 )
    {
        remainder = num % 10;
        reversedInteger = reversedInteger * 10 + remainder;
    }

    // palindrome if orignalInteger and reversedInteger are equal
    if (originalInteger == reversedInteger)
        System.out.println(originalInteger + " is a palindrome.");
    else
        System.out.println(originalInteger + " is not a palindrome.");
}
}
