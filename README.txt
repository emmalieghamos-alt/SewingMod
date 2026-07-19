
Source installation information for modders
-------------------------------------------
This code follows the Minecraft Forge installation methodology. It will apply
some small patches to the vanilla MCP source code, giving you and it access 
to some of the data and functions you need to build a successful mod.

Note also that the patches are built against "un-renamed" MCP source code (aka
SRG Names) - this means that you will not be able to read them directly against
normal code.

Setup Process:
==============================

Step 1: Open your command-line and browse to the folder where you extracted the zip file.

Step 2: You're left with a choice.
If you prefer to use Eclipse:
1. Run the following command: `./gradlew genEclipseRuns`
2. Open Eclipse, Import > Existing Gradle Project > Select Folder 
   or run `gradlew eclipse` to generate the project.

If you prefer to use IntelliJ:
1. Open IDEA, and import project.
2. Select your build.gradle file and have it import.
3. Run the following command: `./gradlew genIntellijRuns`
4. Refresh the Gradle Project in IDEA if required.

If at any point you are missing libraries in your IDE, or you've run into problems you can 
run `gradlew --refresh-dependencies` to refresh the local cache. `gradlew clean` to reset everything 
(this does not affect your code) and then start the process again.

Mapping Names:
=============================
By default, the MDK is configured to use the official mapping names from Mojang for methods and fields 
in the Minecraft codebase. These names are covered by a specific license. All modders should be aware of this
license, if you do not agree with it you can change your mapping names to other crowdsourced names in your 
build.gradle. For the latest license text, refer to the mapping file itself, or the reference copy here:
https://github.com/MinecraftForge/MCPConfig/blob/master/Mojang.md

Additional Resources: 
=========================
Community Documentation: https://docs.minecraftforge.net/en/1.20.1/gettingstarted/
LexManos' Install Video: https://youtu.be/8VEdtQLuLO0
Forge Forums: https://forums.minecraftforge.net/
Forge Discord: https://discord.minecraftforge.net/



How to use!:
## 🧵 How to Use the Sewing Machine

### Obtaining the Sewing Machine
To get the Sewing Machine block in Creative mode, open the chat console and run the following command:
```text
/give @s sewingmod:sewing_machine
✂️ Recipes (Smithing / Sewing Interface)The Sewing Machine utilizes a specialized 3-slot layout (Template, Base, and Material addition) 
to stitch and repair leather garments.1. Tailoring Leather ClothesTo craft a brand new set of leather clothing, insert String as your 
structural template, Leather as the base material, and an additional piece of String to stitch it together.
Slot 1 (Template)Slot 2 (Base Material)Slot 3 (Stitch Material)Result🧶 String🐂 Leather🧶 String🧥 Leather Tunic2. 

Mending Damaged ClothesTo repair worn-out leather armor, place the damaged garment into the sewing station and use extra string to patch up its durability.
Slot 1 (Template)Slot 2 (Base Material)Slot 3 (Repair Material)Result🧶 String🧥 Damaged Leather Tunic🧶 String✨ Repaired Leather Tunic


/give @s sewingmod:sewing_machine

/give @s netherite_upgrade_smithing_template

/give @s leather

/give @s string