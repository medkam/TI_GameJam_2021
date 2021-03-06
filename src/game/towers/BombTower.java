package game.towers;

import game.enemies.Enemy;
import game.projectiles.ArrowProjectile;
import game.projectiles.BombProjectile;

/**
 * Created by johan on 2017-04-10.
 */
public class BombTower extends Tower {
	public BombTower() {
		super("/towers/bomb.png");
		this.cost = 50;
		this.range = 300;
		this.fireDelay = 0.5;
		this.dmg = 1;
		this.upgradeCost = this.cost;
	}

	@Override
	public void shoot(Enemy e) {
		//e.damage(10);
		shoot(new BombProjectile(e.x, e.y, this.dmg));
	}
}
