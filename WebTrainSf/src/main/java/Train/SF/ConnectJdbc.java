package Train.SF;

import java.util.ArrayList;

public interface ConnectJdbc {

	void insertData(ArrayList<String> list);
	void selectData(ArrayList<String> list);
	boolean selectDatabool(ArrayList<String> list);
}
