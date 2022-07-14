package com.example.sakshichauhan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Shotcut extends AppCompatActivity {
    private LinearLayoutManager mLayoutManager;
    private List<ModelClass> item_list;
    private modelAdapter mModelAdapter;
    FloatingActionButton floatingActionButton;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shotcut);
        floatingActionButton = findViewById(R.id.plus);


//                Dialog dialog =new Dialog(Shotcut.this);
//                dialog.setContentView(R.layout.add_update);
//                EditText English =dialog.findViewById(R.id.english);
//                EditText Hindi =dialog.findViewById(R.id.hindi);
//                Button button =dialog.findViewById(R.id.add);

//                button.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                        String msg =English.getText().toString();
//                        String msg_2 =Hindi.getText().toString();

//                        String english="",hindi ="";
//
//                        if(!English.getText().toString().equals("")){
//                             english =English.getText().toString();
//
//                        }else {
//                            Toast.makeText(Shotcut.this,"Pls enter",Toast.LENGTH_LONG).show();
//                        }
//
//
//                            if(!Hindi.getText().toString().equals("")){
//
//                                 hindi =Hindi.getText().toString();
//
//                            }
//                            else {
//                                Toast.makeText(Shotcut.this,"Pls enter",Toast.LENGTH_LONG).show();
//
//                            }

//                         item_list.add(new ModelClass(msg,msg_2));
//                         mModelAdapter.notifyItemInserted(item_list.size()-1);
//                         recyclerView.scrollToPosition(item_list.size()-1);

//
//                    }
//                });
//
//                dialog.show();


//        getSupportActionBar().hide();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gb)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.gb));
        }
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.gb));
        }
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Dialog dialog = new Dialog(Shotcut.this);
                dialog.setContentView(R.layout.add_update);
                EditText English = dialog.findViewById(R.id.english);
                EditText Hindi = dialog.findViewById(R.id.hindi);
                Button button = dialog.findViewById(R.id.add);

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String english="",hindi ="";

                      if(!English.getText().toString().equals("")){
                           english =English.getText().toString();

                       }else {
                          Toast.makeText(Shotcut.this,"Pls enter",Toast.LENGTH_LONG).show();
                       }


                         if(!Hindi.getText().toString().equals("")){

                                hindi =Hindi.getText().toString();

                          }
                           else {
                               Toast.makeText(Shotcut.this,"Pls enter",Toast.LENGTH_LONG).show();

                           }

                         item_list.add(new ModelClass(english,hindi));
                        mModelAdapter.notifyItemInserted(item_list.size()-1);
                        recyclerView.scrollToPosition(item_list.size()-1);
                        dialog.dismiss();


                   }



                });

                dialog.show();


            }
        });
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        item_list = new ArrayList<>();
        mModelAdapter = new modelAdapter(this, item_list);
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(mModelAdapter);
        recyclerView.setLayoutManager(mLayoutManager);
        item_list.add(new ModelClass("KKRH?", "Kya Ker Rhi Ho ?"));
        item_list.add(new ModelClass("KN.", " Kuch Nhi."));
        item_list.add(new ModelClass("KkRH.", "Khana Kha Rhi Hu."));
        item_list.add(new ModelClass("S 2 U .", "Same  to You ."));
        item_list.add(new ModelClass("10Q", "Thank You."));
        item_list.add(new ModelClass("A6.", "I Don't know"));
        item_list.add(new ModelClass("BTW.", "By the way."));
        item_list.add(new ModelClass("DIY.", "Do it Yourself."));
        item_list.add(new ModelClass("FAQ.", "Frequently asked Questions."));
        item_list.add(new ModelClass("WTH.", "What the Hell./What the Heck"));
        item_list.add(new ModelClass("WFM.", "Works for Me."));
        item_list.add(new ModelClass("LOL.", "Laughing Out Loud."));
        item_list.add(new ModelClass("AMA.", "Ask Me  Anything..."));
        item_list.add(new ModelClass("A2A.", "Ask to Answer."));
        item_list.add(new ModelClass("DM.", "Direct Message."));
        item_list.add(new ModelClass("PM.", "Private Message."));
        item_list.add(new ModelClass("1IMO.", "In My Opinion"));
        item_list.add(new ModelClass("TIL.", "Today I Learned."));
        item_list.add(new ModelClass("TY.", " Thank You."));
        item_list.add(new ModelClass("TQ", "Thank You."));
        item_list.add(new ModelClass("GM.", "Good Morning."));
        item_list.add(new ModelClass("GE.", "Good Evening."));
        item_list.add(new ModelClass("GN.", "Good Night."));
        item_list.add(new ModelClass("JFY.", "Just For YOU."));
        item_list.add(new ModelClass("MTUK.", "More Than You Know."));
        item_list.add(new ModelClass("ACC", "Actually."));
        item_list.add(new ModelClass("ACE.", "Excellent or Great."));
        item_list.add(new ModelClass("AFS.", "Always Forever and Seriously."));
        item_list.add(new ModelClass("AUD.", "I don't Know."));
        item_list.add(new ModelClass("B4", "Before."));
        item_list.add(new ModelClass("BCOZ", "Because"));
        item_list.add(new ModelClass("BBS.", "Be Back Soon."));
        item_list.add(new ModelClass("BBL.", "Be Back Later."));
        item_list.add(new ModelClass("BBN.", "Be Back Never."));
        item_list.add(new ModelClass("BF", "Best Friend/Boy Friend."));
        item_list.add(new ModelClass("GF", "Girlfriend."));
        item_list.add(new ModelClass("BFF", "Best Friend Forever."));
        item_list.add(new ModelClass("BOT.", "Back On Topic."));
        item_list.add(new ModelClass("CYL.", "Catch You Later."));
        item_list.add(new ModelClass("KL.", "Cool."));
        item_list.add(new ModelClass("K.", "Okay."));
        item_list.add(new ModelClass("JLT.", "Just Like That."));
        item_list.add(new ModelClass("J4U.", "Just For You."));
        item_list.add(new ModelClass("J4L.", "Just For Laugh."));
        item_list.add(new ModelClass("J4F.", "Just For You."));
        item_list.add(new ModelClass("IK.", "I Know."));
        item_list.add(new ModelClass("IIL.", "I'm  in Love."));
        item_list.add(new ModelClass("IHS.", "I Hope So."));
        item_list.add(new ModelClass("IB.", "I'm Back."));
        item_list.add(new ModelClass("IAS.", "In a Second."));
        item_list.add(new ModelClass(".Hmm.", "Thinking."));
        item_list.add(new ModelClass("HHOJ.", "Ha Ha Only Joking."));
        item_list.add(new ModelClass("HHOK.", "Ha Ha Only Kidding."));
        item_list.add(new ModelClass("HHVF.", "Ha Ha Very Funny."));
        item_list.add(new ModelClass("OP.", "Original Post."));
        item_list.add(new ModelClass("OT", "Off Topic."));
        item_list.add(new ModelClass("SFLR.", "Sorry, for Late Reply."));
        item_list.add(new ModelClass("TIA.", "Thanks in Advance."));
        item_list.add(new ModelClass("TYVM", "Thank You Very Much."));
        item_list.add(new ModelClass("TYT.", "Take your Time."));
        item_list.add(new ModelClass("TTYL.", "Talk to  you Later."));
        item_list.add(new ModelClass("CL", "Cool"));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        MenuItem item = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                mModelAdapter.getFilter().filter(query);
                return false;
            }


            @Override
            public boolean onQueryTextChange(String newText) {
                mModelAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }


}