Vorgehensweise bei der Bearbeitung der Aufgabe:

1.) Aufgabenstellung gründlich durchlesen und verstehen.

2.) Das Beispiel visuell verdeutlichen:

->  2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
    4 5 6 7 8
                            14 15 16 17 18 19 20 21 22 23
                                                            25 26 27 28 29 30

3.) Schnittstelle(n) der Funktion(en) definieren -> Interfaces

4.) Lösungsansatz überlegen.

5.) Evtl. "Hilfs-Funktionen" schreiben, damit die eigentliche Funktion (MERGE)
    nicht so "overloaded" und damit besser lesbar und verständlicher für Dritte ist.
    -> In meinem Fall wären das "SortListOfArrays" und "HelpMerge" (Beschreibung siehe Program)

6.) Lösungsidee:
    a) Bei der visuellen Verdeutlichung der Beispiel Intervalle ist mir aufgefallen, dass es sinvoll wäre,
       vorher die Intervalle zu sortieren, um somit bessere Kontrolle beim Mergen (Algorithmus) zu haben.
       -> einfacher zu implementieren. 

7.) Implementierung der Funktion MERGE (Algorithmus) und der Hilfs-Funktionen.

8.) Funktion MERGE (Algorithmus) testen:

    Test Scenarios:

    a) Beispiel (Intervalle) aus Aufgabe verwenden
    b) Nur Überlappende Intervalle verwenden
    c) Nur NICHT-überlappende Intervalle verwenden
    d) Intervalle verwenden, deren Grenzen sich berühren -> Bsp.: [2,10] [10, 18] etc.
    e) Successiv die Anzahl der Intervalle erhöhen (zufällig generierte ganzzahlige Intervalle erzeugen!?)
    f) Beobachten, wie sich die Laufzeit verhält.
       -> In meinem Fall wäre der Aufwandt, aufgrund des Sortieralgorithmus O(n²).
          Man könnte ihn aber mit einem effizienteren Sortieralgorithmus bestimmt auf n*log(n) reduzieren!
    g) Beobachten, wie sich der Speicherverbrauch verhält.
       Den Speicherverbauch kann man Anhand der definierten Variablen (Arrays, Listen etc.) bestimmen.
       -> In meinem Fall würde ich sagen, dass er linear mit der Anzahl der Intervalle steigt!?

Bzgl. Robustheit: Das einzige was ich dazu sagen kann ist die oben genannten Punkte auszuführen,
vorallem die Funktion MERGE mit einer großen Anzahl an Intervallen zu "füttern" und zu beobachten, wie sie sich verhält
(Diagramme erstellen: Anz. Intervalle -> Laufzeit, Anz. Intervalle -> Speicherverbrauch).
Darüber kann man dann Aussagen treffen, bis zu welcher Anzahl an Intervallen dieser Algorithmus auf bestimmten Devices(Memory) laufen könnte!?
Wenn die Anforderungen nicht erfüllt sind, sollte man versuchen die Laufzeit und den Speicherverbrauch zu reduzieren,
indem man z.B. vermeidet temporäre Variablen zu verwenden oder das Speicherhandling optimiert
(könnte man z.B. in C++ ganz gut umsetzen mit Pointern, Speicher manuell allokieren und wieder freigeben etc.)
und/oder den Algorithmus versuchen zu optimieren.


Ich versichere hiermit, dass ich die Aufgabe alleine ohne Hilfe von Dritten (sogar ohne Verwendung von Literatur oder Internet)
gelöst habe!

Die gesamte Bearbeitungsdauer beträgt ca. 4h.
Davon: - ca. 1h Vorbereitung (Problem klar machen, Lösungsansatz überlegen etc.)
       - ca. 1,5 - 2h Implementierung der Funktion(en) (+ Hilfs-Funktionen)
       - ca. 1 - 1,5h Testen der Funktion MERGE