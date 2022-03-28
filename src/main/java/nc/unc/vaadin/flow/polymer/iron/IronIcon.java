package nc.unc.vaadin.flow.polymer.iron;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("iron-icon")
@NpmPackage(value = "@polymer/iron-icon", version = IronIcon.VERSION)
@JsModule("@polymer/iron-icon/iron-icon.js")
public class IronIcon extends Component {
    public static final String VERSION = "3.0.1";

    public IronIcon(String collection, String icon) {
        super();
        this.getElement().setAttribute("icon", collection + ":" + icon);
    }
}
