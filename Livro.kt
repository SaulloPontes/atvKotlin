import java.time.LocalDate
import kotlin.random.Random

class Livro(override var nomeDaObra: String, override var quemProduziu: String,
            override var dataDeLancamento: LocalDate, var generoLiterario : String) : Obra{


    var numeroDePag = Random.nextInt(500,4000)
        set(value) {
            field = value
        }

    fun verQuantidadeDePag()  {
        println("O livro ${nomeDaObra} tem ${numeroDePag} páginas")
    }

    override fun mostrarDetalhesDaObra() {
        println("nome do livro: ${nomeDaObra} / " +
                "produtor: ${quemProduziu} / data de lançamento: " +
                "${dataDeLancamento} / gênero literário: ${generoLiterario} ")
    }



}