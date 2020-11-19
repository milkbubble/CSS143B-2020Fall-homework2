public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
    Professor Du's hint video definitely helped me conceptualize this process. He asked for me to comment if it
    helped or not. This algorithm sorts an array of integers consisting of 0s, 1s and 2s. It does so in one pass,
    pushing all the 2s to the end, all the 0s to the beginning and the 1s to the middle.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        //this int represents the boundary between the 0s and the rest of the array
        int p0 = 0;
        //this int represents the boundary of 1s in the middle of the array
        int p1 = 0;
        //this int represents the boundary of the 2s and the rest of the array
        int p2 = nums.length - 1;
        int temp;
        //this while loop exits once the boundary between the ones in an array and the twos meet.
        while (p1 <= p2) {
            //this if statement separates the function on what to do depending on the location of the middle
            //boundary of 1s
            if(nums[p1] == 0) {
                temp = nums[p0];
                nums[p0] = nums[p1];
                nums[p1] = temp;
                p0++;
                p1++;
            } else if (nums[p1] == 1) {
                //this moves up the middle boundary through the index of the array
                p1++;
            } else if (nums[p1] == 2) {
                //this puts all the 2s to the end of the array.
                temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
                p2--;
            }


        }
    }
}
