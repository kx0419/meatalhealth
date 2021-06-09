package health.jjj;

public class User {
    private int telephonename;
    private String name;
    private String agent;
    private int age;
    private String password;
    private String determinepw;

    public int getTelephonename() {
        return telephonename;
    }

    public void setTelephonename(int telephonename) {
        this.telephonename = telephonename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeterminepw() {
        return determinepw;
    }

    public void setDeterminepw(String determinepw) {
        this.determinepw = determinepw;
    }
    public User(int telephonename,String name,String agent,int age,String password,String determinepw){

    }

}
