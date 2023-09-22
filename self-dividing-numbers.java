// problem stmt : https://leetcode.com/problems/self-dividing-numbers/

class Solution {

    public static boolean isSelfDivide(int num){
        int copyNum = num;

        if(num == 0)
            return false;

        while(copyNum > 0){
            int digit = copyNum % 10;

            if(digit == 0)
                return false;

            if(num%digit != 0)
                return false;

            copyNum /= 10;
            
        }

        return true;
    }


    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = left;i<=right;i++){
            if(isSelfDivide(i))
                res.add(i);
        }

        return res;
    }
}
