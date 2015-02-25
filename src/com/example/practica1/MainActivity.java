package com.example.practica1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

	
	private Button convertirPesosADolares;
	private Button convertirDolaresAPesos;
	private EditText tipoCambio;
	private EditText dolares;
	private EditText pesos;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        convertirPesosADolares = (Button) findViewById(R.id.btn_convertir1);
        convertirPesosADolares.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			   tipoCambio= (EditText) findViewById(R.id.tipoCambio1);
			   dolares = (EditText) findViewById(R.id.dolares1);
			   pesos = (EditText) findViewById(R.id.pesos1);
			   try{
				   float peso = Float.parseFloat(pesos.getText().toString());
				   float valor = Float.parseFloat(tipoCambio.getText().toString());
				   
				   float resultado = peso/valor;
				   
				   dolares.setText(resultado+" dolares");
			   }catch (Exception e){
	               dolares.setText("debes ingresar solo numeros");			   
			   }
				
			}
		});
        
        convertirDolaresAPesos = (Button) findViewById(R.id.btn_convertir2);
        convertirDolaresAPesos.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				tipoCambio = (EditText) findViewById(R.id.tipoCambio2);
				dolares = (EditText) findViewById(R.id.dolares2);
				pesos = (EditText) findViewById(R.id.pesos2);
				try{
					float dolar = Float.parseFloat(dolares.getText().toString());
					float valor = Float.parseFloat(tipoCambio.getText().toString());
					
					float resultado = dolar*valor;
					pesos.setText(resultado+" pesos");
				}catch (Exception e){
					pesos.setText("Debes ingresar solo numeros");
				}
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
