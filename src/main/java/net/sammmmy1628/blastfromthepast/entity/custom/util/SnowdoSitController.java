package net.sammmmy1628.blastfromthepast.entity.custom.util;

import net.sammmmy1628.blastfromthepast.entity.custom.SnowdoEntity;

public class SnowdoSitController {

    private final SnowdoEntity entity;


    public static final int TICKS_START = 14;
    public static final int TICKS_END = 14;

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

        // Helper para convertir int -> Enum
        public static SitState byId(int id){
            for(SitState s : values()) if(s.id == id) return s;
            return NONE;
        }
    }

    // --- DATA ACCESSOR (Sincronización Cliente-Servidor) ---
    // Usaremos el ID que ya tienes en SnowdoEntity, pero lo gestionamos aquí.

    public SnowdoSitController(SnowdoEntity entity) {
        this.entity = entity;
    }

    // --- LÓGICA PRINCIPAL (Llamar en entity.tick()) ---
    public void tick() {
        if (entity.level().isClientSide) return;

        SitState currentState = getSitState();
        if (currentState == SitState.NONE) return;

        this.stateTimer++;

        // --- MÁQUINA DE ESTADOS ---

        // 1. BAJANDO (START)
        if (currentState == SitState.START) {
            this.entity.getNavigation().stop();

            if (this.stateTimer >= TICKS_START) {
                transitionTo(SitState.LOOP);
            }
        }

        // 2. SENTADO (LOOP)
        else if (currentState == SitState.LOOP) {
            this.entity.getNavigation().stop();

            // Lógica opcional (curarse, etc.)
            if (this.entity.getRandom().nextInt(100) == 0) {
                this.entity.heal(1.0f);
            }

            if (this.stateTimer >= this.sitDuration) {
                transitionTo(SitState.END);
            }
        }

        // 3. LEVANTÁNDOSE (END)
        else if (currentState == SitState.END) {
            this.entity.getNavigation().stop();

            if (this.stateTimer >= TICKS_END) {
                transitionTo(SitState.NONE);
            }
        }
    }

    // --- CONTROL PÚBLICO ---

    // Iniciar acción (llamado por el Goal)
    public void startSitting() {
        if (getSitState() == SitState.NONE) {
            // Duración fija o variable
            this.sitDuration = TICKS_LOOP_MIN;
            transitionTo(SitState.START);
        }
    }

    // Forzar interrupción (llamado si le pegan o hay pánico)
    public void stopSitting() {
        if (getSitState() != SitState.NONE) {
            // Saltamos directamente a NONE (o podríamos ir a END si quisieras ser amable)
            transitionTo(SitState.NONE);
        }
    }

    // --- HELPERS INTERNOS ---

    private void transitionTo(SitState newState) {
        // Actualizamos el dato sincronizado en la entidad
        this.entity.setSitState(newState.getId());
        this.stateTimer = 0; // Resetear timer para el nuevo estado
    }

    private SitState getSitState() {
        return SitState.byId(this.entity.getSitState());
    }

    public boolean isSitting() {
        return getSitState() != SitState.NONE;
    }
}