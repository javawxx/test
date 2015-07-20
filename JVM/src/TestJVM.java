import java.util.ArrayList;
import java.util.List;


public class TestJVM {

	public static class OOMObject{
		public byte[] bytes = new byte[1024 * 64];
	}
	
	public static void main(String[] args) throws InterruptedException{
		fillHeap(1000);
	}
	
	public static void fillHeap(int num) throws InterruptedException{
		
		List<OOMObject> list = new ArrayList<OOMObject>();
		Thread.sleep(10000);
		for(int i = 0 ; i < num ; i++){
			list.add(new OOMObject());
			System.out.println(num+"================================================");
			Thread.sleep(50);
			
		}
		System.gc();
		
	}
	
}
