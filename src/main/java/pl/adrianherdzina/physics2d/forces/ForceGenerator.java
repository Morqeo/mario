package pl.adrianherdzina.physics2d.forces;

import pl.adrianherdzina.physics2d.rigidbody.Rigidbody2D;

public interface ForceGenerator {
    void updateForce(Rigidbody2D body, float dt);
}
