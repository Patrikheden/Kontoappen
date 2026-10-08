1.Datasäkerhet/Inkapsling: Hur har du skyddat kontots uppgifter i din kod, och vad hade kunnat hända om du inte gjorde det?

Svar: Jag har använt private på balance och owner i account.java,om jag inte hade gjort detta hade man lättare kunnat ändra saldot eller andra uppgifter på fel sätt.

2.Skapande-mönster (Factory): Varför skapas kontot via registrets metod istället för direkt ute i Main?

Svar: Kontot skapas via AccountRegister eftersom registret ansvarar för att hantera kontona. Det gör att Main blir enklare och att konto-hanteringen finns samlad på ett ställe.

3.Flöde: Beskriv ett av menyvalen steg för steg (vad användaren matar in → vilket objekt som hanterar det → vilken metod som körs → vad som skrivs ut).

Svar: Användaren väljer menyval 1 och skriver in namn och startbelopp. Main skickar uppgifterna till createAccount() i AccountRegister, som skapar och sparar kontot.

4.Reflektion (3–5 meningar): Hur gjorde du när du körde fast eller stötte på ett problem? Om du använde verktyg som AI, Google eller kursmaterial: ge ett konkret exempel på hur du tog hjälp för att förstå och lösa problemet själv.

Svar: När jag körde fast försökte jag först förstå problemet själv. Jag använde AI för att få hjälp att förstå vissa delar av koden och kollade även upp vissa uppgifter som jag var osäker på. Sedan ändrade jag koden själv och testade att programmet fungerade. Det hjälpte mig att förstå vad jag gjorde istället för att bara kopiera en lösning.
