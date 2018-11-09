package project.java.controller;

import javax.servlet.http.HttpServletRequest;

class ActionsResolver {

    Action resolve(HttpServletRequest req) {
        Action result = Action.ERROR;
        String command = req.getParameter("command");
        try {
            result = Action.valueOf(command.toUpperCase());
        } catch (IllegalArgumentException e) {
            req.setAttribute("message", e.toString());
//            result = Action.ERROR;
//            message to error.jsp
        }
        return result;
    }
}
