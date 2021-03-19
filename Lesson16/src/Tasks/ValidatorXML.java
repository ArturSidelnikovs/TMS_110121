package Tasks;

/*Создать xml-файл, хранящий информацию об объектах предметной области ниже.
Для валидации полученного xml-файла необходимо разработать соответствующую xsd схему.
2. Произвести проверку XML-документа с помощью XSD.
 */

import org.xml.sax.SAXException;
import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;

public class ValidatorXML {

    public static void main(String[] args)  {
        String filename = "src/Tasks/File.xml";
        String schemaname = "src/Tasks/File.xsd";
        String logname = "log.txt";
        Schema schema = null;
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(language);

        try {
            schema = factory.newSchema(new File(schemaname));
            SAXParserFactory spf = SAXParserFactory.newInstance();

            spf.setSchema(schema);
            SAXParser parser = spf.newSAXParser();
            parser.parse(filename, new Handler(logname));
            System.out.println(filename + " is valid");
        } catch (ParserConfigurationException e) {
            System.err.println(filename + " config error: " + e.getMessage());
        } catch (SAXException e) {
            System.err.println(filename + " SAX error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }

    }

