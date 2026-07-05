package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: db4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class db4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ db4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i;
        ComponentName startService;
        String str2 = null;
        boolean z = false;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                oaa A = oaa.A();
                A.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) A.e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (A) {
                    try {
                        String str3 = (String) A.b;
                        if (str3 != null) {
                            str2 = str3;
                        } else {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                    if (str.startsWith(".")) {
                                        A.b = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        A.b = serviceInfo.name;
                                    }
                                    str2 = (String) A.b;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        }
                    } finally {
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (A.D(context)) {
                        startService = zr1.C(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            default:
                jmd jmdVar = jmd.a;
                knd kndVar = (knd) this.b;
                nnd nndVar = (nnd) this.c;
                String str4 = nndVar.l;
                String str5 = nndVar.c;
                bnd bndVar = nndVar.i;
                ymd ymdVar = nndVar.a;
                if (kndVar instanceof ind) {
                    kr6 kr6Var = ((ind) kndVar).a;
                    jmd d = bndVar.d(str5);
                    rmd v = nndVar.h.v();
                    v.getClass();
                    gae.l(v.a, false, true, new a23(str5, 20));
                    if (d != null) {
                        if (d == jmd.b) {
                            if (kr6Var instanceof jr6) {
                                String str6 = ond.a;
                                r95.n().p(str6, "Worker result SUCCESS for " + str4);
                                if (ymdVar.c()) {
                                    nndVar.c();
                                } else {
                                    bndVar.j(jmd.c, str5);
                                    tf2 tf2Var = ((jr6) kr6Var).a;
                                    tf2Var.getClass();
                                    gae.l(bndVar.a, false, true, new t3c(24, tf2Var, str5));
                                    nndVar.f.getClass();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    c23 c23Var = nndVar.j;
                                    for (String str7 : c23Var.a(str5)) {
                                        if (bndVar.d(str7) == jmd.e && ((Boolean) gae.l(c23Var.a, true, false, new a23(str7, 2))).booleanValue()) {
                                            r95.n().p(ond.a, "Setting status to enqueued for ".concat(str7));
                                            bndVar.j(jmdVar, str7);
                                            bndVar.i(currentTimeMillis, str7);
                                        }
                                    }
                                }
                            } else if (kr6Var instanceof ir6) {
                                String str8 = ond.a;
                                r95.n().p(str8, "Worker result RETRY for " + str4);
                                nndVar.b(-256);
                                z = true;
                            } else {
                                String str9 = ond.a;
                                r95.n().p(str9, "Worker result FAILURE for " + str4);
                                if (ymdVar.c()) {
                                    nndVar.c();
                                } else {
                                    nndVar.d(kr6Var);
                                }
                            }
                        } else if (!d.a()) {
                            nndVar.b(-512);
                            z = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (kndVar instanceof hnd) {
                    kr6 kr6Var2 = ((hnd) kndVar).a;
                    String str10 = ond.a;
                    r95.n().p(str10, "Worker result FAILURE for " + str4);
                    if (ymdVar.c()) {
                        nndVar.c();
                    } else {
                        nndVar.d(kr6Var2);
                    }
                } else if (kndVar instanceof jnd) {
                    int i2 = ((jnd) kndVar).a;
                    if (c16.i(ymdVar.y, Boolean.TRUE)) {
                        String str11 = ond.a;
                        r95.n().c(str11, "Worker " + ymdVar.c + " was interrupted. Backing off.");
                        nndVar.b(i2);
                    } else {
                        jmd d2 = bndVar.d(str5);
                        if (d2 != null && !d2.a()) {
                            String str12 = ond.a;
                            r95.n().c(str12, "Status for " + str5 + " is " + d2 + "; not doing any work and rescheduling for later execution");
                            bndVar.j(jmdVar, str5);
                            bndVar.k(i2, str5);
                            bndVar.g(-1L, str5);
                        } else {
                            String str13 = ond.a;
                            r95.n().c(str13, "Status for " + str5 + " is " + d2 + " ; not doing any work");
                        }
                    }
                    z = true;
                } else {
                    xk5.o();
                    return null;
                }
                return Boolean.valueOf(z);
        }
    }
}
