package org.example.String;

import java.util.Stack;

public class XmlParser {

//    Write a XML/HTML Parser Given: <a><b><c><d>MyText</d></c>AnotherText</b>Final</a>
//    Return The formatted version of the same and also to get the text from the json.
//    How can you improve it if we need to put styles, url and other related properties in it.

    public static void main(String[] args) {
        String xmlString = "<a><b><c><d>MyText</d></c>AnotherText</b>Final</a>";
        String formattedXml = parseAndFormatXml(xmlString);
        System.out.println(formattedXml);
    }

    public static String parseAndFormatXml(String xml) {
        StringBuilder result = new StringBuilder();
        Stack<String> stack = new Stack<>();
        int indent = 0;

        for (int i = 0; i < xml.length(); i++) {
            if (xml.charAt(i) == '<') {
                int endIndex = xml.indexOf('>', i);
                if (endIndex != -1) {
                    String tag = xml.substring(i + 1, endIndex);
                    boolean isClosingTag = tag.startsWith("/");
                    if (isClosingTag) {
                        indent -= 2;
                        stack.pop();
                    }

                    String indentSpaces = " ".repeat(indent);
                    result.append("\n").append(indentSpaces);
                    result.append("<").append(tag).append(">");

                    if (!isClosingTag) {
                        stack.push(tag);
                        indent += 2;
                    }

                    i = endIndex;
                }
            } else {
                int endIndex = xml.indexOf('<', i);
                if (endIndex == -1) {
                    endIndex = xml.length();
                }
                String text = xml.substring(i, endIndex).trim();
                if (!text.isEmpty()) {
                    result.append(text);
                }
                i = endIndex - 1;
            }
        }

        return result.toString();
    }
}
