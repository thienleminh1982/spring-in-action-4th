package sia.knights.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sia.knights.Knight;

public class KnightMain {

	public static void main(String[] args) throws Exception {
		// XML configuration: AOP works
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}

}
