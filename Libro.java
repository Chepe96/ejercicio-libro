public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeRef;
    private int prestamos;
    
    /**
     * Se inicializan todas las variables del libro.
     * @param tituloIni Recibe el titulo y se lo asigna a la variable correspondiente.
     * @param autorIni Recibe una cadena con el autor y lo asigna a la varible autor.
     * @param nPaginas Recibe el numero de paginas y se lo asigna a paginas.
     * las variables numDeRef y prestamos se inicializan con 0.
     */
    //constructor
    public Libro(String tituloIni, String autorIni, int nPaginas)
    {
        titulo=tituloIni;
        autor=autorIni;
        paginas=nPaginas;
        numeroDeRef="";
        prestamos=0;
    }
    
    /**
     * Este metodo regresa el autor.
     */
    //Metodo de acceso
    public String dimeAutor()
    {
        return autor;
    }
    
    /**
     * Este metodo regresa el titulo.
     */
    public String dimeTitulo()
    {
        return titulo;
    }
    
    /**
     * Este metodo regresa el numero de paginas.
     */
    public String dimePaginas()
    {
        String cadPaginas="";
        cadPaginas+=paginas;
        return cadPaginas;
    }
    
    /**
     * Este metodo te regresa todos los detalles del libro, titulo,autor,paginas,
     * numero de referencia y prestamos. Ademas te checa el numero de referencia
     * y si es menor o igual a 0 te le asigna ZZZ.
     */
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
    
    /**
     * Este metodo cambia el numero de referencia.
     */
    public void cambiaNumRef(String numRef)
    {
        if(numRef.length()>=3)
        {
            numeroDeRef=numRef;
        }
    }
    
    /**
     * Este metodo regresa el numero de referencia
     */
    public String dimeNumRef()
    {
        return numeroDeRef;
    }
    
    /**
     * Este metodo va contando los prestamos.
     */
    public void prestar()
    {
        prestamos+=1;
    }
    
    /**
     * Este metodo regresa los prestamos.
     */
    public String dimePrestamos()
    {
        String cadPrestamos="";
        cadPrestamos+=prestamos;
        return cadPrestamos;
    }
}