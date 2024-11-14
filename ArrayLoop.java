public class ArrayLoop{
	public static void main(String[] args) {
		byte[] speed = {12,20,52,32,39,69,22,51,45,98};

		for(int i = 0; i < 10; i++){
			System.out.println(speed[i]); //left  to right
		}
		System.out.println("-------------------------");

      for(int i = 9; i >= 0; i--){
      	System.out.println(speed[i]);    //right to left
      }
      System.out.println("-------------------------");

      for(int i=5; i>=0; i--){
      	System.out.println(speed[i]);    //middle to left
      }
      System.out.println("-------------------------");

      for(int i=0; i<5; i++){
      	System.out.println(speed[i]);  //left to middle
      }
      System.out.println("-------------------------");

      for(int i=0; i<10; i=i+3){
      	System.out.println(speed[i]);  //skipping one element

      }


	}

	}
