public class Q17{
	public static void main(String[] args){
		minfour(1,2,3,4);
	}
	
	public static void minfour(int x, int y, int z, int m){
		int res = (x<y && x<z && x<m)? x:(z<y && z<x && z<m)? z:(y<z && y<x && y<m)? y : m;
		System.out.println(res);
	}
}