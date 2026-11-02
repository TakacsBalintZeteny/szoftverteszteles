BankAccount – Banki alkalmazás tesztelése

A projekt leírása



A projekt egy egyszerű banki számlakezelő alkalmazást valósít meg Java nyelven.



A BankAccount osztály lehetővé teszi:



A számlaegyenleg lekérdezését.

Pénz befizetését.

Pénz felvételét, az egyenleg ellenőrzésével.



A BankServiceTest osztály a befizetés működését és az értesítés elküldését ellenőrzi.



Futtatás

Nyisd meg a projektet egy Java fejlesztőkörnyezetben (például IntelliJ IDEA vagy Eclipse).

Ellenőrizd, hogy a szükséges Java és Maven/Gradle függőségek telepítve vannak.

A projekt lefordítása után futtatható a program.

Tesztelés



A teszteléshez JUnit és Mockito keretrendszert használunk.



A tesztek futtatása:



Nyisd meg a BankServiceTest osztályt.

Indítsd el a teszteket a Run Test lehetőséggel.



A tesztek ellenőrzik:



Sikeres befizetés esetén az egyenleg 1000-re változik.

Sikeres befizetés esetén a rendszer elküldi a "Deposit successful" értesítést.

A Mockito verify() metódusa ellenőrzi az értesítési szolgáltatás meghívását.

Szükséges technológiák

Java

JUnit

Mockito

Maven vagy Gradle

Összegzés



A projekt célja egy egyszerű banki számlakezelő működésének bemutatása és automatikus tesztelése. A JUnit a működést, a Mockito pedig a külső értesítési szolgáltatás meghívását ellenőrzi.

