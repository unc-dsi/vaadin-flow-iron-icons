package nc.unc.vaadin.flow.polymer.iron.icons;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import nc.unc.vaadin.flow.polymer.iron.IronIconDefinition;

@JsModule("@polymer/iron-icons/editor-icons.js")
public enum IronEditorIcons implements IronIconDefinition {
    ATTACH_FILE,
    ATTACH_MONEY,
    BORDER_ALL,
    BORDER_BOTTOM,
    BORDER_CLEAR,
    BORDER_COLOR,
    BORDER_HORIZONTAL,
    BORDER_INNER,
    BORDER_LEFT,
    BORDER_OUTER,
    BORDER_RIGHT,
    BORDER_STYLE,
    BORDER_TOP,
    BORDER_VERTICAL,
    BUBBLE_CHART,
    DRAG_HANDLE,
    FORMAT_ALIGN_CENTER,
    FORMAT_ALIGN_JUSTIFY,
    FORMAT_ALIGN_LEFT,
    FORMAT_ALIGN_RIGHT,
    FORMAT_BOLD,
    FORMAT_CLEAR,
    FORMAT_COLOR_FILL,
    FORMAT_COLOR_RESET,
    FORMAT_COLOR_TEXT,
    FORMAT_INDENT_DECREASE,
    FORMAT_INDENT_INCREASE,
    FORMAT_ITALIC,
    FORMAT_LINE_SPACING,
    FORMAT_LIST_BULLETED,
    FORMAT_LIST_NUMBERED,
    FORMAT_PAINT,
    FORMAT_QUOTE,
    FORMAT_SHAPES,
    FORMAT_SIZE,
    FORMAT_STRIKETHROUGH,
    FORMAT_TEXTDIRECTION_L_TO_R,
    FORMAT_TEXTDIRECTION_R_TO_L,
    FORMAT_UNDERLINED,
    FUNCTIONS,
    HIGHLIGHT,
    INSERT_CHART,
    INSERT_COMMENT,
    INSERT_DRIVE_FILE,
    INSERT_EMOTICON,
    INSERT_INVITATION,
    INSERT_LINK,
    INSERT_PHOTO,
    LINEAR_SCALE,
    MERGE_TYPE,
    MODE_COMMENT,
    MODE_EDIT,
    MONETIZATION_ON,
    MONEY_OFF,
    MULTILINE_CHART,
    PIE_CHART,
    PIE_CHART_OUTLINED,
    PUBLISH,
    SHORT_TEXT,
    SHOW_CHART,
    SPACE_BAR,
    STRIKETHROUGH_S,
    TEXT_FIELDS,
    TITLE,
    VERTICAL_ALIGN_BOTTOM,
    VERTICAL_ALIGN_CENTER,
    VERTICAL_ALIGN_TOP,
    WRAP_TEXT;
    
    public static final String COLLECTION = "editor";
    
    public String collection() {
        return COLLECTION;
    }
}
