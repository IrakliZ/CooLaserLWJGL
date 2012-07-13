import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.opengl.*;
import org.lwjgl.*;

public class SimpleOGLRenderer {
	
	public SimpleOGLRenderer(){
		try{
			Display.setDisplayMode(new DisplayMode(640, 480));
			Display.setTitle("Hello, LWJGL");
			Display.create();
		}catch(LWJGLException e){
			e.printStackTrace();
		}
		
		//Initialization OpenGL
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, 640, 480, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		
		while(!Display.isCloseRequested()){
			
			glBegin(GL_LINES);
				glVertex2i(100, 100);
				glVertex2i(200, 200);
			glEnd();
			
			
			Display.update();
			Display.sync(60);
		}
		
		Display.destroy();
	}
	
	
	public static void main(String[] args) {
		new SimpleOGLRenderer();
	}

}
