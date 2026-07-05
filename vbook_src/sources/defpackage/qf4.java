package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qf4  reason: default package */
/* loaded from: classes.dex */
public final class qf4 {
    public static final Object k = new Object();
    public static final yz l = new jla(0);
    public final Context a;
    public final String b;
    public final sg4 c;
    public final qu1 d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final ze6 g;
    public final l99 h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    /* JADX WARN: Type inference failed for: r12v2, types: [ju1, java.lang.Object] */
    public qf4(Context context, String str, sg4 sg4Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.a = context;
        am8.p(str);
        this.b = str;
        this.c = sg4Var;
        fd0 fd0Var = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList o = new kw5(10, context, new mce(ComponentDiscoveryService.class)).o();
        Trace.endSection();
        Trace.beginSection("Runtime");
        nuc nucVar = nuc.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(o);
        arrayList.add(new gu1(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new gu1(new ExecutorsRegistrar(), 1));
        arrayList2.add(pt1.c(context, Context.class, new Class[0]));
        arrayList2.add(pt1.c(this, qf4.class, new Class[0]));
        arrayList2.add(pt1.c(sg4Var, sg4.class, new Class[0]));
        ?? obj = new Object();
        if (dpe.r(context) && FirebaseInitProvider.b.get()) {
            arrayList2.add(pt1.c(fd0Var, fd0.class, new Class[0]));
        }
        qu1 qu1Var = new qu1(nucVar, arrayList, arrayList2, obj);
        this.d = qu1Var;
        Trace.endSection();
        this.g = new ze6(new pu1(2, this, context));
        this.h = qu1Var.c(cu2.class);
        nf4 nf4Var = new nf4(this);
        a();
        if (atomicBoolean.get()) {
            cg0.e.a.get();
        }
        copyOnWriteArrayList.add(nf4Var);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (k) {
            try {
                Iterator it = ((xz) l.values()).iterator();
                while (it.hasNext()) {
                    qf4 qf4Var = (qf4) it.next();
                    qf4Var.a();
                    arrayList.add(qf4Var.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static qf4 d() {
        qf4 qf4Var;
        synchronized (k) {
            try {
                qf4Var = (qf4) l.get("[DEFAULT]");
                if (qf4Var != null) {
                    ((cu2) qf4Var.h.get()).a();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ru.p() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qf4Var;
    }

    public static qf4 e(String str) {
        qf4 qf4Var;
        ArrayList c;
        String str2;
        synchronized (k) {
            try {
                qf4Var = (qf4) l.get(str.trim());
                if (qf4Var != null) {
                    ((cu2) qf4Var.h.get()).a();
                } else {
                    if (c().isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", c);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
            } finally {
            }
        }
        return qf4Var;
    }

    public static qf4 h(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return d();
                }
                sg4 a = sg4.a(context);
                if (a == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return i(context, a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, bg0] */
    public static qf4 i(Context context, sg4 sg4Var) {
        qf4 qf4Var;
        AtomicReference atomicReference = of4.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = of4.a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        cg0.b(application);
                        cg0.e.a(obj);
                        break;
                    } else if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            yz yzVar = l;
            am8.u("FirebaseApp name [DEFAULT] already exists!", !yzVar.containsKey("[DEFAULT]"));
            am8.t(context, "Application context cannot be null.");
            qf4Var = new qf4(context, "[DEFAULT]", sg4Var);
            yzVar.put("[DEFAULT]", qf4Var);
        }
        qf4Var.g();
        return qf4Var;
    }

    public final void a() {
        am8.u("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qf4)) {
            return false;
        }
        qf4 qf4Var = (qf4) obj;
        qf4Var.a();
        return this.b.equals(qf4Var.b);
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(jye.l(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(jye.l(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void g() {
        Context context = this.a;
        boolean r = dpe.r(context);
        String str = this.b;
        if (!r) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            AtomicReference atomicReference = pf4.b;
            if (atomicReference.get() == null) {
                pf4 pf4Var = new pf4(context);
                while (!atomicReference.compareAndSet(null, pf4Var)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(pf4Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        a();
        this.d.u("[DEFAULT]".equals(str));
        ((cu2) this.h.get()).a();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean j() {
        boolean z;
        a();
        xf2 xf2Var = (xf2) this.g.get();
        synchronized (xf2Var) {
            z = xf2Var.a;
        }
        return z;
    }

    public final String toString() {
        s26 s26Var = new s26(this);
        s26Var.h(this.b, "name");
        s26Var.h(this.c, "options");
        return s26Var.toString();
    }
}
