package de.lucsoft.netherIo;

import de.lucsoft.netherIo.setup.*;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(NetherIO.ModId)
public class NetherIO {
    public static final String ModId = "netherio";
    private static final Logger LOGGER = LogManager.getLogger();

    public NetherIO() {
        Registration.init();
    }
}
