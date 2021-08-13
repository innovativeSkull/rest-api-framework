package rest.listener.custom.html;

public class CSSManager {

    public static String getStyleSheetAsString() {

        String cssText = "";

        cssText += ".bg-bluepurple { \n" +
                "                background: linear-gradient(120deg, #008B8B, #1E90FF,#4B0082);\n" +
                "                overflow: hidden;\n" +
                "                box-shadow: 2px 2px 3px #393939;\n" +
                "            }\n" +
                "\n" +
                "            .bg-white-shadowbox {\n" +
                "                background-color: #ffffff;\n" +
                "                box-shadow: 2px 2px 3px #393939;\n" +
                "                overflow: hidden;\n" +
                "            }\n" +
                "\n" +
                "            .bg-white-shadowbox-inset {\n" +
                "                background-color: #ffffff;\n" +
                "                box-shadow: 2px 2px 3px #acacac inset;\n" +
                "                overflow: hidden;\n" +
                "            }\n" +
                "\n" +
                "            .text-blue { \n" +
                "                color : #003477;\n" +
                "                \n" +
                "            }\n" +
                "            \n" +
                "            .text-blue-dark { \n" +
                "                color : #00224e;\n" +
                "                text-shadow: 2px 2px 2px #214a6e;\n" +
                "            }\n" +
                "\n" +
                "            .text-purple { \n" +
                "                color : #340044;  \n" +
                "            }\n" +
                "\n" +
                "            .text-status-success {\n" +
                "                font-weight: bolder;\n" +
                "                font-size: 15px;\n" +
                "                color : #00744d;\n" +
                "                text-shadow: 2px 2px 2px #98ffe5;\n" +
                "            }\n" +
                "\n" +
                "            .text-normal-plain {\n" +
                "                font-weight: normal;\n" +
                "                font-size: 12px;\n" +
                "                color: #2b2b2b;\n" +
                "            }\n" +
                "\n" +
                "            .title-header{\n" +
                "                font-size: 25px;\n" +
                "                font-weight: 600;\n" +
                "            }\n" +
                "\n" +
                "            .title-box {\n" +
                "                font-size: 20px; \n" +
                "                font-weight: 400;\n" +
                "            }";

        return cssText;
    }
}
