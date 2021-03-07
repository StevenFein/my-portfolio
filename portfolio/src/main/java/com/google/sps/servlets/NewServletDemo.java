package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

/** Handles requests sent to the /demo URL. Try running a server and navigating to /demo! */
@WebServlet("/demo")
public class NewServletDemo extends HttpServlet {

    private String convertToJsonUsingGson(String[] quotes) {
    Gson gson = new Gson();
    String json = gson.toJson(quotes);
    return json;
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    String[] quotes = {
                    "\"The way to get started is to quit talking and begin doing.\" -Walt Disney",
                    "\"If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success.\" -James Cameron",
                    "\"Tell me and I forget. Teach me and I remember. Involve me and I learn.\" -Benjamin Franklin"};

    String json = convertToJsonUsingGson(quotes);

    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
}