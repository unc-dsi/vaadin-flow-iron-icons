package nc.unc.vaadin.flow.polymer.iron.icons;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@NpmPackage(value = "@polymer/iron-icons", version = IronIcons.VERSION)
@JsModule("@polymer/iron-icons/communication-icons.js")
public enum IronCommunicationIcons implements IronIconDefinition {
    BUSINESS,
    CALL,
    CALL_END,
    CALL_MADE,
    CALL_MERGE,
    CALL_MISSED,
    CALL_MISSED_OUTGOING,
    CALL_RECEIVED,
    CALL_SPLIT,
    CHAT,
    CHAT_BUBBLE,
    CHAT_BUBBLE_OUTLINE,
    CLEAR_ALL,
    COMMENT,
    CONTACT_MAIL,
    CONTACT_PHONE,
    CONTACTS,
    DIALER_SIP,
    DIALPAD,
    EMAIL,
    FORUM,
    IMPORT_CONTACTS,
    IMPORT_EXPORT,
    INVERT_COLORS_OFF,
    LIVE_HELP,
    LOCATION_OFF,
    LOCATION_ON,
    MAIL_OUTLINE,
    MESSAGE,
    NO_SIM,
    PHONE,
    PHONELINK_ERASE,
    PHONELINK_LOCK,
    PHONELINK_RING,
    PHONELINK_SETUP,
    PORTABLE_WIFI_OFF,
    PRESENT_TO_ALL,
    RING_VOLUME,
    RSS_FEED,
    SCREEN_SHARE,
    SPEAKER_PHONE,
    STAY_CURRENT_LANDSCAPE,
    STAY_CURRENT_PORTRAIT,
    STAY_PRIMARY_LANDSCAPE,
    STAY_PRIMARY_PORTRAIT,
    STOP_SCREEN_SHARE,
    SWAP_CALLS,
    TEXTSMS,
    VOICEMAIL,
    VPN_KEY;
    
    public static final String COLLECTION = "communication";
    
    public String collection() {
        return COLLECTION;
    }
}