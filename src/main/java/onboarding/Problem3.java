package onboarding;

public class Problem3 {
    public static int checkClap(int number){
        int clapNumber = 0;
        while(number!=0){
            int NthDigit = number%10;
            if(NthDigit==3||NthDigit==6||NthDigit==9)
                clapNumber++;
            number/=10;
        }
        return clapNumber;
    }
    public static int solution(int number) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            answer+=checkClap(i);
        }
        return answer;
    }
}
