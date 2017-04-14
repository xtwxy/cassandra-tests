package translated.valueobjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriaVO", propOrder = {
	    "name",
	    "type"
	})
public class CriteriaVO {
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String type;

    public CriteriaVO() {
	}

	public CriteriaVO(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
