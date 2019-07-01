package com.esliceu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("user".equals(username) && "1234".equals(password)){
            //El paràmetre true força a crear la sessió
            HttpSession session = request.getSession(true);
            session.setAttribute("auth",true);

            request.setAttribute("status","Ok!");
        } else {
            request.setAttribute("status","KO!");
        }

        request.getRequestDispatcher("loginStatus.jsp").forward(request,response);
    }
}
