class Rapido
{
void booking()
{
System.out.println("book a bike");
}
}
class cab
{
public static void main(String[] args)
{
Rapido r1=new Rapido();
User1.needToGo(r1);
User2.needToGo(r1);
}
}
class User1
{
static void needToGo(Rapido r2)
{
r2.booking();
}
}
class User2
{
static void needToGo(Rapido r3)
{
r3.booking();
}
}