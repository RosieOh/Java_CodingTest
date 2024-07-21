package theory.재귀;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

    /* reverseString() 함수를 통해 문자열의 값이 0이 되면 문자열을 반환하고
       그렇지 않으면 첫 번째 문자를 마지막 문자와 바꾸고 나머지 문자열에 대해 reverseString()
       함수를 재귀적으로 호출한 결과를 반환
     */
    public static String reverseString(String string) {
        if (string.length() == 0) {
            return string;
        } else {
            return reverseString(string.substring(1)) + string.charAt(0);
        }
    }
}
