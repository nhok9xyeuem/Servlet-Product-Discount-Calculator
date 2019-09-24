package product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DisplayDiscount extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float price = Float.parseFloat(req.getParameter("price"));
        float discount = Float.parseFloat(req.getParameter("discount_percent"));
        String productDescription = req.getParameter("description");
        float discountAmount = price * discount / 100;

        float discountPrice = price - discountAmount;

        resp.getOutputStream().println("<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Product Discount Calculator</title>\n" +
                "    <style>\n" +
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
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div id=\"content\">\n" +
                "    <h1>Product Discount Calculator</h1>\n" +
                "    <label>Product Description: </label>\n" +
                "    <span >"+productDescription+"</span><br/>\n" +
                "    <label>Price: </label>\n" +
                "    <span>$"+price+"</span><br/>\n" +
                "    <label>Discount Percent: </label>\n" +
                "    <span>%"+discount+"</span><br/>\n" +
                "    <label>Discount Amount: </label>\n" +
                "    <span>$"+discountPrice+"</span><br/>\n" +
                "    <label>Discount Price: </label>\n" +
                "    <span>$"+discountAmount+"</span><br/>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");

//        PrintWriter writer = resp.getWriter();
//        writer.println("Discount Price :" + discountPrice);
//        writer.println("Discount Amount :" + discountAmount);
    }
}