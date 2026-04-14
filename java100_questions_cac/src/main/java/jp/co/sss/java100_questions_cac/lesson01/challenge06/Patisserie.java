/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
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
		int citronCount = Integer.parseInt(citronCountStr);

		System.out.println("ショコラ      >");
		String chocolatCountStr = br.readLine();
		int chocolatCount = Integer.parseInt(chocolatCountStr);

		System.out.println("ピスターシュ  >");
		String pistacheCountStr = br.readLine();
		int pistacheCount = Integer.parseInt(pistacheCountStr);

		System.out.println("\nシトロン" + citronCount + "個");
		System.out.println("ショコラ" + chocolatCount + "個");
		System.out.println("ピスターシュ" + citronCount + "個\n");

		int totalCount = citronCount + chocolatCount + pistacheCount;
		int totalPrice = citronCount * 250 + chocolatCount * 280 + pistacheCount * 320;

		System.out.println("合計個数：" + totalCount + "個");
		System.out.println("合計金額：" + totalPrice + "円");
		System.out.print("\nをお買いあげですね。");
		System.out.println("承りました。");

		citronStock = citronStock - citronCount;
		chocolatStock = chocolatStock - chocolatCount;
		pistacheStock = pistacheStock - pistacheCount;

		System.out.println("在庫");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");
	}
}
