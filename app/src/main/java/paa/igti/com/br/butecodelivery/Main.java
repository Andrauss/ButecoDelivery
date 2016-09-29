package paa.igti.com.br.butecodelivery;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Fernando Andrauss on 28/09/2016.
 */


public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_home);
    }

    public void home(View view) {
        Intent i = new Intent(this, Home.class);
        startActivity(i);
    }

    public void finalP(View view) {
        Intent i = new Intent(this, Final.class);
        startActivity(i);
    }

    public void pedido(View view) {
        Intent i = new Intent(this, Pedido.class);
        startActivity(i);
    }

    public void pagamento(View view) {

        Intent i = new Intent(this, Pagamento.class);
        startActivity(i);
    }
}
