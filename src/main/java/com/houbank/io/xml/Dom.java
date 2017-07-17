package com.houbank.io.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class Dom {


    public static void main(String[] args) throws Exception{
        Dom dom=new Dom();
        dom.createXml("user2.xml");
        dom.parserXml("user.xml");
    }


    public void createXml(String fileName) throws ParserConfigurationException, TransformerException, FileNotFoundException {
        DocumentBuilderFactory factory = DocumentBuilderFactory
            .newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();

        Element root = document.createElement("employees");
        document.appendChild(root);
        Element employee = document.createElement("employee");
        Element name = document.createElement("name");
        name.appendChild(document.createTextNode("丁宏亮"));
        employee.appendChild(name);
        Element sex = document.createElement("sex");
        sex.appendChild(document.createTextNode("m"));
        employee.appendChild(sex);
        Element age = document.createElement("age");
        age.appendChild(document.createTextNode("30"));
        employee.appendChild(age);
        root.appendChild(employee);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        DOMSource source = new DOMSource(document);
        transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
        StreamResult result = new StreamResult(pw);
        transformer.transform(source, result);
        System.out.println("生成XML文件成功!");

    }

    public void parserXml(String fileName) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(fileName);
        NodeList employees = document.getChildNodes();
        for (int i = 0; i < employees.getLength(); i++) {
            Node employee = employees.item(i);
            NodeList employeeInfo = employee.getChildNodes();
            for (int j = 0; j < employeeInfo.getLength(); j++) {
                Node node = employeeInfo.item(j);
                NodeList employeeMeta = node.getChildNodes();
                for (int k = 0; k < employeeMeta.getLength(); k++) {
                    System.out.println(employeeMeta.item(k).getNodeName()
                        + ":" + employeeMeta.item(k).getTextContent());
                }
            }
        }
        System.out.println("解析完毕");

    }




}
