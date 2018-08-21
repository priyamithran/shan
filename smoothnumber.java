import java.lang.*;
 
class SmoothNumber{
 
// function to check if number n
// is a P-smooth number or not
 
static boolean check(int n, int p) 
{
    int maximum = -1;
     
    // prime factorise it by 2
    while ((n % 2) == 0) 
    {
        // if the number is divisible by 2
        maximum = Math.max(maximum, 2);
        n = n/2;
    }
 
    // check for all the possible numbers 
    // that can divide it
    for (int i = 3; i <= Math.sqrt(n); i += 2)
    {
        // prime factorize it by i
        while (n % i == 0) 
        { 
            // stores the maximum if maximum 
            // and i, if i divides the number
            maximum = Math.max(maximum,i); 
            n = n / i;
        }
    }
 
    // if n at the end is a prime number, 
    // then it a divisor itself
    if (n > 2)
        maximum = Math.max(maximum, n);
     
    return (maximum <= p);
}
 
// Driver program to test
// above function
public static void main(String[] args) 
{
    int n = 24, p = 7;
     
    if (check(n, p))
        System.out.println("yes");
    else
        System.out.println("no");
     
}
}
