package Application;

import java.util.Date;

import Entities.ORDER;
import Entities_Enum.ORDER_STATUS;

public class PROGRAMA {

	public static void main(String[] args) {
		
		ORDER order = new ORDER(1080, new Date(), ORDER_STATUS.PENDING_PAYMENT);
		
		System.out.println(order);
		
		ORDER_STATUS os1 = ORDER_STATUS.DELIVERED;
		ORDER_STATUS os2 = ORDER_STATUS.valueOf("DELIVERED");
		
		System.out.println();
		
		System.out.println("os1 = " + os1);
		System.out.println("os2 = " + os2);
	}

}
