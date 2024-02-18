package HottellManageMentApp;

import java.util.ArrayList;
import java.util.HashMap;

public interface allHottelNecessaryFuncnality {

	
	CustomerDetails GetCustomerDetailsToAllocatRoom_s(HashMap map, ArrayList ar,ArrayList Sales);
	void BookedRooms(HashMap map);
	void GetAllotedRoomsCustomerDetails(HashMap map);
	void CloseTheAplication();
	void AvailableRooms(HashMap map,ArrayList ar);
	void TotalSalesForADay(ArrayList Sales);
	void CustomerCheckOut(HashMap map);
	void TotalRoomsInAHotell(ArrayList ar);
	
}
