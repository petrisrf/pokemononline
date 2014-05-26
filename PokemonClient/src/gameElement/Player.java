package gameElement;

import client.util.Camera;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;

import com.sun.javafx.geom.Rectangle;

public class Player extends Character {
	private Image spritesheet;
	
	public Player(){
		this.rect = new Rectangle();
		this.spritesheet = new Image("/resource/image/sprite/ash.png");
		this.rect.x = 20;
		this.rect.y = 20;
		this.rect.width = 20;
		this.rect.height = 20;
	}
	
	@Override
	public void draw(WritableImage _screen){
//            System.out.print("x=" + this.rect.x + ", y=" + this.rect.y + ", w= " + this.rect.width + ", h= " + this.rect.height);

            Camera c = Camera.getInstance();
            
//            if ( c.isScrollingX() && c.isScrollingY() ) {
//                _screen.getPixelWriter().setPixels(c.getWidth()/ 2, c.getHeight() / 2, 
//                    rect.width, rect.height, spritesheet.getPixelReader(), 0, 0);
//            } else {
                _screen.getPixelWriter().setPixels((int)c.getLocalX(), (int)c.getLocalY(), 
                        rect.width, rect.height, spritesheet.getPixelReader(), 0, 0);
//            }
     }
	
	@Override
	public void update() {
		// TODO Auto-generated method stub

	}
}
