package com.uber.sawa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.uber.sawa.home.ChatActivity;
import com.uber.sawa.home.EditProfileActivity;
import com.uber.sawa.home.EventActivity;
import com.uber.sawa.home.GramaticaActivity;
import com.uber.sawa.home.OtrosProyectosActivity;
import com.uber.sawa.home.VideosActivity;
import com.uber.sawa.home.VocabularioActivity;

public class MainPageActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    String user_id;
    DatabaseReference databaseReference;
    TextView t1,t2;
    Button personal,event,video,Vocabulario;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);


        firebaseAuth=FirebaseAuth.getInstance();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView =  findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        firebaseUser=FirebaseAuth.getInstance().getCurrentUser();
        if (firebaseUser==null)
        {
            Intent intent=new Intent(MainPageActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
        else
            {
                user_id =firebaseUser.getUid();
                databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(user_id);

                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("name").getValue(String.class);
                        String email=dataSnapshot.child("email").getValue(String.class);
                        t1=findViewById(R.id.name_text);
                        t2=findViewById(R.id.email_text);
                        t1.setText(name);
                        t2.setText(email);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }

//////////////////button page/////////////////////

        //buttonEvent
        event = (Button) findViewById(R.id.eventp);
        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainPageActivity.this, EventActivity.class);
                startActivity(intent);
            }
        });

        //buttonVideos
        video = (Button) findViewById(R.id.Videosb);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainPageActivity.this, VideosActivity.class);
                startActivity(intent);
            }
        });

        //buttonVoc
        Vocabulario = (Button) findViewById(R.id.Vocabulariob);
        Vocabulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainPageActivity.this, VocabularioActivity.class);
                startActivity(intent);
            }
        });
        //button grammer
        Button grammer;
        grammer = (Button) findViewById(R.id.grammer);
        grammer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainPageActivity.this, GramaticaActivity.class);
                startActivity(intent);
            }
        });

        //button OtrosProyectosActivity
        Button work;
        work = (Button) findViewById(R.id.word);
        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainPageActivity.this, OtrosProyectosActivity.class);
                startActivity(intent);
            }
        });
        //button chat
        Button chat;
        chat = (Button) findViewById(R.id.Chat);
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainPageActivity.this, ChatActivity.class);
                startActivity(intent);
            }
        });

        //button test
        Button test;
        test = (Button) findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainPageActivity.this, QuizMainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.facebook) {
            Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/CoDublish/?eid=ARAikzfIrSJIvcwD8Q0yLhuAjP5R5qFa9-VXvLPsaZ5W5pJ66ZF0OYgdrgjRvs0z-edTz5Goa_q5bI-5&timeline_context_item_type=intro_card_work&timeline_context_item_source=100004065635529&fref=tag"));
            startActivity(browserInent);
        } else if (id == R.id.instagram) {
            Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/co_dublish/"));
            startActivity(browserInent);
        } else if (id == R.id.twitter) {
            Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/dublish0"));
            startActivity(browserInent);

        }  else if (id == R.id.whatsapp) {
                    openWhatsApp();

        }else if (id == R.id.mail) {
                    Toast.makeText(getApplicationContext(),
                            "dublish.app@gmail.com",Toast.LENGTH_LONG).show();// Set your own toast  message

        } else if (id == R.id.share) {
                    Intent myIntent = new Intent(Intent.ACTION_SEND);
                    myIntent.setType("text/plain");
                    String shareBody="Your body here";
                    String shareSub="Your Subject here";
                    myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                    myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                    startActivity(myIntent.createChooser(myIntent,"Share Using"));
        }else if (id == R.id.location) {
            Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/CO+Dublish/@30.0376071,31.2113914,17z/data=!3m1!4b1!4m5!3m4!1s0x1458479c1369845b:0xd5c08157b1256c29!8m2!3d30.0376071!4d31.2092027?hl=ar"));
            startActivity(browserInent);

        } else if (id == R.id.call) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:00201027964584"));
                    startActivity(intent);

        }else if (id == R.id.nav_rides) {
            Intent intent=new Intent(MainPageActivity.this, EditProfileActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_signOut) {

            FirebaseUser firebaseUser=FirebaseAuth.getInstance().getCurrentUser();
            if (firebaseUser!=null){
                firebaseAuth.signOut();
                Intent intent=new Intent(MainPageActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
            else {
                Toast.makeText(getApplicationContext(),"User is already signed out",Toast.LENGTH_LONG).show();
            }

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void openWhatsApp(){
        try {
            String text = "Hola, Co Enseñanza";// Replace with your message.

            String toNumber = "+201027964584"; // Replace with mobile phone number without +Sign or leading zeros.


            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+toNumber +"&text="+text));
            startActivity(intent);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
