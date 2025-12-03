package test.three;

public class Defender extends AbstractMonster {
	public Defender(String name, int hp, int attack, int defense) {
		super(name, hp, attack, defense);
	}

	@Override
	public int attack() {
		System.out.println("Defender - Attack");
		return attack;
	}
}
