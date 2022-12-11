package com.example.skincare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Skin_BrandProd extends AppCompatActivity {

    ArrayList<BrandModel> items = new ArrayList<BrandModel>();
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    recyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_brand_prod);

        items.add(new BrandModel("A-Derma 艾芙美", "專注於皮膚修護的法國品牌",R.drawable.ic_aderma));
        items.add(new BrandModel("Aesop", "天然有機的澳洲品牌",R.drawable.ic_aesop));
        items.add(new BrandModel("Advanced 艾德凡斯","台灣醫美平價選擇",R.drawable.ic_advance));
        items.add(new BrandModel("Aglae","護膚保養專用的加拿大品牌",R.drawable.ic_aglae));
        items.add(new BrandModel("AHC", "韓國醫學美容通路的專業護膚品牌",R.drawable.ic_ahc));
        items.add(new BrandModel("Apivita", "來自希臘的天然保養品牌",R.drawable.ic_apivita));
        items.add(new BrandModel("Aveda", "主打植物成份的美國品牌",R.drawable.ic_aveda));
        items.add(new BrandModel("Aveeno", "以燕麥為材料的美國品牌",R.drawable.ic_aveeno));
        items.add(new BrandModel("Avene", "專攻敏弱肌膚法國品牌",R.drawable.ic_avene));
        items.add(new BrandModel("Bioderma 貝膚黛瑪", "韓國醫學美容通路的護膚品牌",R.drawable.ic_bioderma));
        items.add(new BrandModel("Bioneo 德國百妮","",R.drawable.ic_bioneo));
        items.add(new BrandModel("Biotherm 碧兒泉","",R.drawable.ic_biotherm));
        items.add(new BrandModel("Bobbi Brown","",R.drawable.ic_bobbibrown));
        items.add(new BrandModel("CeraVe","",R.drawable.ic_cerave));
        items.add(new BrandModel("Cetaphil 舒特膚","",R.drawable.ic_cetaphil));
        items.add(new BrandModel("Clairs 克蘭詩","",R.drawable.ic_clarins));
        items.add(new BrandModel("Clinique 倩碧","",R.drawable.ic_clinique));
        items.add(new BrandModel("Darphin","",R.drawable.ic_darphin));
        items.add(new BrandModel("DermaLab 德美醫研","",R.drawable.ic_dermalab));
        items.add(new BrandModel("DermEden 得美登","",R.drawable.ic_dermeden));
        items.add(new BrandModel("Dermina 歐敏膚","",R.drawable.ic_dermina));
        items.add(new BrandModel("DF 美肌醫生","",R.drawable.ic_df));
        items.add(new BrandModel("Diptyque","",R.drawable.ic_diptyque));
        items.add(new BrandModel("D program 敏感話題","",R.drawable.ic_dprogram));
        items.add(new BrandModel("Dr.Cink 達特聖克","",R.drawable.ic_drcink));
        items.add(new BrandModel("Dr.Douxi 朵璽","",R.drawable.ic_drdouxi));
        items.add(new BrandModel("Dr.Hsieh 達特醫","",R.drawable.ic_drhsieh));
        items.add(new BrandModel("Dr.Huang 黃禎憲","",R.drawable.ic_drhuang));
        items.add(new BrandModel("DR.Jou 森田藥粧","",R.drawable.ic_drjou));
        items.add(new BrandModel("Dr.May 美博士","",R.drawable.ic_drmay));
        items.add(new BrandModel("DR.Selection賽萊斯\"","",R.drawable.ic_drselection));
        items.add(new BrandModel("Dr.Wu 達爾膚","",R.drawable.ic_drwu));
        items.add(new BrandModel("Dv Tokyo","",R.drawable.ic_dvtokyo));
        items.add(new BrandModel("Ego 意高","",R.drawable.ic_ego));
        items.add(new BrandModel("Elemis","",R.drawable.ic_elemis));
        items.add(new BrandModel("Elxir","",R.drawable.ic_elixir));
        items.add(new BrandModel("Elizabeth Arden","",R.drawable.ic_elizabetharden));
        items.add(new BrandModel("Estee Lauter雅詩蘭黛","",R.drawable.ic_esteelauter));
        items.add(new BrandModel("Exocare 艾索康恩","",R.drawable.ic_exocare));
        items.add(new BrandModel("First Aid Beauty","",R.drawable.ic_firstaidbeauty));
        items.add(new BrandModel("For Beloved One寵愛之名","",R.drawable.ic_forbelovedone));
        items.add(new BrandModel("Helena Rubinstein","",R.drawable.ic_helenarubinstein));
        items.add(new BrandModel("Ido 船井醫朵","",R.drawable.ic_ido));
        items.add(new BrandModel("Ipsa","",R.drawable.ic_ipsa));
        items.add(new BrandModel("Jenduoste 珍朵絲特","",R.drawable.ic_jourdeness));
        items.add(new BrandModel("Jo Malone","",R.drawable.ic_jomalone));
        items.add(new BrandModel("Jourdeness佐登妮絲","",R.drawable.ic_jourdeness));
        items.add(new BrandModel("Kafen","",R.drawable.ic_kafen));
        items.add(new BrandModel("Kanebo","",R.drawable.ic_kanebo));
        items.add(new BrandModel("Kerastase","",R.drawable.ic_kerastase));
        items.add(new BrandModel("Kiehl's","",R.drawable.ic_kiehls));
        items.add(new BrandModel("Klorane","",R.drawable.ic_klorane));
        items.add(new BrandModel("Kose","",R.drawable.ic_kose));
        items.add(new BrandModel("L'Occitane","",R.drawable.ic_loccitane));
        items.add(new BrandModel("La Mer 海洋拉娜","",R.drawable.ic_lamer));
        items.add(new BrandModel("La Roche-Posay理膚寶水","",R.drawable.ic_larocheposay));
        items.add(new BrandModel("Lancome 蘭蔻", "法國高檔的美妝品牌",R.drawable.ic_lancome));
        items.add(new BrandModel("Laneige 蘭芝","",R.drawable.ic_laneige));
        items.add(new BrandModel("Lion 獅王","",R.drawable.ic_lion));
        items.add(new BrandModel("Loveisderma 愛斯德瑪","",R.drawable.ic_loveisderma));
        items.add(new BrandModel("Muji 無印良品","",R.drawable.ic_muji));
        items.add(new BrandModel("Naruko 牛爾","",R.drawable.ic_naruko));
        items.add(new BrandModel("Neogence 霓淨思","",R.drawable.ic_neogence));
        items.add(new BrandModel("NeoStrata 妮傲絲翠","",R.drawable.ic_neostrata));
        items.add(new BrandModel("Neutroguna 露得清", "來自美國的保養品牌",R.drawable.ic_neutroguna));
        items.add(new BrandModel("Nov 娜芙","",R.drawable.ic_nov));
        items.add(new BrandModel("NU+derma 新德曼","",R.drawable.ic_nuderma));
        items.add(new BrandModel("Nuxe 巴黎歐樹","",R.drawable.ic_nuxe));
        items.add(new BrandModel("Olay","",R.drawable.ic_olay));
        items.add(new BrandModel("O'right 歐萊德", "來自台灣的綠色髮膚保養品牌",R.drawable.ic_oright));
        items.add(new BrandModel("Origins 品木宣言","",R.drawable.ic_origins));
        items.add(new BrandModel("Paulas Choice寶拉珍選","",R.drawable.ic_paulaschoice));
        items.add(new BrandModel("Pezri 派翠","",R.drawable.ic_pezri));
        items.add(new BrandModel("Physiogel潔美淨","",R.drawable.ic_physiogel));
        items.add(new BrandModel("Revital 莉薇特麗","",R.drawable.ic_revital));
        items.add(new BrandModel("Revive","",R.drawable.ic_revive));
        items.add(new BrandModel("Sebamed 施巴","",R.drawable.ic_sebamed));
        items.add(new BrandModel("Shiseido 資生堂","",R.drawable.ic_shiseido));
        items.add(new BrandModel("Shu uemera 植村秀","",R.drawable.ic_shuuemera));
        items.add(new BrandModel("Sisley 希思黎","",R.drawable.ic_sisley));
        items.add(new BrandModel("SK-II","",R.drawable.ic_skii));
        items.add(new BrandModel("Skin Rolling新科若林","",R.drawable.ic_skinrolling));
        items.add(new BrandModel("Sulwhasoo 雪花秀","",R.drawable.ic_sulwhasoo));
        items.add(new BrandModel("Swissvita 薇佳","",R.drawable.ic_swissvita));
        items.add(new BrandModel("The Ordinary","",R.drawable.ic_theordinary));
        items.add(new BrandModel("TTM 提提妍","",R.drawable.ic_ttm));
        items.add(new BrandModel("Tunemakers","",R.drawable.ic_tunemakers));
        items.add(new BrandModel("UNITEC 彤妍","",R.drawable.ic_unitec));
        items.add(new BrandModel("unlabel LAB 安博士","",R.drawable.ic_unlabellab));
        items.add(new BrandModel("Vitchy 薇姿","",R.drawable.ic_vichy));
        items.add(new BrandModel("Whoo 后","",R.drawable.ic_whoo));
        items.add(new BrandModel("YSL","",R.drawable.ic_ysl));
        items.add(new BrandModel("台塑生醫","",R.drawable.ic_taisuo));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new recyclerViewAdapter(items);
        recyclerView.setAdapter(adapter);

        //recyclerView.setAdapter(new recyclerViewAdapter(getApplicationContext(),items));
    }

}