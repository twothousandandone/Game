package orsc;

import orsc.enumerations.ORSCharacterDirection;

public final class ORSCharacter {
	public String accountName;
	public int animationNext;
	public int attackingNpcServerIndex = 0;
	public int attackingPlayerServerIndex = 0;
	public int bubbleItem;
	public int bubbleTimeout = 0;
	public int colourBottom;
	public int colourHair;
	public int colourSkin;
	public int colourTop;
	public int combatTimeout = 0;
	public int currentX;
	public int currentZ;
	public int damageTaken = 0;
	public String displayName;
	public int[] layerAnimation = new int[12];
	public int healthCurrent = 0;
	public int healthMax = 0;
	public int incomingProjectileSprite = 0;
	public int level = -1;
	public String message;
	public int messageTimeout = 0;
	public int movingStep;
	public int npcId;
	public int projectileRange = 0;
	public int serverIndex;
	public int skullVisible = 0;
	public int stepFrame;
	public int waypointCurrent;
	public int[] waypointsX = new int[10];
	public int[] waypointsZ = new int[10];
	public String clanTag;
	public boolean isInvisible = false;
	public boolean isInvulnerable = false;
	public int icon = 0;
	public int groupID = Group.DEFAULT_GROUP;
	ORSCharacterDirection direction = ORSCharacterDirection.NORTH;

	public boolean isSuperMod() {
		return groupID == 2 || isAdmin();
	}

	public boolean isMod() {
		return groupID == 3 || isSuperMod();
	}

	public boolean isDev() {
		return groupID == 8 || isAdmin();
	}

	public boolean isEvent() { return groupID == 9 || isMod() || isDev(); }

	public boolean isOwner() {
		return groupID == 0;
	}

	public boolean isAdmin() {
		return groupID == 1 || isOwner();
	}

	public boolean isStaff() {
		return isEvent();
	}

	public String getStaffName() {
		return Group.getStaffPrefix(groupID) + displayName;
	}
}
