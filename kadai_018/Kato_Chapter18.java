package kadai_018;

public class Kato_Chapter18 {
	//フィールド
	public String familyName="加藤";//性
	public String giveName="";
	public String address="東京都中野区〇×";//住所
	
	//【メソッド】共通の紹介
	public void commonIntroduce() {
		System.out.println("名前は"+this.familyName+"です");
		System.out.println("住所は"+this.address+"です");
｝
　　//【メソッド】個別の紹介
　　abstract public void eachIntroduce();

    
    //【メソッド】紹介を実行する
　　public void execIntroduce() {
	   this.commonIntroduce();
	   this.eachIntroduce();
	   this.eachIntroduce();
	   System.out.println();
　　}
}
