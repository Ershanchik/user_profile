public class ProfileDirector{
    public void makeBasicProfile(UserProfileBuilder builder){
        builder.setUsername("Ershanchik")
                .setEmail("ershanchik@example.com")
                .setBio("Just joined the platform.");}
    public void makeVerifiedProfile(UserProfileBuilder builder){
        builder.setUsername("kalybek")
                .setEmail("kokosik08@example.com")
                .setBio("Backend developer.")
                .setVerified(true);}
}

