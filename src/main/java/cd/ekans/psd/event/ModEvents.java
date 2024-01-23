package cd.ekans.psd.event;

import cd.ekans.psd.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static cd.ekans.psd.sound.ModSounds.*;

public class ModEvents {

    @SubscribeEvent
    public static void playSounds(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        Level level = player.getLevel();
        Random rand = new Random();
        List<Player> allPlayers = new ArrayList<>(level.players());
        Player randPlayer = allPlayers.get(rand.nextInt(allPlayers.size()));
        BlockPos randomBlockPos = randPlayer.getOnPos().above(2);
        List<SoundEvent> allModSounds = new ArrayList<>();
        allModSounds.add(ALIEN_1.get());
        allModSounds.add(ALIEN_2.get());
        allModSounds.add(ALIEN_3.get());
        allModSounds.add(ALIEN_4.get());
        allModSounds.add(ALIEN_5.get());
        allModSounds.add(GROWL.get());
        allModSounds.add(HOWL_1.get());
        allModSounds.add(HOWL_2.get());
        allModSounds.add(MONSTER_SCREAM.get());
        allModSounds.add(MUMBLE.get());
        allModSounds.add(SCREECH_1.get());
        allModSounds.add(SCREECH_2.get());
        allModSounds.add(STEPS.get());
        allModSounds.add(WENDIGO_1.get());
        allModSounds.add(WENDIGO_2.get());
        allModSounds.add(WENDIGO_3.get());
        allModSounds.add(WENDIGO_4.get());
        allModSounds.add(WENDIGO_5.get());
        allModSounds.add(WENDIGO_6.get());
        allModSounds.add(WENDIGO_7.get());
        allModSounds.add(WENDIGO_8.get());
        allModSounds.add(WHISTLE.get());
        allModSounds.add(WOOD_1.get());
        allModSounds.add(WOOD_2.get());
        allModSounds.add(WOOD_3.get());
        allModSounds.add(WOOD_4.get());
        allModSounds.add(WOOD_5.get());
        allModSounds.add(WOOD_6.get());
        SoundEvent sound = allModSounds.get(rand.nextInt(1, allModSounds.size()));
        int value = rand.nextInt(1,100);
        if (value == 1) {
            level.playSound((Player) null, randomBlockPos, sound, SoundSource.AMBIENT, 1f, 1f);
        }
    }
}
