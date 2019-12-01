Vorgehensweise bei der Bearbeitung der Aufgabe:

1.) Aufgabenstellung gr�ndlich durchlesen und verstehen.

2.) Das Beispiel visuell verdeutlichen:

->  2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
    4 5 6 7 8
                            14 15 16 17 18 19 20 21 22 23
                                                            25 26 27 28 29 30

3.) Schnittstelle(n) der Funktion(en) definieren -> Interfaces

4.) L�sungsansatz �berlegen.

5.) Evtl. "Hilfs-Funktionen" schreiben, damit die eigentliche Funktion (MERGE)
    nicht so "overloaded" und damit besser lesbar und verst�ndlicher f�r Dritte ist.
    -> In meinem Fall w�ren das "SortListOfArrays" und "HelpMerge" (Beschreibung siehe Program)

6.) L�sungsidee:
    a) Bei der visuellen Verdeutlichung der Beispiel Intervalle ist mir aufgefallen, dass es sinvoll w�re,
       vorher die Intervalle zu sortieren, um somit bessere Kontrolle beim Mergen (Algorithmus) zu haben.
       -> einfacher zu implementieren. 

7.) Implementierung der Funktion MERGE (Algorithmus) und der Hilfs-Funktionen.

8.) Funktion MERGE (Algorithmus) testen:

    Test Scenarios:

    a) Beispiel (Intervalle) aus Aufgabe verwenden
    b) Nur �berlappende Intervalle verwenden
    c) Nur NICHT-�berlappende Intervalle verwenden
    d) Intervalle verwenden, deren Grenzen sich ber�hren -> Bsp.: [2,10] [10, 18] etc.
    e) Successiv die Anzahl der Intervalle erh�hen (zuf�llig generierte ganzzahlige Intervalle erzeugen!?)
    f) Beobachten, wie sich die Laufzeit verh�lt.
       -> In meinem Fall w�re der Aufwandt, aufgrund des Sortieralgorithmus O(n�).
          Man k�nnte ihn aber mit einem effizienteren Sortieralgorithmus bestimmt auf n*log(n) reduzieren!
    g) Beobachten, wie sich der Speicherverbrauch verh�lt.
       Den Speicherverbauch kann man Anhand der definierten Variablen (Arrays, Listen etc.) bestimmen.
       -> In meinem Fall w�rde ich sagen, dass er linear mit der Anzahl der Intervalle steigt!?

Bzgl. Robustheit: Das einzige was ich dazu sagen kann ist die oben genannten Punkte auszuf�hren,
vorallem die Funktion MERGE mit einer gro�en Anzahl an Intervallen zu "f�ttern" und zu beobachten, wie sie sich verh�lt
(Diagramme erstellen: Anz. Intervalle -> Laufzeit, Anz. Intervalle -> Speicherverbrauch).
Dar�ber kann man dann Aussagen treffen, bis zu welcher Anzahl an Intervallen dieser Algorithmus auf bestimmten Devices(Memory) laufen k�nnte!?
Wenn die Anforderungen nicht erf�llt sind, sollte man versuchen die Laufzeit und den Speicherverbrauch zu reduzieren,
indem man z.B. vermeidet tempor�re Variablen zu verwenden oder das Speicherhandling optimiert
(k�nnte man z.B. in C++ ganz gut umsetzen mit Pointern, Speicher manuell allokieren und wieder freigeben etc.)
und/oder den Algorithmus versuchen zu optimieren.


Ich versichere hiermit, dass ich die Aufgabe alleine ohne Hilfe von Dritten (sogar ohne Verwendung von Literatur oder Internet)
gel�st habe!

Die gesamte Bearbeitungsdauer betr�gt ca. 4h.
Davon: - ca. 1h Vorbereitung (Problem klar machen, L�sungsansatz �berlegen etc.)
       - ca. 1,5 - 2h Implementierung der Funktion(en) (+ Hilfs-Funktionen)
       - ca. 1 - 1,5h Testen der Funktion MERGE