
public class PokemonBattle2 {
	public static void main(String args[]) {
		
		//モンスター生成
		//各MonsterをPokemonの一種とみなす
		Pokemon[] p = new Pokemon[3];	
		p[0] = new ThunderMonster("サンダー");
		p[1] = new FireMonster("ファイアー");
		p[2] = new ThunderFireMonster("ロトム");
		
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		
		//拡張for文
		//for(型　変数名 : 配列名)
		for(Pokemon ch : p) {
			ch.attack();
		}
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		
		for(Pokemon ch : p) {
			if(ch instanceof ThunderMonster) {
				ThunderMonster t = (ThunderMonster) ch;
				t.thunderAttack();
			}else if(ch instanceof FireMonster){
				FireMonster f  = (FireMonster) ch;
				f.fireAttack();
			}else if(ch instanceof ThunderFireMonster){
				ThunderFireMonster tf  = (ThunderFireMonster) ch;
				tf.thunderAttack();
				tf.fireAttack();
			}
		}
	}
}
