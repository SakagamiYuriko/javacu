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
		    if(m1.matches()) {
		    System.out.println("半角英数字のみで名前を入力してください");
		    System.exit(0);
		    }
		}

		System.out.println("ユーザー名「"+name+"」を登録しました");
		
/******************************************************
* Q2.じゃんけんチェックシステム
*******************************************************/
//		0はグー、１はチョキ、２はパー
		int gu=0;
		int choki=1;
		int pa=2;
		
		int winCount=0;
		int loseCount=0;
//		スキャナーのインスタンス化
		Scanner stdin=new Scanner(System.in);
		while(winCount<3 && loseCount<3) {
//			メッセージの表示
			System.out.println("じゃんけんポン！(グー：0，チョキ：1、パー：2　どれかの数字をいれてください。)");
//			ユーザーの手を読む
			int userHands=stdin.nextInt();
//			入力チェック
			while(userHands<0 || userHands>2) {
				System.out.println("グー：0，チョキ：1、パー：2　どれかの数字をいれてください。");
				userHands=stdin.nextInt();
//				PCのじゃんけんの手を準備
				Random rand=new Random();
				int pcHands=rand.nextInt(3);
//				結果判定
				String result;
				if(userHands==pcHands) {
					result="あいこです";
				}else if((userHands==0&&pcHands==1)||
						(userHands==1&&pcHands==2)||
						(userHands==2&&pcHands==0)) {
					result="ユーザーの勝ちです。";
					winCount++;
				}else {
					result="ユーザーの負けです。";
					loseCount++;
				}
//				判定結果の表示
				String[]hands= {"グー","チョキ","パー"};
				System.out.println("ユーザーの手:" + hands[userHands] + ",コンピュータの手:" + hands[pcHands]);
				System.out.println("結果：" + result);
				
				System.out.println("現在：" + winCount + "勝" + loseCount + "敗");
		
				}
			
//			Scannerをクローズ
			stdin.close();
				
			}
		}

	
	}



