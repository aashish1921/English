package com.example.sakshichauhan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {


    private LinearLayoutManager mLayoutManager;
    private List<ModelClass> item_list;
    private modelAdapter mModelAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//      getSupportActionBar().hide();
      getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gb)));
      if (android.os.Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
        getWindow().setNavigationBarColor(getResources().getColor(R.color.gb));
      }

      if (android.os.Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){

        getWindow().setNavigationBarColor(getResources().getColor(R.color.gb));
      }
      if (android.os.Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
        Window window= this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.gb));
      }



        RecyclerView recyclerView =( RecyclerView) findViewById(R.id.recyclerview);
        item_list  = new ArrayList<>();
        mModelAdapter = new modelAdapter(this,item_list);
        mLayoutManager =new LinearLayoutManager(this);
        recyclerView.setAdapter(mModelAdapter);
        recyclerView.setLayoutManager(mLayoutManager);
        item_list.add(new ModelClass("How are you?","आप कैसे है?"));
        item_list.add(new ModelClass("Who are you? ","तुम कौन हो ?"));
        item_list.add(new ModelClass("Think before you speak.","सोच-समझ कर बोलो।"));
        item_list.add(new ModelClass("Just listen.","सुनिए तो।"));
        item_list.add(new ModelClass("Let me see. ","मुझे देखने दो।"));
        item_list.add(new ModelClass("Don’t cut jokes. ","मजाक मत करो।"));
        item_list.add(new ModelClass("Don’t talk nonsense.","बकवास मत करो। "));
        item_list.add(new ModelClass("I don’t care whether you stay or leave.","मुझे कोई परवाह नहीं चाहे तुम जाओ यारुको |"));
        item_list.add(new ModelClass("They don’t want to take up too much of your time.","वे आपका ज्यादा समय नहीं लेना चाहते ।"));
        item_list.add(new ModelClass("She does not even want to see your face.","वह तुम्हारा चेहरा भी नहीं देखना चाहती |"));
        item_list.add(new ModelClass("Do you take me for a fool?","क्या तुम मुझे बेवकूफ समझते हो ?"));
        item_list.add(new ModelClass("Why do you contradict me?","आप मेरी बात क्यों काटते हैं ?"));
        item_list.add(new ModelClass("When did you return?","आप वापस कब आये ?"));
        item_list.add(new ModelClass("Why did you come back soon?","तुम इतनी जल्दी वापस क्यों आगये ?"));
        item_list.add(new ModelClass("Who told it to you?","यह तुमसे किसने कहा था ?"));
        item_list.add(new ModelClass("He will defame me.","वह मुझे बदनाम करेगा |"));
        item_list.add(new ModelClass("I will do it now.","मैं इसे अभी कर दूंगा |"));
        item_list.add(new ModelClass("I will talk to him.","मैं उससे बात कर लूँगा |"));
        item_list.add(new ModelClass("I will not apologize.","मैं माफ़ी नहीं मांगूंगा |"));
        item_list.add(new ModelClass("I will not go for study from tomorrow.","मैं कल से पढने नहीं जाऊंगा |"));
        item_list.add(new ModelClass("I will not disappoint you.","मैं आपको निराश नहीं करूँगा ।"));
        item_list.add(new ModelClass("I will not take long to get ready.","मैं तैयार होने मैं ज्यादा देर नहीं लगाउंगी |"));
        item_list.add(new ModelClass("Will you appear at the exam?","क्या तुम परीक्षा मैं बैठोगे ? "));
        item_list.add(new ModelClass("Will you not come to my house?","क्या तुम मेरे घर नहीं चलोगे ?"));
        item_list.add(new ModelClass("Where will you go now?","अब तुम कहाँ जाओगे ?"));
        item_list.add(new ModelClass("How will you go now?","अब तुम कैसे जाओगे ?"));
        item_list.add(new ModelClass("What will he do after this?","वह इस के बाद क्या करेगा ?"));
        item_list.add(new ModelClass("When will the match start?","मैच कब शुरू होगा ?"));
        item_list.add(new ModelClass("It will be so.","ऐसा ही होगा |"));
        item_list.add(new ModelClass("You appear to me mad.","तुम पागल हो रहे हो |"));
        item_list.add(new ModelClass("I feel like wandering today.","आज मेरा घूमने का मन कर रहा है |"));
        item_list.add(new ModelClass("I feel like drinking tea.","मेरा चाय पीने का दिल कर रहा है |"));
        item_list.add(new ModelClass("I don’t feel like studying.","मेरा पढने का दिल नहीं कर रहा |"));
        item_list.add(new ModelClass("Now days, I don’t feel like doing anything else.","आज कल मेरा किसी और चीज़ में मन नहीं लगता |"));
        item_list.add(new ModelClass("The electricity went out while I was reading.","जब मैं पढ़ रहा था तब लाइट चली गई |"));
        item_list.add(new ModelClass("When I saw him he was watching TV.","जब मैंने उसे देखा तब वह टीवी देख रहा था |"));
        item_list.add(new ModelClass("I have told you twice.","मैं तुम्हे दो बार बोल चूका हूँ |"));
        item_list.add(new ModelClass("I have heard this song.","मैं यह गाना सुन चूका हूँ |"));
        item_list.add(new ModelClass("We have not seen Ram for several months.","हम ने कुछ महीनो से राम कोन हीं देखा |"));
        item_list.add(new ModelClass("I have known him for a long time.","मैं उस से बहुत दिनों से जानता हूँ |"));
        item_list.add(new ModelClass("I have not seen him since that day.","उस दिन से मैंने उसे नहीं देखा |"));
        item_list.add(new ModelClass("I have eaten nothing since yesterday.","मैंने कल से कुछ नहीं खाया |"));
        item_list.add(new ModelClass("He has been here since yesterday.","वह यहाँ 9 बजे से है |"));
        item_list.add(new ModelClass("He has not slept for few days.","वह कई दिनो से सोया नहीं है |"));
        item_list.add(new ModelClass("Have you read Gita?","क्या तुमने गीता पढ़ी है?"));
        item_list.add(new ModelClass("He has just come.","वह अभी आया हैं |"));
        item_list.add(new ModelClass("Have you ever met him?","क्या तुम उससे कभी मिले हो?"));
        item_list.add(new ModelClass("I have seen many things so far.","अब तक मैंने बहुत सी चीजे देखली हैं |"));
        item_list.add(new ModelClass("I have not done yet.","मैंने अभी तक नहीं किया |"));
        item_list.add(new ModelClass("I have not met him yet.","मैं उससे अभी तक नहीं मिला |"));
        item_list.add(new ModelClass("I have already watched this movie.","मैं यह movie पहले ही देख चूका हू | "));
        item_list.add(new ModelClass("I have already spoken to him.","मैं उसे पहले ही बोल चूका हूँ |"));
        item_list.add(new ModelClass("I have been here since.","मैं तब से यहीं हूँ |"));
        item_list.add(new ModelClass("Since when have you been here?","तुम यहाँ कबसे हो ?"));
        item_list.add(new ModelClass("I have not talked to him since.","मैंने तब से उससे बात नहीं की |"));
        item_list.add(new ModelClass("He has not seen his brother since.","उसने तब से अपने भाई को नहीं देखा |"));
        item_list.add(new ModelClass("I have not seen that boy since.","मैंने तब से उस लड़के को नहीं देखा |"));
        item_list.add(new ModelClass("Have you seen him anywhere since?","क्या तुमने उसे तब से कही देखा है ?"));
        item_list.add(new ModelClass("I have seen you somewhere before.","मैंने तुम्हे पहले कहीं देखा है |"));
        item_list.add(new ModelClass("I have forgotten how to play this game.","मैं इस खेल को खेलना भूल गया हूँ |"));
        item_list.add(new ModelClass("You can go when you have finished your work.","तुम अपना काम ख़त्म करके जा सकते हो |"));
        item_list.add(new ModelClass("I am certain you have made a mistake.","मुझे यकीन है कि तुमने गलती की है |"));
        item_list.add(new ModelClass("Someone has picked my pocket.","किसी ने मेरी जेब कटली |"));
        item_list.add(new ModelClass("It is not clear who has done this. ","यह स्पष्ट नहीं है कि ये  किसने  किया |"));
        item_list.add(new ModelClass("Have you heard the news?","क्या तुमने खबर सुनी ?"));
        item_list.add(new ModelClass("Have you seen me somewhere before?","क्या तुमने मुझे पहले कही देखा है ?"));
        item_list.add(new ModelClass("I have heard this somewhere before.","मैंने यह पहले कहीं सुना है |"));
        item_list.add(new ModelClass("Have I ever deceived you?","क्या मैंने कभी तुम्हे धोखा दिया हैं ?"));
        item_list.add(new ModelClass("Have you ever seen him in anger?","क्या तुमने कभी उसे ग़ुस्से मे देखा है ?"));
        item_list.add(new ModelClass("Have ever spoken truth?","क्या तुमने कभी सच बोला है ?"));
        item_list.add(new ModelClass("Have you ever gone abroad?","क्या तुम कभी विदेश गए हो ?"));
        item_list.add(new ModelClass("Have you ever eaten pizza?","क्या तुमने कभी पिज़्ज़ा खाया हैं ?"));
        item_list.add(new ModelClass("Have you ever played football?","क्या तुमने कभी फूटबोल खेला है ?"));
        item_list.add(new ModelClass("I have been studying since 8 O’clock.","मैं 8 बजे से पढाई कर रहा हूँ |"));
        item_list.add(new ModelClass("It has been raining for two days.","दो दिनों से बारिश हो रही है |"));
        item_list.add(new ModelClass("It may rain tomorrow.","कल बारिश हो सकती है |"));
        item_list.add(new ModelClass("He may be at home.","वह घर पर हो सकता है |"));
        item_list.add(new ModelClass("It must rain tomorrow.","कल जरुर बारिश होगी |"));
        item_list.add(new ModelClass("It might rain tomorrow.","शायद कल बारिश हो |"));
        item_list.add(new ModelClass("I am in the room.","मैं कमरे में हूँ |"));
        item_list.add(new ModelClass("I live at Gomtinagar in Lucknow.","में लखनऊ में गोमती नगर में रहती हूँ |"));
        item_list.add(new ModelClass("I most hate is telling a lie.","मुझे झूठ बोलने से सबसे ज्यादा नफरत है |"));
        item_list.add(new ModelClass("We hope you will not mind our leaving early.","हम आशा करते हैं कि आप हमारे जल्दी जाने का बुरा नहीं मानेंगे |"));
        item_list.add(new ModelClass("I hope you will excuse my coming late.","मैं आशा करती हूँ कि आप मेरे late आनेके लिए मुझे माफ़ कर देंगे |"));
        item_list.add(new ModelClass("He is expert in making excuses.","वह बहाने बनाने में expert  है |"));
        item_list.add(new ModelClass("You are proficient in telling a lie.","झूठ बोलने में तुम उस्ताद हो |"));
        item_list.add(new ModelClass("My mummy prevents me from talking to you.","मेरी मम्मी मुझे तुम से बात करने से रोकती है |"));
        item_list.add(new ModelClass("He prevented me from going there.","उसने मुझे वहाँ जाने से रोका |"));
        item_list.add(new ModelClass("I am not on speaking terms with him.","मेरी उनसे बातचीत नहीं है |"));
        item_list.add(new ModelClass("I came to meet you on the pretext of going to the college.","मैं तुमसे कॉलेज जाने का बहाना बनाकर मिलने आया हूँ |"));
        item_list.add(new ModelClass("She is bent on going to Delhi.","वह दिल्ली  जाने पे अड़ी है |"));
        item_list.add(new ModelClass("He always keeps on working.","वह हमेशा काम करता रहता है |"));
        item_list.add(new ModelClass("You kept me waiting for a long time.","तुमने मुझे बहुत देर इंतिजार करवाया |"));
        item_list.add(new ModelClass("He was watching TV while studying.","वह पढ़ते समय टीवी देख रहा था |"));
        item_list.add(new ModelClass("You stammer while speaking.","तुम बोलते समय हकलाते हो |"));
        item_list.add(new ModelClass("I found him sleeping.","मैंने उसे सोते हुए पाया |"));
        item_list.add(new ModelClass("I hate being late.","मुझे देर से आने से नफरत है |"));
        item_list.add(new ModelClass("What to do?","क्या करूँ ?"));
        item_list.add(new ModelClass("Where to go?","कहाँ जाऊं ?"));
        item_list.add(new ModelClass("She is just to weep.","वह रोने ही वाली है |"));
        item_list.add(new ModelClass("I was just to call you.","मैं आपको फ़ोन करने ही वाला था |"));
        item_list.add(new ModelClass("I was just to tell you.","मैं तुमको बताने ही वाला था |"));
        item_list.add(new ModelClass("You should teach your child how to behave.","तुम्हे बच्चे को सिखाना चाहिए कि कैसे बरताव करते हैं |"));
        item_list.add(new ModelClass("Did you tell him how to do it?","क्या तुमने उसे बताया कि कैसे करना है इसे ?"));
        item_list.add(new ModelClass("Tell me what to do next.","बताओ मुझे आगे क्या करना है |"));
        item_list.add(new ModelClass("I forget to call you.","मैं आपको कॉल करना भूल गया |"));
        item_list.add(new ModelClass("I want you do it.","मैं चाहता हूँ तुम इसे करो |"));
        item_list.add(new ModelClass("I will tell him to do it.","मैं उसे यह करने के लिए कहूँगा |"));
        item_list.add(new ModelClass("He knows what to do.","वह जानता है क्या करना है |"));
        item_list.add(new ModelClass("I get up at 8 o'clock.","मैं 8 बजे सो कर उठता हूँ |"));
        item_list.add(new ModelClass("I'll meet you at 9:30 o'clock.","मैं तुमसे 9:30 बजे मिलूँगा |"));
        item_list.add(new ModelClass("I will meet you at half past nine.","मैं तुमसे साढ़े 9 बजे मिलूँगा |"));
        item_list.add(new ModelClass("My birthday is on 5th June.","मेरा birthday 5 जून को है |"));
        item_list.add(new ModelClass("I will return in an hour.","मैं एक घंटे में आ जाऊंगा |"));
        item_list.add(new ModelClass("Get ready in 15 minutes.","15 मिनट में तैयार हो जाओ |"));
        item_list.add(new ModelClass("I study Math in the evening.","मैं शाम को गणित पढताहूँ |"));
        item_list.add(new ModelClass("I like to study at night.","मुझे रात में पढना पसंद हैं |"));
        item_list.add(new ModelClass("Leave me alone.","मुझे अकेला छोड़ दो।"));
        item_list.add(new ModelClass("Let it be.","जाने दो। "));
        item_list.add(new ModelClass("Have a heart.","कुछ तो ख्याल करो।"));
        item_list.add(new ModelClass("Don’t worry.","फिक्र मत करो।"));
        item_list.add(new ModelClass("What are you thinking?","तुम क्या सोच रहे हो?"));
        item_list.add(new ModelClass("What do you want?","तुम क्या चाहते हो ?"));
        item_list.add(new ModelClass("May I say something now?","अब मैं कुछ बोलूं ?"));
        item_list.add(new ModelClass("Sorry to hear that.","सुनकर बहुत दुख हुआ ।"));
        item_list.add(new ModelClass("I am feeling sleepy.","मुझे नींद आ रही है ।"));
        item_list.add(new ModelClass("Who do you want to meet?","आपको किससे मिलना है ?"));
        item_list.add(new ModelClass("I am asking you something.","मैं आपसे कुछ पूछ रहा हूं।"));
        item_list.add(new ModelClass("Are you listening to me?","क्या आप मेरी बात सुन रहे हो ?"));
        item_list.add(new ModelClass("How can I trust you ? ","मैं तुम पर भरोसा कैसे कर सकता हूं ?"));
        item_list.add(new ModelClass("I always think only about you.","मैं हमेशा सिर्फ तुम्हारे बारे में सोचता हूं |"));
        item_list.add(new ModelClass("I know you are not happy with me.","मैं जानता हूं आप मुझसे नाराज हो।"));
        item_list.add(new ModelClass("How can you do this?","तुम ऐसा कैसे कर सकते हो ?"));
        item_list.add(new ModelClass("I will do it myself.","मैं यह खुद करूंगा"));
        item_list.add(new ModelClass("I never said anything to you.","मैंने तुम्हें कभी कुछ नहीं कहा |"));
        item_list.add(new ModelClass("Why are you saying so?","तुम ऐसा क्यों कह रहे हो?"));
        item_list.add(new ModelClass("Do you think so? ","क्या तुम ऐसा सोचते हो?"));
        item_list.add(new ModelClass("I am coming from Dehradun.","मैं देहरादून से आ रहा हूं |"));
        item_list.add(new ModelClass("I will work from tomorrow.","मैं कल से काम करूंगा |"));
        item_list.add(new ModelClass("I'm good for you.","मैं तुम्हारे लिए अच्छा हूं |"));
        item_list.add(new ModelClass("I was always with you .","मैं हमेशा तुम्हारे साथ था |"));
        item_list.add(new ModelClass("I had nothing.","मेरे पास कुछ नहीं था |"));
        item_list.add(new ModelClass("What is that?","क्या है वो?"));
        item_list.add(new ModelClass("Sanjit is asleep","संजीत सोया हुआ है |"));
        item_list.add(new ModelClass("Do you not have mind.","क्या तुम्हारे पास दिमाग नहीं है |"));
        item_list.add(new ModelClass("I could not study.","मैं पढ़ नहीं सका |"));
        item_list.add(new ModelClass("haven’t spoken to Kamal about this matter yet.","मैंने अभी तक कमल से इसबारे में बातनहीं की |"));
        item_list.add(new ModelClass("He has not woken up yet.","वह अभी तक नहीं सोके उठा |"));
        item_list.add(new ModelClass("When did you leave?","तुम कब गए थे ?"));
        item_list.add(new ModelClass("When are you going on holiday?","तुम छुट्टी पे कब जा रहे हो ?"));
        item_list.add(new ModelClass("Since when have you been smoking?","तुम कब से स्मोकिंग कर रहे हो ?"));
        item_list.add(new ModelClass("Since when have you been here?","तुम यहाँ कबसे हो ?"));
        item_list.add(new ModelClass("When I saw her she was playing cards.","जब मैंने उसे देखा तब वह ताश खेल रही थी |"));
        item_list.add(new ModelClass("",""));




    }


  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main_menu,menu);
    MenuItem item =menu.findItem(R.id.search);
    SearchView searchView =(SearchView) item.getActionView();
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