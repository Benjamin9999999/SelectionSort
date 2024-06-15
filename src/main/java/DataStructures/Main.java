package wt;

public class SelectionSort {
    public static void main(String[] args) {
            int[] nums = {15, 2, 16, 14, 3, 13, 4, 12, 5, 11, 6, 10, 7, 9, 8, 1};
            int size = nums.length;
            int temp =0;
            int minIndex=-1;
            int maxIndex=-1;
            System.out.println("Before sorting: " );
            for (int num : nums) {
                System.out.print(num + " ");
            }
            for (int i=0; i<size; i++){
                minIndex=i;
                for(int j=i+1; j<size; j++){
                    if(nums[j]<nums[minIndex]){
                        minIndex=j;

                    }
                    temp= nums[minIndex];
                    nums[minIndex]= nums[i];
                    nums[i]= temp;



                }
            }



                System.out.println();
                System.out.println("After Sorting: ");
                for (int num : nums) {
                    System.out.print( num+" ");
                }

            }
        }
