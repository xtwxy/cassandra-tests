package translated.valueobjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="RootVO")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RootVO", propOrder = {
    "content",
})
public class RootVO {

    @XmlElement(required = true)
    protected Object content;

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
}
