package projcect01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Greeting {
	
	public void greets(int select) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		KoreanGreeting kg =
        		ctx.getBean("kg",KoreanGreeting.class);
		EnglishGreeting eg =
        		ctx.getBean("eg", EnglishGreeting.class);
		
		switch(select) {
    	case 1:
    		kg.greet();
    		break;
    	case 2:
    		eg.greet();
    		break;
    	default:
    		System.out.println("잘 못 입력했습니다.");
		}
		
		ctx.close();
	
            return;
	}
}	
