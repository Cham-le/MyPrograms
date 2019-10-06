package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Entity.Room;

public class RoomDao {
	private Connection con;

	public RoomDao() {
		String dbUrl = "jdbc:postgresql://localhost:5432/Room";
		String dbClass = "org.postgresql.Driver";
		try {
			Class.forName(dbClass);
			con = DriverManager.getConnection(dbUrl, "postgres", "123456");
			System.out.println("connection success");
		} catch (Exception e) {
			System.out.println("connection faile");
			e.printStackTrace();
		}
	}

	public void addRoom(Room room) {
		String sql = "insert into public.\"Room\"(name,type,price, description) values(?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, room.getId());
			ps.setString(2, room.getName());
			ps.setString(3, room.getType());
			ps.setInt(4, room.getDisplayPrice());
			ps.setString(5, room.getDescription());
			if (ps.executeUpdate() > 0) {
				System.out.println("add room success");
			} else {
				System.out.println("add room fail");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		RoomDao dao = new RoomDao();
		Room room = new Room(5, "105", "twince", 4000, "nice");
		dao.addRoom(room);
	}
}
