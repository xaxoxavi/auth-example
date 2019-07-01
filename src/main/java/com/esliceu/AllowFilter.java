package com.esliceu;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter({"/recursProtegit.jsp","/recursProtegit2.jsp"})
public class AllowFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpSession session = null;
        session = request.getSession(false);
        if (session == null || session.getAttribute("auth") == null){
            response.sendRedirect("/login.jsp");
        } else {
            chain.doFilter(request,response);
        }


    }
}
