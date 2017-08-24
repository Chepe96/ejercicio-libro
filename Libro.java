public class Libro
{
    private String titulo;
    private String autor;
    //constructor
    public Libro(String tituloIni, String autorIni)
    {
        titulo=tituloIni;
        autor=autorIni;
    }
    //Metodo de acceso
    public String dimeAutor()
    {
        String cadAutor="";
        cadAutor+=autor;
        return cadAutor;
    }
    
        public String dimeTitulo()
    {
        String cadTitulo="";
        cadTitulo+=titulo;
        return cadTitulo;
    }
}