package projcect01;

import java.util.Scanner;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select language! 1.korean, 2.english");
		int select = scanner.nextInt();
		
		Greeting greeting =
				ctx.getBean("greeting", Greeting.class);
		greeting.greets(select);
		
		
		ctx.close();
		scanner.close();
		

	}

}
