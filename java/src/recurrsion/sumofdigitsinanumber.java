package recurrsion;

class sumofdigitsinanumber
{
    static int sum(int n)
    {
        if (n == 0)
            return 0;
        return (n % 10 + sum(n / 10));
    }
    public static void main(String args[])
    {
        int num = 143;
        int result = sum(num);
        System.out.println("Sum of digits in " +  num + " is " + result);
    }
}