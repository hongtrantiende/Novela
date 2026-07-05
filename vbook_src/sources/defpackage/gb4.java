package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gb4  reason: default package */
/* loaded from: classes.dex */
public final class gb4 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a;
    public final Object b;

    public gb4() {
        this.a = 0;
        this.b = new ArrayDeque(10);
    }

    public void a(Intent intent) {
        boolean equals;
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (!arrayDeque.contains(string)) {
                        arrayDeque.add(string);
                    } else {
                        return;
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null) {
            equals = false;
        } else {
            equals = "1".equals(bundle.getString("google.c.a.e"));
        }
        if (equals) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    wc wcVar = (wc) qf4.d().b(wc.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (wcVar != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        xc xcVar = (xc) wcVar;
                        if (!gde.c.contains("fcm")) {
                            qke qkeVar = xcVar.a.a;
                            qkeVar.a(new fhe(qkeVar, string2, 0));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        xcVar.a("fcm", "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            hif.s("_no", bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[Catch: all -> 0x0028, RuntimeException -> 0x002c, TryCatch #1 {RuntimeException -> 0x002c, blocks: (B:3:0x0005, B:5:0x0019, B:7:0x001f, B:22:0x004a, B:25:0x0051, B:30:0x0063, B:35:0x0070, B:15:0x002f, B:17:0x0036, B:19:0x0042), top: B:44:0x0005, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(defpackage.ahe r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            r1 = r0
            yze r1 = (defpackage.yze) r1
            java.lang.Object r0 = r1.a     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            lte r0 = (defpackage.lte) r0     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            ppe r2 = r0.f     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            defpackage.lte.m(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            s56 r2 = r2.J     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            java.lang.String r3 = "onActivityCreated"
            r2.e(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            android.content.Intent r2 = r9.c     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            if (r2 == 0) goto L7f
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            if (r3 == 0) goto L2f
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            if (r4 != 0) goto L26
            goto L2f
        L26:
            r5 = r3
            goto L48
        L28:
            r0 = move-exception
            r8 = r0
            goto La1
        L2c:
            r0 = move-exception
            r8 = r0
            goto L8c
        L2f:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            r4 = 0
            if (r3 == 0) goto L47
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            if (r5 != 0) goto L47
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            goto L26
        L47:
            r5 = r4
        L48:
            if (r5 == 0) goto L7f
            boolean r3 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            if (r3 != 0) goto L51
            goto L7f
        L51:
            l6f r3 = r0.E     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            defpackage.lte.k(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            boolean r2 = defpackage.l6f.a1(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            if (r2 == 0) goto L60
            java.lang.String r2 = "gs"
        L5e:
            r6 = r2
            goto L63
        L60:
            java.lang.String r2 = "auto"
            goto L5e
        L63:
            java.lang.String r2 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            if (r10 != 0) goto L6e
            r2 = 1
        L6c:
            r4 = r2
            goto L70
        L6e:
            r2 = 0
            goto L6c
        L70:
            ete r0 = r0.C     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            defpackage.lte.m(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            gne r2 = new gne     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            r0.g0(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            goto L9c
        L7f:
            java.lang.Object r8 = r1.a
            lte r8 = (defpackage.lte) r8
        L83:
            b1f r8 = r8.H
            defpackage.lte.l(r8)
            r8.e0(r9, r10)
            return
        L8c:
            java.lang.Object r0 = r1.a     // Catch: java.lang.Throwable -> L28
            lte r0 = (defpackage.lte) r0     // Catch: java.lang.Throwable -> L28
            ppe r0 = r0.f     // Catch: java.lang.Throwable -> L28
            defpackage.lte.m(r0)     // Catch: java.lang.Throwable -> L28
            s56 r0 = r0.f     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r0.f(r8, r2)     // Catch: java.lang.Throwable -> L28
        L9c:
            java.lang.Object r8 = r1.a
            lte r8 = (defpackage.lte) r8
            goto L83
        La1:
            java.lang.Object r0 = r1.a
            lte r0 = (defpackage.lte) r0
            b1f r0 = r0.H
            defpackage.lte.l(r0)
            r0.e0(r9, r10)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb4.j(ahe, android.os.Bundle):void");
    }

    public void k(ahe aheVar) {
        b1f b1fVar = ((lte) ((yze) this.b).a).H;
        lte.l(b1fVar);
        synchronized (b1fVar.H) {
            try {
                if (Objects.equals(b1fVar.C, aheVar)) {
                    b1fVar.C = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!((lte) b1fVar.a).d.m0()) {
            return;
        }
        b1fVar.f.remove(Integer.valueOf(aheVar.a));
    }

    public void l(ahe aheVar) {
        lte lteVar = (lte) ((yze) this.b).a;
        b1f b1fVar = lteVar.H;
        lte.l(b1fVar);
        synchronized (b1fVar.H) {
            b1fVar.G = false;
            b1fVar.D = true;
        }
        lte lteVar2 = (lte) b1fVar.a;
        lteVar2.G.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!lteVar2.d.m0()) {
            b1fVar.c = null;
            ete eteVar = lteVar2.C;
            lte.m(eteVar);
            eteVar.g0(new ede(b1fVar, elapsedRealtime));
        } else {
            s0f h0 = b1fVar.h0(aheVar);
            b1fVar.d = b1fVar.c;
            b1fVar.c = null;
            ete eteVar2 = lteVar2.C;
            lte.m(eteVar2);
            eteVar2.g0(new dfb(b1fVar, h0, elapsedRealtime));
        }
        f4f f4fVar = lteVar.D;
        lte.l(f4fVar);
        lte lteVar3 = (lte) f4fVar.a;
        lteVar3.G.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        ete eteVar3 = lteVar3.C;
        lte.m(eteVar3);
        eteVar3.g0(new n3f(f4fVar, elapsedRealtime2, 1));
    }

    public void m(ahe aheVar) {
        lte lteVar = (lte) ((yze) this.b).a;
        f4f f4fVar = lteVar.D;
        lte.l(f4fVar);
        lte lteVar2 = (lte) f4fVar.a;
        lteVar2.G.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ete eteVar = lteVar2.C;
        lte.m(eteVar);
        eteVar.g0(new n3f(f4fVar, elapsedRealtime, 0));
        b1f b1fVar = lteVar.H;
        lte.l(b1fVar);
        Object obj = b1fVar.H;
        synchronized (obj) {
            try {
                b1fVar.G = true;
                if (!Objects.equals(aheVar, b1fVar.C)) {
                    synchronized (obj) {
                        b1fVar.C = aheVar;
                        b1fVar.D = false;
                        lte lteVar3 = (lte) b1fVar.a;
                        if (lteVar3.d.m0()) {
                            b1fVar.E = null;
                            ete eteVar2 = lteVar3.C;
                            lte.m(eteVar2);
                            eteVar2.g0(new w0f(b1fVar, 1));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        lte lteVar4 = (lte) b1fVar.a;
        if (!lteVar4.d.m0()) {
            b1fVar.c = b1fVar.E;
            ete eteVar3 = lteVar4.C;
            lte.m(eteVar3);
            eteVar3.g0(new w0f(b1fVar, 0));
            return;
        }
        b1fVar.f0(aheVar.b, b1fVar.h0(aheVar), false);
        gge ggeVar = ((lte) b1fVar.a).J;
        lte.j(ggeVar);
        lte lteVar5 = (lte) ggeVar.a;
        lteVar5.G.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        ete eteVar4 = lteVar5.C;
        lte.m(eteVar4);
        eteVar4.g0(new ede(ggeVar, elapsedRealtime2));
    }

    public void n(ahe aheVar, Bundle bundle) {
        s0f s0fVar;
        b1f b1fVar = ((lte) ((yze) this.b).a).H;
        lte.l(b1fVar);
        if (((lte) b1fVar.a).d.m0() && bundle != null && (s0fVar = (s0f) b1fVar.f.get(Integer.valueOf(aheVar.a))) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", s0fVar.c);
            bundle2.putString("name", s0fVar.a);
            bundle2.putString("referrer_name", s0fVar.b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT <= 25) {
                        new Handler(Looper.getMainLooper()).post(new ex2(4, this, intent));
                        return;
                    } else {
                        a(intent);
                        return;
                    }
                }
                return;
            case 1:
                ((qke) this.b).a(new cie(this, bundle, activity));
                return;
            default:
                j(ahe.c(activity), bundle);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                ((qke) this.b).a(new fke(this, activity, 4));
                return;
            default:
                k(ahe.c(activity));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                ((qke) this.b).a(new fke(this, activity, 2));
                return;
            default:
                l(ahe.c(activity));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                ((qke) this.b).a(new fke(this, activity, 1));
                return;
            default:
                m(ahe.c(activity));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                ree reeVar = new ree();
                ((qke) this.b).a(new cie(this, activity, reeVar));
                Bundle e = reeVar.e(50L);
                if (e != null) {
                    bundle.putAll(e);
                    return;
                }
                return;
            default:
                n(ahe.c(activity), bundle);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                ((qke) this.b).a(new fke(this, activity, 0));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                ((qke) this.b).a(new fke(this, activity, 3));
                return;
            default:
                return;
        }
    }

    public /* synthetic */ gb4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }
}
