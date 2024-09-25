
public class PokemonBattle {

	public static void main(String args[]) {
		
		//雷属性のモンスター生成
		ThunderMonster t = new ThunderMonster("サンダー");
		
		//炎属性のモンスター生成
		FireMonster f  = new FireMonster("ファイアー");
		
		//雷炎属性のモンスター生成
		ThunderFireMonster tf = new ThunderFireMonster("ロトム");
		
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		
		//雷属性のモンスターの雷攻撃
		t.thunderAttack();
		
		//炎属性のモンスターの炎攻撃
		f.fireAttack();
		
		//雷炎属性のモンスターの雷攻撃
		tf.thunderAttack();
	
		//雷炎属性のモンスターの炎攻撃
		tf.fireAttack();

	}
}
