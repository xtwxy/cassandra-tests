package translated.valueobjects;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetVO", propOrder = {
    "name",
    "type",
    "depends",
    "executions"
})
public class TargetVO {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected List<CriteriaVO> depends;
    @XmlElement(required = true)
    protected List<ActionVO> executions;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public List<CriteriaVO> getDepends() {
        if (depends == null) {
            depends = new ArrayList<CriteriaVO>();
        }
        return this.depends;
    }

    public List<ActionVO> getExecutions() {
        if (executions == null) {
            executions = new ArrayList<ActionVO>();
        }
        return this.executions;
    }

	public void setDepends(List<CriteriaVO> depends) {
		this.depends = depends;
	}

	public void setExecutions(List<ActionVO> executions) {
		this.executions = executions;
	}

}
