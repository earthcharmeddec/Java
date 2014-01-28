/**
* Creates an ASCII peacock art using escape sequences and println statements.
* The second peacock from "http://www.ascii-art.de/ascii/pqr/peacock.txt" was used as an 
* inspiration to create a mirror image and design as needed.
* @author Santhiya Holmes
* @param args command line arguments (not used)
*/
/*Before Escape Sequences
"												        o");       "	 o
"													  o%"          "	  %o
"												     //"		   "		\\
"											    -="~\"			   "		/~"=-
"											      ~\\\"			   "	   ///~
"											        \\\"		   "	  ///
"											         \\\"		   "	 ///
"												      );\"		   "	/;(
"      										         /|;;\"        "   /;;|\
"      									        """;;;;;;;\"	   "  /;;;;;;;"""
"      							          ///"""""""";;;;;;\"	   " /;;;;;;""""""""///
"      						  ___////+++++""""""""""""";;;@@\"     "/@@;;;"""""""""""""+++++////___
"                 __________///////++++++++++++++""""""""@@@@%)"   "(%@@@""""""""++++++++++++++///////_________
"       ....__/0)///0)//0)//0)/++////////++++++++++"""@@@%%%%%/"   " \%%%%%@@@"""+++++++++///////++/(0//(0//(0///(0/__....
"  ..---0)/--------////////////////+++++++/////+++++@@%%%%%%%/"	   "  \%%%%%%%@@+++++/////+++++++///////////////-------/(0---..
" 	 ..///---0)---0)///0)//0)///0)/////////+++++====@%%%%%%/" 	   "   \%%%%%@====+++++////////(0///(0//(0///(0---(0---///..
"   ...0)....//----///------////////////+++++///"     \/\\//" 	   "    \\//\/	"///+++++///////////------///----//....(0...
"	  //../0)--0)///0)///0)///0)//++++/////          /  \/"		   "	 \/  \		  /////++++//(0///(0///(0///(0--(0/..//
"	  --///--------///////////+++/////             _/   /"         "      \   \_            /////+++//////////--------///--
".-//..0).-/0)--0)--0)--0)--..                      /\  /"         "       \  /\                    ..--(0--(0--(0--(0/-.(0..//-.
"		.......--/////////.                            /\_"        "      _/\						       ./////////--.......
"			 .0)..0).."											   "										   ..(0..(0.
*/
public class Art {
/**
*Combines all the parts of the peacock together.
*/
	public static void main(String[] args)
	{
		top();
		middle();
		bottom();
}
	/**
	* Creates the neck portion of the peacock
	*/
	public static void top() {
		System.out.println( "	  	o");
		System.out.println( "	        %o");
		System.out.println(	"		  \\\\");
		System.out.println(	"                  /~\"=-");
		System.out.println( "	         ///~");
		System.out.println(	"	        ///");
		System.out.println(	"	       ///");
		System.out.println(	"	      /;(");
     	System.out.println( "             /;;|\\");
		}
	/**
	* Creates the midsection of the peacock
	*/
	public static void middle() {
		System.out.println("	    /;;;;;;;\"\"\"");
		System.out.println(" 	   /;;;;;;\"\"\"\"\"\"\"\"///");
		System.out.println(" 	  /@@;;;\"\"\"\"\"\"\"\"\"\"\"\"\"+++++////___");
		System.out.println("	  (%@@@\"\"\"\"\"\"\"\"++++++++++++++///////_________");
		System.out.println("	   \\%%%%%@@@\"\"\"+++++++++///////++/(0//(0//(0///(0/__....");
		System.out.println("	    \\%%%%%%%@@+++++/////+++++++///////////////-------/(0---..");
		System.out.println(" 	     \\%%%%%@====+++++////////(0///(0//(0///(0---(0---///..");
}
	/**
	* Creates the feet and the bottom portion of the peacock
	*/
	public static void bottom() {
		System.out.println("              \\\\//\\/	\"///+++++///////////------///----//....(0...");
		System.out.println("	       \\/  \\	     /////++++//(0///(0///(0///(0--(0/..//");
		System.out.println("        	\\   \\_           /////+++//////////--------///--");
		System.out.println("        	 \\  /\\                  ..--(0--(0--(0--(0/-.(0..//-.");
		System.out.println("        	_/\\			     ./////////--.......");
		System.out.println("					           ..(0..(0.");
}	
}
