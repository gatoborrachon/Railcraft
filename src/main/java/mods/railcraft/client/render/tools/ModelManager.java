/*******************************************************************************
 * Copyright (c) CovertJaguar, 2011-2016
 * http://railcraft.info
 *
 * This code is the property of CovertJaguar
 * and may only be used with explicit written
 * permission unless otherwise specified on the
 * license page at http://railcraft.info/wiki/info:license.
 ******************************************************************************/

package mods.railcraft.client.render.tools;

import mods.railcraft.common.util.misc.Game;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import org.apache.logging.log4j.Level;

/**
 * Created by CovertJaguar on 7/18/2016 for Railcraft.
 *
 * @author CovertJaguar <http://www.railcraft.info>
 */
public class ModelManager {
    public static void registerItemModel(ItemModelMesher mesher, Item item, int meta) {
        ModelResourceLocation location = new ModelResourceLocation(item.getRegistryName(), "inventory");
        registerItemModel(mesher, item, meta, location);
    }

    public static void registerItemModel(ItemModelMesher mesher, Item item, int meta, ModelResourceLocation location) {
        if (Game.IS_DEBUG)
            Game.log(Level.INFO, "Registering item model: {0} meta:{1} location:{2}", item.getRegistryName(), meta, location);
        mesher.register(item, meta, location);
    }
}
