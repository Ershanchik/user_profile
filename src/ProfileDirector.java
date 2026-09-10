public class ProfileDirector{
    public void makeBasicProfile(UserProfileBuilder builder) {
        builder.setUsername("ershanchik")
                .setDisplayName("Ershan")
                .setEmail("ershanchik@example.com")
                .setBio("Just joined the platform.");}
    public void makeVerifiedProfile(UserProfileBuilder builder){
        builder.setUsername("kokosichek")
                .setDisplayName("Kalybek")
                .setEmail("kokosichekv@example.com")
                .setBio("Backend developer. Coffee enjoyer.")
                .addInterest("Java")
                .addInterest("Chess")
                .setVerified(true);}
}
