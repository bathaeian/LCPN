import org.jdom2.CDATA;
import org.jdom2.Comment;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
public class AutoCPN{
    private Document doc;
	private Element page;
    AutoCPN()throws JDOMException{
        doc = new Document();
        doc.setRootElement(new Element("workspaceElements"));
		page = new Element("page");
		doc.getRootElement().addContent(page);
    }

    public void addPlace(String s){
        Element place = new Element("place").setAttribute("id", s);
		place.addContent(new Element("text").setText(s));
		page.addContent(place);
    }

    public void writeCPN(OutputStream output) throws IOException {
        XMLOutputter xmlOutputter = new XMLOutputter();
        // change xml encoding
        xmlOutputter.setFormat(Format.getPrettyFormat().setEncoding("ISO-8859-1"));
        //xmlOutputter.setFormat(Format.getPrettyFormat());
        xmlOutputter.output(doc, output);

        // output to any OutputStream
        /*try(FileOutputStream fileOutputStream =
                    new FileOutputStream("c:\\test\\file.xml")){
            xmlOutputter.output(doc, fileOutputStream);
        }*/

        // output to any Writer
        /*try(FileWriter fileWriter =
                    new FileWriter("c:\\test\\file.xml")){
            xmlOutputter.output(doc, fileWriter);
        }*/
    }

}