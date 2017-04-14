package translated.valueobjects;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.junit.Test;

/**
 * Created by master on 4/14/17.
 */
public class TargetVOTest {

    @Test
    public void testMarshal() throws Exception {
        JAXBContext context = JAXBContext.newInstance(new Class[]{
                ActionVO.class,
                CriteriaVO.class,
                TargetVO.class,
                RootVO.class
        });

        Marshaller marshaller = context.createMarshaller();
        TargetVO tvo = new TargetVO();
        tvo.setName("xix");
        tvo.setType("asdf");
        tvo.getDepends().add(new CriteriaVO("asdf", "xxx"));
        tvo.getDepends().add(new CriteriaVO("a1sdf", "x1xx"));
        tvo.getExecutions().add(new ActionVO("3qwre", "3w3"));
        tvo.getExecutions().add(new ActionVO("13qwre", "31w3"));
        RootVO rvo = new RootVO();
        rvo.setContent(tvo);
        
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(rvo, System.out);
    }
}