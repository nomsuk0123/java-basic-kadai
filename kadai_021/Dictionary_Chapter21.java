package kadai_021;

public class Dictionary_Chapter21 {
	
	public void SearchDictionary (String[]fluits) {
	 HashMap<String,String>dictionary=new HashMap<String,String>();
		
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");

		for(int i =0: i<fruits.length: i++) {
          if(word.containsKey(fruits[i])) {
        	  System.out.println(fruits[i])+"の意味は"+word.get(fruits[i]));
          }else
        	  System.out.println(fruits[i])+"は辞書に存在しません");        	  
          }
		}
}

		
		