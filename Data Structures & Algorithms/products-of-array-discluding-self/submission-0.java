class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] preProd = new int[size];
        int[] postProd = new int[size];
        int[] prod = new int[size];
        preProd[0] = 1;
        postProd[size - 1] = 1;
        for (int i = 1; i < size; i++) {
            preProd[i] = nums[i-1] * preProd[i-1];
        }
        for (int i = size - 2; i >= 0; i--) {
            postProd[i] = nums[i+1] * postProd[i+1];
        }

        for (int i = 0; i < size; i++) {
            prod[i] = preProd[i] * postProd[i];
        }
        return prod;
    }
}  
