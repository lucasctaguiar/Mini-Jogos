package jogoslogicos;

import java.util.Random;
import java.util.Scanner;
public class Campominado {

	public static void main(String[] args) {
		//CASSINO
		
		Scanner Sc = new Scanner(System.in); 
		Random gerador = new Random();
		
		//DECLARA��O DAS VARI�VEIS
		
		String jogador, joga="NAO", tipo="MOEDAS", continuar="SIM", comecar="SIM", moeda="CARA", lado="CARA", ppt="PEDRA", sorte="PEDRA"; 
		int Nvet=2000, linhas=2000, colunas=6, i=0, j=0, codjogador=0, coduser=100, tentativas=0, lancar=0, resultadocc=0, resultadoppt=0, resultadodd=0, vitoriappt=0, vitoriadd=0, vitoriacc=0, derrotappt=0, derrotadd=0, derrotacc=0, lcmt=0, numero=0, rodadas=0;
		double SALDO=100, saldocc=0, saldodd=0, saldoppt=0, venc=0, venccc=0, vencdd=0, vencppt=0; 
		int user[][];
		String [] vet;
		
		
		vet = new String [Nvet]; // INICIALIZA��O DO VETOR QUE IR� RECEBER O NOME DOS JOGADORES 
		user = new int [linhas][colunas]; //INICIALIZA��O DO VETOR QUE IR� RECEBER O C�DIGO DOS JOGADORES E AS ESTAT�STICAS E RESULTADOS DO JODO
		
		//CRIA��O DE NOVO USU�RIO OU ACESSO A USU�RIO J� EXISTENTE
		/*System.out.println("J� � um jogador? Digite 1 para (SIM) ou 2 para (N�O)");
		joga = Sc.nextInt();*/
		
		System.out.println("Ja eh um jogador? SIM ou NAO");
		joga = Sc.next();
		
		while (!joga.equals("SIM") && !joga.equals("NAO")) {//RETORNA A PERGUNTA AT� QUE A RESPOSTA SE ENQUANDRE EM UMA DAS OP��ES
			System.out.println("RESPOSTA INVALIDA, RESPONDA NOVAMENTE");
			System.out.println("JA EH um jogador? SIM ou NAO");
			joga = Sc.next();
		}	
		
		//PARA JOGADOR J� CADASTRADO
		if (joga.equals("SIM")) {
			while (tentativas<4) {
				System.out.println("Qual o seu CODIGO de JOGADOR");
				coduser = Sc.nextInt();
				tentativas=tentativas+1;
				
				if (coduser==user[i][j]) {//BUSCAR AS INFORMA��ES DO USU�RIO NA MATRIZ DE DADOS
					System.out.println(user[i][j]+","); //IMPRIMIR AS INFORMA��ES E ESTAT�STICAS DO JOGADOR J� CADASTRADO
				} else { 
					System.out.println("CODIGO INVALIDO");
				}
				}
				
		//PARA CADASTRAR NOVO JOGADOR 
		} else if (joga.equals("NAO")){
				System.out.println("Insira um NOME de JOGADOR para cadastrar");
				jogador = Sc.next();
				while (jogador==vet[i]) {//COMPARA��O SE J� H� JOGADOR CADASTRADO COM O NOME DIGITADO
					System.out.println("Jogador jah cadastrado!");
					System.out.println("Insira um NOME Diferente de JOGADOR para cadastrar");
					jogador = Sc.next();
				}
					if (jogador!=vet[i]) {
						vet[i] = jogador;
						coduser=coduser+1; //GERA��O DE C�DIGO DE USU�RIO
						System.out.println("Bem-Vindo " + vet[i] + " Seu CoDIGO DE USUARIO �: " + coduser);
						System.out.print(" SENHA DE ACESSO EH: ");
						
						for (i = 0; i < 4; i++) {//SENHA DE ACESSO AO JOGO
						System.out.print(gerador.nextInt(5));
						}
						System.out.println("");
						System.out.println("-------------------------------------------------------------------------------------");
					} else {//VOLTA PARA O MENU DE ESCOLHER O JOGO
						System.out.println("Opcao invalida!");
		}
					
					
						
		//MENU DE ESCOLHA DOS JOGOS//////////////////////////////////////////////////////////////////////////////////////						
		while (!tipo.equals("SAIR")) {
		System.out.println("Voce possui de saldo " + SALDO +" Euros para tentar a sorte em nossa banca!!!!");
		System.out.println("Qual dos jogos deseja jogar? MOEDAS, DADOS, PEDRA - ou SAIR!!!!");
		tipo = Sc.next();
		continuar="SIM";
			
			//IN�CIO DO JOGO
			if (tipo.equals("MOEDAS")) {//APRESENTA��O DAS REGRAS DO JOGO MOEDAS
			System.out.println("Bem-vindo ao jogo de Moedas, CARA OU COROA");
			System.out.println("As regras do jogo sao simples:");
			System.out.println("1- Seu limite maximo de perdas e o seu saldo acumulado: " + SALDO);
			System.out.println("2- Cada rodada tem um custo de 1,00 euro caso voce erre!!");
			System.out.println("3- O premio da rodada tem valor de 1,00 euro caso voce ganhe!!!");
			System.out.println("4- As taxas de manutencao do cassino custam 0,02 euro por lancamento de moeda!!!");
			System.out.println("5- Escolha um lado da moeda! CARA ou COROA");
			System.out.println("6- Lance a moeda");
			System.out.println("7- Verifique o resultado, acumule euro, e acompanhe seus resultados!!!!");
			System.out.println("VAMOS COMECAR? SIM ou NAO");
			comecar = Sc.next();
				
				if (comecar.equals("SIM")) {//COME�O DAS APOSTAS
					while (continuar.equals("SIM")) {
					System.out.println("Qual lado da moeda voce escolhe??? CARA OU COROA?");
					lado = Sc.next();
					System.out.println("Voce escolheu: " + lado);
								
								
					System.out.println("DIGITE (1) PARA LANCAR A MOEDEA"); // VERIFICAR PARTE DE LAN�AMENTO DA MOEDA
					lcmt = Sc.nextInt();
					lancar=lancar+1;
					for (i=1; i<1000; i++) {//SORTEIO DA MOEDA
					resultadocc=gerador.nextInt(8);
								
					} if (resultadocc%2==0) {//COROA - lan�amento da moeda
						moeda = "COROA";
						System.out.println("O lancamento foi: " + moeda);
									
									
					} else {//CARA - lan�amento da moeda
						moeda = "CARA";
						System.out.println("O lancamento foi: " + moeda);
					}	
								
					//AN�LISE DO RESULTADO DA RODADA
					if (moeda.equals(lado)) {
						System.out.println("Vitoria!!! Acumulou 1 euro");
						vitoriacc=vitoriacc+1;
					}  else {
						System.out.println("Ohhh doh, voce perdeu 1 euro!!!");
						derrotacc=derrotacc+1;
					}
					
					System.out.println("Deseja Continuar neste jogo????? SIM ou NAO");
					continuar = Sc.next();
								
					while (!continuar.equals("SIM") && !continuar.equals("NAO")) {
						System.out.println("Resposta Invalida:");
						System.out.println("Deseja Continuar neste jogo????? SIM ou NAO");
						continuar = Sc.next();
					}
								
					}//FECHAMENTO DO CICLO DA RODADA DO JOGO CARA OU COROA
					SALDO = SALDO + vitoriacc - derrotacc - (vitoriacc+derrotacc)*0.02;
					
					System.out.println("Voce jogou: - " + (vitoriacc+derrotacc) + " partidas!!!" + "ganhou: Euros" + vitoriacc + " e perdeu: Euros" + derrotacc);
					System.out.println("Seu saldo atual eh de: Euros" + SALDO);
					
					} else if (comecar.equals("NAO")) {//VOLTAR PRO CICLO DE ESCOLHER O JOGO
								
						
						
					} else {//VOLTA PARA O MENU DE ESCOLHER O JOGO
						System.out.println("Resposta invalida!");
					}
							
							
			} else if (tipo.equals("DADOS")) {//JOGO TIPO 2
				System.out.println("Bem-vindo ao jogo DADOS");
				System.out.println("As regras do jogo s�o simples:");
				System.out.println("1- Seu limite maximo de perdas eh o seu saldo acumulado, que eh de: " + SALDO);
				System.out.println("2- Cada rodada tem um custo de 1,00 euro caso voce erre!!");
				System.out.println("3- O premio da rodada tem valor de 5,00 euros caso voce ganhe!!!");
				System.out.println("4- As taxas de manutencao do cassino custam 0,02 euro por lancamento de DADO!!!");
				System.out.println("5- Escolha um numero de 1 a 6! As faces de um dado");
				System.out.println("6- Lance o DADO");
				System.out.println("7- Verifique o resultado, acumule euros, e acompanhe seus resultados!!!!");
				System.out.println("VAMOS COMECAR? SIM ou NAO");
				comecar = Sc.next();
							
					if (comecar.equals("SIM")) {
					while (continuar.equals("SIM")) {
					System.out.println("Qual NUMERO, de 1 a 6, voce escolhe???");
					numero = Sc.nextInt();
					System.out.println("Voce escolheu a face do dado de numero: " + numero);
								
					System.out.println("DIGITE (1) PARA JOGAR O DADO"); // VERIFICAR PARTE DE LAN�AMENTO DA MOEDA
					lcmt = Sc.nextInt();
					lancar=lancar+1;
					for (i=0; i<7; i++) {//SORTEIO DA MOEDA
					resultadodd=gerador.nextInt(6);
								
					} System.out.println("O lancamento do dado foi: " + (resultadodd+1));
									
								
					//AN�LISE DO RESULTADO DA RODADA
					if (resultadodd+1==numero) {
						System.out.println("Vitoria!!! Acumulou 5 Euros");
						vitoriadd=vitoriadd+1;
					}  else {
						System.out.println("Ohhh doh, voce perdeu 1 Euro!!!");
						derrotadd=derrotadd+1;
					}
					
					System.out.println("Deseja Continuar neste jogo????? SIM ou NAO");
					continuar = Sc.next();
								
					while (!continuar.equals("SIM") && !continuar.equals("NAO")) {
						System.out.println("Resposta Invalida:");
						System.out.println("Deseja Continuar neste jogo????? SIM ou NAO");
						continuar = Sc.next();
					}			
					}//FECHAMENTO DO CICLO DA RODADA DO JOGO DE DADOS	
					SALDO = SALDO + (vitoriadd*5) - derrotadd - (vitoriadd+derrotadd)*0.02;
					
					System.out.println("Voc� jogou: - " + (vitoriadd+derrotadd) + " partidas!!!" + "ganhou: euros" + vitoriadd*5 + " e perdeu: euros" + derrotadd);
					System.out.println("Seu saldo atual eh de: Euros" + SALDO);
					System.out.println("Deseja Continuar neste jogo????? SIM ou NAO");
					continuar = Sc.next();
								
					} else if (comecar.equals("NAO")) {//VOLTAR PRO CICLO DE ESCOLHER O JOGO
								
				} else {//VOLTA PARA O MENU DE ESCOLHER O JOGO
								System.out.println("Resposta invalida!");
				}
							
				} 
			else if (tipo.equals("PEDRA")) {//JOGO TIPO 3
				System.out.println("Bem-vindo ao jogo PEDRA PAPEL E TESOURA!!!");
				System.out.println("As regras do jogo s�o simples:");
				System.out.println("1- Seu limite maximo de perdas eh o seu saldo acumulado, que eh de: " + SALDO);
				System.out.println("2- Cada rodada tem um custo de 1,00 euro caso voce erre!!");
				System.out.println("3- O premio da rodada tem valor de 3,00 euros caso voce ganhe!!!");
				System.out.println("4- As taxas de manutencao do cassino custam 0,02 euros por tentativa!!!");
				System.out.println("5- Escolha entre PEDRA, PAPEL ou TESOURA!!");
				System.out.println("6- PEDRA vence TESOURA, TESOURA vence PAPEL, e PAPEL vence PEDRA");
				System.out.println("7- Lance a sorte!");
				System.out.println("8- Verifique o resultado, acumule euros, e acompanhe seus resultados!!!!");
				System.out.println("VAMOS COME�AR? SIM ou NAO");
				comecar = Sc.next();
							
				if (comecar.equals("SIM")) {
					while (continuar.equals("SIM")) {
					System.out.println("PEDRA, PAPEL ou TESOURA???");
					ppt = Sc.next();
					System.out.println("Voce escolheu: " + ppt);
								
								
					System.out.println("DIGITE (1) PARA LANCAR A SORTE"); // VERIFICAR PARTE DE LAN�AMENTO DA MOEDA
					lcmt = Sc.nextInt();
					lancar=lancar+1;
					for (i=0; i<3; i++) {//SORTEIO 
					resultadoppt=gerador.nextInt(3);
					}
								
					if (resultadoppt==0) {//PEDRA
						sorte = "PEDRA";
			
					} else if (resultadoppt==1) {//PAPEL
						sorte = "PAPEL";
			
					} else if (resultadoppt==2) {//TESOURA
						sorte = "TESOURA";
					} 
					System.out.println("O lancamento da SORTE foi: " + (sorte));
									
								
					//AN�LISE DO RESULTADO DA RODADA
					if (ppt.equals(sorte)) {
						System.out.println("Empatou! Tente de novo!!!");
						
					}  else if (ppt.equals("PEDRA") && sorte.equals("Tesoura")) {
						System.out.println("Pedra quebra a tesoura! Parabens, você ganhou 3,00 euros");
						vitoriappt = vitoriappt+1;
					}  else if (ppt.equals("PAPEL") && sorte.equals("PEDRA")) {
						System.out.println("Papel embrulha a Pedra! Parabens, você ganhou 3,00 euros");
						vitoriappt = vitoriappt+1;
						} else if (ppt.equals("TESOURA") && sorte.equals("PAPEL")) {
							System.out.println("Tesoura corta o Papel! Parabens, você ganhou 3,00 euros");
							vitoriappt = vitoriappt+1;
							} else {
								System.out.println("Ohhh doh, voce perdeu 1 euro!!!");
								derrotappt=derrotappt+1;
					}
						
					System.out.println("Deseja Continuar neste jogo????? SIM ou NAO");
					continuar = Sc.next();
								
					while (!continuar.equals("SIM") && !continuar.equals("NAO")) {
						System.out.println("Resposta Invalida:");
						System.out.println("Deseja Continuar neste jogo????? SIM ou NAO");
						continuar = Sc.next();
					}
								
				}//FECHAMENTO DO CICLO DA RODADA DO JOGO PEDRA, PAPEL ou TESOURA
					SALDO = SALDO + vitoriappt*3 - derrotappt - (vitoriappt+derrotappt)*0.02;
					
					System.out.println("Voce jogou: - " + (vitoriappt+derrotappt) + " partidas!!!" + "ganhou: euros" + vitoriappt*3 + " e perdeu: euros" + derrotappt);
					System.out.println("Seu saldo atual eh de: euros" + SALDO);
								
				} else if (comecar.equals("NAO")) {//VOLTAR PRO CICLO DE ESCOLHER O JOGO
								
				} else {//VOLTA PARA O MENU DE ESCOLHER O JOGO
								System.out.println("Resposta inv�lida!");
				}
							
		}
			else if (tipo.equals("SAIR")) {//VAI PARA O FIM DO C�DIGO
							
		}
	}
		}
		
		System.out.println("FIM DO JOGO! SEUS RESULTADOS GERAIS FORAM: ");
		System.out.println("SALDO: Euros" + SALDO);
		rodadas = vitoriacc+derrotacc+vitoriadd+derrotadd+vitoriappt+derrotappt;
		rodadas = vitoriacc+derrotacc+vitoriadd+derrotadd+vitoriappt+derrotappt;
		venc = (Double.valueOf(vitoriacc+vitoriadd+vitoriappt)/Double.valueOf(rodadas))*100;
		System.out.println("Voce jogou um total de: " + rodadas + " partidas, das quais ganhou: " + (vitoriacc+vitoriadd+vitoriappt) + " e perdeu " + (derrotacc+derrotadd+derrotappt));
		System.out.println("Suas jogadas vencedoras representam: " + venc + "%");
		
		
		if (vitoriacc==0) {
			System.out.println("Nao houveram vitorias em CARA ou COROA ");
		} else {
			venccc = (Double.valueOf((vitoriacc)/Double.valueOf(vitoriacc+derrotacc)))*100; //Convertendo um inteiro em um double//
			System.out.println("EM CARA OU COROA: " + venccc + "%");
		}
			
		if (vitoriadd==0) {
			System.out.println("Nao houveram vitorias em DADO ");
		} else {
			vencdd = (Double.valueOf((vitoriadd)/Double.valueOf(vitoriadd+derrotadd)))*100; //Convertendo um inteiro em um double//
			System.out.println("EM JOGO DE DADO: " + vencdd + "%");
		}
		
		if (vitoriappt==0) {
			System.out.println("Nao houve vitorias em PEDRA, PAPEL ou TESOURA ");
		} else {
			vencppt = (Double.valueOf((vitoriappt)/Double.valueOf(vitoriappt+derrotappt)))*100;
			System.out.println("EM PEDRA PAPEL E TESOURA: " + vencppt + "%"); //Convertendo um inteiro em um double//
		}			
				
		System.out.println("FIM!!!");
	}
}
