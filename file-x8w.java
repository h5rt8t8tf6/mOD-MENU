import net.minecraftforge.common.ForgeConfigSpec;

public class Config {

    public static final ForgeConfigSpec CONFIG_SPEC;
    public static final Config CONFIG;

    static {
        final Pair<Config, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Config::new);
        CONFIG_SPEC = specPair.getRight();
        CONFIG = specPair.getLeft();
    }

    @Config.Name("test_option")
    @Config.Comment("This is a test option for the mod menu.")
    public boolean testOption = false;

    public static boolean getTestOption() {
        return CONFIG.testOption;
    }
}