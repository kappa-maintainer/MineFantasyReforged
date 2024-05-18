package minefantasy.mfr.core;

import zone.rong.mixinbooter.IEarlyMixinLoader;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class MixinLoader implements IEarlyMixinLoader, IFMLLoadingPlugin {
	@Override
	public List<String> getMixinConfigs() {
		ArrayList<String> ret = new ArrayList<>();
		ret.add("mixins.minefantasyreforged.json");
		return ret;
	}

	@Override
	String[] getASMTransformerClass(){
		return null;
	}

	@Override
	String getModContainerClass() {
		return null;
	}

	@Override
	String getSetupClass() {
		return null;
	}

	@Override
	void injectData(Map<String, Object> var1) {}

	@Override
	String getAccessTransformerClass() {
		return null;
	}

}
