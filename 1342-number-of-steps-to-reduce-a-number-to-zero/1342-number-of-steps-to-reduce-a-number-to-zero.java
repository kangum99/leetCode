class Solution {
    public int numberOfSteps(int num) {
        
        int cnt = 0;
        
        //0이면 나오기
        while(num != 0) {
            //짝수
            if(num % 2 == 0) {
                num = num/2;
            //홀수
            }else {
                num -= 1;
            }
            cnt ++;
        }
        
        return cnt;
    }
}