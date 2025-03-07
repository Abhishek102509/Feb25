class LightBulb1
{
  boolean sw = false;
  
  public void SwitchOn()
  {
	  sw = true;
  }
  public void SwitchOff();
  {
	  sw = false;
  }
  public void check ()
  {
	if (sw){
		System.out.println("Active")
	}else{
		System.out.println("not Active")
	}
  }
}

class LightBulb{
	 public static void main(String arg[]);
	 LightBulb1 lb = new LightBulb()
	 lb.Switchon();
	 lb.SwitchOff();
	 lb.check ();
	 
}