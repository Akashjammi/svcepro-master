package svce.svcepro;

/**
 * Created by harishananth on 02/10/17.
 */

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.sql.Timestamp;

import ai.api.AIListener;
import ai.api.AIServiceException;
import ai.api.android.AIConfiguration;
import ai.api.android.AIService;
import ai.api.model.AIError;
import ai.api.model.AIRequest;
import ai.api.model.AIResponse;
import ai.api.model.Result;
import co.intentservice.chatui.ChatView;
import co.intentservice.chatui.models.ChatMessage;

public class Chat extends AppCompatActivity implements AIListener {

    static AIService aiService;
    ChatView chatView;
    String uname="Loading..";
    TextView username;
    public static android.support.v7.widget.Toolbar toolbar;

    public Chat() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatalayout);

        Log.d("Debug", "TESTING");
        Bundle extras=getIntent().getExtras();
        if(extras!=null) {
            uname = extras.getString("uname");
        }
        final AIConfiguration aiConfig = new AIConfiguration("d10d7db961a147b38f69cd4e92dd4f84",
                AIConfiguration.SupportedLanguages.English,
                AIConfiguration.RecognitionEngine.System);

        aiService = AIService.getService(Chat.this, aiConfig);
        aiService.setListener(this);
        chatView = (ChatView)findViewById(R.id.chat_view);
        ActionBar actionBar = getSupportActionBar();
        //actionBar.setTitle("svce pro");
        actionBar.hide();
        chatView.setOnSentMessageListener(new ChatView.OnSentMessageListener() {
            @Override
            public boolean sendMessage(ChatMessage chatMessage) {
                Log.d("TEST", String.valueOf(chatMessage.getTimestamp()));
                new Fetch().execute(chatMessage.getMessage());
                return true;
            }
        });
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        username=toolbar.findViewById(R.id.name);
        username.setText(uname);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        chatView.addMessage(new ChatMessage("Hi "+uname+"! ,hope your'e doing great :D .This is Svce Pro bot v1.0,\nYou can call me Alyx!", timestamp.getTime(), ChatMessage.Type.RECEIVED));
        chatView.addMessage(new ChatMessage("Feel free to ask me anything related to Sri Venkateswara College Of Engineering", timestamp.getTime(), ChatMessage.Type.RECEIVED));

        Log.d("project", "chat activity");

    }



    public void onResult(final AIResponse response) {
        Intent intent;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Result result = response.getResult();

        chatView.addMessage(new ChatMessage(result.getFulfillment().getSpeech(), timestamp.getTime(), ChatMessage.Type.RECEIVED));

        Log.d("debug", "" + result.getAction());
        Log.d("debug", "" + result.getStringParameter("event"));

        switch (result.getAction()) {
            default:
                Log.d("Action", "NULL");
                break;
        }
    }

    @Override
    public void onError(final AIError error) {
        Log.d("Error", error.toString());
    }

    public void showMap(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(this.getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    @Override
    public void onListeningStarted() {
    }

    @Override
    public void onListeningCanceled() {
    }

    @Override
    public void onListeningFinished() {
    }

    @Override
    public void onAudioLevel(final float level) {
    }

    private class Fetch extends AsyncTask<String, Void, AIResponse> {

        private AIError aiError;

        @Override
        protected AIResponse doInBackground(final String... params) {
            final AIRequest request = new AIRequest();
            String query = params[0];
            request.setQuery(query);

            try {
                return Chat.aiService.textRequest(request);
            } catch (final AIServiceException e) {
                aiError = new AIError(e);
                return null;
            }
        }

        @Override
        protected void onPostExecute(final AIResponse response) {
            if (response != null) {
                onResult(response);
            } else {
                onError(aiError);
            }
        }
    }

}