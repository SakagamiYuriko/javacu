/*************************************************************************
*[概要]java基礎1.16 データ型とメモリの関係
*[詳細]Q1.ログイン時の入力チェックシステムQ2.半角英数字入力チェックQ3.条件システム
Q4.for文出力1 Q5.for文出力2 Q6.for/Switch/条件演算子 Q7.条件プログラム
**************************************************************************/

package curriculum_B;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
//		name = null;
		
//		nameが0文字以下の場合、名前を入力してくださいと表示させる。empty
//		nameの中身が何もない場合、名前を入力してくださいと表示させる。null
        if ((Objects.isNull(name))||(name.length()<=0)){
			System.out.println("名前を入力してください");
			System.exit(0);
		
        }else if (name.length()>10) {
			System.out.println("名前を10文字以内で入力してください");
			System.exit(0);
		}else {
			String name_val="^[A-Za-z]+$";
		    Pattern p1=Pattern.compile(name_val);
		    Matcher m1=p1.matcher(name);
		    m1.matches();
		    if(!m1.matches()) {
		    System.out.println("半角英数字のみで名前を入力してください");
		    System.exit(0);
		    }
		}

		System.out.println("ユーザー名「"+name+"」を登録しました");
		
//		新上さんとの１on１の復習
//		スキャナー起動→コンソールに書いた文字をnameに入れる→スキャナーを閉じる
//		上から順番に処理される
//		Objects.nonNull(a);・・・aがnullでなければ
//		Objects.isNull(a);・・・aがnullであれば
//		nullとは、変数データが「何もない」ということを示す
//		String name=scanner.nextLine();は空という形があるので、nullではなくenpty
//		exit文は{}の中に入れる
//		(コードの内容)
//		nameの中身があり、０文字ではない　クリア
//		nameの文字が１０文字以上ある　クリア
//		最終ゴール、登録されました。
//		クリアされなかったら、終了
	
	}

}
