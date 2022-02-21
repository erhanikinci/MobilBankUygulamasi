package com.erhanikinci.denememenu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.fragment.NavHostFragment;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    Context contexttt = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


       FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Canlı Destek", Snackbar.LENGTH_LONG)
                        .setAction("Tıkla", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                MainActivity.this.setTitle("Canlı Destek Hattı Tıklandı");
                            }
                        }).show();
            }
        });



    }




@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {



        switch (item.getItemId()) {
            case R.id.action_hesaplar:
                Toast.makeText(contexttt, "Hesaplarım Tıklandı", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_guvenliCikis:
                Toast.makeText(contexttt, "Güvenli Çıkış Tıklandı", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_kartlarim:
                Toast.makeText(contexttt, "Kartlarım Tıklandı", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_krediler:
                Toast.makeText(contexttt, "Krediler Tıklandı", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_paraOdemeler:
                Toast.makeText(contexttt, "Ödemeler Tıklandı", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_paraTransferleri:
                Toast.makeText(contexttt, "Para Transferleri Tıklandı", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_profilVeAyarlar:
                Toast.makeText(contexttt, "Profil ve Ayarlar Tıklandı", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_QRIslemleri:
                Toast.makeText(contexttt, "QR Kod İşlemleri Tıklandı", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_dovizAltin:
                Toast.makeText(contexttt, "Döviz ve Altın Tıklandı", Toast.LENGTH_SHORT).show();
                break;
        }












        //menü submenü işlemleri
        int id = item.getItemId();

        //id işleminin eşleştirilme işlemleri
        if (id == R.id.action_subtumHesaplar){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subyeniHesapAc){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subvadesizHesaplarim){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subtumHesaplar){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subvadeliHesaplarim){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subaltinHesaplarim){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subkrediHesaplarim){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subyatirimHesaplarim){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subpos){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subyeniHesapAc){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subvadesizHesaplarim){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subhesaplarimArasi){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subbaskaHesabaHavaleEft){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subhizliİslemler){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subcebeHavale){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subkrediKartinaTransfer){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subkayitliAlicilarim){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subtransferTalimatlarim){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subwesternUnion){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subkrediKartlarim){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subbankaKartlarim){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subsanalKartlarim){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subkardGonderiTakib){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_submobilTemassizOdeme){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subotomatikTalimatlar){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subkayitliOdemeler){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subfaturaOdeme){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subcebeTlYukleme){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subkendiKrediKatrinaOdeme){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subbaskrediKartinaOdeme){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subtrafikOdemeleriOgsHgs){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subegitimSinavUniversiteler){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subkrediOdemeleri){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subsigortaEmeklilik){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subdigerOdemeler){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subdovizAlis){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subdovizSatis){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subaltinAlis){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subaltinSatis){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subdigitalKredi){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subbireyselKrediTaksitOdeme){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subtokiKrediTaksitOdeme){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subparaCekme){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subparaYatirma){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subodeme){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subanaSayfaDuzenleme){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subbilgilendirmeAyarlarim){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subguvenlikTercihi){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subsifreDegistirme){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subbildirimler){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subepostaGonderimTercihi){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subdigerTercihlerim){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subiletisimBilgilerim){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subElektrikFaturası){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subdogalgazFaturası){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subinternetFaturası){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subtelefonFaturası){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subsuFaturasi){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subkiraFaturası){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_subhesapKapat){
            Toast.makeText(contexttt, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }







        return super.onOptionsItemSelected(item);
    }

    public void mnu_hesaplarim(MenuItem item) {
    }

    public void mnu_paratransferi(MenuItem item) {
    }

    public void mnu_kartlarim(MenuItem item) {
    }

    public void mnu_odemeler(MenuItem item) {
    }

    public void mnu_dovizaltin(MenuItem item) {
    }

    public void mnu_krediler(MenuItem item) {
    }

    public void mnu_qrislemleri(MenuItem item) {
    }

    public void mnu_profilayarlar(MenuItem item) {
    }

    public void mnu_guvenlicikis(MenuItem item) {
    }

    public void mnu_hesaplar(MenuItem item) {
    }







}