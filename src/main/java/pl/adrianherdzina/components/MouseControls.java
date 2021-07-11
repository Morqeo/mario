package pl.adrianherdzina.components;

import pl.adrianherdzina.jade.GameObject;
import pl.adrianherdzina.jade.MouseListener;
import pl.adrianherdzina.jade.Window;

import static org.lwjgl.glfw.GLFW.GLFW_MOUSE_BUTTON_LEFT;

public class MouseControls extends Component{
    GameObject holdingObject = null;

    public void pickupObject(GameObject go){
        this.holdingObject = go;
        Window.getScene().addGameObjectToScene(go);
    }

    public void place(){
        this.holdingObject = null;
    }

    @Override
    public void update(float deltaTime){
        if(holdingObject != null){
            holdingObject.transform.position.x = MouseListener.getOrthoX() - 16;
            holdingObject.transform.position.y = MouseListener.getOrthoY() - 16;

            if(MouseListener.mouseButtonDown(GLFW_MOUSE_BUTTON_LEFT)){
                place();
            }
        }
    }
}