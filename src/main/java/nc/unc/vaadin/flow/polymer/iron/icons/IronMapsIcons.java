package nc.unc.vaadin.flow.polymer.iron.icons;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import nc.unc.vaadin.flow.polymer.iron.IronIconDefinition;

@JsModule("@polymer/iron-icons/maps-icons.js")
public enum IronMapsIcons implements IronIconDefinition {
    ADD_LOCATION,
    BEENHERE,
    DIRECTIONS,
    DIRECTIONS_BIKE,
    DIRECTIONS_BOAT,
    DIRECTIONS_BUS,
    DIRECTIONS_CAR,
    DIRECTIONS_RAILWAY,
    DIRECTIONS_RUN,
    DIRECTIONS_SUBWAY,
    DIRECTIONS_TRANSIT,
    DIRECTIONS_WALK,
    EDIT_LOCATION,
    EV_STATION,
    FLIGHT,
    HOTEL,
    LAYERS,
    LAYERS_CLEAR,
    LOCAL_ACTIVITY,
    LOCAL_AIRPORT,
    LOCAL_ATM,
    LOCAL_BAR,
    LOCAL_CAFE,
    LOCAL_CAR_WASH,
    LOCAL_CONVENIENCE_STORE,
    LOCAL_DINING,
    LOCAL_DRINK,
    LOCAL_FLORIST,
    LOCAL_GAS_STATION,
    LOCAL_GROCERY_STORE,
    LOCAL_HOSPITAL,
    LOCAL_HOTEL,
    LOCAL_LAUNDRY_SERVICE,
    LOCAL_LIBRARY,
    LOCAL_MALL,
    LOCAL_MOVIES,
    LOCAL_OFFER,
    LOCAL_PARKING,
    LOCAL_PHARMACY,
    LOCAL_PHONE,
    LOCAL_PIZZA,
    LOCAL_PLAY,
    LOCAL_POST_OFFICE,
    LOCAL_PRINTSHOP,
    LOCAL_SEE,
    LOCAL_SHIPPING,
    LOCAL_TAXI,
    MAP,
    MY_LOCATION,
    NAVIGATION,
    NEAR_ME,
    PERSON_PIN,
    PERSON_PIN_CIRCLE,
    PIN_DROP,
    PLACE,
    RATE_REVIEW,
    RESTAURANT,
    RESTAURANT_MENU,
    SATELLITE,
    STORE_MALL_DIRECTORY,
    STREETVIEW,
    SUBWAY,
    TERRAIN,
    TRAFFIC,
    TRAIN,
    TRAM,
    TRANSFER_WITHIN_A_STATION,
    ZOOM_OUT_MAP;
    
    public static final String COLLECTION = "maps";
    
    public String collection() {
        return COLLECTION;
    }
}
