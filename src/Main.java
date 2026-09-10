public class Main{
    public static void main(String[]args){
        ProfileDirector director=new ProfileDirector();
        UserProfileObjectBuilder objectBuilder=new UserProfileObjectBuilder();
        director.makeVerifiedProfile(objectBuilder);
        UserProfile profile=objectBuilder.getResult();
        System.out.println("result type: "+profile.getClass().getSimpleName());
        System.out.println(profile);System.out.println();
        UserProfileCardBuilder cardBuilder=new UserProfileCardBuilder();
        director.makeVerifiedProfile(cardBuilder);
        String card=cardBuilder.getResult();
        System.out.println("result type: string");
        System.out.println(card);System.out.println();
        System.out.println("validation check(username too short):");
        try{new UserProfileObjectBuilder()
                .setUsername("ab")
                .setEmail("test@example.com")
                .getResult();}
        catch(IllegalStateException e){System.out.println("Поймано исключение: "+e.getMessage());}}
}
