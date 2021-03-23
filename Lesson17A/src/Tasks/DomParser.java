package Tasks;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DomParser {

    public List<LibraryOfBooks> writeBooksFromXML() {
        List<LibraryOfBooks> bookList = new ArrayList<>();

        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = builder.parse("src/Tasks/Library.xml");
            Node root = ((org.w3c.dom.Document) document).getDocumentElement();
            NodeList books = root.getChildNodes();

            LibraryOfBooks book1 = new LibraryOfBooks();
            for (int i = 0; i < books.getLength(); i++) {
                Node book = books.item(i);

                if (book.getNodeName().equalsIgnoreCase("book")) {

                    NodeList bookChildNodes = book.getChildNodes();

                    for (int j = 0; j < bookChildNodes.getLength(); j++) {
                        Node bookNode = bookChildNodes.item(j);

                        if (bookNode.getNodeName().equalsIgnoreCase("name")) {
                            book1.setName(bookNode.getTextContent());
                        }

                        if (bookNode.getNodeName().equalsIgnoreCase("author")) {
                            book1.setAuthor(bookNode.getTextContent());
                        }
                        if (bookNode.getNodeName().equalsIgnoreCase("genre")) {
                            book1.setGenre(bookNode.getTextContent());

                        }
                        if (bookNode.getNodeName().equalsIgnoreCase("year")) {
                            book1.setYear(Integer.parseInt(bookNode.getTextContent()));
                        }
                        if (bookNode.getNodeName().equalsIgnoreCase("material")) {
                            book1.setMaterial(bookNode.getTextContent());
                        }

                        if (bookNode.getNodeName().equalsIgnoreCase("type")) {
                            book1.setType(bookNode.getTextContent());
                        }
                        bookList.add(book1);
                    }
                }

            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return bookList;
    }
}
