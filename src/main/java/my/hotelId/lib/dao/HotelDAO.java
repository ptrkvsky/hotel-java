package my.hotelId.lib.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import my.hotelId.model.Hotel;

public class HotelDAO extends DAO<Hotel> {
    public HotelDAO(Connection conn) {
        super(conn);
    }

    public boolean create(Hotel obj) {
        return false;
    }

    public boolean delete(Hotel obj) {
        return false;
    }

    public boolean update(Hotel obj) {
        return false;
    }

    public Hotel find(int nuhotel) {
        Hotel Hotel = new Hotel();

        try {
            ResultSet result = this.connect
                    .createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
                    .executeQuery("SELECT * FROM hotel WHERE nuhotel = " + nuhotel);
            if (result.first())
                Hotel = new Hotel(result.getInt("nuhotel"), result.getInt("nutypehotel"), result.getString("nomhotel"),
                        result.getString("adressehotel"), result.getString("cphotel"), result.getString("villehotel"));
            System.out.println(Hotel.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Hotel;
    }
}