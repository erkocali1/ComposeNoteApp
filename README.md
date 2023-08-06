# ComposeNoteApp

  <h3> 🗊 Note App with Compose</h3>
 <img src="https://github.com/erkocali1/ComposeNoteApp/blob/master/app/src/main/res/drawable/appnote.png" alt="Resim">

  <h2>📝 Kullanılan Componentler</h2>
<ul>
  <li>Jetpack Compose</li>
  <li>Dagger Hilt</li>
  <li>Data-Domain-UI Layer</li>
  <li>Room</li>
  <li>Coroutine</li>
  <li>Flow</li>
  <li>LifeCycle</li>
</ul>

Bu uygulama, Android geliştirme sürecindeki en yeni teknolojilerden biri olan Jetpack Compose'u öğrenmek amacıyla tasarlanmıştır. Kendi kişisel gelişimime katkıda bulunmak ve başkalarının da aynı zamanda bu teknolojiye aşina olmasını sağlamak için bu projeyi yaptım.

Bu uygulama, temel olarak üç ana katmandan oluşuyor: Veri Katmanı (Data), Alan Katmanı (Domain) ve Kullanıcı Arayüzü Katmanı (UI). Bu yapı, uygulama içindeki görevleri ayrı kavramsal bölümlere bölmeye ve her katmanın sorumluluklarını izole etmeye yardımcı olur. Veri Katmanı, verilerin alındığı ve işlendiği yerdir. Domain Katmanı, uygulamanın iş mantığı ve kurallarının yer aldığı bölümdür. Son olarak, Kullanıcı Arayüzü Katmanı, Jetpack Compose'un güçlü yeteneklerini kullanarak kullanıcı arabirimini oluşturduğumuz yerdir.

Bağımlılık yönetimi için Dagger Hilt kullanarak, projenin daha sürdürülebilir ve genişletilebilir olmasını sağladım. Dagger Hilt, uygulamamızdaki bağımlılıkları enjekte etmek için kolay ve etkili bir yol sunar, böylece uygulama kodunu daha temiz ve düzenli tutabiliriz.

Uygulamayı oluşturma sürecinde, Jetpack Compose'un basit ve deklaratif doğasından büyük ölçüde etkilendim. Widget ağaçları ve XML dosyalarıyla uğraşmak yerine, doğrudan Kotlin DSL'ini kullanarak kullanıcı arayüzünü tanımlamak, kodun okunabilirliğini ve bakımını artırdı. Ayrıca, yeniden kullanılabilir bileşenler oluşturmak ve animasyonları kolayca entegre etmek gibi Compose'un sunduğu avantajlardan yararlandım.

Bu uygulamayı yazma sürecinde, başlangıçta Compose'un bazı kavramlarına alışmak zaman alsa da, deneyimledikçe ve öğrendikçe kendimi daha da geliştirdiğimi hissettim. Eğer siz de bu uygulama ile Compose'a yeni bir başlangıç yapmak isterseniz, umarım sizin için de faydalı olur.
