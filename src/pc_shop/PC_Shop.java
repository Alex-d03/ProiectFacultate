package pc_shop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;


public class PC_Shop {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/pc_database";
        String user="root";
        String password="1324Ceviatafrumoasa1!";
        
        try{
            Connection conn=DriverManager.getConnection(url,user,password);
            /*Statement st=conn.createStatement();
            
            //-----------------------------------AFISARE--------------------------------------
            ResultSet result = st.executeQuery("SELECT * FROM monitor");
            while(result.next()){
                System.out.println("ID: "+result.getInt("idmonitor")+"\nNume: "+result.getString("nume")+"\nPret: "+result.getInt("pret")+"\nTehnologie: "+result.getString("tehnologie")+"\nPutere consumata: "+result.getString("putere_consumata")+"\nDiagonala: "+result.getString("diagonala")+"\nTip Rezolutie: "+result.getString("tip_rezolutie")+"\nRezolutie optima: "+result.getString("rezolutie_optima")+"\nAspect imagine: "+result.getString("aspect_imagine")+"\nTimp de raspuns: "+result.getString("timp_de_raspuns")+"\nRefresh rate: "+result.getString("refresh_rate")+"\nIluminare fundal: "+result.getString("iluminare_fundal")+"\n");
            }*/
            
            //----------------------------------ADAUGARE--------------------------------------
            /*String insertSQL="INSERT INTO procesor(nume,pret,socket,cache,frecventa,nuclee,threads) VALUES ('Intel® Core™ i9-14900K','900','1700','36 MB','3200 MHz','24','32')";
            st.executeUpdate(insertSQL);
            System.out.println("\nProcesor adaugat.");*/
                
            //--------------------------------ACTUALIZARE-------------------------------------
            /*String updateSQL="UPDATE procesor SET frecventa = '3.2 GHz', nuclee = '32' WHERE nume = 'Intel® Core™ i9-14900K'";
            st.executeUpdate(updateSQL);
            System.out.println("\nProcesor actualizat.");*/
            
            //---------------------------------STERGERE---------------------------------------
            /*String deleteSQL ="DELETE FROM procesor WHERE nume = 'Intel® Core™ i9-14900K'";
            st.executeUpdate(deleteSQL);
            System.out.println("\nProcesor sters.");*/
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
   
    
}
