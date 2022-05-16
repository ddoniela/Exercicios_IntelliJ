
fun main(args: Array<String>) {

    /*
    Variaveis e seus tipos

    var identificador:  Tipo = valor

    Int - Que armazena valores inteiros (ex: 1, 2, 3...)
    Double - Armazena números reais (ex: 1.5, 6.7, 5.6...)
    Char - Armazena apenas um caracter (ex: K, M, J...)
    String - Armazena uma cadeia de caracteres (ex: frase, nome...
    lembrando que toda a cadeia de caracteres é representada por "")
    Boolean - Armazena valores lógicos (true ou false)


     */

    //Exemplo de declaração

    //var num: Int = 9

    //var num2: Double = 5.4

    //Type Inference (não precisa colocar o identificador E o tipo, ele já infere)

    //var nome = ""

    /*se tem "" é porque o nome é uma String, ele já sabe

     */

    //Exemplo prático do uso das variáveis

    //readLine() - Scanner - readLn()

    /*

    var nome = "Henrique"
    var idade = 21
    var altura = 1.75
    var comidaFavorita = "Temaki"

    //Concatenação usando + (forma que funciona, mas não é a mais utilizada)
    // ou $ (forma mais utilizada)

    println("Olá, meu nome é $nome, tenho $idade anos de idade, tenho ainda" + "$altura de altura e minha comida favorita é $comidaFavorita")

    */

    /*

    var leitura = Scanner(System.`in`)

    print("Digite seu nome: ")
    var nome = leitura.next()

    print("Digite sua idade: ")
    var idade = leitura.nextInt()

    print("Digite a sua altura: ")
    var altura = leitura.nextDouble()

    println("Olá, meu nome é $nome, tenho $idade anos de idade, tenho ainda" + "$altura de altura.")




     */

    //Exemplo utilizando readLine()

    /*

    print("Digite seu nome:")
    var nome = readln().toInt()

    print("Digite a sua idade: ")
    //Conversão de Tipos - toTipo()
    var idade = readln()

    print("Digite a sua altura: ")
    var altura = readln().toDouble()

    println("Olá, meu nome é $nome, tenho $idade anos de idade, tenho ainda" + "$altura de altura.")


     */

    /*
    Operadores Aritméticos

    Adição +
    Subtração -
    Muliplicação *
    Divisão /
    Módulo %

     */

    //Exemplo utilizando cálculo

    print("Digite o nome do funcionário: ")
    var nome = readln()

    println("Digite o salário dele: ")
    print("R$")
    var sal = readln().toDouble()

    var bonus = sal * 0.2
    println("O salário do funcionário, com 20% de bônus é: R$${sal + bonus}")
}







