# 🕵️ Git Detective – Ermittlungsprotokoll

Ziel dieser Station ist es, das Repository zu **verstehen**, nicht es zu reparieren.

- Es wird **(noch) nichts geändert**
- Es wird **(noch) nichts repariert**
- Es wird **(noch) nichts committed**

Reparaturen folgen erst im **Panic Room** 🚨

Ausgearbeitet von: Matthias




## #1 -  Überblick über die Git-History
Welche 2 Commits fallen euch in der History bereits zu Beginn negativ auf? Und warum? 
- stuff (Man kennt sich überhaupt nicht aus was gemaint ist.)
- Update (Man weiß nicht was geupdated wurde und kennt sich dadurch nicht aus.)


## #2 - Ab welchem Commit ist das Projekt nicht mehr stabil?
Woran erkennt ihr, dass es ab hier ein Problem gibt?
Mit welche(n) Befehl(en) könnt ihr das herausfinden?
(Antwort: Commit-ID, Message, Begründung)

- Man erkennt es beim Commit "Update" an dem Tag: tag: v2-tests-broken
- ich habe git log --oneline für eine gute Übersicht verwendet
- ID: 50da5b1, Message: Update

## #3 - Welche Datei wurde dabei verändert?
Welche Datei(en) wurden im verdächtigen Commit verändert?
Mit welche(n) Befehlen könnt ihr das herausfinden?
(Antwort: Commit-ID, geänderte Datei(en), Kurzbeschreibung der Änderung)

- es wurde Calculator.java auf CalculatorText.java umbenannt und verschoben und eine Zeile geändert

## #4 - Wer hat die entscheidende Stelle verändert?
Welche Datei ist besonders relevant und warum?
Mit welche(n) Befehlen kannst du dies rausfinden? 
(Antwort: Datei, Commit-ID der relevanten Änderung, Commit Message, betroffene Code-Stelle, warum ist diese Stelle wichtig?)

- Calculator.java weil dort in der Datei etwas geändert wurde
- git show 50da5b1
- return wurde von a / b auf a / 0 geändert

## #5: Vergleich vor und nach der Änderung
Was ist der Unterschied im Code, bevor und nachdem das Problem entstanden ist? Mit welchem Befehl kannst du das rausfinden? 

- git show 50da5b1
- return wurde von a / b auf a / 0 geändert