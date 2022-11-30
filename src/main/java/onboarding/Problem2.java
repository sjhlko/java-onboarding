package onboarding;

public class Problem2 {
    public static String deleteRepeat(String cryptogram){
        char before = cryptogram.charAt(0);
        StringBuilder repeatDeletedString = new StringBuilder();
        repeatDeletedString.append(cryptogram.charAt(0));
        for (int i = 1; i < cryptogram.length(); i++) {
            if(before==cryptogram.charAt(i)){
                repeatDeletedString.deleteCharAt(repeatDeletedString.length()-1);
                while (i<cryptogram.length()&&before==cryptogram.charAt(i)) {
                    i++;
                }
                if(i>=cryptogram.length())
                    return repeatDeletedString.toString();
            }
            before = cryptogram.charAt(i);
            repeatDeletedString.append(before);
        }
        if(!repeatDeletedString.toString().equals(cryptogram))
            return deleteRepeat(repeatDeletedString.toString());
        return repeatDeletedString.toString();
    }
    public static String solution(String cryptogram) {
        return deleteRepeat(cryptogram);
    }

}
