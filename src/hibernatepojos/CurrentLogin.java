package hibernatepojos;
// Generated Apr 30, 2022 11:35:21 PM by Hibernate Tools 4.3.1



/**
 * CurrentLogin generated by hbm2java
 */
public class CurrentLogin  implements java.io.Serializable {


     private String currentLoginUsername;

    public CurrentLogin() {
    }

    public CurrentLogin(String currentLoginUsername) {
       this.currentLoginUsername = currentLoginUsername;
    }
   
    public String getCurrentLoginUsername() {
        return this.currentLoginUsername;
    }
    
    public void setCurrentLoginUsername(String currentLoginUsername) {
        this.currentLoginUsername = currentLoginUsername;
    }




}

