package sia.knights.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sia.knights.Knight;
import sia.knights.config.KnightConfig;

/**
 * Demo Spring AOP with annotation java config
 * @author lmthien
 *
 */
public class AnnotationKnightMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}

}
