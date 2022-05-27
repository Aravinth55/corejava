package com.chainsys.miniproject.dao;

import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.pojo.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DoctorDao {
	private static Connection getConnection() {
		String drivername = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "Aravinth552000";
		try {
			Class.forName(drivername);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	private static java.sql.Date convertTosqlDate(java.util.Date date) {
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		return sqldate;

	}

	// To insert new row to the table Doctor
	public static int insertDoctor(Doctor newdoc) {
		String insertquery = "insert into Doctor(ID,NAME,DOB,SPACIALITY,CITY,PHONE_NO,STANDARD_FEES) values (?,?,?,?,?,?,?)";
		Connection con = null;
		int rows = 0;
//			int rows ;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(insertquery);
			ps.setInt(1, newdoc.getID());
			ps.setString(2, newdoc.getNAME());
			ps.setDate(3, convertTosqlDate(newdoc.getDOB()));
			ps.setLong(6, newdoc.getPHONE_NO());
			ps.setString(4, newdoc.getSPACIALITY());
			// convert java.util.Date to java.sql.date
			ps.setString(5, newdoc.getCITY());
			ps.setFloat(7, newdoc.getSTANDARD_FEES());

			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	// for updating all the columns of the table
	public static int updateDoctor(Doctor newdoc) {
		String updatequery = "update Doctor set NAME=?,DOB=?,SPACIALITY=?,CITY=?,PHONE_NO=?,STANDARD_FEES=? where ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setInt(7, newdoc.getID());
			ps.setString(1, newdoc.getNAME());
			ps.setLong(5, newdoc.getPHONE_NO());
			ps.setString(3, newdoc.getSPACIALITY());
			// convert java.util.Date to java.sql.date
			ps.setDate(2, convertTosqlDate(newdoc.getDOB()));
			ps.setString(4, newdoc.getCITY());
			ps.setFloat(6, newdoc.getSTANDARD_FEES());

			ps.executeUpdate();
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rows;
	}

	// to update only one column of the table
	public static int updateDoctorName(int id,String name) {
		String updatequery = "update Doctor set NAME=? where ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
		    ps.setString(1, name);
		    ps.setInt(2, id);
			ps.executeUpdate();
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rows;
	}

	public static int updateDoctorSTANDARD_FEES(int id, float standard_fees) {
		String updatequery = "update Doctor set STANDARD_FEES=? where ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setFloat(1, standard_fees);
			ps.setInt(2, id);
			ps.executeUpdate();
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public static int deleteDoctor(int id) {
		String deletequery = ("delete Doctor where ID=?");
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;

		try {
			con = getConnection();
			ps = con.prepareStatement(deletequery);
			ps.setInt(1, id);
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	// To retrive specific Employee data using employee_id
	public static Doctor getDoctorById(int id) {
		Doctor doc = null;
		String selectquery = "select ID,NAME,DOB,SPACIALITY,CITY,PHONE_NO,STANDARD_FEES from Doctor where ID = ? ";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			doc = new Doctor();
			if (rs.next()) {
				doc.setID(rs.getInt(1));
				doc.setNAME(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				// date retrieved from the database will be of type java.sql.Date
				// (rs.getDate(5))
				// emp.setHire_date requires date of type java.util.Date
				// so we are converting sql Date to util Date
				// the constructor of java.util.Date requires a long value
				// so we use the getTime() which returns the sql date as a long value.
				doc.setDOB(date);
				doc.setSPACIALITY(rs.getString(4));
				doc.setCITY(rs.getString(5));
				doc.setPHONE_NO(rs.getLong(6));
				doc.setSTANDARD_FEES(rs.getFloat(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return doc;

	}

	// To retrieve all employee data
	public static List<Doctor> getAllDoctor() {
		List<Doctor> listOfDoctor = new ArrayList<Doctor>();
		Doctor doc = null;
		String selectquery = "select ID,NAME,DOB,SPACIALITY,CITY,PHONE_NO,STANDARD_FEES  from Doctor ";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			rs = ps.executeQuery();
		
		while (rs.next()) {
			doc = new Doctor();
				doc.setID(rs.getInt(1));
				doc.setNAME(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				doc.setDOB(date);
				doc.setSPACIALITY(rs.getString(4));
				doc.setCITY(rs.getString(5));
				doc.setPHONE_NO(rs.getLong(6));
				doc.setSTANDARD_FEES(rs.getFloat(7));
				listOfDoctor.add(doc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listOfDoctor;
	}
}
