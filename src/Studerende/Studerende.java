package Studerende;
/*Nu skal I selv bygge en klasse, som kan repræsentere en studerende med navn, alder, by, studieretning.

Herefter skal i instatiere "studerende-objekter" for hver studerende i Jeres gruppe .

Til sidst skal I lave en switch sætning, som indlæser et navn, og som kan vise den given studerendes alder.  */




public class Studerende {
    String navn;
    int alder;
    String retning;
    String by;

    Studerende() {
        retning = "Datamatiker";

    }

    Studerende(String navn, int alder, String by) {
        this.navn = navn;
        this.alder = alder;
        this.by = by;
    }

    Studerende(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }


}


