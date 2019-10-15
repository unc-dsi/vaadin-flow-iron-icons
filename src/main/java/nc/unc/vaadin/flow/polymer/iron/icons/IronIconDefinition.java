package nc.unc.vaadin.flow.polymer.iron.icons;

import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.IconFactory;

public interface IronIconDefinition extends IconFactory {
    public static final String VERSION = "3.0.1";
    
    public String collection();
    
    public default String icon() {
        String name = this.name();
        if (this.name().startsWith("_")) {
            name = name.substring(1);
        }
        return name.toLowerCase().replace('_', '-');
    }
    
    public default Icon create() {
        return new Icon(collection(), icon());
    }

    String name();
}
