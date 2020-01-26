package AgentIj.SCP.TNG.util;

// 12/27/19 Agent Ij


import java.util.Random;

public class Reference {

    public static final String ID="scptng", NAME="SCP: The Next Generation", VERSION="0.0.1A", CLIENT="AgentIj.SCP.TNG.proxy.ClientProxy", SERVER="AgentIj.SCP.TNG.proxy.CommonProxy";
    public static final float CREEPEREXPLOSIONMAXSTRENGTH = 3.9f, TNTMAXSTRENGTH =5.2f, BLOCKCREEPERESISTANCE=CREEPEREXPLOSIONMAXSTRENGTH*5/3/0.3f-0.3f,
            BLOCKTNTRESISTANCE=TNTMAXSTRENGTH*5/3/0.3f-0.3f;


    public static final int EntityTheStatue = 8759;

    static final public Random randomGenerator = new Random();



    public static final double PLAYER_SPRINT_SPEED=0.43;
    public static final double PLAYER_WALK_SPEED=0.32;


    public static final double SMALL_ZOMBIE_SPEED = 0.29;
    public static final double GHAST_DETECTION_RANGE = 100;
}
