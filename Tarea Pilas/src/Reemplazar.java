import java.util.Stack;
public class Reemplazar{
    public static Stack<Integer> A = new Stack<Integer>();
    public static void Reemplazr(Stack<Integer> pila, int nuevo, int viejo) {
        Stack<Integer> aux = new Stack<Integer>();
while (!pila.isEmpty()) {
    int valor = pila.pop();
        if (valor == viejo) {
            aux.push(nuevo);
        } else {
            aux.push(valor);
        }
    }
    while (!aux.isEmpty()) {
        pila.push(aux.pop());
    }
}
public static void main(String[] args) {
    A.push(1);
    A.push(2);
    A.push(3);
    A.push(2);
A.push(6);
int nuevo = 45;
int viejo = 2;
Reemplazr(A, nuevo, viejo);
System.out.println("Pila: " + A.toString());
}
}