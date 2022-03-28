package nc.unc.vaadin.flow.polymer.iron.icons;

import com.vaadin.flow.component.dependency.JsModule;
import nc.unc.vaadin.flow.polymer.iron.IronIconDefinition;

@JsModule("@polymer/iron-icons/places-icons.js")
public enum IronPlacesIcons implements IronIconDefinition {
    AC_UNIT,
    AIRPORT_SHUTTLE,
    ALL_INCLUSIVE,
    BEACH_ACCESS,
    BUSINESS_CENTER,
    CASINO,
    CHILD_CARE,
    CHILD_FRIENDLY,
    FITNESS_CENTER,
    FREE_BREAKFAST,
    GOLF_COURSE,
    HOT_TUB,
    KITCHEN,
    POOL,
    ROOM_SERVICE,
    RV_HOOKUP,
    SMOKE_FREE,
    SMOKING_ROOMS,
    SPA;
    
    public static final String COLLECTION = "places";
    
    public String collection() {
        return COLLECTION;
    }
}
