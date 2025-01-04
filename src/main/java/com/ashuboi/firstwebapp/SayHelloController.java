package com.ashuboi.firstwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    //"say-hello" = "Hello! What are you learning today?"

    //say-hello
    @RequestMapping("say-hello")
    @ResponseBody //Spring framework expects to return this as a view so we need to add @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    //say-hello
    @RequestMapping("say-hello-html")
    @ResponseBody //Spring framework expects to return this as a view so we need to add @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My first HTML Page- Changed</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My First Html page with body");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }// Now this is not scalable because we will have to write 200-300 lines of sb.append to write production html
    // so we make the use of view


    // create sayHello.jsp
    // we want tp redirect "say-hello-jsp" => sayHello.jsp
    @RequestMapping("say-hello-jsp")
    @ResponseBody
    public String sayHelloJsp() {
        return "sayHello";
    }
}
