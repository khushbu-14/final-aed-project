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
public class SessionsMedStaffDirectory {
    
    private ArrayList<SessionsMedStaff> session = new ArrayList<>();

    public ArrayList<SessionsMedStaff> getSession() {
        if(session==null){
       session = new ArrayList<>();
       }
        return session;
    }

    public void setSession(ArrayList<SessionsMedStaff> session) {
        this.session = session;
    }
    
     public SessionsMedStaff addSession(SessionsMedStaff s) {
        session.add(s);
        return s;
    }

    public void removeSession(SessionsMedStaff s) {
        if(session != null){
        session.remove(s);
    }
    

    }

      public SessionsMedStaff getSessionByID(String id){
         SessionsMedStaff staff = null;
         for(SessionsMedStaff st: session){
             if(st.getSessionID().equals(id)){
                 staff = st;
             }    
         }
         return staff;
     }
      
     public SessionsMedStaff getSessionByUserName(String userName){
         SessionsMedStaff staff = null;
         for(SessionsMedStaff st: session){
             if(st.getUsername().equals(userName)){
                 staff = st;
             }    
         }
         return staff;
     }
      
}