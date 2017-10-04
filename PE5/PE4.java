
public class PE4 {

	public static class PalmOuter{
		Hand doThis() {
			class PalmInner implements Hand{

				@Override
				public void facepalm() {
					// TODO Auto-generated method stub
					System.out.println("Place your palm on face");
					
				}				
				
			}
			PalmInner palmIn = new PalmInner();
			return palmIn;
		}
	}
	public static void main(String[] args) {
		PalmOuter palmout = new PalmOuter();
		palmout.doThis();
		
	}
}
