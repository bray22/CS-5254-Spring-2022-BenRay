package edu.vandy.simulator.managers.beings.runnableThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import edu.vandy.simulator.managers.beings.BeingManager;
import edu.vandy.simulator.managers.palantiri.PalantiriManager;
import edu.vandy.simulator.managers.palantiri.arrayBlockingQueuePalantiriManager.ArrayBlockingQueueMgr;
import edu.vandy.simulator.model.implementation.snapshots.PalantirSnapshot;
import edu.vandy.simulator.utils.ExceptionUtils;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * This BeingManager implementation manually creates a pool of Java
 * threads that run the being simulations.
 */
public class RunnableThreadsMgr
        extends BeingManager<SimpleBeingRunnable> {
    /**
     * Used for Android debugging.
     */
    private final static String TAG =
            RunnableThreadsMgr.class.getName();

    /**
     * The list of beings (implemented as concurrent Java threads)
     * that are attempting to acquire palantiri for gazing.
     */
    public List<Thread> mBeingThreads;

    /**
     * A factory method that returns a new SimpleBeingRunnable instance.
     *
     * @return A new SimpleBeingRunnable instance
     */
    @Override
    public SimpleBeingRunnable newBeing() {
        // Return a new SimpleBeingRunnable instance.
        // TODO -- you fill in here replacing this statement with your solution.
        SimpleBeingRunnable simpleBeingRunnable = new SimpleBeingRunnable(this );
        return simpleBeingRunnable;
    }

    /**
     * This entry point method is called by the Simulator framework to
     * start the being gazing simulation.
     */
    @Override
    public void runSimulation() {
        // Call a method to create and start a thread for each being.

        // TODO -- you fill in here.
        beginBeingThreads();

        // Call a method that creates and starts a thread that's then
        //  used to wait for all the being threads to finish and
        //  return that thread to the caller.

        // TODO -- you fill in here.
        Thread waiterThread = createAndStartWaiterForBeingThreads();
        

        // Block until the waiter thread has finished.
        // TODO -- you fill in here.
        try {
            waiterThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    /**
     * Manually create/start a list of threads that represent the
     * beings in .this simulation.
     */
    void beginBeingThreads() {
        // All STUDENTS:
        // Call the BeingManager.getBeings() method to iterate through
        // the beings, create a new Thread object for each one, and
        // add it to the list of mBeingThreads.
        //

        mBeingThreads = new ArrayList(getBeingCount());
        getBeings()
            .forEach(being -> {
                   Thread thread = new Thread(new SimpleBeingRunnable(this));
                   being.run();
            });

        // GRADUATE STUDENTS:
        // Set an "UncaughtExceptionHandler" for each being thread
        // that calls the BeingManager.error() method to indicate an
        // unexpected exception "ex" occurred for thread "thr".
        // Undergraduates do not need to set this exception handler
        // (though they are free to do so if they choose).
        //
        // TODO -- you fill in here.

        

        // Start all the threads in the List of Threads.
        // TODO -- you fill in here.
        if (mBeingThreads != null) {
            for (Thread thread : mBeingThreads) {
                try { thread.run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * Create and start a thread that can be used to wait for all the
     * being threads to finish and return that thread to the caller.
     *
     * @return Thread that is waiting for all the beings to complete.
     */
    public Thread createAndStartWaiterForBeingThreads() {
        // Create a Java thread that waits for all being threads to
        // finish gazing.  If an interruption or exception occurs
        // while waiting for the threads to finish, call the
        // BeingManager.error() helper method with the exception in
        // the catch clause, which trigger the simulator to generate a
        // shutdownNow() request.
        // TODO -- you fill in here.

        RunnableThreadsMgr beingManager = new RunnableThreadsMgr();

        Thread waiterThread = new Thread(() -> {
            beingManager.mBeingThreads =
                    IntStream.rangeClosed(1, beingManager.getBeingCount())
                            .mapToObj(unused -> new Thread())
                            .peek(thread -> {
                                try {
                                  thread.join();
                                } catch (Exception e) {
                                    beingManager.error(e);
                                }
                            })
                            .collect(Collectors.toList());
        });






        // Start running the thread.
        // TODO -- you fill in here.
        waiterThread.start();
        

        // Return the thread.
        // TODO -- you fill in here replacing this statement with your solution.
        return waiterThread;
    }

    /**
     * Called to run to error the simulation and should only return
     * after all threads have been terminated and all resources
     * cleaned up.
     */
    @Override
    public void shutdownNow() {
        // No special handling required for this manager since the all
        // beings will have already been asked to stop by the base
        // class before calling this method.
    }
}

