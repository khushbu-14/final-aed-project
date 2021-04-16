/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Hospital.HospitalDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Shop.ShopDirectory;
import Business.Type.TypeDirectory;
import Business.User.UserDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private HospitalDirectory hospitalDirectory;
    private UserDirectory userDirectory;
    private TypeDirectory typeDirectory;
    private ShopDirectory shopDirectory;

    public EcoSystem(HospitalDirectory hospitalDirectory, UserDirectory userDirectory,TypeDirectory typeDirectory,ShopDirectory shopDirectory) {
        this.hospitalDirectory = hospitalDirectory;
        this.userDirectory = userDirectory;
        this.typeDirectory = typeDirectory;
        this.shopDirectory = shopDirectory;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        hospitalDirectory = new HospitalDirectory();
    }

    public boolean checkIfUserIsUnique(String userName) {
        return false;
    }

    public HospitalDirectory getHospitalDirectory() {
        if (hospitalDirectory == null) {
            hospitalDirectory = new HospitalDirectory();
        }
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public UserDirectory getUserDirectory() {
        if (userDirectory == null) {
            userDirectory = new UserDirectory();
        }
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public TypeDirectory getTypeDirectory() {
        if (typeDirectory == null) {
            typeDirectory = new TypeDirectory();
        }
        return typeDirectory;
    }

    public void setTypeDirectory(TypeDirectory typeDirectory) {
        this.typeDirectory = typeDirectory;
    }

    public ShopDirectory getShopDirectory() {
        if (shopDirectory == null) {
            shopDirectory = new ShopDirectory();
        }
        return shopDirectory;
    }

    public void setShopDirectory(ShopDirectory shopDirectory) {
        this.shopDirectory = shopDirectory;
    }

}
