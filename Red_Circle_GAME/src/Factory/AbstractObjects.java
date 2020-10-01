/**
 * @author Monareng T
  * Interface: AbstractObjecs   (AbstractFactory)
 */

package Factory;

import Products.BlindEnemy;
import Products.ChaserOval;
import Products.EnemyVertical;
import Products.Goal;
import Products.Player;

public interface AbstractObjects {

	Player createPlayer();
	
	ChaserOval	createChaserOval( int x,  int y);
		
	EnemyVertical createEnemyVertical(int x, int y);
	 
	Goal createGoal(int x, int y);
	
	BlindEnemy createBlindEnemy(int x, int y);
}