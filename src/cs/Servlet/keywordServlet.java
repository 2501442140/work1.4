package cs.Servlet;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import cs.entity.keyword;
import cs.service.impl.keywordServiceDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "keywordServlet",urlPatterns = {"/keywordServlet"})
public class keywordServlet extends HttpServlet {
    int i=1;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String comm = request.getParameter("comm");
        keywordServiceDaoImpl ksi = new keywordServiceDaoImpl();
        if (comm.equals("list")) {
            try {
                List<keyword> list = ksi.keyFindAll();
                if (list != null) {
                    request.getSession().setAttribute("list", list);
                    response.sendRedirect("list.jsp");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        if (comm.equals("del")) {
            try {
                String name = request.getParameter("name");
                int x = ksi.keydel(name);
                if (x > 0) {
                    response.sendRedirect("keywordServlet?comm=list");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (comm.equals("添加")) {
            try {
                keyword kd = new keyword();
                String name = request.getParameter("name");
                String type = request.getParameter("type");
                String createDate = request.getParameter("createDate");
                SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = dateformat.parse(createDate);
                kd.setName(name);
                kd.setType(type);
                kd.setCreateDate(date);
                int x=ksi.keyadd(kd);
                if(x>0){
                    response.sendRedirect("keywordServlet?comm=list");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
