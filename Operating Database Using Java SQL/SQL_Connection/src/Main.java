import java.sql.*;
import java.util.Scanner;
public class Main {

    static final String URL= "jdbc:mysql://127.0.0.1:3306/universityresources";
    //           jdbc(same everytime):DBMS we are using (name)://port/database name//
    static final String userName= "root";
    static final String Password= "!e#3D9Y8%F!1~";

    static Connection con;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {

        con= DriverManager.getConnection(URL, userName, Password);
        System.out.println("Database Connected!");

        while (true) {
            int choice;
            System.out.println("Teacher Management System");
            System.out.println("1. Add Teacher");
            System.out.println("2. View Teachers");
            System.out.println("3. Update Teachers");
            System.out.println("4. Delete Teachers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice= scanner.nextInt();
            switch (choice){
                case 1:{
                    addTeacher();
                    break;
                }
                case 2:{
                    viewTeacher();
                    break;
                }
                case 3:{
                    updateTeacher();
                    break;
                }
                case 4:{
                    deleteTeacher();
                    break;
                }
                case 5:{
                    System.exit(0);
                }
                default:
                    System.out.println("Invalid Input");
            }

        }



    }

    static void addTeacher(){
        String TId, name, department, emailAddress, specialization;
        int weeklyHours;
        System.out.println("Welcome to Teacher Adding Section");
        scanner.nextLine();
        System.out.print("Enter teacher ID: ");
        TId= scanner.nextLine();
        System.out.print("Enter teacher Name: ");
        name=scanner.nextLine();
        System.out.print("Enter teacher Department: ");
        department= scanner.nextLine();
        System.out.print("Enter teacher Email: ");
        emailAddress= scanner.nextLine();
        System.out.print("Enter teacher specialization: ");
        specialization= scanner.nextLine();
        System.out.print("Enter teacher weekly hours: ");
        weeklyHours= scanner.nextInt();
        int rowsAffected;
        String sqlQuery= "INSERT INTO teachers(teacherId, name, department, emailAddress, specialization, weeklyHours) VALUES (?,?,?,?,?,?)";
        try(PreparedStatement statement= con.prepareStatement(sqlQuery)) {
            statement.setString(1, TId);
            statement.setString(2, name);
            statement.setString(3, department);
            statement.setString(4, emailAddress);
            statement.setString(5, specialization);
            statement.setInt(6, weeklyHours);
            rowsAffected= statement.executeUpdate();
            System.out.println("Teacher Added Successfully || rows Affected: "+rowsAffected);
        }

        catch (SQLException e) {
            e.printStackTrace(); // This tells you the EXACT error message from MySQL
        }
    }
    static void updateTeacher(){
        String teacherID, department;
        int rowsAffected;
        System.out.println("Welcome to teacher Update Section");
        System.out.print("Enter teacher new department: ");
        scanner.nextLine();
        teacherID= scanner.nextLine();
        System.out.print("Enter teacher Id to update: ");
        department= scanner.nextLine();
        String sqlQuery= "UPDATE teachers SET department=? WHERE teacherId=?";

        try(PreparedStatement statement= con.prepareStatement(sqlQuery)){
            statement.setString(1, teacherID);
            statement.setString(2, department);
            rowsAffected= statement.executeUpdate();
            if(rowsAffected>0){
                System.out.println("Data Updated Successfully || rows Affected: "+rowsAffected);
            }
            else{
                System.out.println("Update Failed || rows Affected: " +rowsAffected);
            }
        }
        catch(SQLException e){
            e.printStackTrace(); // This tells you the EXACT error message from MySQL
        }
    }
    static void deleteTeacher(){
        String teacherID;
        int rows1Affected, rows2Affected;
        System.out.print("Enter teacher ID to delete: ");
        scanner.nextLine();
        teacherID=scanner.nextLine();
        String sqlQueryTeacher= "DELETE FROM teachers where teacherId=?";
        String sqlQueryChild= "DELETE FROM sechdules where teacherId=?";
        try(PreparedStatement statement= con.prepareStatement(sqlQueryChild)){
            statement.setString(1, teacherID);
            rows1Affected= statement.executeUpdate();
        }
        catch (SQLException e){
            System.out.println("Something Went Wrong");
        }
        try(PreparedStatement statement= con.prepareStatement(sqlQueryTeacher)){
            statement.setString(1, teacherID);
            rows2Affected= statement.executeUpdate();
            if(rows2Affected>0){
                System.out.println("Teacher Deleted Successfully");
            }
            else{
                System.out.println("Deletion Failed");
            }
        }
        catch(SQLException e){
            e.printStackTrace(); // This tells you the EXACT error message from MySQL
        }
    }
    static void viewTeacher(){
        System.out.println("Welcome to Data view Section");
        String sqlQuery= "SELECT * FROM teachers";
        try(PreparedStatement statement= con.prepareStatement(sqlQuery)){
            ResultSet resultSet = statement.executeQuery();
            System.out.println("\nID  |  name  |  department  |  email address  |  specialization  | weekly hours");
            System.out.println("-----------------------------------------------------------------------------------");
            while(resultSet.next()){
                System.out.println(resultSet.getString("teacherId")+" | " +resultSet.getString("name")+" | "+resultSet.getString("department")+" | "+ resultSet.getString("emailAddress") +" | "+ resultSet.getString("specialization")+" | "+resultSet.getInt("weeklyHours"));
                if(resultSet.getString("teacherId").equalsIgnoreCase("Harry")) {
                    System.out.println("THis is Me Faaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
                }
            }
        }
        catch(SQLException e){
            System.out.println("Something Went Wrong");
        }
    }
}