package com.fonseca.airport_db.DAO;

import com.fonseca.airport_db.conexao.Conexao;
import com.fonseca.airport_db.entity.Airport;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AirportDAO {
    public void createAirport(Airport airport) {
        String sql = "INSERT INTO AIRPORTS (ICAO_Code, name, gateways, Country, Region, City) VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;
        try{
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, airport.getICAO_Code());
            ps.setString(2, airport.getName());
            ps.setInt(3, airport.getGateways());
            ps.setString(4, airport.getCountry());
            ps.setString(5, airport.getRegion());
            ps.setString(6, airport.getCity());

            ps.execute();
            ps.close();

        }catch(SQLException e){

            e.printStackTrace();

        }
    }

    public void updateAirport(Airport airport) {
        String sql = "UPDATE airports SET "
                + "ICAO_Code = ?,"
                + "name = ?,"
                + "gateways = ?,"
                + "country = ?,"
                + "region = ?,"
                + "city = ? WHERE airportID = ? ";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConnection().prepareStatement(sql);

            ps.setString(1, airport.getICAO_Code());
            ps.setString(2, airport.getName());
            ps.setInt(3, airport.getGateways());
            ps.setString(4, airport.getCountry());
            ps.setString(5, airport.getRegion());
            ps.setString(6, airport.getCity());

            ps.execute();
            ps.close();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
}
