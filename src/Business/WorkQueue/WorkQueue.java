/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void addWorkRequest(WorkRequest workRequest) {
        workRequestList.add(workRequest);
    }

    public ArrayList<WorkRequest> getUserRequestList(UserAccount account, String requestType) {
        ArrayList<WorkRequest> userRequestList = new ArrayList<WorkRequest>();

        for (WorkRequest wr : workRequestList) {
            if (wr.getUserAccount() != null) {
                if (wr.getUserAccount().getUsername().equals(account.getUsername())) {
                    if (wr.getRequestType().equalsIgnoreCase(requestType)) {
                        userRequestList.add(wr);
                    }
                }
            }
        }

        return userRequestList;
    }
}
