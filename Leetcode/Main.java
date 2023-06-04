public class Main {
    public static void main(String[] args) {
        
    }
    public int missingNumber(int[] nums) {
        int i =0;
        int leng = nums.length;
        while(i<leng){
            if(nums[i]!=i &&  nums[i]<leng){
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = nums[nums[i]];
            } else{
                i++;
            }
        }
        for(int j =0;j<leng;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return leng+1;
    }
}
