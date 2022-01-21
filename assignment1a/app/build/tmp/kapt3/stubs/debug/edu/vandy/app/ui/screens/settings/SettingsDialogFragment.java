package edu.vandy.app.ui.screens.settings;

import java.lang.System;

/**
 * Application developer options fragment that shows a list of tunable
 * options in a modal bottom sheet.
 *
 * To show this bottom sheet:
 * <pre>
 * SettingsDialogFragment.newInstance().show(getSupportFragmentManager(), "dialog");
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u0012\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\u0012\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\bH\u0002J\u0012\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\bH\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\u0012H\u0002J\b\u0010$\u001a\u00020\u0012H\u0002J\b\u0010%\u001a\u00020\u0012H\u0002J\b\u0010&\u001a\u00020\u0012H\u0002J\b\u0010\'\u001a\u00020\u0012H\u0002J\b\u0010(\u001a\u00020\u0012H\u0002J\b\u0010)\u001a\u00020\u0012H\u0002J\b\u0010*\u001a\u00020\u0012H\u0002J\b\u0010+\u001a\u00020\u0012H\u0002J\b\u0010,\u001a\u00020\u0012H\u0002J\b\u0010-\u001a\u00020\u0012H\u0002J\b\u0010.\u001a\u00020\u0012H\u0002J&\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020\u0012H\u0016J\b\u00108\u001a\u00020\u0012H\u0002J\u001c\u00109\u001a\u00020\u00122\b\u0010:\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u001a\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u0002002\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u000e\u0010\r\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\bJ\u0016\u0010A\u001a\u00020\u00122\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00120CH\u0002J\b\u0010D\u001a\u00020\u0012H\u0002J\u0010\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020GH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Ledu/vandy/app/ui/screens/settings/SettingsDialogFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "Ledu/vandy/app/utils/KtLogger;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "ignoreGazingEvent", "", "getIgnoreGazingEvent", "()Z", "setIgnoreGazingEvent", "(Z)V", "simulationRunning", "threadCountTunable", "getThreadCountTunable", "userAction", "configureAnimationSpeed", "", "configureAutoScale", "update", "configureBeingCount", "configureBeingManagerType", "configureBeingSize", "configureGazingDuration", "configureIterations", "configureLogging", "configureModelChecker", "configurePalantirCount", "configurePalantirSize", "configurePalantiriManagerType", "configurePerformanceMode", "configureResetToDefaults", "unused", "configureSaveOnExit", "configureShowPaths", "configureShowProgress", "configureShowSprites", "configureShowStates", "configureSpriteSpinner", "configureStateSize", "configureStrictMode", "configureThreadCount", "configureViewTransparency", "configureWidgets", "configureWireFrames", "onBeingManagerChanged", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onPalantiriManagerChanged", "onSharedPreferenceChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "key", "", "onViewCreated", "view", "running", "updatePreference", "block", "Lkotlin/Function0;", "updateThreadCount", "updateThreadCountRange", "max", "", "app_debug"})
public final class SettingsDialogFragment extends androidx.fragment.app.Fragment implements android.content.SharedPreferences.OnSharedPreferenceChangeListener, edu.vandy.app.utils.KtLogger {
    
    /**
     * Temporary flag set when a user action triggers one of the
     * widget Observables. When this happens, the shared preference
     * listener will ignore any notification received and reset the
     * flag to false.
     */
    private boolean userAction = false;
    
    /**
     * Observables should always be disposed. In particular, they
     * need to be disposed when the user clicks the reset button
     * which reconfigures all widgets.
     */
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    
    /**
     * Flag indicating if a simulation is running. Used to
     * prevent reset of critical model parameters while a
     * simulation is running.
     */
    private boolean simulationRunning = false;
    private boolean ignoreGazingEvent = false;
    private java.util.HashMap _$_findViewCache;
    
    public SettingsDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * Configure all widgets and install a shared preference listener.
     */
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Configures all widgets and install Rx Widget Observers.
     */
    private final void configureWidgets() {
    }
    
    /**
     * Called to disable model parameter settings when
     * the simulation is running and to re-enable them
     * once the simulation completes.
     */
    public final void simulationRunning(boolean running) {
    }
    
    private final boolean getThreadCountTunable() {
        return false;
    }
    
    private final void updateThreadCountRange(int max) {
    }
    
    private final void updateThreadCount() {
    }
    
    private final void onBeingManagerChanged() {
    }
    
    private final void onPalantiriManagerChanged() {
    }
    
    /**
     * Dispose of all Rx Observers and stop
     * listening for shared preference changes.
     */
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    /**
     * Keeps settings panel up to date if any shared preferences are changed
     * else where in the app or when the reset button is clicked. Note that
     * for efficiency reasons, we don't want to reconfigure an preference
     * widget if the preference changed was itself caused by user input in
     * this Settings panel.
     *
     * NOTE: This method no longer uses the userAction flag set by
     * updatePreference function to prevent the edge case issue
     * described in the following WARNING note.
     *
     * WARNING: There's and edge case where the app may internally update a
     * shared preference while userAction is true which will cause this
     * function to inadvertently process the internal notification in the
     * userAction block - this can cause unexpected results and should be
     * fixed. The reason for this is when the updatePreference sets the
     * shared preference, the onSharedPreference handler of another class
     * may be called and from that call, may set a shared preference before
     * returning from it's onSharedPreference handler. The framework will
     * then call this function for the apps shared preference change before
     * it calls this function for resulting from the local updatePreference
     * call.
     */
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    private final void configureBeingManagerType(boolean update) {
    }
    
    private final void configurePalantiriManagerType() {
    }
    
    private final void configurePalantirCount() {
    }
    
    private final void configureBeingCount() {
    }
    
    private final void configureThreadCount() {
    }
    
    private final void configureIterations() {
    }
    
    private final void configureAnimationSpeed() {
    }
    
    private final void configureShowPaths() {
    }
    
    private final void configureShowStates() {
    }
    
    private final void configureShowProgress() {
    }
    
    private final void configureLogging() {
    }
    
    private final void configureModelChecker() {
    }
    
    private final void configureStrictMode() {
    }
    
    private final void configureSpriteSpinner() {
    }
    
    private final void configureWireFrames() {
    }
    
    private final void configureShowSprites() {
    }
    
    public final boolean getIgnoreGazingEvent() {
        return false;
    }
    
    public final void setIgnoreGazingEvent(boolean p0) {
    }
    
    private final void configureGazingDuration() {
    }
    
    private final void configurePerformanceMode(boolean update) {
    }
    
    private final void configureAutoScale(boolean update) {
    }
    
    private final void configureViewTransparency() {
    }
    
    private final void configureBeingSize() {
    }
    
    private final void configurePalantirSize() {
    }
    
    private final void configureStateSize() {
    }
    
    private final void configureSaveOnExit() {
    }
    
    /**
     * Resets all Settings shared preferences to their default
     * values. This is tricky because the simplest code to handle
     * this is to call each widgets configure method. This requires
     * uninstalling all RxObservers which are then reinstalled
     * in each configuration function. The problem is that if a
     * shared preference hasn't changed, then the SharedPreference
     * manager will not send a shared preference change event.
     * Therefore, we can't rely on the installed shared preference
     * listener as the main mechanism to handle calling all the
     * configuration functions. Instead, the configureWidgets
     * function is called via the updatePreference wrapper function
     * which ensures that no shared preference processing is called
     * while the configuration is running.
     */
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    private final void configureResetToDefaults(boolean unused) {
    }
    
    /**
     * NOTE: This method is still used but the userAction property
     * is no longer used in onSharedPreferenceChanged because of the
     * edge case issues described by the WARNING note.
     *
     * All Observables call this method to do the preference update
     * so that the userAction flag can be set first which prevents
     * this class's shared preference listener from reacting to the
     * preference change event. The flag is reset to false after
     * the update so that the listener is no longer disabled.
     *
     * WARNING: There's and edge case where the app may update a
     * shared preference while this function has set userAction
     * to true, and therefore this class's onSharedPreference
     * handler will inadvertently process the notification in the
     * userAction block - this can cause unexpected results and
     * should be fixed.
     */
    private final void updatePreference(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLoggerTag() {
        return null;
    }
}