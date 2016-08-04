package mods.itemsample;
 
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
 
@Mod(modid=SampleItemCore.MOD_ID, name="IntelBasicCPU", version="1.0")
public class IntelBasicCPU
{
        public static final String MOD_ID = "IntelBasicCPU";
	public static Item IntelBasicCPU;
 
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//アイテムのインスタンス生成
		IntelBasicCPU = new Item()
		.setCreativeTab(CreativeTabs.tabMaterials)/*クリエイティブのタブ*/
		.setUnlocalizedName("IntelBasicCPU")/*システム名の登録*/
		.setTextureName("samplemod:sample_item")/*テクスチャの指定*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		/*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
		/*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
		.setMaxStackSize(64);/*スタックできる量。デフォルト64*/
		//アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerItem(IntelBasicCPU, "IntelBasicCPU");
	}
}
