
public class ThunderFireMonster implements ThunderPokemon, FirePokemon {

	private String name;
	
	ThunderFireMonster(String name){
		this.name = name;
		System.out.println("雷炎属性モンスター、" + this.name + "が誕生した！");
	}
	
	public void attack() {
		System.out.println(this.name + "の攻撃！");
	}
	
	public void defence() {
		System.out.println(this.name + "は防御している");
	}
	
	public void thunderAttack() {
		System.out.println(this.name + "の雷攻撃！");
	}

	public void fireAttack() {
		System.out.println(this.name + "の炎攻撃！");
	}

}
