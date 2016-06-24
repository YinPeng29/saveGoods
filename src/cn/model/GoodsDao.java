package cn.model;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.PreparedStatement;

public class GoodsDao{
	//数据库连接所用变量
	public String driverName = "com.mysql.jdbc.Driver";
	public String url = "jdbc:mysql://localhost:3306/db_bookinfo";
	public String username = "root";
	public String password = "root";
	public void saveGoods(Goods goods){
		try{
			Class.forName(driverName);
			Connection connection = DriverManager.getConnection(url,username,password);
			//sql 语句
			String sql = "insert into tb_goods(name,price,description) values(?,?,?)";
			//这里要进行类型转换
			PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, goods.getName());
			ps.setDouble(2, goods.getPrice());
			ps.setString(3,goods.getDescription());
			ps.executeUpdate();     	//更新操作
			ps.close();					//关闭ps
			connection.close();			//关闭连接
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
