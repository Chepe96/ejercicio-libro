public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    //constructor
    public Libro(String tituloIni, String autorIni, int nPaginas)
    {
        titulo=tituloIni;
        autor=autorIni;
        paginas=nPaginas;
    }
    //Metodo de acceso
    public String dimeAutor()
    {
        return autor;
    }
    
    public String dimeTitulo()
    {
        return titulo;
    }
    public String dimePaginas()
    {
        String cadPaginas="";
        cadPaginas+=paginas;
        return cadPaginas;
    }
    public String dimeDetalles()
    {
        String cadDetalles="";
        cadDetalles=cadDetalles+"Titulo: ";
        cadDetalles+=titulo;
        cadDetalles+=",";
        cadDetalles+=" Autor: ";
        cadDetalles+=autor;
        cadDetalles+=",";
        cadDetalles+=" Paginas: ";
        cadDetalles+=paginas;
        return cadDetalles;
    }
}