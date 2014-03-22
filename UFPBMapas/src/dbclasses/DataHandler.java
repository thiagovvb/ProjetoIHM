package dbclasses;

import java.sql.SQLException;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DataHandler {

	public static final String DATABASE_NAME = "ufpbmaps";
	public static final int DATABASE_VERSION = 1;
	
	private DatabaseHelper dbhelper;
	private Context ctx;
	private SQLiteDatabase db;
	
	public DataHandler(Context ctx){
		this.ctx = ctx;
		dbhelper = new DatabaseHelper(ctx);
	}
	
	public DataHandler open(){
		db = dbhelper.getWritableDatabase();
		return this;
	}
	
	public void close(){
		dbhelper.close();
	}
	
	public long insertLandmark(String id, String acronym, String name, String picture, String description){
		ContentValues content = new ContentValues();
		content.put(LandmarkEntity.ID, id);
		content.put(LandmarkEntity.ACRONYM, acronym);
		content.put(LandmarkEntity.NAME, name);
		content.put(LandmarkEntity.PICTURE, picture);
		content.put(LandmarkEntity.DESCRIPTION, description);
		return db.insertOrThrow(LandmarkEntity.TABLE_NAME, null, content);
	}
	
	public Cursor fetchLandmark(int id){
		String[] columns = new String[] {LandmarkEntity.ACRONYM, LandmarkEntity.NAME, LandmarkEntity.PICTURE, LandmarkEntity.DESCRIPTION};
		String where = "id = " + id;
		return db.query(LandmarkEntity.TABLE_NAME, columns, where, null, null, null, null);
	}

	
	private static class DatabaseHelper extends SQLiteOpenHelper{

		public DatabaseHelper(Context ctx){
			super(ctx,DATABASE_NAME,null,DATABASE_VERSION);
		}

		@Override
		public void onCreate(SQLiteDatabase arg0) {
			// TODO Auto-generated method stub
			arg0.execSQL(LandmarkEntity.TABLE_CREATE);
		}

		@Override
		public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
			// TODO Auto-generated method stub
			arg0.execSQL("DROP TABLE IF EXISTS " + LandmarkEntity.TABLE_NAME);
			onCreate(arg0);
		}
		
	}
	
}
