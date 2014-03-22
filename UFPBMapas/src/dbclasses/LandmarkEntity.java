package dbclasses;

public class LandmarkEntity {
	
	public static final String ID = "id_landmark";
	public static final String ACRONYM = "acronym";
	public static final String NAME = "name";
	public static final String PICTURE = "picture";
	public static final String DESCRIPTION = "description";
	public static final String TABLE_NAME = "Landmark";
	
	public static final String TABLE_CREATE = 
			"create table landmark (id text not null," +
			"acronym text not null," +
			"name text not null," +
			"picture text not null," +
			"description text not null);";
	
	
	
}
