package com.esliceu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("user".equals(username) && "1234".equals(password)){
            request.setAttribute("status","Ok!");
        } else {
            request.setAttribute("status","KO!");
        }

        request.getRequestDispatcher("loginStatus.jsp").forward(request,response);
    }
}
