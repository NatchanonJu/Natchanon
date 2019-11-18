import java.util.*;

class Order {
	String fname;
	int fprice;
	int fqunt;
	public void Order(String fnameC,int fpriceC,int fquntC) {
		fname=fnameC;
		fprice=fpriceC;
		fqunt+=fquntC;
	}
	 
    	static Scanner input =new Scanner(System.in);
    	static Scanner inputS =new Scanner(System.in);
    	static int active=0;
    	static public int total;
    	static Queue<Integer> q = new LinkedList<>();
    	
	public static void menu() {//this method represent the menu
		System.out.println("\nFried Chicken\n   No.1 32 baht Original fried chicken \n   No.2 32 baht Crippy fired chicken ");
		System.out.println("Burger \n   No.3 64 baht Chicken burger \n   No.4 70 baht Crippy fired chicken burger ");
		System.out.println("Soda \n   No.5 20 baht Coke \n   No.6 20 baht Pepsi \nSend Order or exit\n   No.9 Send order.\n   No.0 Exit");
	}
		public static void firstcommand() {
			System.out.println("Welcome!!\n 1.make order\n 2.check queue \n 3.reset \n 4.cancel order");
			String Fcheck="0";
			int factive=0;
			boolean qcheck=q.isEmpty();
			do {
				System.out.print(">>");
				try{Fcheck = inputS.nextLine();}
				catch(Exception e){
					System.out.println(e);
				}
			switch (Fcheck) {//this switch command use for select the order
            case "1":
            	factive = 1;
                break;
            case "2":
            	if(qcheck==true) {
            		System.out.println("There is no queue right now.");
            	}
            	else {
            	System.out.println("There are "+q);
            	}
            	 break;
            case "3":
            	if(qcheck==true) {
            		System.out.println("There is no queue right now.");
            	}
            	else
            	{
            	q.clear();
            	System.out.println("Queue has been reset ");
            	}
            	break;
            case "4":
            	if(qcheck==true) {
            		System.out.println("There is no queue right now.");
            	}
            	else
            	{
            	System.out.println("There are "+q);
            	System.out.println("Which one would you like to remove? ");
            	System.out.print(">>");
            	int remove = input.nextInt();
            	q.remove(remove);
            	System.out.println("There are "+q+" now");
            	}
            	break;           
            case "0":
            	break;
            default:
            	System.out.println("Invalid option.");
                break;
            }
			}while(factive==0);{}
		}

	public static void main(String[]args) {
		int numo=0; //this one use for select order at switch case.
		Order obj1=new Order();
		Order obj2=new Order();
		Order obj3=new Order();
		Order obj4=new Order();
		Order obj5=new Order();
		Order obj6=new Order();
		int quant;
		for(int i=1;i<100;i++) {
			firstcommand();
			q.add(i);
			System.out.print("Queue No." +i+" Please select your menu!!");
		do {
			menu();//show menu
			System.out.println();
			System.out.print("Input the No. :");
			
			try { //this exception code is using for catch the wrong format number.
				numo = input.nextInt();
			}
			catch(Exception e){
				System.out.print("You input in the wrong order");
			}
			switch (numo) {//this switch command use for select the order
            case 1:
            	System.out.print("How many piece? :");
                quant = input.nextInt();
                obj1.Order("Original fried chicken", 32,quant);
                break;
            case 2:
            	System.out.print("How many piece? :");
                quant = input.nextInt();
                obj2.Order("Crippy fired chicken", 32,quant);
                break;
            case 3:
            	System.out.print("How many piece? :");
                quant = input.nextInt();
                obj3.Order("Chicken burger", 64,quant);
                break;
            case 4:
            	System.out.print("How many piece? :");
                quant = input.nextInt();
                obj4.Order("Crippy fired chicken burger", 70,quant);
                break;
            case 5:
            	System.out.print("How many piece? :");
                quant = input.nextInt();
                obj5.Order("Coke", 20,quant);
                break;
            case 6:
            	System.out.print("How many piece? :");
                quant = input.nextInt();
                obj6.Order("Pepsi", 20,quant);
                break;
            case 0:
    			obj1.fqunt=0;
    			obj2.fqunt=0;
    			obj3.fqunt=0;
    			obj4.fqunt=0;
    			obj5.fqunt=0;
    			obj6.fqunt=0;
    			total=0;
    			q.remove(i);
            	firstcommand();
            	break;
            case 9:
            	active=1;
                break;
            default:
                System.out.println("Invalid option.");
                break;
            }
			
		}while(active==0);
			System.out.print("No."+i+"\n");
			if(obj1.fqunt!=0) {System.out.println(obj1.fname+" "+obj1.fqunt+" unit  "+obj1.fprice*obj1.fqunt+"  baht"); total+=obj1.fprice*obj1.fqunt;}
			if(obj2.fqunt!=0) {System.out.println(obj2.fname+" "+obj2.fqunt+" unit  "+obj2.fprice*obj2.fqunt+"  baht"); total+=obj2.fprice*obj2.fqunt;}
			if(obj3.fqunt!=0) {System.out.println(obj3.fname+" "+obj3.fqunt+" unit  "+obj3.fprice*obj3.fqunt+"  baht"); total+=obj3.fprice*obj3.fqunt;}
			if(obj4.fqunt!=0) {System.out.println(obj4.fname+" "+obj4.fqunt+" unit  "+obj4.fprice*obj4.fqunt+"  baht"); total+=obj4.fprice*obj4.fqunt;}
			if(obj5.fqunt!=0) {System.out.println(obj5.fname+" "+obj5.fqunt+" unit  "+obj5.fprice*obj5.fqunt+"  baht"); total+=obj5.fprice*obj5.fqunt;}
			if(obj6.fqunt!=0) {System.out.println(obj6.fname+" "+obj6.fqunt+" unit  "+obj6.fprice*obj6.fqunt+"  baht"); total+=obj6.fprice*obj6.fqunt;}
			System.out.println("Total value :"+total+" baht");
			System.out.println("Please wait for a minutes, We are preparing your foods!!");
			System.out.println("------------------------------------------------------------------------");
			obj1.fqunt=0;
			obj2.fqunt=0;
			obj3.fqunt=0;
			obj4.fqunt=0;
			obj5.fqunt=0;
			obj6.fqunt=0;
			total=0;
			active=0;
			
			
		
		
	}
	

    }
    

	
	 
    
}
