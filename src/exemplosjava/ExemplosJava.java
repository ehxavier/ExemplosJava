
package exemplosjava;

public class ExemplosJava {

    public static void main(String[] args) {
        /*
        Java é uma linguagem de programação orientada a objetos desenvolvida na década de 90 
        por uma equipe de programadores chefiada por James Gosling, 
        na empresa Sun Microsystems.
        */
        
        // Declarando variáveis...
        String nome, sobrenome;
        int idade;
        char sexo;
        double altura;
        boolean cadastrado = true;
        
        // Atribuindo valores às variáveis...
        nome = "Joaquim";
        sobrenome = "Santos";
        idade = 32;
        sexo = 'M';
        altura = 1.79; 
        
        // Comandos de saida... Hello World!
        System.out.println("Hello World!");
        System.out.println(nome);
        System.out.println(nome + " " + sobrenome);
        
        int n1 = 3;
        int n2 = 5;
        System.out.println(n2%n1);
        
        System.out.println(n1 == n2);  //false
        System.out.println(n1 != n2);  //true
        
        n1++; // 3 + 1 = 4
        n2--; // 5 - 1 = 4
        System.out.println(n2/n1);
        
        System.out.println(n1 == n2); //true
        // imprima(n1=n2)  VERDADEIRO
        System.out.println(n1 != n2); //false
        // imprima(n1<>n2) FALSO
        
        System.out.println("Joaquim" + " " + "Silva");
        System.out.println("n1 + n2 = " + (n1+n2) );
        
        
        
    }
    
}
