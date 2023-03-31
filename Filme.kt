import java.time.LocalDate
import java.util.Scanner

class Filme(override var dataDeLancamento: LocalDate, override var quemProduziu: String,
            override var nomeDaObra: String , var classificacaoIndicativa : Int ) : Obra {

    fun assistirFilme() : String{
        return "você está assistindo ao filme: ${this.nomeDaObra}"
    }
    fun possoAssistirOfilme(idade : Int) : Boolean{
        return if (idade<18){
            println("não posso assistir o filme, pois o filme é para maiores de 18 anos")
            true
        }else{
            println("posso assistir")
            false
        }
    }
    override fun mostrarDetalhesDaObra() {
        println("nome do filme: ${nomeDaObra} " +
                "/ produtor: ${quemProduziu} / " +
                "data de lançamento: ${dataDeLancamento} / " +
                "classificação indicativa: ${classificacaoIndicativa}")
    }

}