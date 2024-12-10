package com.fonseca.airport_db.DAO;

import com.fonseca.airport_db.conexao.Conexao;
import com.fonseca.airport_db.entity.Enterprise;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnterpriseDAO {
    public void createEnterprise(Enterprise enterprise) {
        String sql = "INSERT INTO ENTERPRISES (name) VALUES (?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1,"tony");
            System.out.println(enterprise.getName());
            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}