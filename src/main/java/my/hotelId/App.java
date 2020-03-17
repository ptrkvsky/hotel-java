package my.hotelId;

import my.hotelId.lib.connect.PostgreSQLJDBC;
import my.hotelId.lib.dao.DAO;
import my.hotelId.lib.dao.HotelDAO;
import my.hotelId.model.Hotel;
import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Connection instanceConnect = PostgreSQLJDBC.connect();
        System.out.println("Hello World!");

        DAO<Hotel> hotelDao = new HotelDAO(instanceConnect);
        hotelDao.find(1);
    }
}
