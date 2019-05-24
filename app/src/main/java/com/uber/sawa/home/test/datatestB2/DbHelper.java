package com.uber.sawa.home.test.datatestB2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.uber.sawa.home.test.datatestB2.QuizContract.MovieEntry.KEY_ANSWER;
import static com.uber.sawa.home.test.datatestB2.QuizContract.MovieEntry.KEY_ID;
import static com.uber.sawa.home.test.datatestB2.QuizContract.MovieEntry.KEY_OPTA;
import static com.uber.sawa.home.test.datatestB2.QuizContract.MovieEntry.KEY_OPTB;
import static com.uber.sawa.home.test.datatestB2.QuizContract.MovieEntry.KEY_OPTC;
import static com.uber.sawa.home.test.datatestB2.QuizContract.MovieEntry.KEY_QUES;
import static com.uber.sawa.home.test.datatestB2.QuizContract.MovieEntry.TABLE_QUEST;

public class DbHelper extends SQLiteOpenHelper {
	private static final int DATABASE_VERSION = 1;
	// Database Name
	private static final String DATABASE_NAME = "triviaQuiz";
	// tasks table name

	private SQLiteDatabase dbase;
	public DbHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		dbase=db;
		String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
				+ KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
				+ " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
				+KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
		db.execSQL(sql);		
		addQuestions();
		//db.close();
	}
	private void addQuestions() {
		Question q1 = new Question("Al ________ a ese chico, se enamoró de él.", "vio", "ver", "visto", "ver");
		this.addQuestion(q1);
		Question q2 = new Question("Los niños todavía ________ dormidos.", "son", "están", "nulo", "están");
		this.addQuestion(q2);
		Question q3 = new Question("Iremos al concierto ________ que llueva.", "si no", "a no ser", "por", "a no ser");
		this.addQuestion(q3);
		Question q4 = new Question("Trae_______ porque hace muchísimo frío.", "bolso", "paraguas", "abrigo", "abrigo");
		this.addQuestion(q4);
		Question q5 = new Question("Los libros ________ me dejaste son muy entretenidos.", "quienes", "que", "cuales", "que");
		this.addQuestion(q5);
		Question q6 = new Question("Quiero comprar champú, así que voy a ir a ________.", "una charcutería", "una churrería", "una droguería", "una droguería");
		this.addQuestion(q6);
		Question q7 = new Question("¿Qué me quieres ________?", "decir", "dices", "digo", "decir");
		this.addQuestion(q7);
		Question q8 = new Question("Es importante que ________ un diccionario a clase.", "traerás", "traigas", "traes", "traigas");
		this.addQuestion(q8);
		Question q9 = new Question("Si no ________ en esta situación tan difícil, no te pediría ayuda", "esté", "estaba", "estuviera", "estuviera");
		this.addQuestion(q9);
		Question q10 = new Question("¿________ de los dos vestidos te gusta más?", "Cuáles", "Cuál", "Que", "Cuáles");
		this.addQuestion(q10);
		Question q11 = new Question("Si quieres hacer una copia de tus llaves, ve a una ________.", "ferretería", "carnicería", "peluquería", "ferretería");
		this.addQuestion(q11);
		Question q12 = new Question("Te conté la verdad pero no ________ creíste.", "se la", "te la", "me le", "te la");
		this.addQuestion(q12);
		Question q13 = new Question("Ojalá mañana _______ suerte en el examen.", "tienes", "tendrás", "tengas", "tengas");
		this.addQuestion(q13);
		Question q14 = new Question("________ ver la película, lee el libro", "tan pronto como", "mientras", "antes de", "antes de");
		this.addQuestion(q14);
		Question q15 = new Question(". Es mejor que ________ despacio", "comes", "comas", "comieras", "comas");
		this.addQuestion(q15);
		Question q16 = new Question("Sería conveniente que ________ tus gafas a clase.", "trajeras", "hayas traído", "traes", "trajeras");
		this.addQuestion(q16);
		Question q17 = new Question("Ayer, mi prima me dijo que me ________ al concierto el próximo sábado.", "invite", "invitaría", "invitaría", "comas");
		this.addQuestion(q17);
		Question q18 = new Question("No creo que ________ diciendo la verdad.", "estás", "estabas", "estés", "estés");
		this.addQuestion(q18);
		Question q19 = new Question("________ ya habías preparado la comida, puse la mesa.", "Como", "Para que", "Así que", "Como");
		this.addQuestion(q19);
		Question q20 = new Question("Me caí al _________ las escaleras de mi casa.", "bajar", "bajando", "bajé", "bajar");
		this.addQuestion(q20);
		Question q21 = new Question("Esa ciudad es muy peligrosa: ¡_________ cuidado!", " tienes", "tendrás", "ten", "ten");
		this.addQuestion(q21);
		Question q22 = new Question("Pasa _________ la panadería y compra pan y dulces.", " en", "por", "con", "por");
		this.addQuestion(q22);
		Question q23 = new Question("_________ practicando español y mejorarás en poco tiempo.", " Sigue", "Estés", "Llevas", "Sigue");
		this.addQuestion(q23);
		Question q24 = new Question("_________ pocos dulces, perderás peso.", " comer", "comiendo", "comes", "comiendo");
		this.addQuestion(q24);
		Question q25 = new Question(" _________ sabía su número de teléfono, no lo llamé.", " como", "porque", "aunque", "aunque");
		this.addQuestion(q25);
		Question q26 = new Question("Aunque Pedro _________ coche para viajar, nunca iría con él de vacaciones.", " tengo", "tenga", "tuviera", "tuviera");
		this.addQuestion(q26);
		Question q27 = new Question("Ojalá ayer _________ en casa cuando te _________.", " hubieras estado/llamé", "habrías estado/llamé", "hubieras estado/llamaría", "habrías estado/llamé");
		this.addQuestion(q27);
		Question q28 = new Question("No _________ ese ejercicio, no es necesario.", " haz", "hagas", "haces", "hagas");
		this.addQuestion(q28);




	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
		// Drop older table if existed
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
		// Create tables again
		onCreate(db);
	}
	// Adding new question
	public void addQuestion(Question quest) {
		//SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(KEY_QUES, quest.getQUESTION()); 
		values.put(KEY_ANSWER, quest.getANSWER());
		values.put(KEY_OPTA, quest.getOPTA());
		values.put(KEY_OPTB, quest.getOPTB());
		values.put(KEY_OPTC, quest.getOPTC());
		// Inserting Row
		dbase.insert(TABLE_QUEST, null, values);		
	}
	public List<Question> getAllQuestions() {
		List<Question> quesList = new ArrayList<Question>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST + " ORDER BY "+ "RANDOM()";
		dbase=this.getReadableDatabase();
		Cursor cursor = dbase.rawQuery(selectQuery, null);
		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do {
				Question quest = new Question();
				quest.setID(cursor.getInt(0));
				quest.setQUESTION(cursor.getString(1));
				quest.setANSWER(cursor.getString(2));
				quest.setOPTA(cursor.getString(3));
				quest.setOPTB(cursor.getString(4));
				quest.setOPTC(cursor.getString(5));
				quesList.add(quest);
			} while (cursor.moveToNext());
            Collections.shuffle(quesList);
		}
		// return quest list
		return quesList;
	}
	public int rowcount()
	{
		int row=0;
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);
		row=cursor.getCount();
		return row;
	}
}
