//package SmartBizzk.SmartBizzk.entity;
//
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.NodeList;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import java.io.ByteArrayInputStream;
//import java.nio.charset.StandardCharsets;
//
//public class XMLParser {
//
//    public static void main(String[] args) {
//        String xml = """
//            <stock>
//                <item>
//                    <name>Pen</name>
//                    <quantity>100</quantity>
//                </item>
//                <item>
//                    <name>Notebook</name>
//                    <quantity>50</quantity>
//                </item>
//            </stock>
//        """;
//
//        try {
//            // Create a factory and builder
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = factory.newDocumentBuilder();
//
//            // Parse the XML string
//            Document doc = builder.parse(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)));
//
//            // Normalize and read elements
//            doc.getDocumentElement().normalize();
//            NodeList items = doc.getElementsByTagName("item");
//
//            for (int i = 0; i < items.getLength(); i++) {
//                Element item = (Element) items.item(i);
//                String name = item.getElementsByTagName("name").item(0).getTextContent();
//                String quantity = item.getElementsByTagName("quantity").item(0).getTextContent();
//
//                System.out.println("Item: " + name + ", Quantity: " + quantity);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
