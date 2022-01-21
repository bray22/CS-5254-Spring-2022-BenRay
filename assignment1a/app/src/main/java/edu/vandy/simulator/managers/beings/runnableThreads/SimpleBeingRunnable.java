package edu.vandy.simulator.managers.beings.runnableThreads;

import androidx.annotation.NonNull;

import java.util.Objects;
import java.util.concurrent.CancellationException;

import edu.vandy.simulator.managers.beings.Being;
import edu.vandy.simulator.managers.beings.BeingManager;
import edu.vandy.simulator.managers.palantiri.Palantir;
import edu.vandy.simulator.managers.palantiri.PalantiriManager;
import edu.vandy.simulator.managers.palantiri.arrayBlockingQueuePalantiriManager.ArrayBlockingQueueMgr;
import edu.vandy.simulator.model.implementation.components.PalantirComponent;

/**
 * This class implements the gazing logic for a being that's
 * implemented via a Java thread.
 */
public class SimpleBeingRunnable
        extends Being
        implements Runnable {
    /**
     * Constructor initializes the field.
     *
     * @param manager The controlling BeingManager instance.
     */
    SimpleBeingRunnable(BeingManager<SimpleBeingRunnable> manager) {
        // Call super constructor passing the manager.
        super(manager);
    }

    /**
     * Run the loop that performs the being gazing logic for the
     * designated number of iterations.
     */
    @Override
    public void run() {
        // This template method gazes at a palantir the designated
        // number of times.
        runGazingSimulation(getGazingIterations());
    }

    /**
     * This hook method performs a single gazing operation.
     */
    @Override
    protected void acquirePalantirAndGaze() {
        // Get a palantir from the PalantiriManager by calling the
        // appropriate Being super class helper method - this call
        // will block if there are no available palantiri (if a
        // concurrency error occurs in the assignment implementation,
        // null is returned and this being should immediately call
        // Being.error(), which throws an IllegalStateException)..

        //acquirePalantirAndGaze();
        Palantir palantir = acquirePalantir();

        if (palantir != null) {
            try {
                palantir.gaze(this);
            } finally {
                if (palantir == null) {
                    error("palantir not available");
                } else {
                    releasePalantir(palantir);
                }
            }
        } else {
            error("palantir not available");
        }





        // Then gaze at the palantir for this being (which blocks for
        // a random period of time).  Finally, release the palantir
        // for this being via a call to the appropriate Being super
        // class helper method.


       // lateinit var palantir: Palantir

        //var being = SimpleBeingRunnable(beingManager)
        // TODO -- you fill in here.
        
    }
}
