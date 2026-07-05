package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sw6  reason: default package */
/* loaded from: classes3.dex */
public abstract class sw6 {
    public static volatile int a;
    public static final w7b b = new w7b();
    public static final fx7 c = new fx7();
    public static final boolean d;
    public static volatile bw9 e;
    public static final String[] f;

    static {
        String str;
        boolean equalsIgnoreCase;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            equalsIgnoreCase = false;
        } else {
            equalsIgnoreCase = str.equalsIgnoreCase("true");
        }
        d = equalsIgnoreCase;
        f = new String[]{"2.0"};
    }

    public static ArrayList a() {
        ServiceLoader serviceLoader;
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = sw6.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        bw9 bw9Var = null;
        if (property != null && !property.isEmpty()) {
            try {
                op9.d("Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property");
                bw9Var = (bw9) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e2) {
                op9.b("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e2);
            } catch (ClassNotFoundException e3) {
                e = e3;
                op9.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e4) {
                e = e4;
                op9.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e5) {
                e = e5;
                op9.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e6) {
                e = e6;
                op9.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e7) {
                e = e7;
                op9.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (bw9Var != null) {
            arrayList.add(bw9Var);
            return arrayList;
        }
        if (System.getSecurityManager() == null) {
            serviceLoader = ServiceLoader.load(bw9.class, classLoader);
        } else {
            serviceLoader = (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: rw6
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    return ServiceLoader.load(bw9.class, classLoader);
                }
            });
        }
        Iterator it = serviceLoader.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((bw9) it.next());
            } catch (ServiceConfigurationError e8) {
                op9.a("A service provider failed to instantiate:\n" + e8.getMessage());
            }
        }
        return arrayList;
    }

    public static pw6 b(String str) {
        return c().b().a(str);
    }

    public static bw9 c() {
        if (a == 0) {
            synchronized (sw6.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        d();
                    }
                } finally {
                }
            }
        }
        int i = a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return c;
                    }
                    vs.k("Unreachable code");
                    return null;
                }
                return e;
            }
            vs.k("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            return null;
        }
        return b;
    }

    public static final void d() {
        Enumeration<URL> resources;
        try {
            ArrayList a2 = a();
            h(a2);
            if (!a2.isEmpty()) {
                e = (bw9) a2.get(0);
                rz6 a3 = e.a();
                if (a3 != null) {
                    hxe.i = a3;
                }
                e.getClass();
                a = 3;
                f(a2);
            } else {
                a = 4;
                op9.e("No SLF4J providers were found.");
                op9.e("Defaulting to no-operation (NOP) logger implementation");
                op9.e("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = sw6.class.getClassLoader();
                    if (classLoader == null) {
                        resources = ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class");
                    } else {
                        resources = classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    }
                    while (resources.hasMoreElements()) {
                        linkedHashSet.add(resources.nextElement());
                    }
                } catch (IOException e2) {
                    op9.b("Error getting resources from path", e2);
                }
                g(linkedHashSet);
            }
            e();
            if (a == 3) {
                try {
                    String c2 = e.c();
                    boolean z = false;
                    for (String str : f) {
                        if (c2.startsWith(str)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        op9.e("The requested version " + c2 + " by your slf4j provider is not compatible with " + Arrays.asList(f).toString());
                        op9.e("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                    }
                } catch (Throwable th) {
                    op9.b("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e3) {
            a = 2;
            op9.b("Failed to instantiate SLF4J LoggerFactory", e3);
            throw new IllegalStateException("Unexpected initialization failure", e3);
        }
    }

    public static void e() {
        w7b w7bVar = b;
        synchronized (w7bVar) {
            try {
                w7bVar.a.a = true;
                u7b u7bVar = w7bVar.a;
                u7bVar.getClass();
                ArrayList arrayList = new ArrayList(u7bVar.b.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    t7b t7bVar = (t7b) obj;
                    t7bVar.b = b(t7bVar.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = b.a.c;
        int size2 = linkedBlockingQueue.size();
        ArrayList arrayList2 = new ArrayList((int) Token.CASE);
        int i2 = 0;
        while (linkedBlockingQueue.drainTo(arrayList2, Token.CASE) != 0) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                v7b v7bVar = (v7b) obj2;
                if (v7bVar != null) {
                    t7b t7bVar2 = v7bVar.b;
                    String str = t7bVar2.a;
                    if (t7bVar2.b != null) {
                        if (!(t7bVar2.b instanceof dx7)) {
                            if (t7bVar2.l()) {
                                if (t7bVar2.j(v7bVar.a) && t7bVar2.l()) {
                                    try {
                                        t7bVar2.d.invoke(t7bVar2.b, v7bVar);
                                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                                    }
                                }
                            } else {
                                op9.e(str);
                            }
                        }
                    } else {
                        vs.k("Delegate logger cannot be null at this state.");
                        return;
                    }
                }
                int i4 = i2 + 1;
                if (i2 == 0) {
                    if (v7bVar.b.l()) {
                        op9.e("A number (" + size2 + ") of logging calls during the initialization phase have been intercepted and are");
                        op9.e("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        op9.e("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(v7bVar.b.b instanceof dx7)) {
                        op9.e("The following set of substitute loggers may have been accessed");
                        op9.e("during the initialization phase. Logging calls during this");
                        op9.e("phase were not honored. However, subsequent logging calls to these");
                        op9.e("loggers will work as normally expected.");
                        op9.e("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i2 = i4;
            }
            arrayList2.clear();
        }
        u7b u7bVar2 = b.a;
        u7bVar2.b.clear();
        u7bVar2.c.clear();
    }

    public static void f(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() > 1) {
                op9.d("Actual provider is of type [" + arrayList.get(0) + "]");
                return;
            }
            String str = "Connected with provider of type [" + ((bw9) arrayList.get(0)).getClass().getName() + "]";
            int i = op9.a;
            if (a82.C(1) >= a82.C(op9.b)) {
                op9.c().println("SLF4J(D): ".concat(str));
                return;
            }
            return;
        }
        vs.k("No providers were found which is impossible after successful initialization.");
    }

    public static void g(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        op9.e("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            op9.e("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        op9.e("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void h(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            op9.e("Class path contains multiple SLF4J providers.");
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                op9.e("Found provider [" + ((bw9) obj) + "]");
            }
            op9.e("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
