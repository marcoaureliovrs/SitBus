package br.com.marcogorak.sitbus;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActTelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tela_inicial);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it = new Intent(ActTelaInicial.this, ActLogin.class);
                ActTelaInicial.this.startActivity(it);
                ActTelaInicial.this.finish();
            }
        }, 5000);
    }

}
