 class Amazonv1
{
   void sell()
{
    System.out.println("selling books");
}
}
 class Amazonv2 extends Amazonv1 {
  void sell()
  {
  System.out.println("selling electronics"+" toys");
  }
  }
  class Po
  {
  public static void main(String[] args)
  {
  Amazonv1 a=new Amazonv2();
  a.sell();
  }
  }
  
    