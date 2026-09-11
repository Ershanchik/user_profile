public class UserProfileCardBuilder implements UserProfileBuilder{
    private static final String CARD_DIVIDER="=====================";
    private final StringBuilder card=new StringBuilder(CARD_DIVIDER+"\n");
    @Override
    public UserProfileCardBuilder setUsername(String username){
        card.append("@").append(username).append("\n");return this;}
    @Override
    public UserProfileCardBuilder setEmail(String email){
        card.append("Contact: ").append(email).append("\n");return this;}
    @Override
    public UserProfileCardBuilder setBio(String bio){
        card.append(CARD_DIVIDER).append("\n").append(bio).append("\n");return this;}
    @Override
    public UserProfileCardBuilder setVerified(boolean verified){
        if(verified){card.append("[verified account]\n");}
        return this;}
    public String getResult(){
        return card.toString();}
}