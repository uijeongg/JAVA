package Quest0318;
/*
8. 사칙연산을 수행하는 Calculator 클래스 작성
정수 : 12
정수 : 5
12 + 5 = 17
12 - 5 = 7
12 * 5 = 60
12 / 5 = 2.4
12 소수체크 : false
5 소수체크 : true
 */

public class Calculator {

	    // 덧셈
		public int add(int i, int j) {
			return i + j;
		}

		// 뺄셈
		public int sub(int i, int j) {
			return i - j;
		}

		// 곱셈
		public int mul(int i, int j) {
			return i * j;
		}

		// 나눗셈
		public double div(double i, double j) {
			return i / j;
		}

		// 소수체크
		public boolean prime(int i) {
			for (int j = 2; j < i; j++) { // j<=i 는 포함 xx
				if (i % j == 0) {
					return false;

				}
			}
			return true;
		}

	}
