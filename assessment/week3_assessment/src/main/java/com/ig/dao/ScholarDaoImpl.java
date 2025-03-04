package com.ig.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ig.exception.ScholarNotFoundException;
import com.ig.model.Scholar;
import com.ig.util.DbUtil;

public class ScholarDaoImpl implements ScholarDao{
	private static Connection connection;
	
	public ScholarDaoImpl() {
        try {
			this.connection = DbUtil.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	@Override
	public List<Scholar> ListAllScholars() {
		List<Scholar> scl=new ArrayList<>();
		try {
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery("select * from Scholar");
			while(rs.next()) {
				scl.add(new Scholar(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return scl;
	}

	@Override
	public Scholar GetOneScholar(int scholarId) {
		String sql = "SELECT * FROM Scholar WHERE roll_number=?";
        try {
        	Connection connection = DbUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, scholarId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
			    return new Scholar(
			        rs.getInt("roll_number"),
			        rs.getString("Name"),
			        rs.getString("Email"),
			        rs.getString("Mobile")
			    );
			} else {
			    throw new ScholarNotFoundException("Scholar with ID " + scholarId + " not found.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ScholarNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void UpdateScholarEmail(int scholarId,String newEmail) {
		String sql = "UPDATE Scholar SET Email = ? WHERE roll_number = ?";
        try {
			try (Connection conn = DbUtil.getConnection();
			     PreparedStatement ps = conn.prepareStatement(sql)) {
			    ps.setString(1, newEmail);
			    ps.setInt(2, scholarId);
			    int updatedRows = ps.executeUpdate();
			    if (updatedRows == 0) {
			        throw new ScholarNotFoundException("Scholar with ID " + scholarId + " not found.");
			    }
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ScholarNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteScholarById(int scholarId) {
		String sql = "DELETE FROM Scholar WHERE roll_number=?";
        try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, scholarId);
			int rowsDeleted = ps.executeUpdate();
			if (rowsDeleted == 0) {
			    throw new ScholarNotFoundException("Scholar with ID " + scholarId + " not found.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ScholarNotFoundException e) {
			e.printStackTrace();
		}
    }

	@Override
	public void AddScholar(Scholar scholar) {
		String sql = "INSERT INTO Scholar (Name, Email, Mobile) VALUES (?, ?, ?)";
        try {
        	Connection connection = DbUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, scholar.getName());
			ps.setString(2, scholar.getEmail());
			ps.setString(3, scholar.getMobile());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}


