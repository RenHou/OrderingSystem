package OrderingSystemV1;

public class Staff {
    private int staffNo ;
    private String name;
    private String telNo;
    private String position;
    private String username;    
    private String password;

    public Staff(int staffNo, String name, String telNo, String position, String username, String password) {
        this.staffNo = staffNo;
        this.name = name;
        this.telNo = telNo;
        this.position = position;
        this.username = username;
        this.password = password;
    }

    public int getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(int staffNo) {
        this.staffNo = staffNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Staffs{" + "staffNo=" + staffNo + ", name=" + name + ", telNo=" + telNo + ", position=" + position + ", username=" + username + ", password=" + password + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.staffNo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Staff other = (Staff) obj;
        return this.staffNo == other.staffNo;
    }
    
    
}
