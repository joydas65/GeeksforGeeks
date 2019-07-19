class Solution
{
    // Function to return Largest Number
    static String largestNumber(int n, int sum)
    {
        // add your code here
        StringBuilder sb = new StringBuilder();
        while(sum > 0 || n > 0){
            if(sum >= 9){
                sb.append("9");
                sum -= 9;
            }
            else{
                sb.append(Integer.toString(sum));
                sum = 0;
            }
            n--;
            if(n == 0)
            break;
        }
        if(sum > 0)
        return "-1";
        return sb.toString();
    }
}
