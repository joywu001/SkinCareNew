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
        items.add(new BrandModel("Bioneo 德國百妮","以高科技將頂級成份平價化的德國品牌",R.drawable.ic_bioneo));
        items.add(new BrandModel("Biotherm 碧兒泉","法國萊雅集團旗下的保養品牌",R.drawable.ic_biotherm));
        items.add(new BrandModel("Bobbi Brown","美國著名化妝師的同名美妝品牌",R.drawable.ic_bobbibrown));
        items.add(new BrandModel("CeraVe","主打保濕對抗敏感的美國品牌",R.drawable.ic_cerave));
        items.add(new BrandModel("Cetaphil 舒特膚","提供完整且溫和的保養配方的美國品牌",R.drawable.ic_cetaphil));
        items.add(new BrandModel("Clairs 克蘭詩","法國的奢華護膚品牌",R.drawable.ic_clarins));
        items.add(new BrandModel("Clinique 倩碧","雅詩蘭黛旗下的美國保養品牌",R.drawable.ic_clinique));
        items.add(new BrandModel("Darphin","有著花植保養哲學的法國品牌",R.drawable.ic_darphin));
        items.add(new BrandModel("DermaLab 德美醫研","致力於幫助更多敏弱肌膚",R.drawable.ic_dermalab));
        items.add(new BrandModel("DermEden 得美登","研究並解決光傷害之肌膚問題的法國品牌",R.drawable.ic_dermeden));
        items.add(new BrandModel("Dermina 歐敏膚","來自法國的敏感肌專業護膚品牌",R.drawable.ic_dermina));
        items.add(new BrandModel("DF 美肌醫生","主打凍齡保養的台灣產品",R.drawable.ic_df));
        items.add(new BrandModel("Diptyque","以自然為賣點的法國品牌",R.drawable.ic_diptyque));
        items.add(new BrandModel("D program 敏感話題","被稱為敏弱肌專家的日本品牌",R.drawable.ic_dprogram));
        items.add(new BrandModel("Dr.Cink 達特聖克","來自台灣的醫美級保養品品牌",R.drawable.ic_drcink));
        items.add(new BrandModel("Dr.Douxi 朵璽","適合敏感肌膚的台灣品牌",R.drawable.ic_drdouxi));
        items.add(new BrandModel("Dr.Hsieh 達特醫","致力滿足各種肌膚的居家醫妝保養品",R.drawable.ic_drhsieh));
        items.add(new BrandModel("Dr.Huang 黃禎憲","專業生醫團隊來開發的台灣品牌",R.drawable.ic_drhuang));
        items.add(new BrandModel("DR.Jou 森田藥粧","提供各項肌膚需求的台灣品牌",R.drawable.ic_drjou));
        items.add(new BrandModel("Dr.May 美博士","針對各種肌膚問題的危肌處理專家",R.drawable.ic_drmay));
        items.add(new BrandModel("DR.Selection賽萊斯","首創效性濃度的台日合作品牌",R.drawable.ic_drselection));
        items.add(new BrandModel("Dr.Wu 達爾膚","以醫師配方為基礎的台灣品牌",R.drawable.ic_drwu));
        items.add(new BrandModel("Dv Tokyo","專為亞洲女性保養開發的日本品牌",R.drawable.ic_dvtokyo));
        items.add(new BrandModel("Ego 意高","以科學為後盾的澳洲品牌",R.drawable.ic_ego));
        items.add(new BrandModel("Elemis","萃取大自然活性成分的英國品牌",R.drawable.ic_elemis));
        items.add(new BrandModel("Elxir","主打膠原蛋白保養技術的日本",R.drawable.ic_elixir));
        items.add(new BrandModel("Elizabeth Arden","提倡保養與美妝融合的美國品牌",R.drawable.ic_elizabetharden));
        items.add(new BrandModel("Estee Lauder雅詩蘭黛","以修復為主打的美國品牌",R.drawable.ic_esteelauter));
        items.add(new BrandModel("Exocare 艾索康恩","將醫學帶進保養的台灣品牌",R.drawable.ic_exocare));
        items.add(new BrandModel("First Aid Beauty","來自美國的保養保濕救星",R.drawable.ic_firstaidbeauty));
        items.add(new BrandModel("For Beloved One寵愛之名","致力於推廣醫學美容保養的台灣品牌",R.drawable.ic_forbelovedone));
        items.add(new BrandModel("Helena Rubinstein","高效傳奇新奢華的頂級保養品牌",R.drawable.ic_helenarubinstein));
        items.add(new BrandModel("Ido 船井醫朵","對抗敏感肌膚的台灣品牌",R.drawable.ic_ido));
        items.add(new BrandModel("Ipsa","強調個人化的護膚處方的日本品牌",R.drawable.ic_ipsa));
        items.add(new BrandModel("Jenduoste 珍朵絲特","採用自然植粹的台灣品牌",R.drawable.ic_jourdeness));
        items.add(new BrandModel("Jo Malone","倫敦營銷高檔護膚和香水的品牌",R.drawable.ic_jomalone));
        items.add(new BrandModel("Jourdeness佐登妮絲","來自台灣的高級保養品牌",R.drawable.ic_jourdeness));
        items.add(new BrandModel("Kafen","以自然植萃能量開發的台灣品牌",R.drawable.ic_kafen));
        items.add(new BrandModel("Kanebo","追求舒心使用感受的台灣品牌",R.drawable.ic_kanebo));
        items.add(new BrandModel("Kerastase","預防衰老的專櫃保養品牌",R.drawable.ic_kerastase));
        items.add(new BrandModel("Kiehl's","以溫合天然成份製造的美國品牌",R.drawable.ic_kiehls));
        items.add(new BrandModel("Klorane","將植物的特性應用在保養品上的法國品牌",R.drawable.ic_klorane));
        items.add(new BrandModel("Kose","來自日本的保養品牌",R.drawable.ic_kose));
        items.add(new BrandModel("L'Occitane","天然植萃的法國保養品牌",R.drawable.ic_loccitane));
        items.add(new BrandModel("La Mer 海洋拉娜","強項是乳霜的美國品牌",R.drawable.ic_lamer));
        items.add(new BrandModel("La Roche-Posay理膚寶水","專攻敏感肌膚的法國品牌",R.drawable.ic_larocheposay));
        items.add(new BrandModel("Lancome 蘭蔻", "法國高檔的美妝品牌",R.drawable.ic_lancome));
        items.add(new BrandModel("Laneige 蘭芝","來自韓國的保濕保養品牌",R.drawable.ic_laneige));
        items.add(new BrandModel("Lion 獅王","多功能的日本品牌",R.drawable.ic_lion));
        items.add(new BrandModel("Loveisderma 愛斯德瑪","主打敏弱系列的保養品牌",R.drawable.ic_loveisderma));
        items.add(new BrandModel("Muji 無印良品","清新肌膚保養的日本品牌",R.drawable.ic_muji));
        items.add(new BrandModel("Naruko 牛爾","專為亞洲人打造的台灣品牌",R.drawable.ic_naruko));
        items.add(new BrandModel("Neogence 霓淨思","來自台灣的高效保養品牌",R.drawable.ic_neogence));
        items.add(new BrandModel("NeoStrata 妮傲絲翠","產品含有燕窩素的美國品牌",R.drawable.ic_neostrata));
        items.add(new BrandModel("Neutroguna 露得清", "來自美國的保養品牌",R.drawable.ic_neutroguna));
        items.add(new BrandModel("Nov 娜芙","日本低刺激性保養品牌",R.drawable.ic_nov));
        items.add(new BrandModel("NU+derma 新德曼","類醫學美容的台灣保養品牌",R.drawable.ic_nuderma));
        items.add(new BrandModel("Nuxe 巴黎歐樹","法國植萃科研品牌",R.drawable.ic_nuxe));
        items.add(new BrandModel("Olay 歐蕾","美國寶潔公司旗下的護膚品牌",R.drawable.ic_olay));
        items.add(new BrandModel("O'right 歐萊德", "來自台灣的綠色髮膚保養品牌",R.drawable.ic_oright));
        items.add(new BrandModel("Origins 品木宣言","雅詩蘭黛旗下的天然肌膚保養品牌",R.drawable.ic_origins));
        items.add(new BrandModel("Paulas Choice寶拉珍選","來自美國的保養品牌",R.drawable.ic_paulaschoice));
        items.add(new BrandModel("Pezri 派翠","研發獨特胜肽鏈接技術的美國品牌",R.drawable.ic_pezri));
        items.add(new BrandModel("Physiogel潔美淨","來自德國的擬膚專利科技",R.drawable.ic_physiogel));
        items.add(new BrandModel("Revital 莉薇特麗","資生堂旗下撫皺抗老保養品牌",R.drawable.ic_revital));
        items.add(new BrandModel("Revive","美國奢華保養品牌",R.drawable.ic_revive));
        items.add(new BrandModel("Sebamed 施巴","不含皂鹼的潔護膚產品的德國品牌",R.drawable.ic_sebamed));
        items.add(new BrandModel("Shiseido 資生堂","來自日本的專櫃品牌",R.drawable.ic_shiseido));
        items.add(new BrandModel("Shu uemura 植村秀","採用高效植物精華的日本品牌",R.drawable.ic_shuuemera));
        items.add(new BrandModel("Sisley 希思黎","法國的專業植物美容保養品牌",R.drawable.ic_sisley));
        items.add(new BrandModel("SK-II","高檔的護膚日本品牌",R.drawable.ic_skii));
        items.add(new BrandModel("Skin Rolling新科若林","保濕改善暗沉的保養品牌",R.drawable.ic_skinrolling));
        items.add(new BrandModel("Sulwhasoo 雪花秀","韓國頂底的草本護膚品牌",R.drawable.ic_sulwhasoo));
        items.add(new BrandModel("Swissvita 薇佳","針對乾癢保濕的瑞士品牌",R.drawable.ic_swissvita));
        items.add(new BrandModel("The Ordinary","平價的加拿大保養品牌",R.drawable.ic_theordinary));
        items.add(new BrandModel("TTM 提提研","來自台灣面膜品牌",R.drawable.ic_ttm));
        items.add(new BrandModel("Tunemakers","日本的人氣原液保養品牌",R.drawable.ic_tunemakers));
        items.add(new BrandModel("UNITEC 彤妍","來自妮傲絲翠旗下開架品牌",R.drawable.ic_unitec));
        items.add(new BrandModel("unlabel LAB 安博士","主打保濕補水的日本品牌",R.drawable.ic_unlabellab));
        items.add(new BrandModel("Vichy 薇姿","來自法國醫美領導品牌",R.drawable.ic_vichy));
        items.add(new BrandModel("Whoo 后","來自韓國的頂級宮廷護膚品牌",R.drawable.ic_whoo));
        items.add(new BrandModel("YSL","來自法國得奢侈品牌",R.drawable.ic_ysl));
        items.add(new BrandModel("台塑生醫","結合長庚醫學團隊的台灣品牌",R.drawable.ic_taisuo));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new recyclerViewAdapter(items);
        recyclerView.setAdapter(adapter);

        //recyclerView.setAdapter(new recyclerViewAdapter(getApplicationContext(),items));
    }

}