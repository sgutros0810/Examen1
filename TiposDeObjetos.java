
public enum TiposDeObjetos {
	GOTA, GOTALOCA, CRUZ, DIAMANTE, CIRCUNFERENCIA, PELOTA;
	
	public TiposDeObjetos valuesOf(String s) {
		TiposDeObjetos a = null;
		switch(s){
        case "GOTA":
        	a=GOTA;
            break;
        case "GOTALOCA":
        	a=GOTALOCA;
            break;
        case "CRUZ":
        	a=CRUZ;
            break;
        case "DIAMANTE":
        	a=DIAMANTE;
             break;
        case "CIRCUNFERENCIA":
        	a=CIRCUNFERENCIA;
            break;
        case "PELOTA":
        	a=PELOTA;
            break;
    }
		return a;
	}
}