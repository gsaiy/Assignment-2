package flour;

public class flourstore implements flouriteminterface
{
    public flour getquintal()
    {
        flour objquint=new flour(100,25);
        objquint.display();
        return objquint;
    }
    public flour get10kg()
    {
        flour obj10=new flour(10,30);
        obj10.display();
        return obj10;
    }
    public flour get1kg(){
        flour obj1=new flour(1,40);
        obj1.display();
        return obj1;
    }
}
