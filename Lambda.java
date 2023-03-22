//lambda expression
//syntax- ()->
/*interface A
	{
		public void fn();  //abstract function
	}
class Lambda
	{
		public static void main(String[] args)
		{
			A obj=new A()  //annonymous class
			{
				public void fn()
				{
					System.out.println("This is fn inside b");
				}
			};
			obj.fn();
		}
	}*/
	
interface A
	{
		public void fn();  //abstract function
	}
class Lambda
	{
		public static void main(String[] args)
		{
			A obj=()-> 
				{
					System.out.println("This is fn inside b");
			};
			obj.fn();
		}
	}	