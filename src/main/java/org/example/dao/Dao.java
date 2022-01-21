package org.example.dao;

import org.example.model.Cities;
import org.example.model.Country;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dao {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "54321";

    public static Connection connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static List<Country> printCountry() {
        System.out.println("1  Country");
        ArrayList<Country> country = new ArrayList<>();
        String SQL = "SELECT * FROM country";
        try (Connection conn = connection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                country.add(new Country(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("language"),
                        rs.getString("countryArea"),
                        rs.getString("population"),
                        rs.getString("presidents")));
            }
            return country;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return country;
    }
    public static List<Cities> printCities() {
        System.out.println("2  Cities");
        ArrayList<Cities> cities = new ArrayList<>();
        String SQL = "SELECT * FROM cities";
        try (Connection conn = connection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                cities.add(new Cities(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("population"),
                        rs.getString("cityArea"),
                        rs.getString("mayors")));
            }
            return cities;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static void printIdCountry(int id) throws SQLException {
        try (PreparedStatement preparedStatement = connection().prepareStatement
                ("select * from country where id=(?)")) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                int Id = rs.getInt("id");
                String name = rs.getString("name");
                String language = rs.getString("language");
                String countryArea = rs.getString("countryArea");
                String population = rs.getString("population");
                String presidents = rs.getString("presidents");

                System.out.println(Id);
                System.out.println(name);
                System.out.println(language);
                System.out.println(countryArea);
                System.out.println(population);
                System.out.println(presidents);
            }

        } finally {
            connection().close();
        }
    }
    public static void printIdCities(int id) throws SQLException {
        try (PreparedStatement preparedStatement = connection().prepareStatement
                ("select * from cities where id=(?)")) {
            preparedStatement.setInt(1
                    , id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                int Id = rs.getInt("id");
                String name = rs.getString("name");
                String population = rs.getString("population");
                String cityArea = rs.getString("cityArea");
                String mayors = rs.getString("mayors");
                System.out.println(Id);
                System.out.println(name);
                System.out.println(population);
                System.out.println(cityArea);
                System.out.println(mayors);
            }

        } finally {
            connection().close();
        }
    }
}
