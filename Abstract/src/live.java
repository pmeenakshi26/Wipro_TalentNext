import music.Playable;
import music_string.veena;
import music_wind.Saxophone;
public class live {
public static void main(String[]args) {
	veena a=new veena();
	Saxophone b=new Saxophone();
	System.out.println("Direct instance class : ");
	a.play();
	b.play();
	System.out.println("Using playable interface : "); 
	Playable p1=a;
	Playable p2=b;
	p1.play();
	p2.play();
}
}