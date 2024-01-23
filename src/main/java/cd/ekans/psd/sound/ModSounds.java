package cd.ekans.psd.sound;

import cd.ekans.psd.PSD;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PSD.MODID);

    public static final RegistryObject<SoundEvent> ALIEN_1 =
            registerSoundEvent("alien_1");
    public static final RegistryObject<SoundEvent> ALIEN_2 =
            registerSoundEvent("alien_2");
    public static final RegistryObject<SoundEvent> ALIEN_3 =
            registerSoundEvent("alien_3");
    public static final RegistryObject<SoundEvent> ALIEN_4 =
            registerSoundEvent("alien_4");
    public static final RegistryObject<SoundEvent> ALIEN_5 =
            registerSoundEvent("alien_5");
    public static final RegistryObject<SoundEvent> GROWL =
            registerSoundEvent("growl");
    public static final RegistryObject<SoundEvent> HOWL_1 =
            registerSoundEvent("howl_1");
    public static final RegistryObject<SoundEvent> HOWL_2 =
            registerSoundEvent("howl_2");
    public static final RegistryObject<SoundEvent> MONSTER_SCREAM =
            registerSoundEvent("monster_scream");
    public static final RegistryObject<SoundEvent> MUMBLE =
            registerSoundEvent("mumble");
    public static final RegistryObject<SoundEvent> SCREECH_1 =
            registerSoundEvent("screech_1");
    public static final RegistryObject<SoundEvent> SCREECH_2 =
            registerSoundEvent("screech_2");
    public static final RegistryObject<SoundEvent> STEPS =
            registerSoundEvent("steps");
    public static final RegistryObject<SoundEvent> WENDIGO_1 =
            registerSoundEvent("wendigo_1");
    public static final RegistryObject<SoundEvent> WENDIGO_2 =
            registerSoundEvent("wendigo_2");
    public static final RegistryObject<SoundEvent> WENDIGO_3 =
            registerSoundEvent("wendigo_3");
    public static final RegistryObject<SoundEvent> WENDIGO_4 =
            registerSoundEvent("wendigo_4");
    public static final RegistryObject<SoundEvent> WENDIGO_5 =
            registerSoundEvent("wendigo_5");
    public static final RegistryObject<SoundEvent> WENDIGO_6 =
            registerSoundEvent("wendigo_6");
    public static final RegistryObject<SoundEvent> WENDIGO_7 =
            registerSoundEvent("wendigo_7");
    public static final RegistryObject<SoundEvent> WENDIGO_8 =
            registerSoundEvent("wendigo_8");
    public static final RegistryObject<SoundEvent> WHISTLE =
            registerSoundEvent("whistle");
    public static final RegistryObject<SoundEvent> WOOD_1 =
            registerSoundEvent("wood_1");
    public static final RegistryObject<SoundEvent> WOOD_2 =
            registerSoundEvent("wood_2");
    public static final RegistryObject<SoundEvent> WOOD_3 =
            registerSoundEvent("wood_3");
    public static final RegistryObject<SoundEvent> WOOD_4 =
            registerSoundEvent("wood_4");
    public static final RegistryObject<SoundEvent> WOOD_5 =
            registerSoundEvent("wood_5");
    public static final RegistryObject<SoundEvent> WOOD_6 =
            registerSoundEvent("wood_6");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(PSD.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
