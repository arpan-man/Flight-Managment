package Train.SF;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;

@JsonAutoDetect
public class searchflight {
	
		searchflight() {
		}

		@JsonCreator
		public static searchflight newInstance() {
			return new searchflight();
		}

		

}

