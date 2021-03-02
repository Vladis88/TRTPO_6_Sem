package by.bsuir.project.action;

import by.bsuir.project.exception.PersistentException;
import by.bsuir.project.util.Constant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class MainAction extends AuthorizedUserAction {
    @Override
    public Forward exec(HttpServletRequest request, HttpServletResponse response) throws PersistentException {
        @SuppressWarnings("unchecked")
        List<MenuItem> menu = (List<MenuItem>)request.getSession(false).getAttribute(Constant.MENU);
        return new Forward(menu.get(0).getUrl());
    }
}
