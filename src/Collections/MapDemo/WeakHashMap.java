package Collections.MapDemo;

public class WeakHashMap {

   public static void main(String[] args){

//       WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
//
//       String key1 = new String("img1");
//       String key2 = new String("img1");
//
//       imageCache.put(key1, new Image("Image1"));
//       imageCache.put(key2, new Image("Image1"));
//
//       System.out.println(imageCache);
//
//       System.gc();
//
//        System.out.println(imageCache);

        //If a key is no longer in ordinary use. no strong references to it exist elsewhere in the application),
       // it can be garbage collected.
   }

}

class Image{

    private String name;

    public Image(String n){
        this.name = n;
    }


}
