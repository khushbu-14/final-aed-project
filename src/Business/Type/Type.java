/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Type;

/**
 *
 * @author kunal
 */
public class Type {
    private String type;
    private String parent;

    public Type(String type, String parent) {
        this.type = type;
        this.parent = parent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
    
     @Override
    public String toString() {
        return type;
    }
}
