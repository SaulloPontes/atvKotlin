import java.time.LocalDate
import java.util.Scanner

import kotlin.random.Random

fun main() {

    /*
        EQUIPE                      MATRICULA
        SAULO ARAUJO DE PONTES      2122683
        RENATO IVENS                2128731
        ISMAEL GOES                 2127167

     */

    var obrasCriadas = arrayListOf<Obra>()



    val scanner = Scanner(System.`in`)
    var sair : String = "n"
    var produtor : String;
    var obra : String;
    var clas : Int;
    var verObra : String;
    var qualObra : String;
    var gen : String;

    while (sair!="s"){

        println("qual tipo de obra vc quer produzir? [livro] ou [filme]")
        qualObra = scanner.nextLine();
        if(qualObra=="filme"){
            println("==FILME==")
            println("quem produziu")
            produtor  = scanner.nextLine();
            println("nome da obra")
            obra = scanner.nextLine();
            println("classificação indicativa")
            clas = scanner.nextInt();
            val filme = Filme(LocalDate.of(Random.nextInt(1900,2023),Random.nextInt(1,12),Random.nextInt(1,31)),produtor,obra,clas);
            println("posso assistir o filme?")
            if(!filme.possoAssistirOfilme(scanner.nextInt())){
                filme.mostrarDetalhesDaObra()
                println("quer assistir o filme?")
                verObra = scanner.next();
                if(verObra == "s"){
                    println(filme.assistirFilme())
                }
            }
            obrasCriadas.add(filme)
        }else if(qualObra=="livro"){
            println("==LIVRO==")
            println("quem produziu")
            produtor  = scanner.nextLine();
            println("nome da obra")
            obra = scanner.nextLine();
            println("genero literario")
            gen = scanner.nextLine();
            val livro = Livro(obra,produtor,LocalDate.of(Random.nextInt(1900,2023),Random.nextInt(1,12),Random.nextInt(1,31)),gen)
            println("quer ver os detalhes da obra?")
            verObra = scanner.nextLine();
            if(verObra == "s"){
                livro.mostrarDetalhesDaObra()
                livro.verQuantidadeDePag()
            }
            obrasCriadas.add(livro)
        }else{
            println("obra invalida")
        }

        println("quer parar de produzir?")
        sair = scanner.nextLine();

    }

    for(ob in obrasCriadas){
        ob.mostrarDetalhesDaObra()
    }
}