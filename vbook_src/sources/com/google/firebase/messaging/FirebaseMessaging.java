package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static g99 m;
    public static l99 n = new ou1(5);
    public static ScheduledThreadPoolExecutor o;
    public final qf4 a;
    public final Context b;
    public final yv c;
    public final bm1 d;
    public final s26 e;
    public final o40 f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final Task i;
    public final ui5 j;
    public final ig4 k;
    public boolean l;

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, yv] */
    /* JADX WARN: Type inference failed for: r11v0, types: [ui5, java.lang.Object] */
    public FirebaseMessaging(final qf4 qf4Var, l99 l99Var, l99 l99Var2, final ig4 ig4Var, l99 l99Var3, r7b r7bVar) {
        qf4Var.a();
        Context context = qf4Var.a;
        final ?? obj = new Object();
        obj.b = 0;
        obj.c = context;
        qf4Var.a();
        kv9 kv9Var = new kv9(qf4Var.a);
        ?? obj2 = new Object();
        obj2.a = qf4Var;
        obj2.b = obj;
        obj2.c = kv9Var;
        obj2.d = l99Var;
        obj2.e = l99Var2;
        obj2.f = ig4Var;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ux7("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ux7("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ux7("Firebase-Messaging-File-Io"));
        this.l = false;
        n = l99Var3;
        this.a = qf4Var;
        this.f = new o40(this, r7bVar);
        qf4Var.a();
        final Context context2 = qf4Var.a;
        this.b = context2;
        gb4 gb4Var = new gb4();
        this.j = obj;
        this.c = obj2;
        this.k = ig4Var;
        bm1 bm1Var = new bm1(context2, qf4Var, ig4Var, (yv) obj2, (ui5) obj);
        this.d = bm1Var;
        this.e = new s26(newSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        qf4Var.a();
        Context context3 = qf4Var.a;
        if (context3 instanceof Application) {
            ((Application) context3).registerActivityLifecycleCallbacks(gb4Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + context3 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (bm1Var.J()) {
            lg4 lg4Var = new lg4(this);
            hg4 hg4Var = (hg4) ig4Var;
            synchronized (hg4Var) {
                hg4Var.k.add(lg4Var);
            }
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: mg4
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task forException;
                int i;
                int i2 = r2;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (i2) {
                    case 0:
                        if (firebaseMessaging.f.g() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.l) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context4 = firebaseMessaging.b;
                        ff.t(context4);
                        yv yvVar = firebaseMessaging.c;
                        final boolean f = firebaseMessaging.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences E = fbe.E(context4);
                            if (!E.contains("proxy_retention") || E.getBoolean("proxy_retention", false) != f) {
                                kv9 kv9Var2 = (kv9) yvVar.c;
                                if (kv9Var2.c.E() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f);
                                    vdf i3 = vdf.i(kv9Var2.b);
                                    synchronized (i3) {
                                        i = i3.b;
                                        i3.b = i + 1;
                                    }
                                    forException = i3.j(new e8f(i, 4, bundle, 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new az(1), new OnSuccessListener() { // from class: m99
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj3) {
                                        Void r2 = (Void) obj3;
                                        SharedPreferences.Editor edit = fbe.E(context4).edit();
                                        edit.putBoolean("proxy_retention", f);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.f()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ux7("Firebase-Messaging-Topics-Io"));
        Task call = Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: eic
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, dic] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dic dicVar;
                Context context4 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                ui5 ui5Var = obj;
                qf4 qf4Var2 = qf4Var;
                FirebaseMessaging firebaseMessaging = this;
                ig4 ig4Var2 = ig4Var;
                synchronized (dic.class) {
                    try {
                        WeakReference weakReference = dic.b;
                        if (weakReference != null) {
                            dicVar = (dic) weakReference.get();
                        } else {
                            dicVar = null;
                        }
                        if (dicVar == null) {
                            SharedPreferences sharedPreferences = context4.getSharedPreferences("com.google.android.gms.appid", 0);
                            ?? obj3 = new Object();
                            synchronized (obj3) {
                                obj3.a = bm1.s(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            dic.b = new WeakReference(obj3);
                            dicVar = obj3;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new fic(ui5Var, dicVar, new yx9(qf4Var2, firebaseMessaging, ig4Var2), context4, scheduledThreadPoolExecutor3);
            }
        });
        this.i = call;
        call.addOnSuccessListener(scheduledThreadPoolExecutor, new ng4(this, 0));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: mg4
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task forException;
                int i;
                int i2 = r2;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (i2) {
                    case 0:
                        if (firebaseMessaging.f.g() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.l) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context4 = firebaseMessaging.b;
                        ff.t(context4);
                        yv yvVar = firebaseMessaging.c;
                        final boolean f = firebaseMessaging.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences E = fbe.E(context4);
                            if (!E.contains("proxy_retention") || E.getBoolean("proxy_retention", false) != f) {
                                kv9 kv9Var2 = (kv9) yvVar.c;
                                if (kv9Var2.c.E() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f);
                                    vdf i3 = vdf.i(kv9Var2.b);
                                    synchronized (i3) {
                                        i = i3.b;
                                        i3.b = i + 1;
                                    }
                                    forException = i3.j(new e8f(i, 4, bundle, 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new az(1), new OnSuccessListener() { // from class: m99
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj3) {
                                        Void r2 = (Void) obj3;
                                        SharedPreferences.Editor edit = fbe.E(context4).edit();
                                        edit.putBoolean("proxy_retention", f);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.f()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(long j, Runnable runnable) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (o == null) {
                    o = new ScheduledThreadPoolExecutor(1, new ux7("TAG"));
                }
                o.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized g99 c(Context context) {
        g99 g99Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new g99(context);
                }
                g99Var = m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return g99Var;
    }

    @Deprecated
    public static synchronized FirebaseMessaging getInstance(qf4 qf4Var) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) qf4Var.b(FirebaseMessaging.class);
            am8.t(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        mz6 d = d();
        if (!h(d)) {
            return (String) d.b;
        }
        String d2 = ui5.d(this.a);
        s26 s26Var = this.e;
        og4 og4Var = new og4(this, d2, d);
        synchronized (s26Var) {
            task = (Task) ((yz) s26Var.c).get(d2);
            if (task != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + d2);
                }
            } else {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + d2);
                }
                task = og4Var.a().continueWithTask((Executor) s26Var.b, new iu1(s26Var, d2, 12));
                ((yz) s26Var.c).put(d2, task);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException("FCM Registration failed!", e);
        }
    }

    public final mz6 d() {
        String f;
        mz6 c;
        g99 c2 = c(this.b);
        qf4 qf4Var = this.a;
        qf4Var.a();
        if ("[DEFAULT]".equals(qf4Var.b)) {
            f = "";
        } else {
            f = qf4Var.f();
        }
        String d = ui5.d(this.a);
        synchronized (c2) {
            c = mz6.c(((SharedPreferences) c2.b).getString(f + "|T|" + d + "|*", null));
        }
        return c;
    }

    public final void e() {
        Task forException;
        int i;
        kv9 kv9Var = (kv9) this.c.c;
        if (kv9Var.c.E() >= 241100000) {
            vdf i2 = vdf.i(kv9Var.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (i2) {
                i = i2.b;
                i2.b = i + 1;
            }
            forException = i2.j(new e8f(i, 5, bundle, 1)).continueWith(f73.c, v28.b);
        } else {
            forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        forException.addOnSuccessListener(this.g, new ng4(this, 1));
    }

    public final boolean f() {
        Context context = this.b;
        ff.t(context);
        if (ff.u(context)) {
            if (this.a.b(wc.class) == null) {
                if (hif.l() && n != null) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final synchronized void g(long j) {
        b(j, new dfb(this, Math.min(Math.max(30L, 2 * j), 28800L)));
        this.l = true;
    }

    public final boolean h(mz6 mz6Var) {
        String str;
        if (mz6Var != null) {
            String str2 = (String) mz6Var.b;
            String c = this.j.c();
            if (System.currentTimeMillis() <= mz6Var.a + 604800000 && c.equals((String) mz6Var.c)) {
                if (this.d.J()) {
                    try {
                        str = (String) Tasks.await(((hg4) this.k).c());
                    } catch (InterruptedException | ExecutionException unused) {
                        str = null;
                    }
                    return !str2.equalsIgnoreCase(str);
                } else if (str2.length() <= 22) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
