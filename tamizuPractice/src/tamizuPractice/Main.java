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

	}

}
