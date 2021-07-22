package pl.adrianherdzina.editor;

import imgui.ImGui;
import pl.adrianherdzina.observers.EventSystem;
import pl.adrianherdzina.observers.events.Event;
import pl.adrianherdzina.observers.events.EventType;

public class MenuBar {

    public void imgui() {
        ImGui.beginMenuBar();

        if (ImGui.beginMenu("File")) {
            if (ImGui.menuItem("Save", "Ctrl+S")) {
                EventSystem.notify(null, new Event(EventType.SaveLevel));
            }

            if (ImGui.menuItem("Load", "Ctrl+O")) {
                EventSystem.notify(null, new Event(EventType.LoadLevel));
            }

            ImGui.endMenu();
        }

        ImGui.endMenuBar();
    }
}
