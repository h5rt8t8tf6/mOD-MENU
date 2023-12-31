@Mod.EventBusSubscriber(modid = "examplemod", bus = Mod.EventBusSubscriber.Bus.MOD)
public class Mod {

    public static final String MOD_ID = "examplemod";

    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {
        ModMenu.onLoad(configEvent);
    }

    @SubscribeEvent
    public static void onReload(final ModConfig.Reloading configEvent) {
        ModMenu.onReload(configEvent);
    }
}