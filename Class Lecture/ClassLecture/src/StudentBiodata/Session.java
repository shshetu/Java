/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentBiodata;

/**
 *
 * @author User
 */
public class Session {
    String session;
    int id;

    public Session(String session, int id) {
        this.session = session;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Session{" + "session=" + session + ", id=" + id + '}';
    }
    
}
