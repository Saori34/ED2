package ed2.nfa025.cnam.fr.ed2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CycleDeVie extends AppCompatActivity {

    public static final String APP_TAG="CNAM_NFA025_TAG";

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        Log.i(APP_TAG, "CycleDeVie : onCreate(): début !");
        setContentView(R.layout.activity_cycle_de_vie);
    }

    @Override
    public void onBackPressed() {
        Log.i(APP_TAG, "CycleDeVie.onBackPressed(): début !");
        this.finish();
    }
    @Override
    public void onRestart(){
        Log.i(APP_TAG, "CycleDeVie.onRestart(): début !");
        super.onRestart();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(APP_TAG, "CycleDeVie : onStart() : début !");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(APP_TAG, "CycleDeVie : onResume() : début !");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(APP_TAG, "CycleDeVie : onPause() : début !");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(APP_TAG, "CycleDeVie : onStop() : début !");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(APP_TAG, "CycleDeVie : onDestroy() : début !");
    }

    @Override
    public void onSaveInstanceState(final Bundle b){
        Log.i(APP_TAG, "CycleDeVie.onSaveInstanceState(): début !");
        super.onSaveInstanceState(b);
    }
}
