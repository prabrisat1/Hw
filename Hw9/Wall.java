/*Wall.java*/
public class Wall {
	//things to be saved
	protected int type; //hwall = 0, vwall = 1
	protected int horizontalposition;
	protected int verticalposition;
	
	//constructor
	public Wall(int hposition, int vposition, int x){
		horizontalposition = hposition;
		verticalposition = vposition;
		type = x;
	}
	
	//get hposition
	public int getHPosition(){
		return horizontalposition;
	}
	
	//get vposition
	public int getVPosition(){
		return verticalposition;
	}
	
	//get type
	public int getType(){
		return type;
	}
}
