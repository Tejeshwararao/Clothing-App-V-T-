package com.clothing;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/clothes")
public class ClothingServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Clothing Store</h2>");
        out.println("<ul>");
        out.println("<li>T-Shirt - ₹499</li>");
        out.println("<li>Jeans - ₹1299</li>");
        out.println("<li>Jacket - ₹2499</li>");
        out.println("</ul>");
        out.println("</body></html>");
    }
}
