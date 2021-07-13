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
import java.io.FileOutputStream;
import java.io.File;

public class AutoCPN{
    private Document doc;
	private Element page;
    private float posattrx, posattry;
    private int lastID;
    private Element cpnet;
    AutoCPN()throws JDOMException{
        lastID=100;
        doc = getSAXParsedDocument("1.cpn");
        Element rootNode = doc.getRootElement();
        cpnet = rootNode.getChild("cpnet");
        page = cpnet.getChild("page");
        posattrx=posattry=100;  
    }

    public void addPlace(String s){
        Element place = new Element("place").setAttribute("id", s);
		place.addContent(new Element("text").setText(s));
        Element pos= new Element("posattr").setAttribute("x",String.valueOf(posattrx));
        pos.setAttribute("y",String.valueOf(posattrx));
        place.addContent(pos);        
        posattrx+=20;
		page.addContent(place);
    }
    public void addTrans(String s){
        Element tr = new Element("trans").setAttribute("id", s);
		tr.addContent(new Element("text").setText(s));
        Element pos= new Element("posattr").setAttribute("x",String.valueOf(posattrx));
        pos.setAttribute("y",String.valueOf(posattrx));
        tr.addContent(pos);
        posattrx+=20;
		page.addContent(tr);
    }

    //orientation==> true:TtoP   false:PtoT
    public void addArc(Boolean orientation, String transendID, String placeendID, String annotText){
        String id6=getNewID();
        Element arc = new Element("arc").setAttribute("id",id6 );
        if(orientation) arc.setAttribute("orientation","TtoP");
        else arc.setAttribute("orientation","PtoT");
        arc.addContent(new Element("placeend").setAttribute("idref", placeendID));
        arc.addContent(new Element("transend").setAttribute("idref", transendID));
        id6=getNewID();
        Element annot= new Element("annot").setAttribute("id", id6);
		annot.addContent(new Element("text").setText(annotText));
        arc.addContent(annot);
		page.addContent(arc);
    }

     public void addVar(){
         Element globbox= cpnet.getChild("globbox");
         Element block1 = globbox.getChildren("block").get(1);
         
     }
    public void writeCPN(OutputStream output) throws IOException {
        XMLOutputter xmlOutputter = new XMLOutputter();
        // change xml encoding
        xmlOutputter.setFormat(Format.getPrettyFormat().setEncoding("ISO-8859-1"));
        //xmlOutputter.setFormat(Format.getPrettyFormat());
        xmlOutputter.output(doc, output);

        // output to any OutputStream
        try(FileOutputStream fileOutputStream =
                    new FileOutputStream("out.cpn")){
            xmlOutputter.output(doc, fileOutputStream);
        }

    }

    private static Document getSAXParsedDocument(final String fileName) 
    {
        SAXBuilder builder = new SAXBuilder(); 
        Document document = null;
        try
        {
            document = builder.build(fileName);
        } 
        catch (JDOMException | IOException e) 
        {
            e.printStackTrace();
        }
        return document;
    }

    private String  getNewID(){
        lastID++;
        return "ID"+lastID;
    }

}