class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int temp=0;
        while(x>0){
            int dig = x%10;
            temp = temp*10+dig;
            x = x/10;
        }
        if(temp == org){
            return true;
        }
        return false;
    }
}