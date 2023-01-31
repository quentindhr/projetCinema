
package tpcinema;


public class Admin {
    
    private String id;
    private String mdp;

    public Admin(String id, String mdp) {
        this.id = id;
        this.mdp = mdp;
    }

    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", mdp=" + mdp + '}';
    }
    
    public String getId() {
        return id;
    }

    public String getMdp() {
        return mdp;
    }
    
    
    
}
