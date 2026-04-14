/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

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
		System.out.println("ピスターシュ" + citronCount + "個");

		System.out.print("\nをお買いあげですね。");
		System.out.println("承りました。");
	}
}
