/*************************************************************************
*[概要]java基礎1.16 データ型とメモリの関係
*[詳細]Q1.ログイン時の入力チェックシステムQ2.半角英数字入力チェックQ3.条件システム
Q4.for文出力1 Q5.for文出力2 Q6.for/Switch/条件演算子 Q7.条件プログラム
**************************************************************************/

package curriculum_B;

import java.util.Objects;
import java.util.Scanner;

public class Curriculum1_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
/******************************************************
 * Q1.ログイン時の入力チェックシステム
 ******************************************************/
		Scanner scanner = new Scanner(System.in);
		String name=scanner.nextLine();
		scanner.close();
		
//		nullチェック用
		name = null;
		
//		nameが0文字以下の場合、名前を入力してくださいと表示させる。empty
//		nameの中身が何もない場合、名前を入力してくださいと表示させる。null
        if ((Objects.isNull(name))||(name.length()<=0)){
			System.out.println("名前を入力してください");
			System.exit(0);
		}
		if (name.length()>10) {
			System.out.println("名前を10文字以内で入力してください");
			System.exit(0);
		}
		
//		System.out.println(name.length());
		System.out.println("ユーザー名「"+name+"」を登録しました");
 

	}

}
