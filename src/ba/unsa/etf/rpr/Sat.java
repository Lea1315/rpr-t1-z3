package ba.unsa.etf.rpr;

public class Sat {
    private int sati, minute, sekunde;

     public Sat(int sati, int minute, int sekunde) {
        postavi(sati,minute,sekunde);
    }

     public void postavi(int s, int min, int sek) {
        this.sati=s;
        this.minute=min;
        this.sekunde=sek;
    }

    public void sljedeci() {
        this.sekunde = this.sekunde + 1;
        if (this.sekunde == 60) {
            this.sekunde = 0;
            this.minute = this.minute +1;
        }
        if (this.minute == 60) {
            this.minute = 0;
            this.sati = this.sati +1;
        }
        if (this.sati == 24)
            this.sati = 0;
    }
            public void prethodni() {
                sekunde = sekunde - 1;
                if (sekunde == -1) {
                    sekunde = 59;
                    minute = minute - 1;
                }
                if (minute == -1) {
                    minute = 59;
                    sati = sati - 1;
                }
                if (sati == -1)
                    sati=23;
            }
            public void pomjeriZa(int pomak) {
                if (pomak > 0)
                    for (int i = 0; i < pomak; i++) sljedeci();
		        else
		            for (int i = 0; i < -pomak; i++) prethodni();
            }
            public int dajSate()  { return this.sati; }
            public int dajMinute() { return this.minute; }
            public int dajSekunde() { return this.sekunde; }
            public void ispisi()  { System.out.println(sati +":" +minute +":" +sekunde);};
        }


