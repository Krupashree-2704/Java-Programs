interface Playable
{
	abstract public void play();
}
class Football implements Playable
{
	public void play()
	{
		System.out.println("Play Football");
	}
}
class Volleyball implements Playable
{
	public void play()
	{
		System.out.println("Play Volleyball");
	}
}
class Basketball implements Playable
{
	public void play()
	{
		System.out.println("Play Basketball");
	}
}
public class PlayableInterfaceProg {

	public static void main(String[] args) {
		Football football = new Football();
		Volleyball volleyball=new Volleyball();
		Basketball basketball = new Basketball();
		football.play();
		volleyball.play();
		basketball.play();

	}

}
