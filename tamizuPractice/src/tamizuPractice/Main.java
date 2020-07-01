package tamizuPractice;

public class Main {

	public static void dispFizzBuzz(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=1;i<=100;){
			if(i%3==0 || i%5==0){
				if(i%3==0 && i%5==0){
					System.out.println("FizzBizz");
				}
				if(i%5!=0){
					System.out.println("Fizz");
				}
				if(i%3!=0){
					System.out.println("Bizz");
				}
			}else{
			System.out.println(i);
			}
			i++;
		}
		String[] sweets = {"きたあああああ", "あああ", "い-------", "a111111", "aiiiiii", "", "1111112","111111","123456"};

		for (int i = 0; i < sweets.length; i++) {
		System.out.println(sweets[i] + ":: " +
		sweets[i].matches("(.)\\1{" + 5 + ",}"));
		}

		int num = 5;

		for (int i = 0; i < sweets.length; i++) {
		System.out.println(sweets[i] + "::: " +
		sweets[i].matches(".*(.)\\1{" + num + ",}"));
		}

		String password="aaaaaa";
		String mailAddress="aaaaaa@gmail.com";

		check(password,mailAddress,num);

	}

	private static boolean check(String str1,String str2,int num) {
		// TODO 自動生成されたメソッド・スタブ

		if(str1.matches(".*(.)\\1{" + num + ",}") && str2.contains(str1)) {
			System.out.println("true");
		}else{
			System.out.println("false");
		};
		return true;
	}
}
