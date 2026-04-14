/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citronStock = 30;
		int chocolatStock = 30;
		int pistacheStock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		System.out.println("シトロン      >");
		String citronCountStr = br.readLine();
		double citronCount = Double.parseDouble(citronCountStr);

		System.out.println("ショコラ      >");
		String chocolatCountStr = br.readLine();
		double chocolatCount = Double.parseDouble(chocolatCountStr);

		System.out.println("ピスターシュ  >");
		String pistacheCountStr = br.readLine();
		double pistacheCount = Double.parseDouble(pistacheCountStr);

		System.out.println("\nシトロン" + citronCount + "個");
		System.out.println("ショコラ" + chocolatCount + "個");
		System.out.println("ピスターシュ" + citronCount + "個\n");

		double totalCount = citronCount + chocolatCount + pistacheCount;
		int totalPrice = (int) (citronCount * 250 + chocolatCount * 280 + pistacheCount * 320);

		System.out.println("合計個数：" + totalCount + "個");
		System.out.println("合計金額：" + totalPrice + "円");
		System.out.print("\nをお買いあげですね。");
		System.out.println("承りました。");

		citronStock = (int) (citronStock - citronCount);
		chocolatStock = (int) (chocolatStock - chocolatCount);
		pistacheStock = (int) (pistacheStock - pistacheCount);

		System.out.println("在庫");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

		System.out.println("\n閉店時間となりました。またのお越しをお待ちしております。\n");
		System.out.println("\n売上の割合");
		System.out.println("売上合計  \\" + totalPrice);
		System.out.println("内訳\n");
		System.out.println("シトロン      \\" + (int) (250 * citronCount) + "・・・"
				+ (int) ((250 * citronCount) / totalPrice * 100) + "%");
		System.out.println("ショコラ      \\" + (int) (280 * chocolatCount) + "・・・"
				+ (int) ((280 * chocolatCount) / totalPrice * 100) + "%");
		System.out.println("ピスターシュ  \\" + (int) (320 * pistacheCount) + "・・・"
				+ (int) ((320 * pistacheCount) / totalPrice * 100) + "%");
	}

}
