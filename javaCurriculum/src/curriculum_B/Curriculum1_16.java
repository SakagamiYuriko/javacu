/*************************************************************************
 *[概要]java基礎1.16 データ型とメモリの関係
 *[詳細]Q1.ログイン時の入力チェックシステムQ2.半角英数字入力チェックQ3.じゃんけんシステム
Q4.for文出力1 Q5.for文出力2 Q6.for/Switch/条件演算子 Q7.条件プログラム
 **************************************************************************/

package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Curriculum1_16 {

	public static void main (String[] args) {
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
		if ((Objects.isNull(name)) ||(name.length()<=0)){
			System.out.println("名前を入力してください");
			System.exit(0);
			
//			nameが10文字より大きい場合、名前を10文字以内にしてくださいと表示		
		}else if (name.length()>10) {
			System.out.println("名前を10文字以内で入力してください");
			System.exit(0);
		}else {
			String name_val="^[A-Za-z]+$";//半角英数字か判定
			Pattern p1=Pattern.compile(name_val);//正規表現のパターンを
			Matcher m1=p1.matcher(name);
			m1.matches();
			if(m1.matches()) {//真偽値を返す
				System.out.println("半角英数字のみで名前を入力してください");
				System.exit(0);
			}
		}
//		nameが正常な値だった場合
		System.out.println("ユーザー名「"+name+"」を登録しました");
	}
}

		/******************************************************
		 * Q2.じゃんけんチェックシステム
		 *******************************************************/

		//		・「0はグー、1：チョキ、2：パー」とすること
		
		
//		if文→あいこ、
//		負けた場合、
//		勝った場合場合
//		do whileの中で繰り返す
//		dowhileとifとrandomを組み合わせる
		
		
//		String JANKEN_PAGE="Janken.jsb";
//		request.setCharacterEncoding("UTF-8");
//		
//		String[]hands= {"グー","チョキ","パー"};//じゃんけんの手を配列にて定義
//		int rand=(int)(Math.random()*3);//0~2の数字をランダムに生成
//		String psHand=hands[rand];//pc側の手を決定
//		request.setAttribute("pcHand", pcHand);//画面側へデータ受け渡し
//		
//		RequestDispatcher rd = request.getRequestDispatcher(JANKEN_PAGE);
//		rd.forward(request,response);
//		
//		↓トライ　https://ict-skillup.com/java/1107/

		public class JankenIf{
			public static void main(String[]args) {
			
//		ユーザーの手をキーボードから入力
		int user=getUser();
//		コンピュータの手を乱数で作成
		int pc=getPc();
//		勝負の判定を行う
		String result=judgeJanken(user,pc);
//		結果を表示
		showResult(user,pc,result);
		}
		
		public static int getUser() {
//			キーボード入力の準備
			Scanner stdin=new Scanner(System.in);
			
//			無限ループ
			while(true) {
//				メッセージの表示
				System.out.println("あなたのじゃんけんの手を入力して下さい");
				System.out.println("(グー:0,チョキ:1,パー:2)-->");
				
//			入力されたデータが整数かどうかのチェック
			if(stdin.hasNextInt()) {
//			入力されたデータを整数として読み込む
				int number=stdin.nextInt();
//			整数でも有効なのは「0,1,2」のみ
				if(number<=-1|| number>=3) {
					System.out.println("【エラー】入力できるのは「0～2」です");
					continue;
					}else {
//			0,1,2の場合、メッソドの結果として返す
						return number;
					}
			}else {
//			整数以外の場合、無効なデータなのでやり直し
				System.out.println("【エラー】入力できるのは整数だけです");
//			不要なトークンをバッファから取り除く
				stdin.next();
			}
			}
			
		}
		
		public static int getPc() {
//		    乱数の準備
			Random rand=new Random();
			return rand.nextInt(3);
		}
		
		public static String judgeJanken(int user,int pc){
			String result="";//判定結果を保存する
			
			if((user==0&&pc==1)||(user==1&&pc==2)||(user==2&&pc==0)) {
				result="勝ち";
			}else if((user==0&&pc==2)||(user==1&&pc==0)||(user==2&&pc==1)) {
				result="負け";
			}else {
				result="あいこ";
			}
			
//			勝敗結果を返す
			return result;
		}
		
		public static void showResult(int user,int pc,String result) {
			String[]janken= {"グー","チョキ","パー"
		};
//			結果の表示
			System.out.println("あなたの手："+janken[user]+",コンピュータの手："+janken[pc]);
			System.out.println("結果："+result);
		}
}
		
		
		
		





//	}



//}


