package revision;

public class Object {
	String Brand="Lenovo";
	String modName="Ideal pad Slim5";
	short window=10;
	short Ram=16;
	int intStorage=512;
	boolean isFingerPrint=true;
	String Cpu="Intel";
float ScreenSize=15.6f;
public void makeVideo() {
	System.out.println("yes it's available camera to make video is very clearly");
}
public void makeScreenShot() {
	System.out.println("yes make a Screen Shot, the short cut is print screen or alt+print screen");
}
public void wificonnection() {
	System.out.println("yes the laptop have new technology wireless fieldity with faster ");
}
private void fingerPrint() {
	System.out.println("yes this laptop new added finger print and password");

}
public static void main(String[] args) {
	Object obj= new Object();
	obj.makeVideo();
	obj.makeScreenShot();
	obj.wificonnection();
	obj.fingerPrint();
	System.out.println("******************************************");
	String brand2 = obj.Brand;
	System.out.println("Brand:"+brand2);
	String modName2 = obj.modName;
	System.out.println("ModelName:"+modName2);
	short window2 = obj.window;
	System.out.println("Window:"+window2);
	int intStorage2 = obj.intStorage;
	System.out.println("InternalStorage:"+intStorage2);
	boolean isFingerPrint2 = obj.isFingerPrint;
	System.out.println("FingerPrint:"+isFingerPrint2);
	short ram2 = obj.Ram;
System.out.println("RAM:"+ram2);
}
}
