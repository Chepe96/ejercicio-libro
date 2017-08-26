public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeRef;
    private int prestamos;
    //constructor
    public Libro(String tituloIni, String autorIni, int nPaginas)
    {
        titulo=tituloIni;
        autor=autorIni;
        paginas=nPaginas;
        numeroDeRef="";
        prestamos=0;
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
        cadDetalles+=",";
        cadDetalles+=" Numero de referencia: ";
        if(numeroDeRef.length()<=0)
        {
            numeroDeRef+="ZZZ";
        }
        cadDetalles+=numeroDeRef;
        cadDetalles+=",";
        cadDetalles+=" Prestamos: ";
        cadDetalles+=prestamos;
        return cadDetalles;
    }
    
    public void cambiaNumRef(String numRef)
    {
        if(numRef.length()>=3)
        {
            numeroDeRef=numRef;
        }
    }
    
    public String dimeNumRef()
    {
        return numeroDeRef;
    }
    
    public void prestar()
    {
        prestamos+=1;
    }
    
    public String dimePrestamos()
    {
        String cadPrestamos="";
        cadPrestamos+=prestamos;
        return cadPrestamos;
    }
}