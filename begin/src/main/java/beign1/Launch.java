package beign1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		Bird bird=(Bird)context.getBean("parote");
		bird.flying();
		context.close();
	}

}
