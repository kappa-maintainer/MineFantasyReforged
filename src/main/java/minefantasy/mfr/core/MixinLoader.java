package minefantasy.mfr.core;

import zone.rong.mixinbooter.IEarlyMixinLoader;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class MixinLoader implements IEarlyMixinLoader, IFMLLoadingPlugin {
	@Override
	public List<String> getMixinConfigs() {
		ArrayList<String> ret = new ArrayList<>();
		ret.add("mixins.minefantasyreforged.json");
		return ret;
	}

	@Override
	public boolean shouldMixinConfigQueue(String mixinConfig) {
		return mixinConfig.equals("mixins.minefantasyreforged.json");
	}

	@Override
	public String[] getASMTransformerClass() {
		return new String[0];
	}

	@Override
	public String getModContainerClass() {
		return null;
	}

	@Override
	public String getSetupClass() {
		return null;
	}

	@Override
	public void injectData(Map<String, Object> map) {

	}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}
}
