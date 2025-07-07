class UserProfile{
    private String userName;
    private String email;
    private String password;
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getuserName(){
        return userName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getemail(){
        return email;
    }
    public void setpassword(String password){
        if(password.length()>=12){
            this.password=password;
        }
        else{
            System.out.println("Password should be atleast 12 digits");
        }
    }
    public String getpassword(){
        return password;
    }
    public static void main(String[] args){ 
        UserProfile userprofile=new UserProfile();
        userprofile.setUserName("ATPLD18");
        userprofile.setEmail("aditya.aaslin@gmail.com");
        userprofile.setpassword("adityaaaslin");
        System.out.println("UserName:"+userprofile.getuserName());
        System.out.println("Email:"+userprofile.getemail());
        System.out.println("password:"+userprofile.getpassword());

    }
}