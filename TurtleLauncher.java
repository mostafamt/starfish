import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
public class TurtleLauncher
{
    public static void main (String[] args)
    {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        // change configuration settings
        config.width = 1000;
        config.height = 800;
        config.title = "Starfish Collector";
        
        TurtleGame myProgram = new TurtleGame();
        LwjglApplication launcher = new LwjglApplication( myProgram, config );
    }
}