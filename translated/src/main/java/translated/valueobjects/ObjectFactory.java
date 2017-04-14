package translated.valueobjects;

import javax.xml.bind.annotation.XmlRegistry;


@XmlRegistry
public class ObjectFactory {


    public ObjectFactory() {
    }

    public TargetVO createTargetVO() {
        return new TargetVO();
    }

    public CriteriaVO createCriteriaVO() {
        return new CriteriaVO();
    }

    public ActionVO createActionVO() {
        return new ActionVO();
    }

}
