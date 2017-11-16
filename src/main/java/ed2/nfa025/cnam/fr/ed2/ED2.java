package ed2.nfa025.cnam.fr.ed2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

public class ED2 extends AppCompatActivity {

    public static final String APP_TAG="CNAM_NFA025_TAG";
    public static final String BNDL_MSG_KEY="BNDL_MSG_KEY";

    @Override
    public void onCreate(final Bundle savedInstanceState){
        Log.i(APP_TAG, "ED2.onCreate(): début !");
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.main);
        if(null != savedInstanceState){
            Log.i(APP_TAG, "ED2 restaure son état précédent !");
            EditText msg_text_widget = (EditText)this.findViewById(R.id.main_msg_te);
            msg_text_widget.setText(savedInstanceState.getString(BNDL_MSG_KEY));
        }else{
            Log.i(APP_TAG, "ED2.onCreate(): premier démarrage !");
        }Log.i(APP_TAG, "ED2.onCreate(): fin !");
    }
    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState){
        Log.i(APP_TAG, "ED2.onRestoreInstanceState(): début !");
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(APP_TAG, "ED2.onRestoreInstanceState(): fin !");
    }
    @Override
    public void onBackPressed() {
        Log.i(APP_TAG, "ED2.onBackPressed(): début !");
        this.finish();
        Log.i(APP_TAG, "ED2.onBackPressed(): fin !");
    }@Override
    public void onRestart(){
        Log.i(APP_TAG, "ED2.onRestart(): début !");
        super.onRestart();
        Log.i(APP_TAG, "ED2.onRestart(): fin !");
    }
    @Override
    public void onStart(){
        Log.i(APP_TAG, "ED2.onStart(): début !");
        super.onStart();
        Log.i(APP_TAG, "ED2.onStart(): fin !");
    }
    @Override
    public void onResume(){
        Log.i(APP_TAG, "ED2.onResume(): début !");
        super.onResume();
        Log.i(APP_TAG, "ED2.onResume(): fin !");
    }
    @Override
    public void onPause(){
        Log.i(APP_TAG, "ED2.onPause(): début !");
        super.onPause();
        Log.i(APP_TAG, "ED2.onPause(): fin !");
    }
    @Override
    public void onStop(){
        Log.i(APP_TAG, "ED2.onStop(): début !");
        super.onStop();
        Log.i(APP_TAG, "ED2.onStop(): fin !");
    }
    @Override
    public void onDestroy(){
        Log.i(APP_TAG, "ED2.onDestroy(): début !");
        super.onDestroy();
        Log.i(APP_TAG, "ED2.onDestroy(): fin !");
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        Log.i(APP_TAG, "ED2.onSaveInstanceState(): début !");
        super.onSaveInstanceState(savedInstanceState);
        EditText msg_text_widget = (EditText)this.findViewById(R.id.main_msg_te);
        savedInstanceState.putString(BNDL_MSG_KEY
                , msg_text_widget.getText().toString());
        Log.i(APP_TAG, "ED2.onSaveInstanceState(): fin !");
    }
}
