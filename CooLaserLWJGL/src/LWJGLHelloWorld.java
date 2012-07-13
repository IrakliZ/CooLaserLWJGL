import org.lwjgl.opengl.GL11.*;
import org.lwjgl.opengl.*;
import org.lwjgl.*;

public class LWJGLHelloWorld {
	
	public LWJGLHelloWorld(){
		try{
			Display.setDisplayMode(new DisplayMode(640, 480));
			Display.setTitle("Hello, LWJGL");
			Display.create();
		}catch(LWJGLException e){
			e.printStackTrace();
		}
		
		//Initialization OpenGL
		
		while(!Display.isCloseRequested()){
			Display.update();
			Display.sync(60);
		}
		
		Display.destroy();
	}
	
	
	public static void main(String[] args) {
		System.out.println("hello");
		new LWJGLHelloWorld();

	}

}
