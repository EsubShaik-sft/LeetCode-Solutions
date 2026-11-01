class Solution {
    public int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);

        int temp=0;
        while(x>0){
            int dig=x%10;
            if (temp > (Integer.MAX_VALUE - dig) / 10) {
                return 0;
            }
             temp=temp*10+dig;
            x=x/10;
        }
        
      return temp*sign;
    }
}