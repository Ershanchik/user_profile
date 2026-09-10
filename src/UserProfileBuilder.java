public interface UserProfileBuilder{
    UserProfileBuilder setUsername(String username);
    UserProfileBuilder setDisplayName(String displayName);
    UserProfileBuilder setEmail(String email);
    UserProfileBuilder setBio(String bio);
    UserProfileBuilder addInterest(String interest);
    UserProfileBuilder setVerified(boolean verified);}