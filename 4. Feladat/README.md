User – Mockito tesztelési példa

A projekt leírása



A projekt egy egyszerű Java felhasználókezelő osztályt tartalmaz.



A User osztály tárolja a felhasználó nevét, jelszavát, bejelentkezési állapotát és azonosítóját.



A UserDatabase osztály a felhasználói adatbázis kezeléséért felelős, például a jelszó módosításáért.



Futtatás

Nyisd meg a projektet egy Java fejlesztőkörnyezetben (például IntelliJ IDEA vagy Eclipse).

Ellenőrizd, hogy a Java, JUnit és Mockito függőségek rendelkezésre állnak.

Fordítsd le a projektet.

A tesztelés a UserTest osztály futtatásával indítható.

Tesztelés



A tesztelés JUnit és Mockito keretrendszerrel történik.



A tesztek két fő funkciót ellenőriznek:



mockUserReturnsCorrectData(): Ellenőrzi, hogy a mockolt User objektum a megfelelő felhasználói adatokat adja vissza.

updatePwdCallsDatabase(): Ellenőrzi, hogy a jelszó módosításakor a User osztály meghívja-e az adatbázis setPassword() metódusát a megfelelő felhasználói azonosítóval és új jelszóval.



A Mockito verify() metódusa ellenőrzi a megfelelő metódushívásokat.



Szükséges technológiák

Java

JUnit 4

Mockito

Maven vagy Gradle

Összegzés



A projekt célja a Mockito használatának bemutatása Java környezetben. A tesztek segítségével ellenőrizhető a mock objektumok működése, valamint az osztályok közötti együttműködés.

