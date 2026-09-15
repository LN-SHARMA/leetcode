class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=0;
        int one = Math.min(numOnes,k);
        sum += one;
        k -= one;
        int zero = Math.min(numZeros,k);
        k -=zero;
        sum -=k;
        return sum;
    }
}