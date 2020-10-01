/**
 * @author Monareng T
 * Class: ConcreteObjects   (ConcreteFactory)
 */
package Factory;

import Products.BlindEnemy;
import Products.ChaserOval;
import Products.EnemyVertical;
import Products.Goal;
import Products.Player;

public class ConcreteObjects implements AbstractObjects{
	

	//Create instance of player
	@Override 
	public Player createPlayer() {
		// TODO Auto-generated method stub
		Player player = new Player();
		return player;
	}

	//Create instance of ChaserOval
	@Override
	public ChaserOval createChaserOval(int x, int y) {
		// TODO Auto-generated method stub
		ChaserOval co = new ChaserOval(x,y);
		return co;
	}

	//Create instance of EnemyVertical
	@Override
	public EnemyVertical createEnemyVertical(int x, int y) {
		// TODO Auto-generated method stub
		EnemyVertical ev = new EnemyVertical(x, y);
		return ev;
	}

	//Create instance of Goal
	@Override
	public Goal createGoal(int x, int y) {
		// TODO Auto-generated method stub
		Goal  goal = new Goal(x,y);
        return goal;
	}

	//Create instance of BlindEnemy
	@Override
	public BlindEnemy createBlindEnemy(int x, int y) {
		// TODO Auto-generated method stub
		BlindEnemy be = new BlindEnemy(x,y);
		return be;
	}
	


}