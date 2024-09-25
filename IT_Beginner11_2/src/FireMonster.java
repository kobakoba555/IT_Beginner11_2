
public class FireMonster implements FirePokemon {

	private String name;
	
	FireMonster(String name){
		this.name = name;
		System.out.println("炎属性モンスター、" + this.name + "が誕生した！");
	}
	
	public void attack() {
		System.out.println(this.name + "の攻撃！");
	}
	
	public void defence() {
		System.out.println(this.name + "は防御している");
	}
	
	public void fireAttack() {
		System.out.println(this.name + "の炎攻撃！");
	}
		
}
