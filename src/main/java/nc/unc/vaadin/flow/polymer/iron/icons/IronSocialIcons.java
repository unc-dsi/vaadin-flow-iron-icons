package nc.unc.vaadin.flow.polymer.iron.icons;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@NpmPackage(value = "@polymer/iron-icons", version = IronIcons.VERSION)
@JsModule("@polymer/iron-icons/social-icons.js")
public enum IronSocialIcons implements IronIconDefinition {
    CAKE,
    DOMAIN,
    GROUP,
    GROUP_ADD,
    LOCATION_CITY,
    MOOD,
    MOOD_BAD,
    NOTIFICATIONS,
    NOTIFICATIONS_ACTIVE,
    NOTIFICATIONS_NONE,
    NOTIFICATIONS_OFF,
    NOTIFICATIONS_PAUSED,
    PAGES,
    PARTY_MODE,
    PEOPLE,
    PEOPLE_OUTLINE,
    PERSON,
    PERSON_ADD,
    PERSON_OUTLINE,
    PLUS_ONE,
    POLL,
    PUBLIC,
    SCHOOL,
    SENTIMENT_DISSATISFIED,
    SENTIMENT_NEUTRAL,
    SENTIMENT_SATISFIED,
    SENTIMENT_VERY_DISSATISFIED,
    SENTIMENT_VERY_SATISFIED,
    SHARE,
    WHATSHOT;
    
    public static final String COLLECTION = "social";
    
    public String collection() {
        return COLLECTION;
    }
}