package onboarding;

public class Problem4 {
    public static char changedCharacter(char c){
        if(c>='a'&&c<='z')
            return (char) ('a'+'z'-c);
        if(c>='A'&&c<='Z')
            return (char) ('A'+'Z'-c);
        return c;
    }
    public static String solution(String word) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            answer.append(changedCharacter(word.charAt(i)));
        }
        return answer.toString();
    }
}
