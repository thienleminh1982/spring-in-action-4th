package sia.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import sia.knights.BraveKnight;
import sia.knights.Knight;
import sia.knights.Quest;
import sia.knights.SlayDragonQuest;
import sia.knights.aspect.MinstrelAspect;

@Configuration
@EnableAspectJAutoProxy
/**
 * Don't forget the annotation @EnableAspectJAutoProxy which will
 * create a proxy class
 * 
 * @author lmthien
 *
 */
public class KnightConfig {

	@Bean
	public Knight knight() {
		return new BraveKnight(quest()); // DI on constructor
	}

	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}

	@Bean
	public MinstrelAspect minstrel() {
		// To return directly the aspect class, not the interface
		return new MinstrelAspect(System.out);
	}

}
