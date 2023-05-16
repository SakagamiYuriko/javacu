
package javaCurriculum1_5;

public class avaCurriculum1_5 {

		    public static void main(String[] args) {
		    	
		        // Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		        //  ローカル変数に代入し○○に入れてください
		        // 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		    	
		    	// Q1を下記に記載
		        // ↓↓format↓↓
		        // 「初めまして○○です」
		    	String name="山田太郎";
		    	String nameLetter=String.format("初めまして%sです", name);
		    	System.out.println(nameLetter);
		        // 「年齢は○○歳です」
		    	int age=18;
		    	String ageLetter=String.format("年齢は%d歳です", age);
		    	System.out.println(ageLetter);
		        // 「身長は○○cmです」
		    	double height=170.5;
		    	String heightLetter=String.format("身長は%.1fcmです", height);
		    	System.out.println(heightLetter);
		        // 「体重は○○kgです」
		    	double weight=62.2;
		    	String weightLetter=String.format("体重は%.1fkgです", weight);
		    	System.out.println(weightLetter);
		        // 「好きな食べ物は○○です」
		    	String food="寿司";
		    	String foodLetter=String.format("好きな食べ物は%sです", food);
		    	System.out.println(foodLetter);
		    	

		        // Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
		    	// 「BMIは○○です」
		        // ただし計算は数値を直書きせず、全て変数を使ってすること

		        // Q2を下記に記載
		    	double bmi=weight/((height/100)*(height/100));
		    	String bmiLetter=String.format("BMIは%.1fcmです", bmi);
		    	System.out.println(bmiLetter);
		    	
		    	    	
		        // Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
		    	// Q3を下記に記載
		    	// 初めまして鈴木一郎です
		    	name="鈴木一郎";
		        nameLetter=String.format("初めまして%sです", name);
		    	System.out.println(nameLetter);
		    	// 年齢は24歳です
		    	age=24;
		    	ageLetter=String.format("年齢は%d歳です", age);
		    	System.out.println(ageLetter);
		    	// 身長168.5cmです
		    	height=168.5;
		        heightLetter=String.format("身長は%.1fcmです", height);
		    	System.out.println(heightLetter);
		    	// 体重は64.2kgです
		        weight=64.2;
		    	weightLetter=String.format("体重は%.1fkgです", weight);
		    	System.out.println(weightLetter);
		    	// 好きな食べ物はオムライスです
		        food="オムライス";
		        foodLetter=String.format("好きな食べ物は%sです", food);
		    	System.out.println(foodLetter);
		    	// BMIは22.6です
		    	bmi=weight/((height/100)*(height/100));
		    	bmiLetter=String.format("BMIは%.1fcmです", bmi);
			    System.out.println(bmiLetter);



		    	// ↓↓コンソール最終結果↓↓
		    	
		    	//	初めまして山田太郎です
				//	年齢は18歳です
				//	身長170.5cmです
				//	体重は62.2kgです
				//	好きな食べ物は寿司です
				//	BMIは21.4です
				//	
				//	初めまして鈴木一郎です
				//	年齢は24歳です
				//	身長168.5cmです
				//	体重は64.2kgです
				//	好きな食べ物はオムライスです
				//	BMIは22.6です
		    	 
		     }

		}

