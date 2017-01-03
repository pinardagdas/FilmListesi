package com.pinardagdas.filmlistesi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.pinardagdas.filmlistesi.R.id.detayTextView;

public class DetayActivity extends AppCompatActivity {

    private TextView detayText;
    private ImageView detayImage;


    private String[] detayListe;
    private int[] detayImageListe;
    private String[] detayUrlListe;


    private String pozisyonAnahtari = "pozisyonAnahtari";
    private int detayPozisyon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        detayText = (TextView) findViewById(detayTextView);
        detayImage = (ImageView) findViewById(R.id.detayImageView);


        detayListe = new String[] { "Yönetmen: Steve McQueen\nOyuncular: Chiwetel Ejiofor, Michael Fassbender, Benedict Cumberbatch\n\n1841'de New York'ta yaşayan Solomon Northup, kendisini müziğe adamış siyahi bir adamdır. Ailesiyle birlikte yaşayan Solomon, özgür yaşayan ve istediği şeyleri yapabildiği için mutlu bir adamdır. Fakat bir gün bir müzik işi için 2 adam ile tanışır ve çalışmak için Washington'a gider. İnandığı medeni dünya alt üst olur çünkü kendisini kaçırıp Güney'de bir çiflikte köle olarak çalışması için satarlar. Özgürlüğünü korumak için verdiği tüm emekler ve mücadele yerle bir olmuş, hayatı kabusa dönmüştür. Bu cehennemde Solomon acıyı, şiddeti, küçük düşürülmeyi yeniden öğrenecek ve isyan etmeye cesareti olmayan br grup insanın umutsuzluğuna şahit olacaktır. Sevdiklerini ve hayatını geri almak için ne yapması gerektiğini kesinlikle bulmuştur.", "Yönetmen: Robert Zemeckis\nOyuncular: Tom Hanks, Gary Sinise, Robin Wright\n\nDüşük IQ sahibi Forrest Gump Jenny ile tanışır ve aşık olur. Gump aralarında Elvis Presley, Kennedy, Nixon’ın da olduğu tarihsel kişilerle kaza eseri tanışır ve 50’lerden 70’lerin sonuna kadar gelen bir süre zarfında olaylar gelişir. Gump tamamen tesadüf olarak Vietnam savaşına ve Amerikan yakın tarihinin önemli olaylarına şahitlik eder ve hatta rol alır. Ancak bilmeden yaptıklarının ne kadar önemli sonuçları olduğundan da haberi yoktur.", "Yönetmen: Carlos Saldanha, Mike Thurmeier\nSeslendirenler: Ray Romano, John Leguizamo, Denis Leary\n\nBaşta Scrat olmak üzere, kahramanlarımızın maceradan maceraya koştukları Ice Age’in yeni filminde karşımıza bu defa da dinazorlar çıkıyor. Kaplanlara, avcılara, eriyen buzullara kafa tutan kahramanlarımız bu sefer dinazorlarla mücadele edecektir. Film dinazorların her zaman yaşadığını, buzun erimesiyle ortaya çıktıkları tezini öne sürüyor.Kahramanlarımız Sid, Manny ve Diego’ya ikinci bölümde yer alan Ellie ve fareler, bu bölümde de eşlik ediyor.", "Yönetmen: Damien Chazelle\nOyuncular: Ryan Gosling, Emma Stone, J.K. Simmons\n\nİkinci uzun metrajlı filmi Whiplash ile 2014 yılının en ses getiren yapıtlarından birine imza atmış olan Damien Chazelle'in yeni projesi, yine müzik üzerinden giden bir hikayeyi ele alıyor. Ryan Gosling'in başarılı bir caz müzisyenini canlandıracağı filmde, Emma Stone'u ise Los Angeles'ın acımasız düzeninde aktris olmaya çalışan kız arkadaşı Mia rolünde izleyeceğiz.", "Yönetmen: Tom Hooper\nOyuncular: Hugh Jackman, Russell Crowe, Anne Hathaway\n\n19. yüzyıl Fransasında geçen film, yıkılan hayaller, kalp kırıklıkları, tutkular ve fedakarlıklar üzerine kurulu. Jean Valjean olarak bilinen 24601 nolu mahkum, hapishaneden salınır. Kendisine yeni bir hayat kurmak ister ama müfettiş Javert'in gölgesi onu daima takip etmektedir. Jean Valjean Fantine'in kızı Cosette ile ilgilenmeyi kabul ettikten sonra ikisinin hayatı da tamamen değişecektir. Fransız Devrimi'nin arifesinde geçen hikaye ihtilalin her iki tarafının da yüzünü gözler önüne serer. Ünlü yazar Victor Hugo'nun aynı isimli ünlü edebiyat klasiğinden uyarlanan Les Miserables (Sefiller), Jean Valjean'ın ölümsüz hikayesini beyazperdeye taşıyor.", "Yönetmen: Thea Sharrock\nOyuncular: Emilia Clarke, Sam Claflin, Janet McTeer\n\nTekerlekli sandalyeye bağlı olarak yaşamını sürdürmek zorunda olan yarı felçli genç adam, bakıcı olarak küçük bir kasabada yetişmiş genç kadını istihdam ettir. Bu genç adam ve kadının bir araya gelişi hayatlarını yeni bir yola sürükleyecektir. İlk başta birbirlerinden hoşlanmayan ikili farklılıklarının fazlalığından yakınsa da zamanla hayatla ilgili bilmedikleri şeyleri birbirlerine öğretmeye başlarlar. Birbirlerine aşık olan karakterleri şimdi daha da zorlu bir sınav beklemektedir.", "Yönetmen: Louis Leterrier Oyuncular: Jesse Eisenberg, Mark Ruffalo, Woody Harrelson\n\n'Now You See Me', Atlas isimli son derece karizmatik ve etkileyici bir illüzyonistin liderliğini yaptığı, dünyanın en iyi sihirbazlarından oluşan 'Four Horsemen' ekibinin başından geçenleri konu alıyor. Ekip üstün sihir marifetlerini sadece sahne gösterileri için değil, soygun yaptıkları bankaların sistemlerine erişmek ve izleyicilerini soymak için kullanıyorlar. Bu adamlar izleyicileri önce başka bir kıtadaki bir bankayı soyarak, daha sonra beyaz yakalı bir suçlunun bankadaki milyon dolarlarını izleyicilerin banka hesaplarına aktararak şaşırtıyorlar. Bunun üzerine onları durdurmaya kararlı olan özel FBI ajanı Dylan bu çetenin peşine düşer.", "Yönetmen: Michael Spierig, Peter Spierig\nOyuncular: Ethan Hawke, Sarah Snook, Noah Taylor\n\nSıkı bir bilimkurgu filmi olan Predestination, zamanda seyahat edip olmuş ya da olası olayların önüne geçmeye veya suçluları yakalamaya çalışan bir zamansal ajanın hikayesini konu eder. Gizli bir serivise bağlı çalışan ajanın son görevi ise; 1975 yılında New York'ta yaptığı bir patlamada 11.000 insanın ölümünden sorumlu olan Fiyasko Bombacısı adlı kişiyi bulup bu patlamanın hiç yaşanmamış olmasını sağlamaktır... Görevi için 1970 yılına New York'ta bir barda, barmen olarak çalışmaya başlayan ajan orada “Evlenmemiş Anne” rumuzlu John isimli bir köşe yazarıyla tanışır. Küçük bir bar sohbetiyle başlayan ikilinin sohbeti, gecenin ilerleyen saatlerinde daha da derinleşir.", "Yönetmen: Joe Wright\nOyuncular: Keira Knightley, Matthew MacFadyen, Talulah Riley\n\nFilm, Jane Austen’in beş kız kardeş, Jane, Elizabeth, Mary, Kitty ve Lydia Bennet’i anlatan romanından uyarlanmıştır. Hikaye George dönemi İngilteresi’nde geçer. Ailenin yaşamı, genç ve zengin bir adam olan Bay Bingley’in ve onun en yakın arkadaşı Bay Darcy’nin komşu gelişleri ile tepetaklak olur. Kızların anneleri olan Bayan Bennet, onların evlenmelerini istemektedir. Bay Bingley’in iyi bir aday olduğuna kanaat getirir. Bu aday ise Jane’den etkilenecektir. Bu durumu fark eden anneleri, kızını yağmurlu bir günde Bingley’in malikanesine gönderir. Geri dönemeyen Jane, üstüne bir de hastalanır. Bu kez ona yardıma giden Elizabeth de Bay Darcy’nin takibine takılır. Elizabeth bu durumdan hoşlansa da esas Bay Wickham’dan ziyadesi ile etkilenecektir. Lydia işin içine hesapsızca dahil olduğunda cesaret kavramı gözler önüne serilir. Gururun, aşkın önüne geçtiği bir çizgide kız kardeşlerin yaşamları umulmadık bir biçimde karmaşıklacaktır.", "Yönetmen: Steven Spielberg\nOyuncular: Tom Hanks, Tom Sizemore, Edward Burns\n\nDört çocuk annesi bir annenin İkinci Dünya Savaşı’nda kaybettiği üç oğlunun ardından fazlasıyla yaralanmıştır. Şimdi tek dileği hayatta kalan tek oğlunun savaştan sağ salim dönmesidir. Yakarışları karşılık bulur ve Başkan tarafından verilen bir emirle James Ryan’ın ne pahasına olursa olsun bu savaştan sağ çıkması sağlanacaktır. Normandiya çıkarmasının yapıldığı gün, sekiz kişilik bir asker birliği farklı bir göreve, Ryan’ı kurtarma görevine atanır. Ancak yüzbaşı John Miller tarafından yönetilen bu birim, can pazarının yaşandığı bu zorlu ortamda hakikatli bir yaşam mücadelesine atılacak; tek bir adamı kurtarmak için sekiz kişinin hayatının tehlikeye atılmasının meşruluğunu sorgulayacaktır.", "Yönetmen: Byron Howard, Nathan Greno\nSeslendirenler: Mandy Moore, Zachary Levi, Donna Murphy\n\nAlternatif göndermelerle bezeli bu çizgi filmde, hanedanlığın en çok aranan –ve en etkileyici- eşkıyası Flynn Rider (seslendiren Zachary Levi) bilinmeyen bir zamanda, bilinmeyen bir krallıkta, bilinmeyen bir mekanda ancak gizemli bir kulede saklanırken, o kulede yaşayan güzel ve cesur, 20 metre uzunluğunda altın sarısı saçları olan Rapunzel (seslendiren Mandy Moore) tarafından esir alınır. Masalın farklı bir versiyonunun beyazperde'deki bu yorumunda, yıllardır hapsedildiği kuleden çıkma yolları arayan Flynn’i esir alan meraklı kız, yakışıklı hırsızla bir anlaşma yapacaktır. Bu tuhaf ikili, süper-polis bir atın, aşırı korumacı bir bukalemunun ve sevimsiz bar haydutlarının da olduğu aksiyon dolu bir maceraya yelken açar.", "Yönetmen: Mark Herman\nOyuncular: Asa Butterfield, Vera Farmiga, David Thewlis\n\n2. Dünya Savaşı’nın kara günlerinde, arkadaş olmaya çalışan iki çocuğun hikayesi. 8 yaşındaki Bruno ailesiyle Berlin'den ayrılır ve Polonya'da yaşamaya başlar. Babasının işi için taşındıkları bu yerde bir de arkadaş edinir. Arkadaşı tellerin arkasında kalan bir Yahudi'dir. Bruno'nun yaşadığı yer, 1.5 milyon Yahudi'nin öldürüldüğü Auschwitz toplama ve yoketme kampının bitişiğindedir. Oğlunun tellerin ardında yaşananlarla ilgili gerçeği öğreniceğinden kaygılanan Bruno'nun annesiyse oğlunu bu ’’arkadaş’’lıktan korumaya çalışır. John Boyne’un dünya çapında güzel eleştiriler alan aynı adlı romanından uyarlanan film, tarihin acıyla dolu anısını küçük bir çocuğun gözünden hatırlatarak, masumiyet ve insanlık dehşetini zarif bir dille beyazperdeye yansıtıyor.", "Yönetmen: Joel Schumacher\nOyuncular: Gerard Butler, Emmy Rossum, Patrick Wilson\n\nFilm, bir opera hayaletinin French Opera House’daki oyuncuları ve koro şarkıcısı olan ve özel olarak çalıştırılan Christine’i tehdit etmesi ile başlıyor. Hayalet, baş sopranoyu nihayet delirtir ve kaçmasına neden olur. Ancak bir geceliğine onun yerini alan Christine sayesinde şov, gala gecesinde çok beğenilince kaçan yıldız, rolünü geri ister. Bu sırada Christine’in çocukluğundan beri ona tutkun olan Raoul, tuhaf olaylar olurken bu durumu fırsat bilmek isteği ile Christine’in yanında olmaya çalışır.", "Yönetmen: Robert Wise\nOyuncular: Julie Andrews, Christopher Plummer, Richard Haydn\n\nMaria öylesine hayat dolu ve çoşkulu bir genç kadındır ki manastır hayatı aslında hiç de onun ruhuna hitap etmemektedir. En sevdiği şey dağlara çıkıp şarkı söylemektir. Bu yüzden de genelde birçok dersi kaçırır. Bu duruma bir çare arayan Baş Rahibe Peggy, sorumluluk alması için Maria'yı bakıcı olarak karısını yeni kaybetmiş, 7 çocuklu Kaptan Von Trapp'ın yanına gönderir. Kaptan Trapp'ın çocuklarının haylazlığı yüzünden bütün bakıcılar bir süre sonra işi bırakmaktadırlar. Maria ise iyimserliği ve sevecenliğiyle hem kaptanın güvenini hem de çocukların sevgisini kazanacaktır. En iyi yönetmen ve film dahil 5 dalda Oscar ödülü kazanan Maria von Trapp’in otobiyografik romanından uyarlanmış müzikalin beyazperdeye versiyonu klasikleşmiş bir yapıttır.", "Yönetmen: Byron Howard, Rich Moore\nSeslendirenler: Aysun Topar, Cem Yılmaz, Fatih Özacun\n\nKarmakarışık ve Bolt gibi sevilen animasyon filmlerinin yönetmeni Byron Howard'ın perdeye taşıdığı Zootopia, medenileşmiş ve teknoloji kullanabilen hayvanların bir arada yaşadığı bir şehirde yaşanan ilginç bir polisiye öyküsünü perdeye taşıyor. Alışıldık Disney havasının solunacağı filmde; konuşkan tilki Nick'in, üzerine yığılmaya çalışan bir suçtan sıyrılma çabası anlatılıyor. Modern memelilerin yaşadığı Zootropolis adındaki metropolis, lüks Sahra Meydanı’ndan, soğuk Tundra Kasabası’na kadar bir çok farklı doğal ortamın ve hayvanın bir arada yaşadığı benzersiz bir şehirdir. Burası bir fil kadar büyük ya da bir arı kadar küçük olanların bile istediği her şeyi yapabileceği türden bir yerdir. İyimser Polis Memuru Judy Hopps buraya geldiğinde, büyük ve sert mizaçlı hayvanların olduğu bir yerde polis olmanın hiç de kolay olmadığını fark eder. Kendini ispatlayabilme fırsatını elde edebilmek için, geveze ve numaracı tilki Nick Wilde ile ortak olma pahasına önemli ve gizemli bir olayı çözmeye çalışacaktır. Filmin seslendirme kadrosunda Ginnifer Goodwin, Jason Bateman, Idris Elba, J.K. Simmons, Octavia Spencer yer alıyor."};
        detayImageListe = new int[] {R.drawable.twelveyearsslave, R.drawable.forrestgump, R.drawable.iceagedawnofthedinosaurs, R.drawable.lalaland, R.drawable.lesmiserable, R.drawable.mebeforeyou, R.drawable.nowyouseeme, R.drawable.predestination, R.drawable.prideprejudice, R.drawable.savingprivateryan, R.drawable.tangled, R.drawable.boyinthestripedpajamas, R.drawable.thephantomoftheopera, R.drawable.thesoundofmusic, R.drawable.zootopia};
        detayUrlListe = new String[] {"http://www.imdb.com/title/tt2024544/?ref_=nv_sr_1", "http://www.imdb.com/title/tt0109830/?ref_=nv_sr_1", "http://www.imdb.com/title/tt1080016/?ref_=nv_sr_1", "http://www.imdb.com/title/tt3783958/?ref_=nv_sr_1", "http://www.imdb.com/title/tt1707386/?ref_=nv_sr_1", "http://www.imdb.com/title/tt2674426/?ref_=nv_sr_1", "http://www.imdb.com/title/tt1670345/?ref_=nv_sr_2", "http://www.imdb.com/title/tt2397535/?ref_=nv_sr_1", "http://www.imdb.com/title/tt0414387/?ref_=nv_sr_2", "http://www.imdb.com/title/tt0120815/?ref_=nv_sr_1", "http://www.imdb.com/title/tt0398286/?ref_=nv_sr_1", "http://www.imdb.com/title/tt0914798/?ref_=nv_sr_1", "http://www.imdb.com/title/tt0293508/?ref_=nv_sr_2", "http://www.imdb.com/title/tt0059742/?ref_=nv_sr_1", "http://www.imdb.com/title/tt2948356/?ref_=nv_sr_1"};

        detayPozisyon = getIntent().getIntExtra(pozisyonAnahtari, -1);



        if (detayPozisyon == -1) {
            Toast.makeText(DetayActivity.this, "Hata Var!", Toast.LENGTH_LONG).show();
        } else {
            detayText.setText(detayListe[detayPozisyon]);
            detayImage.setImageResource(detayImageListe[detayPozisyon]);
        }


        detayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (detayPozisyon == -1) {
                    Toast.makeText(DetayActivity.this, "Hata Var!", Toast.LENGTH_LONG).show();
                } else {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(detayUrlListe[detayPozisyon]));
                    startActivity(i);
                }

            }
        });


        detayText.setMovementMethod(new ScrollingMovementMethod());

    }
}
