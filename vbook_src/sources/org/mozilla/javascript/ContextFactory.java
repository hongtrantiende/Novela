package org.mozilla.javascript;

import java.security.AccessController;
import java.security.PrivilegedAction;
import org.mozilla.javascript.xml.XMLLib;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class ContextFactory {
    private static ContextFactory global = new ContextFactory();
    private static volatile boolean hasCustomGlobal;
    private ClassLoader applicationClassLoader;
    private boolean disabledListening;
    private volatile Object listeners;
    private final Object listenersLock = new Object();
    private volatile boolean sealed;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public interface GlobalSetter {
        ContextFactory getContextFactoryGlobal();

        void setContextFactoryGlobal(ContextFactory contextFactory);
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public interface Listener {
        void contextCreated(Context context);

        void contextReleased(Context context);
    }

    public static ContextFactory getGlobal() {
        return global;
    }

    public static synchronized GlobalSetter getGlobalSetter() {
        GlobalSetter globalSetter;
        synchronized (ContextFactory.class) {
            if (!hasCustomGlobal) {
                hasCustomGlobal = true;
                globalSetter = new GlobalSetter() { // from class: org.mozilla.javascript.ContextFactory.1GlobalSetterImpl
                    @Override // org.mozilla.javascript.ContextFactory.GlobalSetter
                    public ContextFactory getContextFactoryGlobal() {
                        return ContextFactory.global;
                    }

                    @Override // org.mozilla.javascript.ContextFactory.GlobalSetter
                    public void setContextFactoryGlobal(ContextFactory contextFactory) {
                        if (contextFactory == null) {
                            contextFactory = new ContextFactory();
                        }
                        ContextFactory.global = contextFactory;
                    }
                };
            } else {
                throw new IllegalStateException();
            }
        }
        return globalSetter;
    }

    public static boolean hasExplicitGlobal() {
        return hasCustomGlobal;
    }

    public static synchronized void initGlobal(ContextFactory contextFactory) {
        synchronized (ContextFactory.class) {
            if (contextFactory != null) {
                if (!hasCustomGlobal) {
                    hasCustomGlobal = true;
                    global = contextFactory;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    private static boolean isDom3Present() {
        Class<?> classOrNull = Kit.classOrNull("org.w3c.dom.Node");
        if (classOrNull == null) {
            return false;
        }
        try {
            classOrNull.getMethod("getUserData", String.class);
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }

    public final void addListener(Listener listener) {
        checkNotSealed();
        synchronized (this.listenersLock) {
            try {
                if (!this.disabledListening) {
                    this.listeners = Kit.addListener(this.listeners, listener);
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <T> T call(ContextAction<T> contextAction) {
        return (T) Context.call(this, contextAction);
    }

    public final void checkNotSealed() {
        if (!this.sealed) {
            return;
        }
        vm1.d();
    }

    public GeneratedClassLoader createClassLoader(final ClassLoader classLoader) {
        return (GeneratedClassLoader) AccessController.doPrivileged(new PrivilegedAction<DefiningClassLoader>() { // from class: org.mozilla.javascript.ContextFactory.1
            @Override // java.security.PrivilegedAction
            public DefiningClassLoader run() {
                return new DefiningClassLoader(classLoader);
            }
        });
    }

    public final void disableContextListening() {
        checkNotSealed();
        synchronized (this.listenersLock) {
            this.disabledListening = true;
            this.listeners = null;
        }
    }

    public Object doTopCall(Callable callable, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object call = callable.call(context, scriptable, scriptable2, objArr);
        if (call instanceof ConsString) {
            return call.toString();
        }
        return call;
    }

    @Deprecated
    public final Context enter() {
        return enterContext(null);
    }

    public Context enterContext() {
        return enterContext(null);
    }

    @Deprecated
    public final void exit() {
        Context.exit();
    }

    public final ClassLoader getApplicationClassLoader() {
        return this.applicationClassLoader;
    }

    public XMLLib.Factory getE4xImplementationFactory() {
        if (isDom3Present()) {
            return XMLLib.Factory.create("org.mozilla.javascript.xmlimpl.XMLLibImpl");
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean hasFeature(Context context, int i) {
        switch (i) {
            case 1:
                int languageVersion = context.getLanguageVersion();
                if (languageVersion == 100 || languageVersion == 110 || languageVersion == 120) {
                    return true;
                }
                return false;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
                if (context.getLanguageVersion() == 120) {
                    return true;
                }
                return false;
            case 5:
                break;
            case 6:
                int languageVersion2 = context.getLanguageVersion();
                if (languageVersion2 != 0 && languageVersion2 < 160) {
                    return false;
                }
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return false;
            case 14:
                return true;
            case 15:
                if (context.getLanguageVersion() <= 170) {
                    return true;
                }
                return false;
            case 16:
                if (context.getLanguageVersion() >= 200) {
                    return true;
                }
                return false;
            case 17:
            case 18:
            case 19:
                return false;
            case 20:
                return true;
            case 21:
            case 22:
                return false;
            default:
                vs.m(String.valueOf(i));
                return false;
        }
        return true;
    }

    public final void initApplicationClassLoader(ClassLoader classLoader) {
        if (classLoader != null) {
            if (Kit.testIfCanLoadRhinoClasses(classLoader)) {
                if (this.applicationClassLoader == null) {
                    checkNotSealed();
                    this.applicationClassLoader = classLoader;
                    return;
                }
                vs.k("applicationClassLoader can only be set once");
                return;
            }
            vs.m("Loader can not resolve Rhino classes");
            return;
        }
        vs.m("loader is null");
    }

    public final boolean isSealed() {
        return this.sealed;
    }

    public Context makeContext() {
        return new Context(this);
    }

    public void onContextCreated(Context context) {
        Object obj = this.listeners;
        int i = 0;
        while (true) {
            Listener listener = (Listener) Kit.getListener(obj, i);
            if (listener == null) {
                return;
            }
            listener.contextCreated(context);
            i++;
        }
    }

    public void onContextReleased(Context context) {
        Object obj = this.listeners;
        int i = 0;
        while (true) {
            Listener listener = (Listener) Kit.getListener(obj, i);
            if (listener == null) {
                return;
            }
            listener.contextReleased(context);
            i++;
        }
    }

    public final void removeListener(Listener listener) {
        checkNotSealed();
        synchronized (this.listenersLock) {
            try {
                if (!this.disabledListening) {
                    this.listeners = Kit.removeListener(this.listeners, listener);
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void seal() {
        checkNotSealed();
        this.sealed = true;
    }

    public final Context enterContext(Context context) {
        return Context.enter(context, this);
    }

    public void observeInstructionCount(Context context, int i) {
    }
}
