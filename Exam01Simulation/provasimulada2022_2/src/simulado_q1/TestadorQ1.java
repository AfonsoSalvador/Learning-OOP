package simulado_q1;

/**
 * Questão 1.
 * 
 * Crie classes para representar dados sobre uma base de usuários (UserBase) do Twitter, seguindo o diagrama UML fornecido.
 * 
 * Implemente funcionalidade nas suas classes para calcular a porcentagem média de usuários "verificados" (VerifiedUser) 
 * em uma UserBase assim como o tamanho médio de cada mensagem (ou seja o tamanho médio do atributo text de 
 * todos os tweets de todos os usuários).
 * 
 * Crie um testador para suas classes. 
 * 
 * 
 */


public class TestadorQ1 {

	public static void main(String[] args) {
		UserBase ub = new UserBase();
		ub.CreateNormalUser("1090");
		ub.CreateNormalUser("1010");
		ub.CreateVerifiedUser("2090");
		ub.CreateVerifiedUser("2020");

		User u = ub.findUserID("1090");
		u.Tweet("teste de tweet");
		u = ub.findUserID("2090");
		u.Tweet("teste de tweet");

		double tweetavg = ub.getTweetLentghAvg();
		double verporcent = ub.getVerifiedPorcent();
		double normporcent = ub.getNormalPorcent();

		System.out.println("Average tweet size: "+ tweetavg + "\nVerfied User Percentage:" + verporcent + "%\nNormal User Percentage:" + normporcent + "%");
	}

}
