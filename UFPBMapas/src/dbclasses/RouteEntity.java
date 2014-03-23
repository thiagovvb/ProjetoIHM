package dbclasses;

public class RouteEntity {
	
	public static final String ID = "id";
	public static final String SOURCE = "source";
	public static final String DESTINATION = "destination";
	public static final String MAP = "map";
	public static final String WEIGHT = "weight";
	public static final String TABLE_NAME = "routes";
	public static final String INSTRUCTION = "instruction";
	
	public static final String TABLE_CREATE = 
			"create table landmark (id_route text not null," +
			"source_id text not null," +
			"destination_id text not null," +
			"map text not null," +
			"weight text not null," +
			"instruction text not null);";

}
