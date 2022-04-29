package jp.learningdesign.java;

public class BmiCalc {
/* BMI(体格指数)を計算するプログラム
 * BMI = 体重 / (身長 * 身長)
 * 体重 kg、身長 cm
 */

	public static void main(String[] args) {
		double weight,height,bmi;
		
		weight = 71;
		height = 180;
		
		height /= 100;
		
		bmi = weight / (height * height);
		
		System.out.println(bmi);
		
		if (bmi < 18.5) {
			System.out.println("やせ型です");
		} else if (bmi < 25) {
			System.out.println("標準です");			
		} else {
			System.out.println("肥満です");
		}
	}

}
