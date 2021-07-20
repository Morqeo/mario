package pl.adrianherdzina.physics2d.components;

import org.joml.Vector2f;
import pl.adrianherdzina.components.Component;

public abstract class Collider extends Component {
    private Vector2f offset = new Vector2f();

    public Vector2f getOffset(){
        return this.offset;
    }
}
