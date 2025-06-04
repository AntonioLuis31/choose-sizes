package es.vedruna;
public class SizeGen {
    public String talla;
     public void setTalla() {
         this.talla = talla;
     }
     public String tallaGen() {
         if (talla == null || talla.isEmpty()) {
             return "Introduce una talla valida";
         }
         return "Has seleccionado la talla " + talla + ".";
     }
}
