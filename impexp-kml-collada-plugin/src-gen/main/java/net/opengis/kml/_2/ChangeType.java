//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.18 um 03:45:53 PM CET 
//


package net.opengis.kml._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ChangeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ChangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractObjectGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeType", propOrder = {
    "abstractObjectGroup"
})
public class ChangeType {

    @XmlElementRef(name = "AbstractObjectGroup", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends AbstractObjectType>> abstractObjectGroup;

    /**
     * Gets the value of the abstractObjectGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractObjectGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractObjectGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FolderType }{@code >}
     * {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractContainerType }{@code >}
     * {@link JAXBElement }{@code <}{@link NetworkLinkType }{@code >}
     * {@link JAXBElement }{@code <}{@link PlacemarkType }{@code >}
     * {@link JAXBElement }{@code <}{@link ScreenOverlayType }{@code >}
     * {@link JAXBElement }{@code <}{@link PhotoOverlayType }{@code >}
     * {@link JAXBElement }{@code <}{@link GroundOverlayType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractOverlayType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemIconType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResourceMapType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link LodType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link ViewVolumeType }{@code >}
     * {@link JAXBElement }{@code <}{@link LatLonBoxType }{@code >}
     * {@link JAXBElement }{@code <}{@link ImagePyramidType }{@code >}
     * {@link JAXBElement }{@code <}{@link LatLonAltBoxType }{@code >}
     * {@link ScaleElement }
     * {@link JAXBElement }{@code <}{@link DataType }{@code >}
     * {@link JAXBElement }{@code <}{@link BalloonStyleType }{@code >}
     * {@link JAXBElement }{@code <}{@link ListStyleType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStyleType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolyStyleType }{@code >}
     * {@link JAXBElement }{@code <}{@link LabelStyleType }{@code >}
     * {@link JAXBElement }{@code <}{@link IconStyleType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractColorStyleType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSubStyleType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link ModelType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link RegionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkType }{@code >}
     * {@link JAXBElement }{@code <}{@link LookAtType }{@code >}
     * {@link JAXBElement }{@code <}{@link CameraType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractViewType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeStampType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeSpanType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimePrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link AliasType }{@code >}
     * {@link JAXBElement }{@code <}{@link StyleMapType }{@code >}
     * {@link JAXBElement }{@code <}{@link StyleType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractStyleSelectorType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link PairType }{@code >}
     * {@link JAXBElement }{@code <}{@link SchemaDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link LocationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractObjectType>> getAbstractObjectGroup() {
        if (abstractObjectGroup == null) {
            abstractObjectGroup = new ArrayList<JAXBElement<? extends AbstractObjectType>>();
        }
        return this.abstractObjectGroup;
    }

    public boolean isSetAbstractObjectGroup() {
        return ((this.abstractObjectGroup!= null)&&(!this.abstractObjectGroup.isEmpty()));
    }

    public void unsetAbstractObjectGroup() {
        this.abstractObjectGroup = null;
    }

    public void setAbstractObjectGroup(List<JAXBElement<? extends AbstractObjectType>> value) {
        this.abstractObjectGroup = value;
    }

}
