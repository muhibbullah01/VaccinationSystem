import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class VaccineDAO {
    public static boolean insertData(VaccineData vd){
        boolean f=false;
        try {
            Connection con = Connectivity.create();
            String insertQuery = "insert into info values(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(insertQuery);
            pst.setInt(1, vd.getNid());
            pst.setString(2, vd.getName());
            pst.setString(3,vd.getGender());
            pst.setInt(4, vd.getAge());
            int count = pst.executeUpdate();
            System.out.println(count+ " row/s inserted");
            f=true;
        }catch (Exception e){
            System.out.println(e);
        }
        return f;
    }
    public static boolean rmvData(int uid){
        boolean f =false;
        try {
            Connection con = Connectivity.create();
            String rmvQuery = "delete from info where NID=?";
            PreparedStatement pst = con.prepareStatement(rmvQuery);
            pst.setInt(1,uid);
            pst.executeUpdate();
            f=true;
        }catch (Exception e){
            System.out.println(e);
        }
        return f;
    }
    public static void getInfo(int id){


        try {
            Connection con = Connectivity.create();
            String getQuery =  "select * from info where NID = "+id;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(getQuery);

            while (rs.next()){

                int nid = rs.getInt("NID");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String age = rs.getString("age");
                System.out.println("NID: "+nid+" | "+name+" | "+gender+" | "+age+" Years Old");
                System.out.println();
            }


        }catch (Exception e){
            System.out.println(e);
        }

    }
    public static boolean checkInfo(){
        boolean f = false;
        try {
            Connection con = Connectivity.create();
            String checkQuery =  "select * from info";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(checkQuery);
            while (rs.next()){
                int nid = rs.getInt(1);
                String name = rs.getString(2);
                String gender = rs.getString(3);
                String age = rs.getString(4);
                System.out.println("NID: "+nid+" | "+name+" | "+gender+" | "+age+" Years old");
                System.out.println();
            }
            f = true;
        }catch (Exception e){
            System.out.println(e);
        }
        return f;
    }
}
