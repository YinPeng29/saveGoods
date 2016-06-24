package contro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.model.Goods;
import cn.model.GoodsDao;

/**
 * Servlet implementation class GoodsServlet
 */
@WebServlet("/GoodsServlet")
public class GoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//设置request编码
		request.setCharacterEncoding("UTF-8");
		//设置response 编码
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		//商品的信息以字符串的形式获取所以price 是String 类型的 后面进行类型的转换
		String price = request.getParameter("price");
		String description = request.getParameter("description");
		Goods goods = new Goods();
		goods.setName(name);
		goods.setPrice(Double.valueOf(price));
		goods.setDescription(description);
		GoodsDao goodsDao = new GoodsDao();
		goodsDao.saveGoods(goods);  //保存商品的信息
		out.println("商品信息保存成功");
		out.flush();
		out.close();
	}
}
