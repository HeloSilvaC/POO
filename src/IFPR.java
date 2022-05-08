import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;
import javax.xml.crypto.Data;

public class IFPR {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("SOBRE A SALA");
		Sala sala = new Sala(250, "Labien", "IPRF-Capum Paranavaí");
		
		System.out.println("Nome: " + sala.nome);
		System.out.println("Capacidade de pessoas: " + sala.capacidade);
		System.out.println("local: " + sala.local);

		System.out.println();
		System.out.println("SOBRE A PALESTRA");
		Palestra palestra = new Palestra("Mulheres na exata", "Dia 19/07 às 14h", true);
		
		System.out.println("Tema: " + palestra.tema);
		System.out.println("Data e o local: " + palestra.diaHora);
		System.out.println("Exigência de frequência: " + palestra.exigeFrequencia);

		System.out.println();
		System.out.println("SOBRE A PALESTRANTE");
		Palestrante palestrante = new Palestrante("Heloísa da Silva Contrera", "111.565.839-50", "Rua Antônio Silvestre de Oliveira, 1063", "14.000.356-5", "03/09/2005",
			"Paranavaí", "Paraná");
		System.out.println("Nome: " + palestrante.nome);
		System.out.println("Cpf: " + palestrante.cpf);
		System.out.println("Rg: " + palestrante.rg);
		System.out.println("Endereço: " + palestrante.endereco);
		System.out.println("Cidade que nasceu: " + palestrante.cidadeNascimento);
		System.out.println("Estado que nasceu: " + palestrante.estadoNascimento);
		
		System.out.println();
		System.out.println("SOBRE A CERTIFICADO:");
		Certificado certificado = new Certificado(89, 8, 9, 58);
		System.out.println("Livro: " +  certificado.livro);
		System.out.println("Folha:" + certificado.folha);
		System.out.println("Página: " + certificado.pagina);
		System.out.println("Número do Certificado: " + certificado.numeroDoCertificado);
		
		System.out.println();
		System.out.println("SOBRE OS PARTICIPANTES:");
		Participantes participantes = new Participantes();
		System.out.print("Quantidade de participantes:");
		int numParticipantes = teclado.nextInt();
		
		for(int i = 0; i<=numParticipantes; i++) {
			participantes.nome = teclado.nextLine();
			participantes.email = teclado.nextLine();
			participantes.cpf= teclado.nextLine();
		}
	}

}
