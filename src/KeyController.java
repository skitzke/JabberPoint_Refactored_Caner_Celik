import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

/** <p>This is the KeyController (KeyListener)</p>
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
*/

public class KeyController extends KeyAdapter {
	private final Presentation presentation; //Commands are given to the presentation

	public KeyController(Presentation p) {
		presentation = p;
	}

	public void keyPressed(KeyEvent keyEvent) {
		switch (keyEvent.getKeyCode()) {
			//Keys changed to appropriate right arrow, left arrow and escape.
			case KeyEvent.VK_RIGHT -> presentation.nextSlide();
			case KeyEvent.VK_LEFT -> presentation.prevSlide();
			case KeyEvent.VK_ESCAPE -> System.exit(0);
			//Should not be reached
			default -> {
			}
		}
	}
}
