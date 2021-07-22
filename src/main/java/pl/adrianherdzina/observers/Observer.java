package pl.adrianherdzina.observers;

import pl.adrianherdzina.jade.GameObject;
import pl.adrianherdzina.observers.events.Event;

public interface Observer {
    void onNotify(GameObject object, Event event);
}
