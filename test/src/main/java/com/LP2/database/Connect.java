package com.LP2.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.LP2.app.loader.Dataset;

public class Connect {
  private String url;
  private String username;
  private String password;
  private Connection conn;

  public Connect() {
    this.url = Dataset.getValue("CONNECTION_URL");
    this.username = Dataset.getValue("DB_USER");
    this.password = Dataset.getValue("DB_PASS");

    try {
      Class.forName("org.postgresql.Driver");
      this.conn =
        DriverManager.getConnection(this.url, this.username, this.password);
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
    }
    System.out.println("Conexão sucedida");
  }

  public Connection getCon() { return this.conn; }

  public void rebuildTables() {
    createClientTable();
    createDrinkTable();
    createImageTable();
    createItemTable();
    createFoodTable();
    createOrderTable();
    createUserTable();
  }

  public boolean createUserTable() {
    try  {
      Statement stm = this.conn.createStatement();
      stm.executeUpdate("CREATE TABLE Person (" +
                        "id SERIAL NOT NULL PRIMARY KEY," +
                        "name varchar(80) UNIQUE," +
                        "email varchar(80)," +
                        "password varchar(80)," +
                        "IDcode varchar(80)," +
                        "userType smallint" +
                        ");");
      stm.close();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }

  public boolean createItemTable() {
    try {
      Statement stm = this.conn.createStatement();
      stm.executeUpdate("CREATE TABLE Item (" +
                        "id SERIAL NOT NULL PRIMARY KEY," +
                        "name varchar(100) UNIQUE," +
                        "price real" +
                      ");");

      stm.close();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }


    return true;
  }

  public boolean createFoodTable () {
    try {
      Statement stm = this.conn.createStatement();
      stm.executeUpdate("CREATE TABLE Food (" +
                        "food_id integer NOT NULL," + // colocar como foreign key de item.
                        "description varchar(240)," +
                        "PRIMARY KEY(food_id)," +
                        "FOREIGN KEY(food_id) REFERENCES Item(id)" +
                      ")");
      stm.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return true;
  }

  public boolean createDrinkTable() {
    try {
      Statement stm = this.conn.createStatement();
      stm.executeUpdate("CREATE TABLE Drink (" +
                        "drink_id integer NOT NULL," + // colocar como foreign key de item.
                        "provider varchar(80)," +
                        "PRIMARY KEY(drink_id)," +
                        "FOREIGN KEY(drink_id) REFERENCES Item(id)" +
                      ")");
      stm.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return true;
  }

  public boolean createClientTable() {
    try {
      Statement stm = this.conn.createStatement();
      stm.executeUpdate("CREATE TABLE Client (" +
                        "client_id INTEGER NOT NULL," +
                        "lastBought REAL," +
                        "lastVisit DATE," +
                        "FOREIGN KEY(client_id) REFERENCES Person(id)" +
                      ")");
                      stm.close();
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  public boolean createOrderTable() {
    try {
      Statement stm = this.conn.createStatement();
      stm.executeUpdate(
        "CREATE TABLE ClientOrder (" +
          "client_id INTEGER NOT NULL, " +
          "item_id INTEGER NOT NULL, " +
          "quantity INTEGER NOT NULL, " +
          "ordered_at DATE NOT NULL DEFAULT CURRENT_DATE, " +
          "FOREIGN KEY (client_id) REFERENCES Person(id), " +
          "FOREIGN KEY (item_id) REFERENCES Item(id)" +
        ")");

      stm.close();
      return true;
    } catch(Exception e) {
      e.printStackTrace();
      return false;
    }
  }


  public boolean createImageTable() {
    try {
      Statement stm = this.conn.createStatement();
      stm.executeUpdate(
        "CREATE TABLE Image (" +
        "id SERIAL NOT NULL PRIMARY KEY, " +
        "filePath varchar(80)," +
        "fileName varchar(80)," +
        "fileType varchar(20), " +
        "content bytea" +
        ")"
      );

      stm.close();
      return true;
    } catch(Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  public boolean createVisitTable() {
    try {
      Statement stm = this.conn.createStatement();
      stm.executeUpdate(
        "CREATE TABLE Visit (" +
        "id SERIAL NOT NULL PRIMARY KEY, " +
        "client_id INTEGER NOT NULL, " +
        "entered_at TIMESTAMP NOT NULL, " +
        "exited_at TIMESTAMP, " +
        "FOREIGN KEY (client_id) REFERENCES Person(id)" +
        ")"
      );

      stm.close();
      return true;
    } catch(Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  public boolean createReviewTable() {
    try {
      Statement stm = this.conn.createStatement();
      stm.executeUpdate(
        "CREATE TABLE Review (" +
        "id SERIAL NOT NULL PRIMARY KEY, " +
        "item_id INTEGER NOT NULL, " +
        "client_id INTEGER NOT NULL, " +
        "content varchar(80) NOT NULL, " +
        "state varchar(30) DEFAULT 'visible' NOT NULL," +
        "FOREIGN KEY (item_id) REFERENCES Item(id), " +
        "FOREIGN KEY (client_id) REFERENCES Person(id)" +
        ")"
      );

      stm.close();
      return true;
    } catch(Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  public boolean createFavouritesTable() {
    try {
      Statement stm = this.conn.createStatement();
      stm.executeUpdate(
        "CREATE TABLE Favourite (" +
        "client_id INTEGER NOT NULL, " +
        "item_id INTEGER NOT NULL, " +
        "FOREIGN KEY(client_id) REFERENCES Person(id), " +
        "FOREIGN KEY (item_id) REFERENCES Item(id), " +
        "PRIMARY KEY(client_id, item_id)" +
        ")"
      );

      stm.close();
      return true;
    } catch(Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  public boolean addColumnToTable(String query) {
    try {
      Statement stm = this.conn.createStatement();
      stm.executeUpdate(
        query
      );

      stm.close();
      return true;
    } catch(Exception e) {
      e.printStackTrace();
      return false;
    }


  }

  public boolean deleteTable(String tableName) {
    try {
      Statement stm = this.conn.createStatement();
      stm.executeUpdate("DROP TABLE " + tableName);

      stm.close();
    } catch (Exception e) {
      e.printStackTrace();

      return false;
    }

    return true;
  }
}
