import java.util.ArrayList;
import java.util.List;
public class UserProfileObjectBuilder implements UserProfileBuilder{
    private static final int MIN_USERNAME_LENGTH=3;
    private String username;
    private String displayName;
    private String email;
    private String bio;
    private final List <String>interests=new ArrayList<>();
    private boolean verified;
    @Override
    public UserProfileObjectBuilder setUsername(String username){this.username=username;return this;}
    @Override
    public UserProfileObjectBuilder setDisplayName(String displayName){this.displayName=displayName;return this;}
    @Override
    public UserProfileObjectBuilder setEmail(String email){this.email=email;return this;}
    @Override
    public UserProfileObjectBuilder setBio(String bio){this.bio=bio;return this;}
    @Override
    public UserProfileObjectBuilder addInterest(String interest){this.interests.add(interest);return this;}
    @Override
    public UserProfileObjectBuilder setVerified(boolean verified){this.verified=verified;return this;}
    public UserProfile getResult(){
        if(username==null||username.isBlank()){throw new IllegalStateException("Username is required");}
        if(username.length()<MIN_USERNAME_LENGTH){
            throw new IllegalStateException(
                    "Username must be at least " + MIN_USERNAME_LENGTH + " characters");}
        if(email==null||!email.contains("@")){throw new IllegalStateException("A valid email is required");}
        return new UserProfile(username, displayName, email, bio, interests, verified);
    }
}