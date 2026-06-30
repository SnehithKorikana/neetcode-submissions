class Solution {
    public int[] twoSum(int[] num, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int len = num.length;
        int[] indexes = new int[2];
        indexes[0] = 1;
        indexes[1] = 2;
        for (int i= len - 1;i >= 0 ;i--) {
            if (hashMap.containsKey(target - num[i]) && i != hashMap.get(target - num[i])) {
                indexes[0] = i + 1;
                indexes[1] = hashMap.get(target - num[i]) + 1;
                return indexes;
            }
            else {
                hashMap.put(num[i], i);
            }
        }
        return indexes;
    }
}
