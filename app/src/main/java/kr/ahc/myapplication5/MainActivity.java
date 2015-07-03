package kr.ahc.myapplication5;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.File;


public class MainActivity extends ActionBarActivity {

    private Button buttonSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttonSearch=(Button)findViewById(R.id.button);
        //buttonSearch.setOnClickListener(googleSearch();
    }


    public void googleSearch(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, "searchString");
        startActivity(intent);
    }

    public void browserUrl(View v) {
        Uri uri = Uri.parse("http://www.daegu.ac.kr");
    }

    public void dial(View v) {
        Uri uri = Uri.parse( "tel:01021264238");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }

    public void mp3(View v) {
       /*Intent intent=new Intent(Intent.ACTION_VIEW);
         Uri uri=Uri.parse("file://sdcard/"); 
        //intent.setDataAndType(uri, "audio/mp3"); 
        startActivity(intent); */

        //Intent intent = new Intent();
        //intent.setAction(android.content.Intent.ACTION_VIEW);
        //File file = new File("file://sdcard);
        //intent.setDataAndType(Uri.fromFile(file), "audio/*");
        ///startActivity(intent);

        //Uri uri=Uri.withAppendedPath( MediaStore.Audio.Media.INTERNAL_CONTENT_URI,"1");
        //Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        //startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
