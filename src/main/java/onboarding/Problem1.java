package onboarding;

import java.util.List;

class Problem1 {
    public static boolean isValidPage(int left, int right){
        if(left>=400||right<1)
            return false;
        if(left+1!=right)
            return false;
        return left % 2 == 1 && right % 2 == 0;
    }
    public static int findMax(int page){
        int plus = 0;
        int multiply = 1;
        while (page!=0){
            plus+=page%10;
            multiply*=page%10;
            page/=10;
        }
        return Math.max(plus,multiply);
    }

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if(isValidPage(pobi.get(0),pobi.get(1))&&isValidPage(crong.get(0),crong.get(1))){
            int pobiMax = Math.max(findMax(pobi.get(0)),findMax(pobi.get(1)));
            int crongMax = Math.max(findMax(crong.get(0)),findMax(crong.get(1)));
            if(pobiMax>crongMax)
                return 1;
            if(pobiMax==crongMax)
                return 0;
            return 2;
        }
        return -1;
    }
}