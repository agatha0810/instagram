package pl.akademiakodu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// jeśli klasa jest finalna
// to nie możemy po niej dziedziczyć

public  class InstagramPost {

    private static List<InstagramPost> postList = new ArrayList<>();
    // do inicjalizacji zmiennychstatatycznych

//    postList.add(new InstagramPost()); nie komplikuje się

    static {
       // postList.add(new InstagramPost());
    }

    private String username;

    private String content;

    private int numberOfLikes;

    private Set<Hashtag> hashtags = new HashSet<>();

    // jeśli metoda jest finaln
    //
    // to nie możemy przesłaniać w klasie,
    // po której dziedziczymy


    public InstagramPost(String username, String content) {
        this.username = username;
        this.content = content;
    }

    public void addHashtag(String name){
        hashtags.add(new Hashtag(name));
    }

    public void addHashtag(Hashtag hashtag){
        hashtags.add(hashtag);
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(username);
        stringBuilder.append(" ");
        stringBuilder.append(content);
        stringBuilder.append(",tagi");
        stringBuilder.append(hashtags);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        InstagramPost instagramPost = new InstagramPost("michalos1515",
                "Tokyo is my second home");
        instagramPost.addHashtag("standwithkerala");
        instagramPost.addHashtag("tokyo");
        System.out.println(instagramPost);

        InstagramPost instagramPost2 = new InstagramPost("anna",
                "Tokyo is my fisth home");;
        instagramPost2.addHashtag("tokyo");

        System.out.println(instagramPost);
    }


}
