import java.awt.Point;
public class point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Point[] points = new Point[3];
		
		for(int i=0; i<points.length; i++)
		{
			points[i] = new Point(i*i, i*i);
			
			for(Point p:points) //points dizisinin ba��ndan sonuna kadar her eleman�
							  //kontrol edecek	
			{
				System.out.println(p);
			}
		}

	}

}
