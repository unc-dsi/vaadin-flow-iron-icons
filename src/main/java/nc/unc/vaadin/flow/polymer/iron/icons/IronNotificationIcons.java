package nc.unc.vaadin.flow.polymer.iron.icons;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@NpmPackage(value = "@polymer/iron-icons", version = IronIcons.VERSION)
@JsModule("@polymer/iron-icons/notification-icons.js")
public enum IronNotificationIcons implements IronIconDefinition {
    ADB,
    AIRLINE_SEAT_FLAT,
    AIRLINE_SEAT_FLAT_ANGLED,
    AIRLINE_SEAT_INDIVIDUAL_SUITE,
    AIRLINE_SEAT_LEGROOM_EXTRA,
    AIRLINE_SEAT_LEGROOM_NORMAL,
    AIRLINE_SEAT_LEGROOM_REDUCED,
    AIRLINE_SEAT_RECLINE_EXTRA,
    AIRLINE_SEAT_RECLINE_NORMAL,
    BLUETOOTH_AUDIO,
    CONFIRMATION_NUMBER,
    DISC_FULL,
    DO_NOT_DISTURB,
    DO_NOT_DISTURB_ALT,
    DO_NOT_DISTURB_OFF,
    DO_NOT_DISTURB_ON,
    DRIVE_ETA,
    ENHANCED_ENCRYPTION,
    EVENT_AVAILABLE,
    EVENT_BUSY,
    EVENT_NOTE,
    FOLDER_SPECIAL,
    LIVE_TV,
    MMS,
    MORE,
    NETWORK_CHECK,
    NETWORK_LOCKED,
    NO_ENCRYPTION,
    ONDEMAND_VIDEO,
    PERSONAL_VIDEO,
    PHONE_BLUETOOTH_SPEAKER,
    PHONE_FORWARDED,
    PHONE_IN_TALK,
    PHONE_LOCKED,
    PHONE_MISSED,
    PHONE_PAUSED,
    POWER,
    PRIORITY_HIGH,
    RV_HOOKUP,
    SD_CARD,
    SIM_CARD_ALERT,
    SMS,
    SMS_FAILED,
    SYNC,
    SYNC_DISABLED,
    SYNC_PROBLEM,
    SYSTEM_UPDATE,
    TAP_AND_PLAY,
    TIME_TO_LEAVE,
    VIBRATION,
    VOICE_CHAT,
    VPN_LOCK,
    WC,
    WIFI;
    
    public static final String COLLECTION = "notification";
    
    public String collection() {
        return COLLECTION;
    }
}