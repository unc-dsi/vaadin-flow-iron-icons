# Polymer's icons definitions for Vaadin

Provides an easy way to include [Polymer iron-icons](https://github.com/PolymerElements/iron-icons) inside Vaadin applications.

## Usage

* Use your dependencies manager to include this library. Example with Maven:
```
<dependency>
    <groupId>nc.unc.vaadin.flow.polymer</groupId>
    <artifactId>iron-icons</artifactId>
    <version>${iron-icons.version}</version>
</dependency>
```
* Each collection belongs on this own enumeration named by following pattern : `Iron[Collection]Icons`.
For example, communication icons are defined in `IronCommunicationIcons` enumeration.
The collection named 'icons' is defined in `IronIcons` enumeration.

* To create an Vaadin `Icon` component, you must use the `create` method. Examples: 
```
new Button("Save", IronIcons.SAVE.create());
new Span(IronSocialIcons.SCHOOL.create(), "Congratulations ! Your are graduated.");
```

