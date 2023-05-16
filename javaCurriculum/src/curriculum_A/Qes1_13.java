/*************************************************************************
*[概要]java基礎Qus1_13
*[詳細]Q1.ローカル変数の宣言Q2.ローカル変数の初期化Q3.ローカル変数の値の代入
Q4.ローカル変数の出力Q5.ローカル変数の正誤問題Q6.ローカル変数を使った自己紹介文
Q7.ローカル変数を使ったBMI計算Q8.ローカル変数の再代入Q9.ローカル変数の和算
Q10.ローカル変数のtrue式Q11.文字列型への変換Q12.整数型への変換Q13.true出力式
**************************************************************************/

package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
/*************************************************************************
[概要]Q1.ローカル変数の宣言
**************************************************************************/
//		下記9個をローカル変数として宣言のみしてください
//		・バイト型・短整数型・整数型・長整数型
		byte b;
		short s;
		int i;
		long l;
//		・単精度浮動小数点数型・倍精度浮動小数点数型
		float f;
		double d;
//		・文字型・文字列型
		char c;
		String Str;
//		・ブーリアン型
		boolean bool;

/*************************************************************************
[概要]Q2.ローカル変数の初期化
**************************************************************************/
//		それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		
//		・バイト型・短整数型・整数型・長整数型
		b=0;
		s=0;
		i=0;
	    l=0L;
//		・単精度浮動小数点数型・倍精度浮動小数点数型
		f=0.0f;
		d=0.0d;
//		・文字型・文字列型
	    c='\u0000';
		Str=null;
//		・ブーリアン型
		bool=false;
		
/*************************************************************************
 [概要]Q3.ローカル変数の値の代入
**************************************************************************/
//		初期化をしたそれぞれの変数に下記の値を代入してください
//		・バイト型 10
	    b=10;
//		・短整数型 100
		s=100;
//		・整数型 1000
		i=1000;
//		・長整数型 10000
		l=10000;
//		・単精度浮動小数点数型 9.5
	    f=9.5f;
//		・倍精度浮動小数点数型 10.5
		d=10.5;
//		・文字型 a
	    c='a';
//		・文字列型 ハロー
		Str="ハロー";
//		・ブーリアン型　true
	    bool=true;

/*************************************************************************
[概要]Q4.ローカル変数の出力
**************************************************************************/
//		下記の通りにコンソール出力されるようにしてください			
//		上記で作成した変数を必ず使用すること			
//		11110
		System.out.println(l+i+s+b);
//		20
		System.out.println(String.format("%.1f", b*2.0));
//		a ハロー true
		System.out.println(c+Str+bool);
//		11130 数字を全て足す
		System.out.println(Math.round(b+s+i+l+f+d));
//		10000000000	小数点以外の数字を全てかける
		System.out.println(b*s*i*l);
//		0.105　10.5割る100をする
		System.out.println(d/100);
//		-90	10引く100をする
        System.out.println(b-100);

 /*************************************************************************
[概要]Q5.ローカル変数の正誤問題
**************************************************************************/
//        次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
//        「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
//        　String num="20";
//        　int num1=23;
//        　System.out.println("ハローJAVA"+(num+num1));
        int num=20;
        int num1=23;
        System.out.println("ハローJAVA"+(num+num1));

 /*************************************************************************
 [概要]Q6.ローカル変数を使った自己紹介文
 **************************************************************************/
//        『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
//        ローカル変数に代入し○○に入れてください
//        『山田太郎 18歳 170.5cm 62.2kg 寿司』
//
//        ↓↓format↓↓
//        「初めまして○○です」
//        「年齢は○○歳です」
//        「身長は○○cmです」
//        「体重は○○kgです」
//        「好きな食べ物は○○です」
        String name="山田太郎";
    	String nameLetter=String.format("初めまして%sです", name);
    	System.out.println(nameLetter);

    	int age=18;
    	String ageLetter=String.format("年齢は%d歳です", age);
    	System.out.println(ageLetter);

    	double height=170.5;
    	String heightLetter=String.format("身長は%.1fcmです", height);
    	System.out.println(heightLetter);

    	double weight=62.2;
    	String weightLetter=String.format("体重は%.1fkgです", weight);
    	System.out.println(weightLetter);

    	String food="寿司";
    	String foodLetter=String.format("好きな食べ物は%sです", food);
    	System.out.println(foodLetter);
        
 /*************************************************************************
{概要]Q7.ローカル変数を使ったBMI計算
 **************************************************************************/
//        6で作成した自己紹介に続いてBMIが出力されるようにしてください
//        「BMIは○○です」
//        ただし計算は数値を直書きせず、全て変数を使ってすること
    	double bmi=weight/((height/100)*(height/100));
    	String bmiLetter=String.format("BMIは%.1fcmです", bmi);
    	System.out.println(bmiLetter);
    	
 /*************************************************************************
  [概要]Q8.ローカル変数の再代入
 **************************************************************************/
//    	6で宣言した変数に再代入し下記の通りコンソールに出力してください
//    	　初めまして鈴木一郎です
//    	　年齢は24歳です
//    	　身長168.5cmです
//    	　体重は64.2kgです
//    	　好きな食べ物はオムライスです
//    	　BMIは22.6です
    	name="鈴木一郎";
        nameLetter=String.format("初めまして%sです", name);
    	System.out.println(nameLetter);

    	age=24;
    	ageLetter=String.format("年齢は%d歳です", age);
    	System.out.println(ageLetter);

    	height=168.5;
        heightLetter=String.format("身長は%.1fcmです", height);
    	System.out.println(heightLetter);

        weight=64.2;
    	weightLetter=String.format("体重は%.1fkgです", weight);
    	System.out.println(weightLetter);

        food="オムライス";
        foodLetter=String.format("好きな食べ物は%sです", food);
    	System.out.println(foodLetter);

    	bmi=weight/((height/100)*(height/100));
    	bmiLetter=String.format("BMIは%.1fです", bmi);
	    System.out.println(bmiLetter);

/*************************************************************************
 [概要]Q9.ローカル変数の和算
**************************************************************************/
//	    8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
//	   　初めまして鈴木一郎です
//	   　年齢は48歳です
//	   　身長337.0cmです
//	   　体重は128.4kgです
//	   　好きな食べ物はオムライスです
//	   　BMIは11.31です
	    name="鈴木一郎";
        nameLetter=String.format("初めまして%sです", name);
    	System.out.println(nameLetter);

    	age=24;
    	int ageAdd=24;
        int ageSuzu=age+ageAdd;
    	System.out.println("年齢は"+ageSuzu+"歳です");

    	height=168.5;
    	double heightAdd=168.5;
    	double heightSuzu=height+heightAdd;
    	System.out.println("身長は"+heightSuzu+"cmです");

        weight=64.2;
        double weightAdd=64.2;
        double weightSuzu=weight+weightAdd;
    	System.out.println("体重は"+weightSuzu+"kgです");

        food="オムライス";
        foodLetter=String.format("好きな食べ物は%sです", food);
    	System.out.println(foodLetter);

    	bmi=weightSuzu/((heightSuzu/100)*(heightSuzu/100));
    	bmiLetter=String.format("BMIは%.2fです", bmi);
	    System.out.println(bmiLetter);

/*************************************************************************
 [概要]Q10.ローカル変数のtrue式
**************************************************************************/
//	    8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
	    boolean result;
	    result=(ageSuzu>20);
	    System.out.println(result);
	    
/*************************************************************************
  [概要]Q11.文字列型への変換
**************************************************************************/
//	    8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
	    String ageChange=String.valueOf(ageSuzu);
	    System.out.println("年齢は"+ageChange+"歳です");
	    
	    String heightChange=String.valueOf(heightSuzu);
	    System.out.println("身長は"+heightChange+"cmです");
	    
	    String weightChange=String.valueOf(weightSuzu);
	    System.out.println("体重は"+weightChange+"kgです");
	    
/*************************************************************************
 [概要]Q12.整数型への変換
**************************************************************************/
//	    11で変換した【年齢・身長】を整数型に変換して出力してください
	    int heightChange1=(int)Double.parseDouble(heightChange);
	    System.out.println("身長は"+heightChange1+"cmです");
	    
	    int weightChange1=(int)Double.parseDouble(weightChange);
	    System.out.println("体重は"+weightChange1+"kgです");
	    
/*************************************************************************
 [概要]Q13.true出力式
**************************************************************************/
//	    12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
	    int ageChange1=(int)Double.parseDouble(ageChange);
	    result=(ageChange1 > 25 && heightChange1 > 160);
	    System.out.println(result);



	}

}


/*************************************************************************

**************************************************************************/
