package HomeWork2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();



        try {
            File file = new File("C:\\Users\\User\\IdeaProjects\\Web\\src\\main\\java\\HomeWork2\\candies.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Factory.class);

            Marshaller mar = jaxbContext.createMarshaller();
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

            Unmarshaller unmar = jaxbContext.createUnmarshaller();
            factory = (Factory) unmar.unmarshal(file);
            System.out.println(factory);

            factory.add(new Candy("red","raspberries","round"));

            mar.marshal(factory,file);
            mar.marshal(factory,System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
