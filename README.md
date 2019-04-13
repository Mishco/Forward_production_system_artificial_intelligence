# Forward Production System

Projekt z umelej inteligencie - Dopredný produkčný systém

## Assignment 

Production system based on the derivation rule modus ponens (rule separation) derives new facts from known facts and production rules. If the system does not have enough input data, it can ask the user questions.
It is also necessary to include a description of the functional program
specific solutions (knowledge representation, algorithm, specific properties) and by evaluating the operation of the system created. The system must work properly at least over the first mentioned (simple) knowledge base, the system must base knowledge can load from a file. In this case, you also need to write to the documentation of how the system could be expanded. It is also possible to create your own knowledge bases.

## Solution

```java
// Find all applicated actions
for (Pravidlo prav : vsetkyPravidla) { 
 List<String[]> naviazania = new ArrayList<>(); 
 searching(prav.Nazov, prav.Podmienka, prav.Akcia, naviazania); 
} 
```

The search function searches sequentially for a given rule that consists of a condition consisting of multiple sub-conditions.
 
So at the beginning of the search function, we check how many current conditions we have, if there is no more, we have successfully acquired all the links and we can list the action to be performed. 
If we still have a condition, we will go first to look at the first character, which can be in specific cases (<>) and then proceed in a different way, if this character is not found at the beginning of the condition, until all the facts are found, who sits with a particular condition. 
That is, I always crumble the word into words (eg, Peter, is, parent, Jano) and the condition (? X, is, parent,? Y) and I check the word by word if they match each other and are the same in it if i found the right fact and i try to establish a link between Peter -> X and Jano -> Y. 
I check these links with the previous ones created in the given condition (in case that it finds two completely the same bindings it will delete one of them as unnecessary and if it finds a link that contradicts the previous one it discards the whole fact and solves the whole condition from the beginning and try to find another fact that would suit.)
If it finds a link successfully, it will reduce the number of sidebars and return to the very beginning, where they find out who else has another sub-condition.


## Slovak version

## Zadanie

Produkčný systém na základe odvodzovacieho pravidla modus ponens (pravidlo 
odlúčenia) odvodzuje zo známych faktov a produkčných pravidiel nové fakty. Ak 
systém nemá dostatok vstupných údajov, môže klásť užívateľovi otázky. 
K funkčnému programu je potrebné pripojiť aj dokumentáciu s opisom 
konkrétneho riešenia (reprezentácia znalostí, algoritmus, špecifické vlastnosti) a 
zhodnotením činnosti vytvoreného systému. Systém musí správne pracovať aspoň 
nad prvou uvedenou (jednoduchou) bázou znalostí, bázu znalostí si musí systém 
vedieť načítať zo súboru. V tom prípade je tiež potrebné napísať do dokumentácie, 
ako by bolo možné systém rozšíriť. Je možné si vytvoriť aj vlastné bázy znalostí.

## Riešenie

```java
// Najde všetky aplikovateľné akcie 
for (Pravidlo prav : vsetkyPravidla) { 
 List<String[]> naviazania = new ArrayList<>(); 
 searching(prav.Nazov, prav.Podmienka, prav.Akcia, naviazania); 
} 
```

Funkcia searching, prehliadava postupne pre dané pravidlo, ktoré sa skladá z podmienky, 
tvorenej viacerými podpodmienkami. 
 
Takže na začiatku funkcie searching sa skontroluje koľko mám ešte aktuálnych podmienok, ak 
by už nebola ani jedna, úspešne sme získali všetky naviazania a môže vypísať akciu, ktorú má 
vykonať. Ak ešte máme nejakú podmienku tak ju ideme riešiť najskôr pozerám na prvý znak, ktorý 
môže byť v špecifických prípadoch (<>) a vtedy sa postupuje odlišným spôsobom, ak sa tento znak na 
začiatku podmienky nenachádza postupne prehľadáva všetky fakty, kým nenájde vyhovujúci fakt, 
ktorý sedí s konkrétnou podmienkou. To znamená, že vždy si rozdrobím fakt na slová (napr: Peter, je, 
rodic, Jano) a podobne aj podmienku(?X, je, rodic, ?Y) a kontrolujem slovo po slove ak navzájom 
vyhovujú a teda sú rovnaké v tom prípade som našiel správny fakt a snažím sa vytvoriť naviazanie 
medzi Peter->?X a Jano->?Y . Tieto naviazania kontrolujem s predošlými vytvorenými v danej 
podmienke (v prípade ,že nájde dve úplne rovnaké naviazania vymaže jedno z nich ako zbytočné 
a v prípade, že nájde naviazanie, ktoré protirečí predošlému zahodí celý fakt a rieši celú podmienku 
od začiatku a snaží sa nájsť iný fakt, ktorý by vyhovoval.) 
Ak úspešne nájde naviazania, zníži počet podpomienok a vracia sa na úplný začiatok, a tam 
zistí čí ešte má nejakú ďalšiu podpodmienku. 
