package product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//mo ta san pham
public class ProductDescription extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getOutputStream().println("<html lang=\"en\">\n" +
                "<head>\n" +
                "    <title>Product Discount Calculator</title>\n" +
                "   <style>\n" +
                "        #content{\n" +
                "            width: 450px;\n" +
                "            margin: 0 auto;\n" +
                "            padding: 0px 20px 20px;\n" +
                "            background: white;\n" +
                "            border: 2px solid navy;\n" +
                "        }\n" +
                "\n" +
                "        h1{\n" +
                "            color: navy;\n" +
                "        }\n" +
                "\n" +
                "        label{\n" +
                "            width: 10em;\n" +
                "            padding-right: 1em;\n" +
                "            float: left;\n" +
                "        }\n" +
                "\n" +
                "        #data input{\n" +
                "            float: left;\n" +
                "            width: 15em;\n" +
                "            margin-bottom: .5em;\n" +
                "        }\n" +
                "\n" +
                "        #buttons input{\n" +
                "            float: left;\n" +
                "            margin-bottom: .5em;\n" +
                "        }\n" +
                "        br{\n" +
                "            clear: left;\n" +
                "        }\n" +
                "    </style>" +
                "</head>\n" +
                "<body>\n" +
                "<div id=\"content\">\n" +
                "    <h1>Product Discount Calculator</h1>\n" +
                "    <form method=\"post\" action=\"display_discount.php\">\n" +
                "        <div id=\"data\">\n" +
                "            <label>Product Description:</label>\n" +
                "            <input type=\"text\" name=\"description\"/><br/>\n" +
                "            <label>List Price:</label>\n" +
                "            <input type=\"text\" name=\"price\"/><br/>\n" +
                "            <label>Discount Percent:</label>\n" +
                "            <input type=\"text\" name=\"discount_percent\"/>(%)<br/>\n" +
                "        </div>\n" +
                "        <div id=\"buttons\">\n" +
                "            <label>&nbsp;</label>\n" +
                "            <input type=\"submit\" value=\"Calculate Discount\"/>\n" +
                "        </div>\n" +
                "    </form>\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
    }
}
