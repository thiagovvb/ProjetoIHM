package dbclasses;

import java.sql.SQLException;
import java.util.ArrayList;

import entities.Landmark;
import entities.Route;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DataHandler {

	public static final String DATABASE_NAME = "ufpbmaps";
	public static final int DATABASE_VERSION = 2;
	
	private DatabaseHelper dbhelper;
	private Context ctx;
	private SQLiteDatabase db;
	
	public DataHandler(Context ctx){
		this.ctx = ctx;
		dbhelper = DatabaseHelper.getInstance(ctx);
	}
	
	public boolean isFilled(){
		return fetchLandmark().size() > 0;	
	}
	
	public DataHandler open(){
		db = dbhelper.getWritableDatabase();
		return this;
	}
	
	public void close(){
		dbhelper.close();
	}
	
	public boolean isOpen(){
		return db.isOpen();
	}
	
	public void clearTable(String table){
		db.execSQL("delete from " + table);
	}
	
	public long insertRoute(int id, int source, int dest, int map, int weight, String instruction){
		ContentValues content = new ContentValues();
		content.put(RouteEntity.ID, new String(id + ""));
		content.put(RouteEntity.SOURCE, new String(source + ""));
		content.put(RouteEntity.DESTINATION, new String(dest + ""));
		content.put(RouteEntity.MAP, new String(map + ""));
		content.put(RouteEntity.WEIGHT, new String(weight+ ""));
		content.put(RouteEntity.INSTRUCTION, new String(instruction + ""));
		return db.insertOrThrow(RouteEntity.TABLE_NAME, null, content);
	}
	
	public Route fetchRoute(int source, int destination){
		String[] columns = new String[]{RouteEntity.ID, RouteEntity.SOURCE, RouteEntity.DESTINATION, RouteEntity.MAP, RouteEntity.WEIGHT, RouteEntity.INSTRUCTION};
		String where = "source = " + source + " AND destination = " + destination;
		return assembleRoute(db.query(RouteEntity.TABLE_NAME, columns, where, null, null, null, null)).get(0);
	}
	
	public ArrayList<Route> fetchRouteBySrc(int source){
		String[] columns = new String[]{RouteEntity.ID, RouteEntity.SOURCE, RouteEntity.DESTINATION, RouteEntity.MAP, RouteEntity.WEIGHT, RouteEntity.INSTRUCTION};
		String where = "source = " + source;
		return assembleRoute(db.query(RouteEntity.TABLE_NAME, columns, where, null, null, null, null));
	}
	
	public ArrayList<Route> fetchRouteByDest(int dest){
		String[] columns = new String[]{RouteEntity.ID, RouteEntity.SOURCE, RouteEntity.DESTINATION, RouteEntity.MAP, RouteEntity.WEIGHT, RouteEntity.INSTRUCTION};
		String where = "destination = " + dest;
		return assembleRoute(db.query(RouteEntity.TABLE_NAME, columns, where, null, null, null, null));
	}
	
	public ArrayList<Route> fetchRoute(){
		String[] columns = new String[]{RouteEntity.ID, RouteEntity.SOURCE, RouteEntity.DESTINATION, RouteEntity.MAP, RouteEntity.WEIGHT, RouteEntity.INSTRUCTION};
		return assembleRoute(db.query(RouteEntity.TABLE_NAME, columns, null, null, null, null, null));
	}
	
	public long insertLandmark(int id, String acronym, String name, int picture, String description, int relevant){
		ContentValues content = new ContentValues();
		content.put(LandmarkEntity.ID, new String(id + ""));
		content.put(LandmarkEntity.ACRONYM, acronym);
		content.put(LandmarkEntity.NAME, name);
		content.put(LandmarkEntity.PICTURE, new String(picture + ""));
		content.put(LandmarkEntity.DESCRIPTION, description);
		content.put(LandmarkEntity.RELEVANT, new String(relevant + ""));
		return db.insertOrThrow(LandmarkEntity.TABLE_NAME, null, content);
	}
	
	public Landmark fetchLandmark(int id){
		String[] columns = new String[] {LandmarkEntity.ID, LandmarkEntity.ACRONYM, LandmarkEntity.NAME, LandmarkEntity.PICTURE, LandmarkEntity.DESCRIPTION, LandmarkEntity.RELEVANT};
		String where = "id = " + id;
		return assembleLandmark(db.query(LandmarkEntity.TABLE_NAME, columns, where, null, null, null, null)).get(0);
	}
	
	public ArrayList<Landmark> fetchLandmark(){
		String[] columns = new String[] {LandmarkEntity.ID, LandmarkEntity.ACRONYM, LandmarkEntity.NAME, LandmarkEntity.PICTURE, LandmarkEntity.DESCRIPTION, LandmarkEntity.RELEVANT};
		return assembleLandmark(db.query(LandmarkEntity.TABLE_NAME, columns, null, null, null, null, null));
	}

	public ArrayList<Landmark> fetchRelevantLandmarks(){
		String[] columns = new String[] {LandmarkEntity.ID, LandmarkEntity.ACRONYM, LandmarkEntity.NAME, LandmarkEntity.PICTURE, LandmarkEntity.DESCRIPTION, LandmarkEntity.RELEVANT};
		String where = "relevant = 1";
		return assembleLandmark(db.query(LandmarkEntity.TABLE_NAME, columns, where, null, null, null, null));
	}
	
	public ArrayList<Landmark> assembleLandmark(Cursor c){
		
		ArrayList<Landmark> v = new ArrayList<Landmark>();
		
		if(c.getCount() > 0){
			while(c.moveToNext()){
				String name = c.getString(c.getColumnIndex(LandmarkEntity.NAME));
				String id = c.getString(c.getColumnIndex(LandmarkEntity.ID));
				String acronym = c.getString(c.getColumnIndex(LandmarkEntity.ACRONYM));
				String picture = c.getString(c.getColumnIndex(LandmarkEntity.PICTURE));
				String desc = c.getString(c.getColumnIndex(LandmarkEntity.DESCRIPTION));
				String rele = c.getString(c.getColumnIndex(LandmarkEntity.RELEVANT));
				
				Landmark l = new Landmark(Integer.parseInt(id), acronym, name, Integer.parseInt(picture), desc, Integer.parseInt(rele));
				v.add(l);
				
			}
		}
		
		return v;
	}
	
	public ArrayList<Route> assembleRoute(Cursor c){
		
		ArrayList<Route> v = new ArrayList<Route>();
		
		if(c.getCount() > 0){
			while(c.moveToNext()){
				int id = Integer.parseInt(c.getString(c.getColumnIndex(RouteEntity.ID)));
				int src = Integer.parseInt(c.getString(c.getColumnIndex(RouteEntity.SOURCE)));
				int dest = Integer.parseInt(c.getString(c.getColumnIndex(RouteEntity.DESTINATION)));
				int map = Integer.parseInt(c.getString(c.getColumnIndex(RouteEntity.MAP)));
				int weight = Integer.parseInt(c.getString(c.getColumnIndex(RouteEntity.WEIGHT)));
				String inst = c.getString(c.getColumnIndex(RouteEntity.INSTRUCTION));
				
				Route r = new Route(id,src,dest,map,inst,weight);
				v.add(r);
				
			}
		}
		
		return v;
	}
	
	private static class DatabaseHelper extends SQLiteOpenHelper{
		
		private static DatabaseHelper sInstance = null;

		private DatabaseHelper(Context ctx){
			super(ctx,DATABASE_NAME,null,DATABASE_VERSION);
		}
		
		public static DatabaseHelper getInstance(Context ctx){
			if(sInstance == null){
				sInstance = new DatabaseHelper(ctx.getApplicationContext());
			}
			return sInstance;
		}

		@Override
		public void onCreate(SQLiteDatabase arg0) {
			// TODO Auto-generated method stub
			arg0.execSQL(LandmarkEntity.TABLE_CREATE);
			arg0.execSQL(RouteEntity.TABLE_CREATE);
		}

		@Override
		public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
			// TODO Auto-generated method stub
			arg0.execSQL("DROP TABLE IF EXISTS " + LandmarkEntity.TABLE_NAME);
			arg0.execSQL("DROP TABLE IF EXISTS " + RouteEntity.TABLE_NAME);
			onCreate(arg0);
		}
		
	}
	
}
