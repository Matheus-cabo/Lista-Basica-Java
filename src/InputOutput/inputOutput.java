package InputOutput;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // TODO: complete os espaços em branco com sua solução para o problema
		String[] nomes = new String[ 10    ];
		
		for(int i=0 ; i<10 ; i++)
			nomes[  i  ] = sc.nextLine();
    System.out.printf("%s\n%s\n%s\n",nomes[2],nomes[6],nomes[8]);
		sc.close();  
	}
}

