/*
 * This file is part of Biome Staff Mod. Copyright (c) 2018, p455w0rd
 * (aka TheRealp455w0rd), All rights reserved unless otherwise stated.
 *
 * Biome Staff Mod is free software: you can redistribute it and/or
 * modify it under the terms of the MIT License.
 *
 * Biome Staff Mod is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the MIT
 * License for more details.
 *
 * You should have received a copy of the MIT License along with Biome
 * Staff Mod Crafting Terminal. If not, see
 * <https://opensource.org/licenses/MIT>.
 */
package p455w0rd.biomestaff.init;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.item.Item;
import p455w0rd.biomestaff.item.ItemBiomeStaff;
import p455w0rd.biomestaff.item.ItemObsidianShaft;
import p455w0rd.biomestaff.item.ItemTopPlate;

/**
 * @author p455w0rd
 *
 */
public class ModItems {

	public static final List<Item> ITEM_LIST = new ArrayList<>();

	public static final ItemBiomeStaff BIOME_STAFF = new ItemBiomeStaff();
	public static final ItemObsidianShaft OBSIDIAN_SHAFT = new ItemObsidianShaft();
	public static final ItemTopPlate TOP_PLATE = new ItemTopPlate();

	static {

		ITEM_LIST.addAll(Lists.newArrayList(BIOME_STAFF, OBSIDIAN_SHAFT, TOP_PLATE));

	}

}
