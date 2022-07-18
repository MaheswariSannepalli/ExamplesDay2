package javaExamples;
import java.util.Random;
import java.util.ArrayList;

enum Jazz{
	BIRDLAND,
	AUTUMNLEAVES,
	DAYDREAM,
	TELLME;
}
class Jazzsongs {
	public void songs() 
	{
		//Loading enum values to array
		Jazz arr[] = Jazz.values();
		//generating random number
		Random rand = new Random();
		System.out.print("Jazz Songs generated are : ");
		for(int i=0;i<=10;i++)
		{
			System.out.println( arr[ rand.nextInt(arr.length) ] + " , ");
		}
	}
}

enum Folk{
	SPIRITS,
	HOME,
	BABEL,
	REVERSE;
}
class Folksongs {
	public void songs() 
	{
		//Loading enum values to array
		Folk arr[] = Folk.values();
		//generating random number
		Random rand = new Random();
		System.out.print("Folk Songs generated are : ");
		for(int i=0;i<=10;i++)
		{
			System.out.println( arr[ rand.nextInt(arr.length) ] + " , ");
		}
	}
}

class PlayLibrary{
	public void play(ArrayList<String> songs)
	{
		for(String song : songs  )
		{
			System.out.print( song);
		}
	}
}
public class User {
	public static void main(String[] args)
	{
		ArrayList<String> songs = new ArrayList<String>();
		songs.add("Truth Untold");
		songs.add("Ephiphany");
		songs.add("ON");
		
		PlayLibrary library = new PlayLibrary();
		library.play(songs);
		
		Folksongs fs = new Folksongs();
		fs.songs();
		
		Jazzsongs js = new Jazzsongs();
		js.songs();
	}
}
