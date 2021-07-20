package pl.adrianherdzina.physics2d.components;

import pl.adrianherdzina.components.Component;

public class CircleCollider extends Collider {
    private float radius = 1f;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
