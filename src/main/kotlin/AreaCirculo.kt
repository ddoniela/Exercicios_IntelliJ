// 1 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele

fun main() {
    print("Digite o diâmetro do círculo: ")
    var diametro = readln().toDouble()

    var r = (diametro / 2);

    var area = (3.14 * (r * r))
    println(area)

    var per = (2 * 3.14 * r)
    println(per)

}