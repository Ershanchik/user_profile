public class Main{
    public static void main(String[]args){
        ProfileDirector director=new ProfileDirector();
        UserProfileObjectBuilder objectBuilder=new UserProfileObjectBuilder();
        director.makeVerifiedProfile(objectBuilder);
        UserProfile profile=objectBuilder.getResult();
        System.out.println(profile);
        UserProfileCardBuilder cardBuilder=new UserProfileCardBuilder();
        director.makeVerifiedProfile(cardBuilder);
        System.out.println(cardBuilder.getResult());
        try{
            new UserProfileObjectBuilder().setEmail("test@example.com").getResult();
        } catch (IllegalStateException e){
            System.out.println("Validation works: "+e.getMessage());
        }
    }
}