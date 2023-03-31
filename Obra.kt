import java.time.LocalDate

interface Obra {

    var nomeDaObra : String
    var dataDeLancamento : LocalDate;
    var quemProduziu : String;

    fun mostrarDetalhesDaObra();

}