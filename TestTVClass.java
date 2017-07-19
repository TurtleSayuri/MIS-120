public class TestTVClass
{
   public static void main(String[] args)
   {
      System.out.println( "Begin testing TV Class" );
         
      TV myTV = new TV(); //Creating a new instance of TV Class
      myTV.setChannel(32);
      myTV.setVolume(10);
      myTV.turnOn();
      System.out.println ( myTV );  //Call toString method
         
      myTV.turnOn();          //Calling turnOn method
      myTV.setChannel( 55 );  //Set channel to channel 55
      myTV.channelUp();       //Calling channelUp method - changing channel
      myTV.setVolume( 33 );   //Set volume to level 33
      System.out.println ( myTV ); //Call toString method
      myTV.volumeUp();        //Calling volumeUp method - turning volume up
      myTV.volumeUp();        //Calling volumeUp method - turning volume up
      System.out.println ( myTV ); //Call toString method
      myTV.turnOff();         //Calling turnOff method
   
   }
}