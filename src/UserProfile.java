public class UserProfile {
    private final String username;
    private final String email;
    private final String bio;
    private final boolean verified;
    UserProfile(String username,String email,String bio,boolean verified){
        this.username=username;
        this.email=email;
        this.bio=bio;
        this.verified=verified;}
    public String getUsername(){return username;}
    public String getEmail() { return email; }
    public String getBio(){return bio;}
    public boolean isVerified(){return verified;}
    @Override
    public String toString(){
        return "UserProfile{username='"+username+"', email='"+email+"',bio='"+bio+"',verified="+verified+"}";}
}