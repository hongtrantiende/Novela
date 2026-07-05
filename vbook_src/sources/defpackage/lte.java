package defpackage;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lte  reason: default package */
/* loaded from: classes.dex */
public final class lte implements tve {
    public static volatile lte b0;
    public final ete C;
    public final f4f D;
    public final l6f E;
    public final yoe F;
    public final kh5 G;
    public final b1f H;
    public final yze I;
    public final gge J;
    public final h0f K;
    public final String L;
    public toe M;
    public w2f N;
    public sae O;
    public joe P;
    public l0f Q;
    public Boolean S;
    public long T;
    public volatile Boolean U;
    public volatile boolean V;
    public int W;
    public int X;
    public final long Z;
    public final Context a;
    public final long a0;
    public final boolean b;
    public final jf8 c;
    public final t7e d;
    public final dre e;
    public final ppe f;
    public boolean R = false;
    public final AtomicInteger Y = new AtomicInteger(0);

    /* JADX WARN: Type inference failed for: r2v13, types: [t7e, c3e] */
    /* JADX WARN: Type inference failed for: r4v14, types: [qve, h0f] */
    public lte(vwe vweVar) {
        Context context;
        long currentTimeMillis;
        long elapsedRealtime;
        Context context2 = vweVar.a;
        jf8 jf8Var = new jf8(9);
        this.c = jf8Var;
        nae.l = jf8Var;
        this.a = context2;
        this.b = vweVar.e;
        this.U = vweVar.b;
        this.L = vweVar.h;
        boolean z = true;
        this.V = true;
        if (t0f.b == null && context2 != null) {
            Object obj = t0f.a;
            synchronized (obj) {
                try {
                    if (t0f.b == null) {
                        synchronized (obj) {
                            kze kzeVar = t0f.b;
                            Context applicationContext = context2.getApplicationContext();
                            if (applicationContext == null) {
                                applicationContext = context2;
                            }
                            if (kzeVar != null) {
                                if (kzeVar.a != applicationContext) {
                                }
                            }
                            if (kzeVar != null) {
                                Iterator it = nze.a.values().iterator();
                                if (!it.hasNext()) {
                                    z0f.a();
                                } else if (it.next() == null) {
                                    throw null;
                                } else {
                                    throw new ClassCastException();
                                }
                            }
                            t0f.b = new kze(applicationContext, kte.j(new c0f(applicationContext, 2)));
                            t0f.c.incrementAndGet();
                        }
                    }
                } finally {
                }
            }
        }
        this.G = kh5.N;
        tz4 tz4Var = new tz4(context2, null, gxe.a, xs.g, sz4.c);
        String concat = "com.google.android.gms.measurement#".concat(String.valueOf(context2.getPackageName()));
        uu5 b = uu5.b();
        b.c = new rwa(23, concat, new String[0]);
        tz4Var.b(0, b.a());
        AtomicReference atomicReference = a0f.k;
        if (atomicReference.get() == null) {
            try {
                context = context2.getApplicationContext();
            } catch (NullPointerException unused) {
                a0f.b();
                dce.G(Level.WARNING, (Executor) a0f.m.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                context = null;
            }
            if (context != null) {
                while (!atomicReference.compareAndSet(null, context) && atomicReference.get() == null) {
                }
            }
        }
        Long l = vweVar.f;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            this.G.getClass();
            currentTimeMillis = System.currentTimeMillis();
        }
        this.Z = currentTimeMillis;
        Long l2 = vweVar.g;
        if (l2 != null) {
            elapsedRealtime = l2.longValue();
        } else {
            this.G.getClass();
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.a0 = elapsedRealtime;
        ?? c3eVar = new c3e(this);
        c3eVar.d = tw8.b;
        this.d = c3eVar;
        dre dreVar = new dre(this);
        dreVar.a0();
        this.e = dreVar;
        ppe ppeVar = new ppe(this);
        ppeVar.a0();
        this.f = ppeVar;
        l6f l6fVar = new l6f(this);
        l6fVar.a0();
        this.E = l6fVar;
        this.F = new yoe(new k57(28, vweVar, this));
        this.J = new gge(this);
        b1f b1fVar = new b1f(this);
        b1fVar.Z();
        this.H = b1fVar;
        yze yzeVar = new yze(this);
        yzeVar.Z();
        this.I = yzeVar;
        f4f f4fVar = new f4f(this);
        f4fVar.Z();
        this.D = f4fVar;
        ?? qveVar = new qve(this);
        qveVar.a0();
        this.K = qveVar;
        ete eteVar = new ete(this);
        eteVar.a0();
        this.C = eteVar;
        xge xgeVar = vweVar.d;
        if (xgeVar != null && xgeVar.b != 0) {
            z = false;
        }
        if (this.a.getApplicationContext() instanceof Application) {
            l(yzeVar);
            if (((lte) yzeVar.a).a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((lte) yzeVar.a).a.getApplicationContext();
                if (yzeVar.c == null) {
                    yzeVar.c = new gb4(yzeVar, 2);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(yzeVar.c);
                    application.registerActivityLifecycleCallbacks(yzeVar.c);
                    ppe ppeVar2 = ((lte) yzeVar.a).f;
                    m(ppeVar2);
                    ppeVar2.J.e("Registered activity lifecycle callback");
                }
            }
        } else {
            m(ppeVar);
            ppeVar.E.e("Application context is not an Application");
        }
        eteVar.g0(new bv4(this, false, vweVar, 21));
    }

    public static final void j(xke xkeVar) {
        if (xkeVar != null) {
            return;
        }
        vs.k("Component not created");
    }

    public static final void k(c3e c3eVar) {
        if (c3eVar != null) {
            return;
        }
        vs.k("Component not created");
    }

    public static final void l(fne fneVar) {
        if (fneVar != null) {
            if (fneVar.b) {
                return;
            }
            vs.k("Component not initialized: ".concat(String.valueOf(fneVar.getClass())));
            return;
        }
        vs.k("Component not created");
    }

    public static final void m(qve qveVar) {
        if (qveVar != null) {
            if (qveVar.b) {
                return;
            }
            vs.k("Component not initialized: ".concat(String.valueOf(qveVar.getClass())));
            return;
        }
        vs.k("Component not created");
    }

    public static lte s(Context context, xge xgeVar, Long l, Long l2) {
        Bundle bundle;
        if (xgeVar != null) {
            Bundle bundle2 = xgeVar.d;
            xgeVar = new xge(xgeVar.a, xgeVar.b, xgeVar.c, bundle2, null);
        }
        am8.s(context);
        am8.s(context.getApplicationContext());
        if (b0 == null) {
            synchronized (lte.class) {
                try {
                    if (b0 == null) {
                        b0 = new lte(new vwe(context, xgeVar, l, l2));
                    }
                } finally {
                }
            }
        } else if (xgeVar != null && (bundle = xgeVar.d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            am8.s(b0);
            b0.U = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        am8.s(b0);
        return b0;
    }

    public final boolean a() {
        if (d() == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tve
    public final jf8 b() {
        return this.c;
    }

    @Override // defpackage.tve
    public final ppe c() {
        ppe ppeVar = this.f;
        m(ppeVar);
        return ppeVar;
    }

    public final int d() {
        Boolean bool;
        ete eteVar = this.C;
        m(eteVar);
        eteVar.W();
        t7e t7eVar = this.d;
        if (t7eVar.l0()) {
            return 1;
        }
        m(eteVar);
        eteVar.W();
        if (this.V) {
            dre dreVar = this.e;
            k(dreVar);
            dreVar.W();
            if (dreVar.b0().contains("measurement_enabled")) {
                bool = Boolean.valueOf(dreVar.b0().getBoolean("measurement_enabled", true));
            } else {
                bool = null;
            }
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return 3;
                }
                return 0;
            }
            jf8 jf8Var = ((lte) t7eVar.a).c;
            Boolean k0 = t7eVar.k0("firebase_analytics_collection_enabled");
            if (k0 != null) {
                if (!k0.booleanValue()) {
                    return 4;
                }
                return 0;
            } else if (this.U != null && !this.U.booleanValue()) {
                return 7;
            } else {
                return 0;
            }
        }
        return 8;
    }

    @Override // defpackage.tve
    public final kh5 e() {
        return this.G;
    }

    @Override // defpackage.tve
    public final ete f() {
        ete eteVar = this.C;
        m(eteVar);
        return eteVar;
    }

    @Override // defpackage.tve
    public final Context g() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r7.T) > 1000) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r7 = this;
            boolean r0 = r7.R
            r1 = 0
            if (r0 == 0) goto L96
            ete r0 = r7.C
            m(r0)
            r0.W()
            java.lang.Boolean r0 = r7.S
            kh5 r2 = r7.G
            if (r0 == 0) goto L35
            long r3 = r7.T
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L35
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8f
            r2.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.T
            long r3 = r3 - r5
            long r3 = java.lang.Math.abs(r3)
            r5 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L8f
        L35:
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            r7.T = r2
            l6f r0 = r7.E
            k(r0)
            java.lang.String r2 = "android.permission.INTERNET"
            boolean r2 = r0.B0(r2)
            if (r2 == 0) goto L75
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = r0.B0(r2)
            if (r2 == 0) goto L75
            android.content.Context r2 = r7.a
            zd0 r3 = defpackage.wnd.a(r2)
            boolean r3 = r3.c()
            r4 = 1
            if (r3 != 0) goto L74
            t7e r3 = r7.d
            boolean r3 = r3.a0()
            if (r3 != 0) goto L74
            boolean r3 = defpackage.l6f.T0(r2)
            if (r3 == 0) goto L75
            boolean r2 = defpackage.l6f.s0(r2)
            if (r2 == 0) goto L75
        L74:
            r1 = r4
        L75:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r7.S = r2
            if (r1 == 0) goto L8f
            joe r1 = r7.r()
            java.lang.String r1 = r1.e0()
            boolean r0 = r0.d0(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.S = r0
        L8f:
            java.lang.Boolean r7 = r7.S
            boolean r7 = r7.booleanValue()
            return r7
        L96:
            java.lang.String r7 = "AppMeasurement is not initialized"
            defpackage.vs.k(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lte.h():boolean");
    }

    public final void i(int i, Throwable th, byte[] bArr) {
        ppe ppeVar;
        ppe ppeVar2;
        int i2 = i;
        ppe ppeVar3 = this.f;
        if (i2 != 200 && i2 != 204) {
            if (i2 == 304) {
                i2 = 304;
            }
            m(ppeVar3);
            ppeVar3.E.g(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
        }
        if (th == null) {
            dre dreVar = this.e;
            k(dreVar);
            dreVar.P.b(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(optString)) {
                        m(ppeVar3);
                        ppeVar3.I.e("Deferred Deep Link is empty.");
                        return;
                    }
                    String optString2 = jSONObject.optString("gclid", "");
                    String optString3 = jSONObject.optString("gbraid", "");
                    String optString4 = jSONObject.optString("gad_source", "");
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    l6f l6fVar = this.E;
                    k(l6fVar);
                    lte lteVar = (lte) l6fVar.a;
                    if (TextUtils.isEmpty(optString)) {
                        ppeVar2 = ppeVar3;
                    } else {
                        Context context = lteVar.a;
                        ppeVar2 = ppeVar3;
                        try {
                            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                            if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(optString3)) {
                                    bundle.putString("gbraid", optString3);
                                }
                                if (!TextUtils.isEmpty(optString4)) {
                                    bundle.putString("gad_source", optString4);
                                }
                                bundle.putString("gclid", optString2);
                                bundle.putString("_cis", "ddp");
                                this.I.e0("auto", "_cmp", bundle);
                                if (!TextUtils.isEmpty(optString)) {
                                    try {
                                        SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                        edit.putString("deeplink", optString);
                                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                        if (edit.commit()) {
                                            Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                            Context context2 = lteVar.a;
                                            if (Build.VERSION.SDK_INT < 34) {
                                                context2.sendBroadcast(intent);
                                                return;
                                            } else {
                                                context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                return;
                                            }
                                        }
                                        return;
                                    } catch (RuntimeException e) {
                                        ppe ppeVar4 = ((lte) l6fVar.a).f;
                                        m(ppeVar4);
                                        ppeVar4.f.f(e, "Failed to persist Deferred Deep Link. exception");
                                        return;
                                    }
                                }
                                return;
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            ppeVar = ppeVar2;
                            m(ppeVar);
                            ppeVar.f.f(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    m(ppeVar2);
                    ppeVar = ppeVar2;
                    try {
                        ppeVar.E.h("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                        m(ppeVar);
                        ppeVar.f.f(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    ppeVar = ppeVar3;
                }
            } else {
                m(ppeVar3);
                ppeVar3.I.e("Deferred Deep Link response empty.");
                return;
            }
        }
        m(ppeVar3);
        ppeVar3.E.g(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public final yoe n() {
        return this.F;
    }

    public final toe o() {
        l(this.M);
        return this.M;
    }

    public final w2f p() {
        l(this.N);
        return this.N;
    }

    public final sae q() {
        m(this.O);
        return this.O;
    }

    public final joe r() {
        l(this.P);
        return this.P;
    }
}
