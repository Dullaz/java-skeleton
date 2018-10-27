package answers;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {

		// TODO Auto-generated method stub

		int maxm = 0;

		for(int i =0;i<portfolios.length;i++)

		{

			for(int j=i+1;j<portfolios.length;j++)

			{

				maxm = Math.max(portfolios[i]^portfolios[j],maxm);

			}

		}

		return maxm;

	}
}
