public class UserProfileCardBuilder implements UserProfileBuilder{
    private static final String CARD_DIVIDER="=========================";
    private final StringBuilder card=new StringBuilder(CARD_DIVIDER+"\n");
    @Override
    public UserProfileCardBuilder setUsername(String username){
        card.append("@").append(username).append("\n");
        return this;}
    @Override
    public UserProfileCardBuilder setDisplayName(String displayName){
        card.append(displayName).append("\n");
        return this;}
    @Override
    public UserProfileCardBuilder setEmail(String email){
        card.append("contact: ").append(email).append("\n");
        return this;}
    @Override
    public UserProfileCardBuilder setBio(String bio){
        card.append(CARD_DIVIDER).append("\n").append(bio).append("\n");
        return this;}
    @Override
    public UserProfileCardBuilder addInterest(String interest){
        card.append("#").append(interest).append(" ");
        return this;}
    @Override
    public UserProfileCardBuilder setVerified(boolean verified){
        if(verified){card.append("\n[verified account]");}
        return this;}
    public String getResult(){return card.toString();}}
