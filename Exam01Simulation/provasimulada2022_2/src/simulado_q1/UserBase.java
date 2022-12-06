package simulado_q1;

import java.util.LinkedList;
import java.util.List;

public class UserBase {
    private List<User> users;
    private int verifieduserscount;
    private int normaluserscount;

    public UserBase() {
        this.users = new LinkedList<User>();
        this.verifieduserscount = 0;
        this.normaluserscount = 0;
    }

    public void CreateNormalUser(String ID) {
        if (IDValid(ID)) {
            User u = new User(ID);
            AddUser(u);
        } else {
            System.out.println("ID already taken");
        }
    }

    public void CreateVerifiedUser(String ID) {
        if (IDValid(ID)) {
            User u = new VerifiedUser(ID);
            AddUser(u);
        } else {
            System.out.println("ID already taken");
        }
    }

    public void AddUser(User newUser) {
        users.add(newUser);
        if (newUser instanceof VerifiedUser) {
            verifieduserscount++;
        } else {
            normaluserscount++;
        }
    }

    public User RemoveUser(String ID) {
        User u = findUserID(ID);
        if (u == null) {
            System.out.println("User not found");
            return null;
        }
        if (u instanceof VerifiedUser) {
            verifieduserscount--;
        } else {
            normaluserscount--;
        }
        users.remove(u);
        return u;
    }

    public int getVerifieduserscount() {
        return verifieduserscount;
    }

    public int getNormaluserscount() {
        return normaluserscount;
    }

    public User findUserID(String ID) {
        for (User u : users) {
            if (u.getID().equals(ID)) {
                return u;
            }
        }
        return null;
    }

    public Boolean IDValid(String newID) {
        User u = findUserID(newID);
        if (u == null) {
            return true;
        } else {
            return false;
        }
    }

    public double getVerifiedPorcent() {
        double count = getVerifieduserscount();
        double p = (count / users.size());
        return p * 100;
    }

    public double getNormalPorcent() {
        double count = getNormaluserscount();
        double p = (count / users.size());
        return p * 100;
    }

    public double getTweetLentghAvg() {
        int number = 0;
        int chars = 0;
        for (User u : users) {
            number += u.getTweetAmount();
            chars += u.getTotalTweetLentgh();
        }
        double avg = chars / number;
        return avg;
    }

}
