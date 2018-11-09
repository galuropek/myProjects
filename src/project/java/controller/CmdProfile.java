package project.java.controller;

import project.java.beans.Car;
import project.java.beans.Order;
import project.java.beans.User;
import project.java.dao.Dao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class CmdProfile extends Cmd {

    @Override
    public Cmd execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException, ServletException {
        User user = Util.getUser(req);
        if (user == null) {
            return Action.LOGIN.cmd;
        }

        if (Form.isPost(req)) {
            if (req.getParameter("update") != null) {
                user.setLogin(req.getParameter("login"));
                user.setEmail(req.getParameter("email"));
                user.setPassword(req.getParameter("password"));
                Util.saveImage(req, "user" + user.getID());
                Dao.getDao().user.update(user);
                return Action.PROFILE.cmd;
            } else if (req.getParameter("edit") != null) {
                return Action.EDITUSERS.cmd;
            } else if (req.getParameter("logout") != null) {
                HttpSession session = req.getSession();
                session.invalidate();
                return Action.LOGIN.cmd;
            } else if (req.getParameter("editOrders") != null) {
                return Action.EDITORDERS.cmd;
            } else if (req.getParameter("editCarList") != null) {
                return Action.EDITCARLIST.cmd;
            }
        }

        HttpSession session = req.getSession();
        List<Order> orders = Dao.getDao().order.getAll(String.format(" WHERE `users_id`= %d ", user.getID()));
        session.setAttribute("orders", orders);

        List<Car> cars = Dao.getDao().car.getAll();
        session.setAttribute("cars", cars);

        String where = " WHERE `Reserved`= 'false' ";
        List<Car> freeCars = Dao.getDao().car.getAll(where);
        if (freeCars.size() > 0) {
            session.setAttribute("freeCars", freeCars);
            session.setAttribute("carExist", "true");
        }
        else
            session.setAttribute("carExist", "false");
        return null;
    }
}
