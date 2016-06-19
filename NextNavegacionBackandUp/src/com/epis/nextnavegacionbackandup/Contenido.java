package com.epis.nextnavegacionbackandup;

import android.os.Bundle;
//import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.annotation.SuppressLint;
//import android.app.ActionBar;
import android.support.v7.app.ActionBar;

@SuppressLint("NewApi") public class Contenido extends AppCompatActivity{

	@SuppressLint("NewApi") @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contenido);
		
		ActionBar atras = getSupportActionBar();
		atras.setDisplayHomeAsUpEnabled(true);
	}
	

}
