public class UserProfileObjectBuilder implements UserProfileBuilder{
    private String username;
    private String email;
    private String bio;
    private boolean verified;
    @Override
    public UserProfileObjectBuilder setUsername(String username){
        this.username=username;return this;}
    @Override
    public UserProfileObjectBuilder setEmail(String email){
        this.email=email;return this;}
    @Override
    public UserProfileObjectBuilder setBio(String bio){
        this.bio=bio;return this;}
    @Override
    public UserProfileObjectBuilder setVerified(boolean verified){
        this.verified=verified;return this;}
    public UserProfile getResult(){
        if(username==null||username.isBlank()){
            throw new IllegalStateException("username is required");}
        if(email==null||!email.contains("@")){
            throw new IllegalStateException("a valid email is required");}
        return new UserProfile(username,email,bio,verified);}
}