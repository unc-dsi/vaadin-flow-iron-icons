package nc.unc.vaadin.flow.polymer.iron;

import com.vaadin.flow.component.dependency.NpmPackage;

@NpmPackage(value = "@polymer/iron-icons", version = IronIconDefinition.VERSION)
public interface IronIconDefinition {
    String VERSION = "3.0.1";
    
    String collection();
    
    default String icon() {
        String name = this.name();
        if (this.name().startsWith("_")) {
            name = name.substring(1);
        }
        return name.toLowerCase().replace('_', '-');
    }
    
    default IronIcon create() {
        return new IronIcon(collection(), icon());
    }

    String name();
}
