package all_stuff;

import java.util.ArrayList;

class IP
{
	static int NN;
	static int HH;

	public IP(int NN, int HH)
	{
		IP.NN=NN;
		IP.HH=HH;
	}
        
        
	
        @Override
	public String toString()
	{
		return NN+" "+HH;
	}
	
	int getNN(){return NN;}
	
	int getHH(){return HH;}


}
//each instance will have one Router

public class IRouter 

{       
         static IP ip;
         static int ID;
         static ArrayList<IP> myIPList ;
         
          IRouter(int ID,ArrayList<IP> i)
         {
             IRouter.ID=ID;
             myIPList=i;
         }
         
	public static void main(String[] args)
	{

	IRouter ir = makeIRouter(args);
            System.out.println("");
		

	}
	/*
	Command Line for UP: irouter java ID NN HH NN HH &
				
				
	*/
	static IRouter makeIRouter(String[] args)
	{
            int router_id=Integer.parseInt(args[0]);
            ArrayList<IP> list_ip= new ArrayList<>();
            
            for(int i=1; i<args.length; i+=2){
                IP ip = new IP(Integer.parseInt(args[i]), Integer.parseInt(args[i+1]));
                list_ip.add(ip);
            }
            IRouter ir = new IRouter(router_id, list_ip);
            
            
            
            
            return ir;
            
            
        }
         
         
        
	
	
			
		
}
