import java.util.List;
public class UserProfile{
    private final String username;private final String displayName;
    private final String email;private final String bio;
    private final List<String>interests;
    private final boolean verified;
    UserProfile(String username,String displayName,String email,
                String bio, List<String> interests, boolean verified){
        this.username=username;
        this.displayName=displayName;
        this.email=email;this.bio=bio;
        this.interests=List.copyOf(interests);
        this.verified=verified;}
    public String getUsername(){return username;}
    public String getDisplayName(){return displayName;}
    public String getEmail(){return email;}
    public String getBio(){return bio;}
    public List<String>getInterests(){return interests;}
    public boolean isVerified(){return verified;}
    @Override
    public String toString(){
        return "UserProfile{" +
                "username='" + username + '\'' +
                ", displayName='" + displayName + '\'' +
                ", email='" + email + '\'' +
                ", bio='" + bio + '\'' +
                ", interests=" + interests +
                ", verified=" + verified +
                '}';}
}
