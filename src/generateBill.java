

public class generateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float total=0;
		int i;
		
		PizzaOrder[] item1=new PizzaOrder[5];
		item1[0]=new PizzaOrder("Panner Pizza",2,200);
		item1[1]=new PizzaOrder("  Veg Pizza",3,150);
		item1[2]=new PizzaOrder("chicken Pizza",1,250);
		
		System.out.println("______________________________________________________________________________________________");
		
		System.out.println("----------------------------------BILL---------------------------------------------------------");
		System.out.println("______________________________________________________________________________________________");
	
		System.out.println("The Name of the product   |"+  "  Quantity  |"+" Price of Product |"+"  Total Price of Product");
		
		for(i=0;i<=2;i++)
		{
			total=total+item1[i].totalPrice();
			item1[i].printDetail();
			
			
		}

		System.out.println("Total Amount:-    "+total);
		
			float amount=total;
			float gst;
			amount=(amount*8)/100;
			gst=total+amount;
			System.out.println("-----------------------------------------------------------------------------------------------------");
			System.out.println(" Gst Tax:-     "+amount);
			System.out.println("GST(8%) WITH GST TOTAL AMOUNT:-     "+gst);
			System.out.println("----------------------------------THANK YOU ---------------------------------------------------------");
		
		
		
	}



	}


