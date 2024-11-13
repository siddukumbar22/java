public class Parameters{
	public static void main(String[] args) {
		
		room(23);
		university("vishveshwriya technology university",219);
        train("train is very fast","train is non stop", 98907);
        sports("cricket",11,70.25f,1.5d);



		
	}
	
		public static void room(int num){
			System.out.println( "room number" + num);
		}

		public static void university(String name,int num){
			System.out.println("university name" + name);
			System.out.println("number of collages" + num);

		}
	public static void train(String name,String type,int num ){

		System.out.println("chennai express " + name);
		System.out.println("shatabdi express" + type);
		System.out.println("train number"  +  num);

	}

	public static void sports (String game,int total,float size,double weight){
		System.out.println("game name" + game);
		System.out.println("number of players" + total);
		System.out.println("ground size" + size);
		System.out.println("bat weight" + weight);
	}

}