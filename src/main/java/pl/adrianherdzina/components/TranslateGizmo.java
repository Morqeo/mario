package pl.adrianherdzina.components;

import org.joml.Vector2f;
import org.joml.Vector4f;
import pl.adrianherdzina.editor.PropertiesWindow;
import pl.adrianherdzina.jade.GameObject;
import pl.adrianherdzina.jade.MouseListener;
import pl.adrianherdzina.jade.Prefabs;
import pl.adrianherdzina.jade.Window;

public class TranslateGizmo extends Gizmo {

    public TranslateGizmo(Sprite arrowSprite, PropertiesWindow propertiesWindow) {
        super(arrowSprite, propertiesWindow);
    }

    @Override
    public void update(float dt) {
        if (activeGameObject != null) {
            if (xAxisActive && !yAxisActive) {
                activeGameObject.transform.position.x -= MouseListener.getWorldDx();
            } else if (yAxisActive) {
                activeGameObject.transform.position.y -= MouseListener.getWorldDy();
            }
        }

        super.update(dt);
    }
}
