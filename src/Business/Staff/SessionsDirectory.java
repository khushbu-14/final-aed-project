/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Staff;

import Business.WorkQueue.OrderItem;
import java.util.ArrayList;

/**
 *
 * @author singh
 */
public class SessionsDirectory {
    
    private ArrayList<Sessions> session = new ArrayList<>();

    public ArrayList<Sessions> getSession() {
        if(session==null){
       session = new ArrayList<>();
       }
        return session;
    }

    public void setSession(ArrayList<Sessions> session) {
        this.session = session;
    }
    
     public Sessions addSession(Sessions s) {
        session.add(s);
        return s;
    }

    public void removeSession(Sessions s) {
        if(session != null){
        session.remove(s);
    }
    

    }

      public Sessions getSessionByID(String id){
         Sessions staff = null;
         for(Sessions st: session){
             if(st.getSessionID().equals(id)){
                 staff = st;
             }    
         }
         return staff;
     }
      
     public Sessions getSessionByUserName(String userName){
         Sessions staff = null;
         for(Sessions st: session){
             if(st.getUsername().equals(userName)){
                 staff = st;
             }    
         }
         return staff;
     }
      
}