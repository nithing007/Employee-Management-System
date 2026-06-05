import java.sql.*;
import java.util.Scanner;
public class ManagementJDBC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/management_db",
                    "root",
                    "nithin007"
            );

            int choice;
            do {

                System.out.println("\n===== Management System =====");
                System.out.println("1. Insert Details");
                System.out.println("2. Update Details");
                System.out.println("3. View Details");
                System.out.println("4. Exit");

                System.out.print("Enter Choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {

                    System.out.print("Enter Department ID: ");
                    int deptid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Department Name: ");
                    String deptname = sc.nextLine();

                    PreparedStatement deptps = con.prepareStatement(
                            "INSERT INTO Department(Departmentid, DepartmentName) VALUES(?,?)"
                    );

                    deptps.setInt(1, deptid);
                    deptps.setString(2, deptname);

                    deptps.executeUpdate();

                    System.out.print("Enter Project ID: ");
                    int projectid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Project Name: ");
                    String projectname = sc.nextLine();

                    System.out.print("Enter Project Status (true/false): ");
                    boolean projectstatus = sc.nextBoolean();
                    sc.nextLine();

                    PreparedStatement projectps = con.prepareStatement(
                            "INSERT INTO Project(Projectid, ProjectName, Status) VALUES(?,?,?)"
                    );

                    projectps.setInt(1, projectid);
                    projectps.setString(2, projectname);
                    projectps.setBoolean(3, projectstatus);

                    projectps.executeUpdate();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Mobile No: ");
                    String mobile = sc.nextLine();

                    System.out.print("Enter City: ");
                    String city = sc.nextLine();

                    System.out.print("Enter State: ");
                    String state = sc.nextLine();

                    System.out.print("Enter Date Of Joining (yyyy-mm-dd): ");
                    String doj = sc.nextLine();

                    System.out.print("Enter Experience: ");
                    String exp = sc.nextLine();

                    System.out.print("Enter Employee Status (true/false): ");
                    boolean empstatus = sc.nextBoolean();

                    PreparedStatement empps = con.prepareStatement(
                            "INSERT INTO Employee(Empname, Email, MobileNO, City, State, DateofJoining, Departmentid, Projectid, Status, Experience) VALUES(?,?,?,?,?,?,?,?,?,?)"
                    );

                    empps.setString(1, name);
                    empps.setString(2, email);
                    empps.setString(3, mobile);
                    empps.setString(4, city);
                    empps.setString(5, state);
                    empps.setDate(6, Date.valueOf(doj));
                    empps.setInt(7, deptid);
                    empps.setInt(8, projectid);
                    empps.setBoolean(9, empstatus);
                    empps.setString(10, exp);

                    empps.executeUpdate();

                    System.out.println("Details Inserted Successfully.");
                }

                else if (choice == 2) {

                    System.out.print("Enter Employee ID: ");
                    int empid = sc.nextInt();
                    sc.nextLine();

                    System.out.println("1. Update Name");
                    System.out.println("2. Update Email");
                    System.out.println("3. Update Mobile");
                    System.out.println("4. Update City");
                    System.out.println("5. Update State");
                    System.out.println("6. Update Experience");

                    System.out.print("Enter Update Choice: ");
                    int updatechoice = sc.nextInt();
                    sc.nextLine();

                    String query = "";
                    String value = "";

                    if (updatechoice == 1) {

                        System.out.print("Enter New Name: ");
                        value = sc.nextLine();

                        query = "UPDATE Employee SET Empname=? WHERE Empid=?";
                    }

                    else if (updatechoice == 2) {

                        System.out.print("Enter New Email: ");
                        value = sc.nextLine();

                        query = "UPDATE Employee SET Email=? WHERE Empid=?";
                    }

                    else if (updatechoice == 3) {

                        System.out.print("Enter New Mobile: ");
                        value = sc.nextLine();

                        query = "UPDATE Employee SET MobileNO=? WHERE Empid=?";
                    }

                    else if (updatechoice == 4) {

                        System.out.print("Enter New City: ");
                        value = sc.nextLine();

                        query = "UPDATE Employee SET City=? WHERE Empid=?";
                    }

                    else if (updatechoice == 5) {

                        System.out.print("Enter New State: ");
                        value = sc.nextLine();

                        query = "UPDATE Employee SET State=? WHERE Empid=?";
                    }

                    else if (updatechoice == 6) {

                        System.out.print("Enter New Experience: ");
                        value = sc.nextLine();

                        query = "UPDATE Employee SET Experience=? WHERE Empid=?";
                    }

                    PreparedStatement ps = con.prepareStatement(query);

                    ps.setString(1, value);
                    ps.setInt(2, empid);

                    int rows = ps.executeUpdate();

                    if (rows > 0) {

                        System.out.println("Details Updated Successfully.");

                    } else {

                        System.out.println("Employee Not Found.");
                    }
                }

                else if (choice == 3) {

                    Statement st = con.createStatement();

                    ResultSet rs = st.executeQuery(
                            "SELECT * FROM Employee"
                    );

                    System.out.println("\n===== Employee Details =====");

                    while (rs.next()) {

                        System.out.println("--------------------------------");

                        System.out.println("Employee ID   : " + rs.getInt("Empid"));
                        System.out.println("Name          : " + rs.getString("Empname"));
                        System.out.println("Email         : " + rs.getString("Email"));
                        System.out.println("Mobile No     : " + rs.getString("MobileNO"));
                        System.out.println("City          : " + rs.getString("City"));
                        System.out.println("State         : " + rs.getString("State"));
                        System.out.println("Date Joining  : " + rs.getDate("DateofJoining"));
                        System.out.println("Department ID : " + rs.getInt("Departmentid"));
                        System.out.println("Project ID    : " + rs.getInt("Projectid"));
                        System.out.println("Status        : " + rs.getBoolean("Status"));
                        System.out.println("Experience    : " + rs.getString("Experience"));
                    }
                }

                else if (choice == 4) {

                    System.out.println("Application Closed.");
                }

                else {

                    System.out.println("Invalid Choice.");
                }

            } while (choice != 4);

            con.close();

        } catch (Exception e) {

            System.out.println("Error : " + e.getMessage());
        }

        sc.close();
    }
}