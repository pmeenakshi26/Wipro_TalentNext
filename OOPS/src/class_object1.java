
class Box{
	int width;
	int height;
	int depth;
	Box(int w,int h,int d){
		   width = w;
		   height = h;
		   depth = d;
	}
	

int getvolume() {
	return width*height*depth;
    }

}

public class class_object1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box myBox=new Box(5,3,5);
		int volume = myBox.getvolume();
		System.out.println(volume);
		

	}

}