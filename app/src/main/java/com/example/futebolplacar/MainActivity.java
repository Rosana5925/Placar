package com.example.futebolplacar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goloA=0;
    int faltaA=0;
    int penaltiA=0;
    int cantoA=0;
    int autogoloA=0;
    int livresA=0;
    int goloB=0;
    int faltaB=0;
    int penaltiB=0;
    int cantoB=0;
    int autogoloB=0;
    int livresB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Altera o numero golo para team A.
     */

    public void goloTeamA (View v){
        goloA=goloA + 1;
        NumerogoloTeamA(goloA);
    }
    /**
     * Altera o numero golo para team B.
     */

    public void goloTeamB (View v){
        goloB=goloB + 1;
        NumerogoloTeamB(goloB);
    }
    /**
     * Altera o numero falta para Team A.
     */

    public void faltaTeamA (View v){
        faltaA=faltaA + 1;
        NumeroFaltaTeamA(faltaA);

    }
    /**
     * Altera o numero falta para Team B.
     */

    public void faltaTeamB (View v){
        faltaB=faltaB + 1;
        NumeroFaltaTeamB(faltaB);

    }

    /**
     * Altera o numero penalti para team A.
     */

    public void penaltiTeamA (View v){
        penaltiA=penaltiA + 1;
        NumeroPenaltiTeamA(penaltiA);

    }

    /**
     * Altera o numero penalti para team B.
     */

    public void penaltiTeamB (View v){
        penaltiB=penaltiB + 1;
        NumeroPenaltiTeamB(penaltiB);

    }
    /**
     * Altera o numero canto para team A.
     */

    public void cantoTeamA (View v){
        cantoA=cantoA + 1;
        NumeroCantoTeamA(cantoA);

    }
    /**
     * Altera o numero canto para team B.
     */

    public void cantoTeamB (View v){
        cantoB=cantoB + 1;
        NumeroCantoTeamB(cantoB);

    }
    /**
     * Altera o numero Autogolo para team A.
     */

    public void autogoloTeamA (View v){
        autogoloA=autogoloA + 1;
        NumeroAutogoloTeamA(autogoloA);
    }
    /**
     * Altera o numero Autogolo para team B.
     */

    public void autogoloTeamB (View v){
        autogoloB=autogoloB + 1;
        NumeroAutogoloTeamB(autogoloB);
    }
    /**
     * Altera o numero Livres para team A.
     */

    public void livresTeamA (View v) {
        livresA = livresA + 1;
        NumeroLivresTeamA(livresA);
    }
    /**
     * Altera o numero Livres para team B.
     */

    public void livresTeamB (View v) {
        livresB = livresB + 1;
        NumeroLivresTeamB(livresB);
    }
    /**
     * Altera o numero golo na text view para team A.
     */
    public void NumerogoloTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.golos_TeamA);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Altera o numero golo na text view para team B.
     */
    public void NumerogoloTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.golos_TeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Altera o numero faltas na text view para team A.
     */
    public void NumeroFaltaTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltaTeamA);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Altera o numero faltas na text view para team B.
     */
    public void NumeroFaltaTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltaTeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Altera o numero penalti na text view para team A.
     */
    public void NumeroPenaltiTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.penaltiTeamA);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Altera o numero penalti na text view para team B.
     */
    public void NumeroPenaltiTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.penaltiTeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Altera o numero canto na text view para team A.
     */
    public void NumeroCantoTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cantoTeamA);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Altera o numero canto na text view para team B.
     */
    public void NumeroCantoTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cantoTeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Altera o numero Autogolo na text view para team A.
     */
    public void NumeroAutogoloTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.autogoloTeamA);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Altera o numero Autogolo na text view para team B.
     */
    public void NumeroAutogoloTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.autogoloTeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Altera o numero Livres na text view para team A.
     */
    public void NumeroLivresTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.livreTeamA);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Altera o numero Livres na text view para team B.
     */
    public void NumeroLivresTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.livreTeamB);
        scoreView.setText(String.valueOf(score));
    }

    public void ReiniciarPlacar(View v){
        goloA=0;
        NumerogoloTeamA(goloA);
        faltaA=0;
        NumeroFaltaTeamA(faltaA);
        penaltiA=0;
        NumeroPenaltiTeamA(penaltiA);
        cantoA=0;
        NumeroCantoTeamA(cantoA);
        autogoloA=0;
        NumeroAutogoloTeamA(autogoloA);
        livresA=0;
        NumeroLivresTeamA(livresA);
        goloB=0;
        NumerogoloTeamB(goloB);
        faltaB=0;
        NumeroFaltaTeamB(faltaB);
        penaltiB=0;
        NumeroPenaltiTeamB(penaltiB);
        cantoB=0;
        NumeroCantoTeamB(cantoB);
        autogoloB=0;
        NumeroAutogoloTeamB(autogoloB);
        livresB=0;
        NumeroLivresTeamB(livresB);


    }


}