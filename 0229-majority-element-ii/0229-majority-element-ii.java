class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n= nums.length;
        int maj1=0;
        int maj2=0;
        int count1=0;
        int count2=0;
        for(int i =0;i<n;i++){
            if(nums[i] == maj1){
                count1++;
            }
            else if(nums[i] == maj2){
                count2++;
            }
            else if(count1 == 0){
                count1=1;
                maj1 = nums[i];
                
            }
            else if(count2 == 0){
                count2= 1;
                maj2=nums[i];
            }
            else{
                count1--;
                count2--;
            }
        }
         count1=0;
         count2=0;
        for(int num : nums){
            if(num == maj1){
                count1++;
            }
            else if(num == maj2){
                count2++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        
            if(count1>n/3){
                ans.add(maj1);
            }
            if(count2>n/3){
                ans.add(maj2);
            }
             return ans;
        }
       
    }
