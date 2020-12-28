package model.dao.mysql;

import java.sql.SQLException;
import java.util.*;
import businesslogic.domain.User;
import businesslogic.domain.Administrator;
import businesslogic.domain.Player;

/**
 * @author Tiffany Dumaire - Aaron Lazaroo - Clarence Rouvel
 */
public abstract class UserDAO {

    /**
     * Default constructor
     */
    public UserDAO() {
    }


    /**
     * @param userId 
     * @return
     * @throws SQLException 
     */
    public abstract User getUserById(int userId) throws SQLException;

    /**
     * @param email 
     * @return
     * @throws SQLException 
     */
    public abstract User getUserByEmail(String email) throws SQLException;

    /**
     * @param email 
     * @param password 
     * @return
     * @throws SQLException 
     */
    public abstract User getUserByLogin(String email, String password) throws SQLException;

    /**
     * @param email 
     * @return
     * @throws SQLException 
     */
    public abstract boolean existsByEmail(String email) throws SQLException;

    /**
     * @param username 
     * @return
     * @throws SQLException 
     */
    public abstract boolean existsUsername(String username) throws SQLException;

    /**
     * @param email 
     * @return
     */
    public abstract User deleteUserByEmail(String email);

    /**
     * @param username 
     * @return
     */
    public abstract boolean deletePlayerByUsername(String username);

    /**
     * @param email 
     * @param password 
     * @return
     */
    public abstract boolean updateAdministratorProfile(String email, String password);

    /**
     * @param username 
     * @return
     * @throws SQLException 
     */
    public abstract boolean updateBlockPlayer(String username) throws SQLException;

    /**
     * @param username 
     * @param email 
     * @param password 
     * @param country 
     * @return
     */
    public abstract boolean updatePlayerProfile(String username, String email, String password, String country);

    /**
     * @param username 
     * @param email 
     * @param password 
     * @param dateOfBirth 
     * @param gender 
     * @param country 
     * @return
     */
    public abstract boolean addAPlayer(String username, String email, String password, Date dateOfBirth, String gender, String country);

    /**
     * @param email 
     * @param password 
     * @return
     */
    public abstract boolean addAnAdministrator(String email, String password);

    /**
     * @param username 
     * @return
     */
    public abstract boolean searchPlayerStats(String username);

    /**
     * @param username 
     * @param played 
     * @param win 
     * @param lost 
     * @param maxPlayed 
     * @param maxWin 
     * @param maxLost 
     * @return
     * @throws SQLException 
     */
    public abstract ArrayList<String> getCorrespondingPlayer(String username, int played, int win, int lost, boolean maxPlayed, boolean maxWin, boolean maxLost) throws SQLException;
    /**
     * 
     * @param user
     * @return
     * @throws SQLException 
     */
	public abstract Player getPlayer(User user) throws SQLException;

	/**
	 * 
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	public abstract Administrator getAdmin(User user) throws SQLException;
	
	/**
	 * 
	 * @param username
	 * @return
	 * @throws SQLException
	 */
	public abstract Player getPlayerByUsername(String username) throws SQLException;

	/**
	 * 
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	public abstract boolean exist(User user) throws SQLException;

	/**
	 * 
	 * @param username
	 * @return
	 * @throws SQLException
	 */
	public abstract int getUserIdByUsername(String username) throws SQLException ;
	
}