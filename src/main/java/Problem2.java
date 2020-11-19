public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
    This algorithm will take an already sorted array of integers and push all the duplicate values to the end
    leaving all the unique values in the front of the array, the index limit for these unique values is returned.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory

    public static int remove(int[] nums) {
        //this integer serves as the length of the non duplicate array.
        int newLength = 0;
        //this for loop enters the array and continues for the length of the array index so 0 - array.length - 1
        for (int i = 0; i < nums.length; i++) {
            // this if statement checks if the value at i and the value at the newLength index are the same
            // if they are the same the loop continues and adds 1 to i
            // if not it adds a value to newLength to register the unique value then switches the value at index newLength
            // with the value that was flagged at index i
            if (nums[i] != nums[newLength]) {
                newLength++;
                nums[newLength] = nums[i];
            }

        }
        //the newLength int needs a 1 added to it as it never counts the first
        //in the array that is read since i and newLength both start as 0 so the first
        //value it reads in the array it doesn't instantly recognize as unique.
        return newLength + 1; // place holder
    }

}
