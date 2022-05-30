package Quest0318;
/*
- 아래의 내용을 만족하는 StringUtil 클래스를 작성합니다. (1 번 ~7 번)
1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true 를 반환하는 isUpperChar( char c )
메소드를 작성하시오
2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true 를 반환하는 isLowerChar(char c) 메
소드를 작성하시오
3. 두개의 숫자를 입력받아 큰수를 반환하는 max( int i, int j) 메소드를 작성하시오
4. 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드를 작성하시오
5. 문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드를 작성하시오
6. 문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드를 작성하시오
7. 문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드를 작성하시오
*/

public class StringUtil {

	//1번
		public boolean isUpperChar(char c) {
			if (c >= 'A' && c <= 'Z') {
				return true;
			} else {
				return false;
			}
		}

		//2번
		public boolean isLowerChar(char c) {
			if (c >= 'a' && c <= 'z') {
				return true;
			} else {
				return false;
			}
		}

		//3번
		public int max(int i, int j) {
			if (i > j) {
				return i;
			} else if (i < j) {
				return j;
			} else {
				return 0;
			}
		}

		//4번
		public int min(int i, int j) {
			if (i < j) {
				return i;
			} else if (i > j) {
				return j;
			} else {
				return 0;
			}
		}

		//5번
		public String reverseString(String str) {

			String newStr = " ";
			for (int i = str.length() - 1; i >= 0; i--) {
				newStr += str.charAt(i);

			}
			return newStr;
		}

		//6번
		public String toUpperString(String str) {

			String newStr = " ";
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					newStr += (char) (str.charAt(i) - 32);
				} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') { // 대->대 ok
					newStr += str.charAt(i);
				}

			}
			return newStr;
		}

		//7번
		public String toLowerString(String str) {

			String newStr = " ";
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') { // 소->소 xx
					newStr += str.charAt(i);
				} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') { // 대->소 ok
					newStr += (char) (str.charAt(i) + 32);
				}

			}
			return newStr;
		}

}
