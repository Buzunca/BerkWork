// Berk Uzuncaova
// 9/7/2019
// CSE142
// TA: Jun Song
// Assignment #1
//
// This program will display the lyrics to the song, "There Was an Old Woman Who Swallowed a Fly.”

public class Song {
   public static void main(String[] args){
      verseOne();
      
      blankLine();
      
      verseTwo();
            
      blankLine();
      
      verseThree();
      
      blankLine();

      verseFour();
      
      blankLine();
      
      verseFive();

      blankLine();
      
      verseSix();

      blankLine();
      
      verseSeven();

   }    
 
   public static void perhapsDie() {
      System.out.println("Perhaps she'll die.");
   }   
   
   public static void dontKnowWhy() {
      System.out.println("I don't know why she swallowed that fly,");  
   }
   
   public static void catchTheFly() {
      System.out.println("She swallowed the spider to catch the fly,");
   }
   
   public static void catchTheSpider() {
      System.out.println("She swallowed the bird to catch the spider,");
   }
   
   public static void catchTheBird() {
      System.out.println("She swallowed the cat to catch the bird,");
   }
   
   public static void catchTheCat() {
      System.out.println("She swallowed the dog to catch the cat,");
   }
   
   public static void blankLine() {
      System.out.println("");
   } 
   
   public static void verseOne() {
      System.out.println("There was an old woman who swallowed a fly.");
      dontKnowWhy();
      perhapsDie();     
   }
   
   public static void verseTwo() {
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      catchTheFly();
      dontKnowWhy();
      perhapsDie();
   }         

   public static void verseThree() {
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      catchTheSpider();
      catchTheFly();
      dontKnowWhy();
      perhapsDie();              
   }
   
   public static void verseFour() {
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      catchTheBird();
      catchTheSpider();
      catchTheFly();
      dontKnowWhy();
      perhapsDie();
   }
   
   public static void verseFive() {
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      catchTheCat();
      catchTheBird();
      catchTheSpider();
      catchTheFly();
      dontKnowWhy();
      perhapsDie();
   }
   
   public static void verseSix() {
      System.out.println("There was an old woman who swallowed a bear,");
      System.out.println("What a big scare to swallow a bear.");
      System.out.println("She swallowed the bear to catch the dog,");
      catchTheCat();
      catchTheBird();
      catchTheSpider();
      catchTheFly();
      dontKnowWhy();
      perhapsDie();      
   }
   
   public static void verseSeven() {
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");
   }               
}               
