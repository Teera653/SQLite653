package app.buusk.sqlite_653;

	import android.content.ContentValues;
	import android.content.Context;
	import android.database.sqlite.SQLiteDatabase;
	import android.database.sqlite.SQLiteDatabase.CursorFactory;
	import android.database.sqlite.SQLiteOpenHelper;
	import android.util.Log;

	public class control_653 extends SQLiteOpenHelper {

		private static final String DATABASE_NAME = "mydata495";
		private static final int DATABASE_VERSION = 1;
		private static final String TABLE_MEMBER = "members";
		
		public control_653(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL("CREATE TABLE " + TABLE_MEMBER 
					+ "(MemberID INTEGER PRIMARY KEY AUTOINCREMENT,"
					+ "Name TEXT(100),"
					+ "Age TEXT(100),"); //�����㹡�����ҧ���ҧ�ͧ sql �ǧ��纤�� field ��Դ��������С�á�˹��Ϳ���
			
				Log.d("CREATE TABLE", "Create table Successfully");
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE OF EXISTS " + TABLE_MEMBER);
			onCreate(db);
		}
		
		//InsertData
		public long InsertData(String strName, String strAge, String strBlood, String strCity, String strBirth, String strHobby, String strReligion, String strNation){
			try{
				SQLiteDatabase db;
				db = this.getWritableDatabase();
				ContentValues values = new ContentValues();
				values.put("Name", strName);
				values.put("Age", strAge);
				
				long l = db.insert(TABLE_MEMBER, null, values);
				db.close();
				return l;
			}catch (Exception c){
				
			}
			return -1;
		}

	}
