package dbclasses;

public class RouteEntity {
	
	public static final String ID = "id_route";
	public static final String SOURCE_ID = "source_id";
	public static final String DESTINATION_ID = "destination_id";
	public static final String MAP = "map";
	public static final String WEIGHT = "weight";
	
	public static final String TABLE_CREATE = 
			"create table landmark (id_route text not null," +
			"source_id text not null," +
			"destination_id text not null," +
			"map text not null" +
			"weight text not null);";

}
