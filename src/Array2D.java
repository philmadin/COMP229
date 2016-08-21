
public class Array2D<T> {

	int width=0;
	int height=0;
	public Cell[][] space;
	public Array2D(int inWidth,int inHeight){
		width=inWidth;
		height=inHeight;
		space = new Cell[inWidth][inHeight];
		
	}
	
}
