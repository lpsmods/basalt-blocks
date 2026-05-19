
# Legacy
execute as @a at @s run fill ~-10 ~-10 ~-10 ~10 ~10 ~10 lpsm_basaltblocks:cobbled_basalt replace lpsm_basaltblocks:basalt_cobblestone
execute as @a at @s run fill ~-10 ~-10 ~-10 ~10 ~10 ~10 lpsm_basaltblocks:cobbled_basalt_stairs replace lpsm_basaltblocks:basalt_cobblestone_stairs
execute as @a at @s run fill ~-10 ~-10 ~-10 ~10 ~10 ~10 lpsm_basaltblocks:cobbled_basalt_slab replace lpsm_basaltblocks:basalt_cobblestone_slab

execute as @a[hasitem={item=lpsm_basaltblocks:basalt_cobblestone}] run give @s lpsm_basaltblocks:cobbled_basalt
execute as @a[hasitem={item=lpsm_basaltblocks:basalt_cobblestone}] run clear @s lpsm_basaltblocks:basalt_cobblestone 0 1

execute as @a[hasitem={item=lpsm_basaltblocks:basalt_cobblestone_stairs}] run give @s lpsm_basaltblocks:cobbled_basalt_stairs
execute as @a[hasitem={item=lpsm_basaltblocks:basalt_cobblestone_stairs}] run clear @s lpsm_basaltblocks:basalt_cobblestone_stairs 0 1

execute as @a[hasitem={item=lpsm_basaltblocks:basalt_cobblestone_slab}] run give @s lpsm_basaltblocks:cobbled_basalt_slab
execute as @a[hasitem={item=lpsm_basaltblocks:basalt_cobblestone_slab}] run clear @s lpsm_basaltblocks:basalt_cobblestone_slab 0 1

# Vertical Slabs
execute as @a at @s run fill ~-10 ~-10 ~-10 ~10 ~10 ~10 lpsm_basaltblocks:cobbled_basalt_vertical_slab replace lpsm_basaltblocks:basalt_cobblestone_vertical_slab

execute as @a[hasitem={item=lpsm_basaltblocks:basalt_cobblestone_vertical_slab}] run give @s lpsm_basaltblocks:cobbled_basalt_vertical_slab
execute as @a[hasitem={item=lpsm_basaltblocks:basalt_cobblestone_vertical_slab}] run clear @s lpsm_basaltblocks:basalt_cobblestone_vertical_slab 0 1