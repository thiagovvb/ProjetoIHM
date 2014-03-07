package dbclasses;

import android.provider.BaseColumns;

public class LandmarkContract {

	public LandmarkContract(){}
	
	public static abstract class LandmarkEntry implements BaseColumns{
		public static final String TABLE_NAME = "Landmark";
		public static final String COLUMN_LANDMARK_ID = "LandmarkID";
		public static final String COLUMN_LANDMARK_NAME = "LandmarkName";
		public static final String COLUMN_LANDMARK_PICTURE = "LandmarkPicture";
		public static final String COLUMN_LANDMARK_DESCRIPTION = "LandmarkDescription";
	}
	
}
