package nc.unc.vaadin.flow.polymer.iron.icons;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import nc.unc.vaadin.flow.polymer.iron.IronIconDefinition;

@JsModule("@polymer/iron-icons/hardware-icons.js")
public enum IronHardwareIcons implements IronIconDefinition {
    CAST,
    CAST_CONNECTED,
    COMPUTER,
    DESKTOP_MAC,
    DESKTOP_WINDOWS,
    DEVELOPER_BOARD,
    DEVICE_HUB,
    DEVICES_OTHER,
    DOCK,
    GAMEPAD,
    HEADSET,
    HEADSET_MIC,
    KEYBOARD,
    KEYBOARD_ARROW_DOWN,
    KEYBOARD_ARROW_LEFT,
    KEYBOARD_ARROW_RIGHT,
    KEYBOARD_ARROW_UP,
    KEYBOARD_BACKSPACE,
    KEYBOARD_CAPSLOCK,
    KEYBOARD_HIDE,
    KEYBOARD_RETURN,
    KEYBOARD_TAB,
    KEYBOARD_VOICE,
    LAPTOP,
    LAPTOP_CHROMEBOOK,
    LAPTOP_MAC,
    LAPTOP_WINDOWS,
    MEMORY,
    MOUSE,
    PHONE_ANDROID,
    PHONE_IPHONE,
    PHONELINK,
    PHONELINK_OFF,
    POWER_INPUT,
    ROUTER,
    SCANNER,
    SECURITY,
    SIM_CARD,
    SMARTPHONE,
    SPEAKER,
    SPEAKER_GROUP,
    TABLET,
    TABLET_ANDROID,
    TABLET_MAC,
    TOYS,
    TV,
    VIDEOGAME_ASSET,
    WATCH;
    
    public static final String COLLECTION = "hardware";
    
    public String collection() {
        return COLLECTION;
    }
}
