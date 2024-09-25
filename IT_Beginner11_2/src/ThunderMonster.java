
public class ThunderMonster implements ThunderPokemon {

	private String name;
	
	ThunderMonster(String name){
		this.name = name;
		System.out.println("雷属性モンスター、" + this.name + "が誕生した！");
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
	
}
