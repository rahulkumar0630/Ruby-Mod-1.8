package com.camp.item;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
import com.example.examplemod.ExampleMod;
 
public class CustomItem extends Item {
 
public static final String name = "CustomItem";
 
    public CustomItem(){
        super();
         
 
        this.setUnlocalizedName(ExampleMod.MODID + "_" + this.name);
 
        this.setCreativeTab(CreativeTabs.tabMisc);
 
         
    }
     
}