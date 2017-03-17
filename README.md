# oop_projekt_roomik

### Kirjeldus
    
    Illustreeriv skeem ja elementide arvu arvutamise skeem kaustas.
    
    Programm arvutab sisestatud ringi raadiusee ja ristküliku külje pikkuse järgi kaks
    
    kõige lähedasemat varianti võimalikule lahendusele, 
    
    kuidas väiksemaid ristkülikuid kujundi ümbermõõdule paigutada.
    
    ----
    Skeemi näite järgi oleks sisestatud:
    R=50
    B=100
    C=15
    //D=5
   
    programmi väljund oleks midagi sellist:
    Elemendi pikkus 15 
    Roomikule R=50 B=100 kõige lähedasemad variandid on:
    Väiksem: 30 Elementi, R=47,35, B=90
    Suurem: 34 Elementi, R=52,16, B=105
    
    -----
    

### Klassid

roomik

    main() klass küsib sisendid R, B, C ja D ja kutsub vajaminevad klassid?
        
        Sisendid

          - Ring raadiusega R

          - Ristkülik külgedega A=R*2 ja B

          - Ristkülik2 külgedega C ja D (edaspidi kirjeldustes Element)
          (ilma graafilise liideseta pole teise ristküliku kõrgust vaja arvestada)
         
          - suurem/väiksem
          suurem - väljastatakse ainulut rohkemate lülidega variant
          vaiksem - väljastatkse vähemate lülidega variant
          Null - väljastatakse mõlemad
          
          
RingiElementideArv

        Arvutab ringi ümbermõõdu ja väiksema ristküliku pikkuse järgi väiksema ja suurema 
        
        ringi elementide arvu: Ümbermõõt/C(elemendi pikkus).
        
        Selline lähenemine ei ole ideaalne aga selle ülesande raames ei ole ilmselt tarvis
        
        matemaatiliselt üli täpne olla. Väga suure ja väga väikese raadiuse/elemendi_pikkuse suhte korral
        
        see valem õiget tulemust ei anna. Et oleks kena ilmselt kirjutada mingi funktsioon, 
        
        mis kontrolliks et sisestatud väärtuste suhe oleks mingis vahemikus enne programmi käivitamist.
        
        Sisendid: sisestatud Raadius ja elemendi pikkus
        
        Väljund: elementide arv
        
        
        
RingiRaadius

    Arvutab ringi raadiuse, mis vastab elemendi pikkusele ja arvule.
    
    Arvutamine kirjeldatud elementide_arvutamine.jpg skeemi peal.
    
    Sisend elementide arv ja elemendi pikkus.
    
    Väljund ringi raadius.
        
RistkylikuElementideArv

        Arvutab suurema ristküliku küljepikkuse ja elemendi pikkuse järgi 
        
        väiksema ja suurema suure ristküliku pikkuse, millele mahub täisarv ristkülikuid.
        
        

RistkylikuKylg

        Arvutab elementide arvu järgi küljele mahtuvad elemndid.                
    
   
    
RoomikuKuju (konstruktor)
    
    Roomik (int, ..., int, string)
    
    Roomik (int, ..., int)
    
    
Kontroll

    Kas sisestatud raadiuse ja elemendi pikkuse suhe mahub mingisugusesse piirkonda.


 
