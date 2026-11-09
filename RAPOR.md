# Rapor

**Ad Soyad:**TALHA EREN ÇEVİK
**Numara:**

## 1. Problemin Açıklaması
<!-- Problemi kendi cümlelerinizle yazın. -->
İlk önce kullanıcıdan girdileri yani mevcut ve hedef katı isteriz ardından eğer ikisinden biri 10 dan büyük veya 0 dan küçük ise HATA ekrana yansıtırız eğer doğru girdiler 
sağlanırsa mevcut ve hedef kat karşılaştırması yapark hareket yönü (yukarı,aşşşağı) belirleriz ve hareket mesafesini buluruz
yön ve mesafeyi ekrana yazdırırız


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-mevcut kat hedef kat

**İşlemler:**
-hareket yönü,hareket mesafesi

**Çıktılar:**
-yön ve mesafe

## 3. Sözde Kod (Pseudocode)

```
1.başla mevcut kat kat ve hedef katı gir eğer mkat>10 or mkat<0 or gkat>10 or gkat<0 ise HATA yazdırlır
2.eğer hat yok ise mevcut kattan hedef katı çıkarırız mutlak değerini alırız  yönünü de hkat ve mkat karşılaştırılarak buluruz
3.hareket mesafesi ve yön ekrana yazdırılır 
```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)
<img width="429" height="364" alt="image" src="https://github.com/user-attachments/assets/73a3bd87-ec73-458c-b961-db8a53db6bcd" />

## 5. Test Sonuçları

| Mevcut kat | Hedef kat | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 3 | 8 | 5 kat yukarı | 5 kat yukarı  |EVET |
| 9 | 2 | 7 kat aşağı | 7 kat aşağı  | EVET |
| 5 | 5 | Hareket yok | Hareket yok |EVET  |
| 1 | 10 | 9 kat yukarı |  9 kat yukarı | EVET |
| 10 | 1 | 9 kat aşağı |  9 kat aşağı|EVET  |
| 0 | 5 | Geçersiz mevcut kat |HATA | EVET |
| 5 | 11 | Geçersiz hedef kat | HATA|EVET  |
| -2 | 4 | Geçersiz mevcut kat | HATA|EVET  |
