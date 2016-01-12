package sia.knights.aspect;

import java.io.PrintStream;

/**
 * POJO class, will play as Aspect when configured in META-INF/spring/knight.xml
 * 
 * @author lmthien
 *
 */
public class Minstrel implements MinstrelInterface {

	private PrintStream stream;

	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}

	public void embarkCalled() {
	}

	public void singBeforeQuest() {
		stream.println("Fa la la, the knight is so brave!");
	}

	public void singAfterQuest() {
		stream.println("Tee hee hee, the brave knight " + "did embark on a quest!");
	}

}
