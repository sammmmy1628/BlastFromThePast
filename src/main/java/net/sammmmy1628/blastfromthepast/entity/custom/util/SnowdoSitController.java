package net.sammmmy1628.blastfromthepast.entity.custom.util;

import net.sammmmy1628.blastfromthepast.entity.custom.SnowdoEntity;

public class SnowdoSitController {

    private final SnowdoEntity entity;


    public static final int TICKS_START = 15;
    public static final int TICKS_END = 15;

    public static final int TICKS_LOOP_MIN = 120;

    private int stateTimer = 0;
    private int sitDuration = 0;

    public enum SitState {
        NONE(0),
        START(1), // Bajando
        LOOP(2),  // Sentado
        END(3);   // Levantándose

        public final int id;
        SitState(int id){ this.id = id; }
        public int getId() { return id; }

        public static SitState byId(int id){
            for(SitState s : values()) if(s.id == id) return s;
            return NONE;
        }
    }

    public SnowdoSitController(SnowdoEntity entity) {
        this.entity = entity;
    }

    public void tick() {
        if (entity.level().isClientSide) return;

        SitState currentState = getSitState();
        if (currentState == SitState.NONE) return;

        this.stateTimer++;


        if (currentState == SitState.START) {
            this.entity.getNavigation().stop();

            if (this.stateTimer >= TICKS_START) {
                transitionTo(SitState.LOOP);
            }
        }

        else if (currentState == SitState.LOOP) {
            this.entity.getNavigation().stop();

            if (this.entity.getRandom().nextInt(100) == 0) {
                this.entity.heal(1.0f);
            }

            if (this.stateTimer >= this.sitDuration) {
                transitionTo(SitState.END);
            }
        }

        else if (currentState == SitState.END) {
            this.entity.getNavigation().stop();

            if (this.stateTimer >= TICKS_END) {
                transitionTo(SitState.NONE);
            }
        }
    }


    public void startSitting() {
        if (getSitState() == SitState.NONE) {
            // Duración fija o variable
            this.sitDuration = TICKS_LOOP_MIN;
            transitionTo(SitState.START);
        }
    }

    public void stopSitting() {
        if (getSitState() != SitState.NONE) {
            transitionTo(SitState.NONE);
        }
    }

    private void transitionTo(SitState newState) {
        this.entity.setSitState(newState.getId());
        this.stateTimer = 0;
    }

    private SitState getSitState() {
        return SitState.byId(this.entity.getSitState());
    }

    public boolean isSitting() {
        return getSitState() != SitState.NONE;
    }
}