import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun ler_arquivo(){

    val arquivo = File("C:\\Users\\franc\\Documents\\ProjetosIntelliJ\\AtividadesTDD\\src\\LerArquivo.txt")

    try {
        Scanner(arquivo).use {l ->
            while (l.hasNext()){
                println(l.next())
            }
            l.close()
        }
    }catch (e: FileNotFoundException){
        println("Valha ao ler o arquivo, verifique o diretorio")
    }
}

fun main(){
    ler_arquivo()
}