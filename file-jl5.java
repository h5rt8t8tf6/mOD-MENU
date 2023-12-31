import carpet.settings.ParsedRule;
import carpet.settings.Rule;
import carpet.settings.Validator;
import carpet.settings.SettingsManager;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.config.ModConfig;

public class ModMenu {

    @Rule(
            desc = "This is a test option for the mod menu.",
            extra = {"If you have the 'carpet' mod installed, you can change the value of this option in the 'carpet.conf' file."}
    )
    public static boolean testOption = false;

    public static void onLoad(final ModConfig.Loading configEvent) {
        testOption = getSettingsManager().getRule(ModMenu.class, "testOption").getBoolean();
    }

    public static void onReload(final ModConfig.Reloading configEvent) {
        testOption = getSettingsManager().getRule(ModMenu.class, "testOption").getBoolean();
    }

    private static SettingsManager getSettingsManager() {
        return SettingsManager.getSettingsManager();
    }
}