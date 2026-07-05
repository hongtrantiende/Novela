package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.mozilla.javascript.ES6Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yze  reason: default package */
/* loaded from: classes.dex */
public final class yze extends fne {
    public final AtomicReference C;
    public final Object D;
    public boolean E;
    public int F;
    public bxe G;
    public bxe H;
    public PriorityQueue I;
    public hwe J;
    public final AtomicLong K;
    public long L;
    public final g99 M;
    public boolean N;
    public bxe O;
    public pze P;
    public bxe Q;
    public final l97 R;
    public gb4 c;
    public rwa d;
    public final CopyOnWriteArraySet e;
    public boolean f;

    public yze(lte lteVar) {
        super(lteVar);
        this.e = new CopyOnWriteArraySet();
        this.D = new Object();
        this.E = false;
        this.F = 1;
        this.N = true;
        this.R = new l97(this);
        this.C = new AtomicReference();
        this.J = hwe.c;
        this.L = -1L;
        this.K = new AtomicLong(0L);
        this.M = new g99(lteVar, 26);
    }

    @Override // defpackage.fne
    public final boolean a0() {
        return false;
    }

    public final void b0(String str, String str2, Bundle bundle) {
        long j;
        lte lteVar = (lte) this.a;
        lteVar.G.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (lteVar.d.i0(null, yme.e1)) {
            lteVar.G.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        c0(str, str2, bundle, true, true, currentTimeMillis, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r3 > 500) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
        if (r5 > 500) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yze.c0(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0() {
        /*
            Method dump skipped, instructions count: 1359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yze.d0():void");
    }

    public final void e0(String str, String str2, Bundle bundle) {
        long j;
        W();
        lte lteVar = (lte) this.a;
        lteVar.G.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (lteVar.d.i0(null, yme.e1)) {
            lteVar.G.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        f0(currentTimeMillis, j, bundle, str, str2);
    }

    public final void f0(long j, long j2, Bundle bundle, String str, String str2) {
        W();
        boolean z = true;
        if (this.d != null && !l6f.C0(str2)) {
            z = false;
        }
        g0(str, str2, j, j2, bundle, true, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0(java.lang.String r27, java.lang.String r28, long r29, long r31, android.os.Bundle r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yze.g0(java.lang.String, java.lang.String, long, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    public final void h0(String str, String str2, Object obj, boolean z, long j) {
        int i;
        String str3;
        lte lteVar = (lte) this.a;
        int i2 = 0;
        if (z) {
            l6f l6fVar = lteVar.E;
            lte.k(l6fVar);
            i = l6fVar.h1(str2);
        } else {
            l6f l6fVar2 = lteVar.E;
            lte.k(l6fVar2);
            if (l6fVar2.b1("user property", str2)) {
                if (!l6fVar2.d1("user property", s9e.d, null, str2)) {
                    i = 15;
                } else {
                    ((lte) l6fVar2.a).getClass();
                    if (l6fVar2.e1("user property", str2, 24)) {
                        i = 0;
                    }
                }
            }
            i = 6;
        }
        l97 l97Var = this.R;
        if (i != 0) {
            lte.k(lteVar.E);
            String e0 = l6f.e0(24, str2, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            lte.k(lteVar.E);
            l6f.p0(l97Var, null, i, "_ev", e0, i2);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            l6f l6fVar3 = lteVar.E;
            l6f l6fVar4 = lteVar.E;
            lte.k(l6fVar3);
            int m0 = l6fVar3.m0(obj, str2);
            if (m0 != 0) {
                lte.k(l6fVar4);
                String e02 = l6f.e0(24, str2, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = obj.toString().length();
                }
                lte.k(l6fVar4);
                l6f.p0(l97Var, null, m0, "_ev", e02, i2);
                return;
            }
            lte.k(l6fVar4);
            Object n0 = l6fVar4.n0(obj, str2);
            if (n0 != null) {
                ete eteVar = lteVar.C;
                lte.m(eteVar);
                eteVar.g0(new hic(this, str3, str2, n0, j, 2));
                return;
            }
            return;
        }
        ete eteVar2 = lteVar.C;
        lte.m(eteVar2);
        eteVar2.g0(new hic(this, str3, str2, null, j, 2));
    }

    public final void i0(long j, Object obj, String str, String str2) {
        String str3;
        boolean e0;
        long j2;
        Object obj2 = obj;
        lte lteVar = (lte) this.a;
        am8.p(str);
        am8.p(str2);
        W();
        Y();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (obj2 instanceof String) {
                String str5 = (String) obj2;
                if (!TextUtils.isEmpty(str5)) {
                    String lowerCase = str5.toLowerCase(Locale.ENGLISH);
                    String str6 = "false";
                    if (true != "false".equals(lowerCase)) {
                        j2 = 0;
                    } else {
                        j2 = 1;
                    }
                    obj2 = Long.valueOf(j2);
                    dre dreVar = lteVar.e;
                    lte.k(dreVar);
                    o40 o40Var = dreVar.I;
                    if (j2 == 1) {
                        str6 = "true";
                    }
                    o40Var.l(str6);
                    ppe ppeVar = lteVar.f;
                    lte.m(ppeVar);
                    ppeVar.J.g("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
                    str3 = str4;
                }
            }
            if (obj2 == null) {
                dre dreVar2 = lteVar.e;
                lte.k(dreVar2);
                dreVar2.I.l("unset");
            } else {
                str4 = str2;
            }
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.J.g("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj3 = obj2;
        if (!lteVar.a()) {
            ppe ppeVar3 = lteVar.f;
            lte.m(ppeVar3);
            ppeVar3.J.e("User property not set since app measurement is disabled");
        } else if (!lteVar.h()) {
        } else {
            g6f g6fVar = new g6f(j, obj3, str3, str);
            w2f p = lteVar.p();
            p.W();
            p.Y();
            p.j0();
            toe o = ((lte) p.a).o();
            o.getClass();
            Parcel obtain = Parcel.obtain();
            q4f.a(g6fVar, obtain);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                ppe ppeVar4 = ((lte) o.a).f;
                lte.m(ppeVar4);
                ppeVar4.C.e("User property too long for local database. Sending directly to service");
                e0 = false;
            } else {
                e0 = o.e0(marshall, 1);
            }
            p.l0(new l1f(p, p.n0(true), e0, g6fVar, 0));
        }
    }

    public final void j0() {
        W();
        Y();
        lte lteVar = (lte) this.a;
        if (lteVar.h()) {
            t7e t7eVar = lteVar.d;
            ((lte) t7eVar.a).getClass();
            Boolean k0 = t7eVar.k0("google_analytics_deferred_deep_link_enabled");
            if (k0 != null && k0.booleanValue()) {
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.I.e("Deferred Deep Link feature enabled.");
                ete eteVar = lteVar.C;
                lte.m(eteVar);
                eteVar.g0(new ywe(this, 2));
            }
            w2f p = lteVar.p();
            p.W();
            p.Y();
            d8f n0 = p.n0(true);
            p.j0();
            lte lteVar2 = (lte) p.a;
            lteVar2.d.i0(null, yme.W0);
            lteVar2.o().e0(new byte[0], 3);
            p.l0(new o1f(p, n0, 1));
            this.N = false;
            dre dreVar = lteVar.e;
            lte.k(dreVar);
            dreVar.W();
            String string = dreVar.b0().getString("previous_os_version", null);
            ((lte) dreVar.a).q().Z();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = dreVar.b0().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                lteVar.q().Z();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    e0("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void k0(Bundle bundle, long j) {
        lte lteVar = (lte) this.a;
        am8.s(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.E.e("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        obe.E(bundle2, "app_id", String.class, null);
        obe.E(bundle2, "origin", String.class, null);
        obe.E(bundle2, "name", String.class, null);
        obe.E(bundle2, ES6Iterator.VALUE_PROPERTY, Object.class, null);
        obe.E(bundle2, "trigger_event_name", String.class, null);
        obe.E(bundle2, "trigger_timeout", Long.class, 0L);
        obe.E(bundle2, "timed_out_event_name", String.class, null);
        obe.E(bundle2, "timed_out_event_params", Bundle.class, null);
        obe.E(bundle2, "triggered_event_name", String.class, null);
        obe.E(bundle2, "triggered_event_params", Bundle.class, null);
        obe.E(bundle2, "time_to_live", Long.class, 0L);
        obe.E(bundle2, "expired_event_name", String.class, null);
        obe.E(bundle2, "expired_event_params", Bundle.class, null);
        am8.p(bundle2.getString("name"));
        am8.p(bundle2.getString("origin"));
        am8.s(bundle2.get(ES6Iterator.VALUE_PROPERTY));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(ES6Iterator.VALUE_PROPERTY);
        l6f l6fVar = lteVar.E;
        yoe yoeVar = lteVar.F;
        ppe ppeVar2 = lteVar.f;
        lte.k(l6fVar);
        if (l6fVar.h1(string) == 0) {
            lte.k(l6fVar);
            if (l6fVar.m0(obj, string) == 0) {
                Object n0 = l6fVar.n0(obj, string);
                if (n0 == null) {
                    lte.m(ppeVar2);
                    ppeVar2.f.g(yoeVar.c(string), obj, "Unable to normalize conditional user property value");
                    return;
                }
                obe.D(bundle2, n0);
                long j2 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
                    lte.m(ppeVar2);
                    ppeVar2.f.g(yoeVar.c(string), Long.valueOf(j2), "Invalid conditional user property timeout");
                    return;
                }
                long j3 = bundle2.getLong("time_to_live");
                if (j3 <= 15552000000L && j3 >= 1) {
                    ete eteVar = lteVar.C;
                    lte.m(eteVar);
                    eteVar.g0(new bye(this, bundle2, 0));
                    return;
                }
                lte.m(ppeVar2);
                ppeVar2.f.g(yoeVar.c(string), Long.valueOf(j3), "Invalid conditional user property time to live");
                return;
            }
            lte.m(ppeVar2);
            ppeVar2.f.g(yoeVar.c(string), obj, "Invalid conditional user property value");
            return;
        }
        lte.m(ppeVar2);
        ppeVar2.f.f(yoeVar.c(string), "Invalid conditional user property name");
    }

    public final void l0(String str, String str2, Bundle bundle) {
        lte lteVar = (lte) this.a;
        lteVar.G.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        am8.p(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        ete eteVar = lteVar.C;
        lte.m(eteVar);
        eteVar.g0(new bye(this, bundle2, 1));
    }

    public final String m0() {
        lte lteVar = (lte) this.a;
        try {
            return bce.q(lteVar.a, lteVar.L);
        } catch (IllegalStateException e) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.f.f(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void n0(hwe hweVar, long j, boolean z) {
        int i = hweVar.b;
        W();
        Y();
        lte lteVar = (lte) this.a;
        dre dreVar = lteVar.e;
        ppe ppeVar = lteVar.f;
        lte.k(dreVar);
        hwe e0 = dreVar.e0();
        if (j <= this.L && hwe.l(e0.b, i)) {
            lte.m(ppeVar);
            ppeVar.H.f(hweVar, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        dre dreVar2 = lteVar.e;
        lte.k(dreVar2);
        dreVar2.W();
        if (hwe.l(i, dreVar2.b0().getInt("consent_source", 100))) {
            SharedPreferences.Editor edit = dreVar2.b0().edit();
            edit.putString("consent_settings", hweVar.g());
            edit.putInt("consent_source", i);
            edit.apply();
            lte.m(ppeVar);
            ppeVar.J.f(hweVar, "Setting storage consent(FE)");
            this.L = j;
            if (lteVar.p().h0()) {
                w2f p = lteVar.p();
                p.W();
                p.Y();
                p.l0(new p2f(p, 2));
            } else {
                w2f p2 = lteVar.p();
                p2.W();
                p2.Y();
                if (p2.g0()) {
                    p2.l0(new o1f(p2, p2.n0(false)));
                }
            }
            if (z) {
                lteVar.p().b0(new AtomicReference());
                return;
            }
            return;
        }
        lte.m(ppeVar);
        ppeVar.H.f(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
    }

    public final void o0(Boolean bool, boolean z) {
        W();
        Y();
        lte lteVar = (lte) this.a;
        ppe ppeVar = lteVar.f;
        lte.m(ppeVar);
        ppeVar.I.f(bool, "Setting app measurement enabled (FE)");
        dre dreVar = lteVar.e;
        lte.k(dreVar);
        dreVar.W();
        SharedPreferences.Editor edit = dreVar.b0().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z) {
            dreVar.W();
            SharedPreferences.Editor edit2 = dreVar.b0().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        ete eteVar = lteVar.C;
        lte.m(eteVar);
        eteVar.W();
        if (!lteVar.V && (bool == null || bool.booleanValue())) {
            return;
        }
        p0();
    }

    public final void p0() {
        long j;
        W();
        lte lteVar = (lte) this.a;
        dre dreVar = lteVar.e;
        ppe ppeVar = lteVar.f;
        kh5 kh5Var = lteVar.G;
        lte.k(dreVar);
        String k = dreVar.I.k();
        if (k != null) {
            if ("unset".equals(k)) {
                kh5Var.getClass();
                i0(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                if (true != "true".equals(k)) {
                    j = 0;
                } else {
                    j = 1;
                }
                Long valueOf = Long.valueOf(j);
                kh5Var.getClass();
                i0(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (lteVar.a() && this.N) {
            lte.m(ppeVar);
            ppeVar.I.e("Recording app launch after enabling measurement for the first time (FE)");
            j0();
            f4f f4fVar = lteVar.D;
            lte.l(f4fVar);
            f4fVar.e.A();
            ete eteVar = lteVar.C;
            lte.m(eteVar);
            eteVar.g0(new ywe(this, 1));
            return;
        }
        lte.m(ppeVar);
        ppeVar.I.e("Updating Scion state (FE)");
        w2f p = lteVar.p();
        p.W();
        p.Y();
        p.l0(new o1f(p, p.n0(true), 3));
    }

    public final void q0() {
        lte lteVar = (lte) this.a;
        if ((lteVar.a.getApplicationContext() instanceof Application) && this.c != null) {
            ((Application) lteVar.a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    public final void r0(Bundle bundle, int i, long j) {
        Boolean bool;
        String str;
        yve yveVar;
        String str2;
        Boolean bool2;
        lte lteVar = (lte) this.a;
        Y();
        hwe hweVar = hwe.c;
        dwe[] dweVarArr = awe.STORAGE.a;
        int length = dweVarArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 < length) {
                String str3 = dweVarArr[i2].a;
                if (bundle.containsKey(str3) && (str = bundle.getString(str3)) != null) {
                    if (str.equals("granted")) {
                        bool2 = Boolean.TRUE;
                    } else if (str.equals("denied")) {
                        bool2 = Boolean.FALSE;
                    } else {
                        bool2 = null;
                    }
                    if (bool2 == null) {
                        break;
                    }
                }
                i2++;
            } else {
                str = null;
                break;
            }
        }
        if (str != null) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.G.f(str, "Ignoring invalid consent setting");
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.G.e("Valid consent values are 'granted', 'denied'");
        }
        ete eteVar = lteVar.C;
        lte.m(eteVar);
        boolean d0 = eteVar.d0();
        hwe b = hwe.b(i, bundle);
        Iterator it = b.a.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            yveVar = yve.UNINITIALIZED;
            if (!hasNext) {
                break;
            } else if (((yve) it.next()) != yveVar) {
                t0(b, d0);
                break;
            }
        }
        qae c = qae.c(i, bundle);
        Iterator it2 = c.e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((yve) it2.next()) != yveVar) {
                s0(c, d0);
                break;
            }
        }
        if (bundle != null) {
            int ordinal = hwe.d(bundle.getString("ad_personalization")).ordinal();
            if (ordinal != 2) {
                if (ordinal == 3) {
                    bool = Boolean.TRUE;
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        if (bool != null) {
            if (i == -30) {
                str2 = "tcf";
            } else {
                str2 = "app";
            }
            if (d0) {
                i0(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                h0(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void s0(qae qaeVar, boolean z) {
        bv4 bv4Var = new bv4(this, false, qaeVar, 26);
        if (z) {
            W();
            bv4Var.run();
            return;
        }
        ete eteVar = ((lte) this.a).C;
        lte.m(eteVar);
        eteVar.g0(bv4Var);
    }

    public final void t0(hwe hweVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        hwe hweVar2;
        Y();
        int i = hweVar.b;
        if (i != -10) {
            yve yveVar = (yve) hweVar.a.get(dwe.AD_STORAGE);
            if (yveVar == null) {
                yveVar = yve.UNINITIALIZED;
            }
            yve yveVar2 = yve.UNINITIALIZED;
            if (yveVar == yveVar2) {
                yve yveVar3 = (yve) hweVar.a.get(dwe.ANALYTICS_STORAGE);
                if (yveVar3 == null) {
                    yveVar3 = yveVar2;
                }
                if (yveVar3 == yveVar2) {
                    ppe ppeVar = ((lte) this.a).f;
                    lte.m(ppeVar);
                    ppeVar.G.e("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.D) {
            try {
                z2 = false;
                if (hwe.l(i, this.J.b)) {
                    hwe hweVar3 = this.J;
                    EnumMap enumMap = hweVar.a;
                    dwe[] dweVarArr = (dwe[]) enumMap.keySet().toArray(new dwe[0]);
                    int length = dweVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            dwe dweVar = dweVarArr[i2];
                            yve yveVar4 = (yve) enumMap.get(dweVar);
                            yve yveVar5 = (yve) hweVar3.a.get(dweVar);
                            yve yveVar6 = yve.DENIED;
                            if (yveVar4 == yveVar6 && yveVar5 != yveVar6) {
                                z3 = true;
                                break;
                            }
                            i2++;
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                    dwe dweVar2 = dwe.ANALYTICS_STORAGE;
                    if (hweVar.i(dweVar2) && !this.J.i(dweVar2)) {
                        z2 = true;
                    }
                    hweVar = hweVar.k(this.J);
                    this.J = hweVar;
                    z4 = z2;
                    z2 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                hweVar2 = hweVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            ppe ppeVar2 = ((lte) this.a).f;
            lte.m(ppeVar2);
            ppeVar2.H.f(hweVar2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.K.getAndIncrement();
        if (z3) {
            this.C.set(null);
            xye xyeVar = new xye(this, hweVar2, andIncrement, z4, 0);
            if (z) {
                W();
                xyeVar.run();
                return;
            }
            ete eteVar = ((lte) this.a).C;
            lte.m(eteVar);
            eteVar.i0(xyeVar);
            return;
        }
        xye xyeVar2 = new xye(this, hweVar2, andIncrement, z4, 1);
        if (z) {
            W();
            xyeVar2.run();
        } else if (i != 30 && i != -10) {
            ete eteVar2 = ((lte) this.a).C;
            lte.m(eteVar2);
            eteVar2.g0(xyeVar2);
        } else {
            ete eteVar3 = ((lte) this.a).C;
            lte.m(eteVar3);
            eteVar3.i0(xyeVar2);
        }
    }

    public final void u0() {
        q5e.a();
        lte lteVar = (lte) this.a;
        t7e t7eVar = lteVar.d;
        ete eteVar = lteVar.C;
        ppe ppeVar = lteVar.f;
        if (t7eVar.i0(null, yme.P0)) {
            lte.m(eteVar);
            if (!eteVar.d0()) {
                if (!jf8.b()) {
                    Y();
                    lte.m(ppeVar);
                    ppeVar.J.e("Getting trigger URIs (FE)");
                    AtomicReference atomicReference = new AtomicReference();
                    lte.m(eteVar);
                    eteVar.h0(atomicReference, 10000L, "get trigger URIs", new sxe(this, atomicReference, 5, false));
                    final List list = (List) atomicReference.get();
                    if (list == null) {
                        lte.m(ppeVar);
                        ppeVar.D.e("Timed out waiting for get trigger URIs");
                        return;
                    }
                    lte.m(eteVar);
                    eteVar.g0(new Runnable() { // from class: jze
                        @Override // java.lang.Runnable
                        public final void run() {
                            yze yzeVar = yze.this;
                            yzeVar.W();
                            if (Build.VERSION.SDK_INT < 30) {
                                return;
                            }
                            dre dreVar = ((lte) yzeVar.a).e;
                            lte.k(dreVar);
                            SparseArray d0 = dreVar.d0();
                            for (p4f p4fVar : list) {
                                int i = p4fVar.c;
                                if (!d0.contains(i) || ((Long) d0.get(i)).longValue() < p4fVar.b) {
                                    yzeVar.v0().add(p4fVar);
                                }
                            }
                            yzeVar.w0();
                        }
                    });
                    return;
                }
                lte.m(ppeVar);
                ppeVar.f.e("Cannot get trigger URIs from main thread");
                return;
            }
            lte.m(ppeVar);
            ppeVar.f.e("Cannot get trigger URIs from analytics worker thread");
        }
    }

    public final PriorityQueue v0() {
        if (this.I == null) {
            this.I = new PriorityQueue(Comparator.comparing(lze.a, roa.c));
        }
        return this.I;
    }

    public final void w0() {
        p4f p4fVar;
        W();
        if (!v0().isEmpty() && !this.E && (p4fVar = (p4f) v0().poll()) != null) {
            lte lteVar = (lte) this.a;
            l6f l6fVar = lteVar.E;
            lte.k(l6fVar);
            k37 t0 = l6fVar.t0();
            if (t0 != null) {
                this.E = true;
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                s56 s56Var = ppeVar.J;
                String str = p4fVar.a;
                s56Var.f(str, "Registering trigger URI");
                ListenableFuture e = t0.e(Uri.parse(str));
                if (e == null) {
                    this.E = false;
                    v0().add(p4fVar);
                    return;
                }
                e.a(new bv4(0, e, new rwa(this, false, p4fVar, 22)), new p35(this, 3));
            }
        }
    }

    public final void x0(hwe hweVar) {
        boolean z;
        Boolean bool;
        W();
        if ((hweVar.i(dwe.ANALYTICS_STORAGE) && hweVar.i(dwe.AD_STORAGE)) || ((lte) this.a).p().g0()) {
            z = true;
        } else {
            z = false;
        }
        lte lteVar = (lte) this.a;
        ete eteVar = lteVar.C;
        lte.m(eteVar);
        eteVar.W();
        if (z != lteVar.V) {
            ete eteVar2 = lteVar.C;
            lte.m(eteVar2);
            eteVar2.W();
            lteVar.V = z;
            dre dreVar = ((lte) this.a).e;
            lte.k(dreVar);
            dreVar.W();
            if (dreVar.b0().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(dreVar.b0().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z || bool == null || bool.booleanValue()) {
                o0(Boolean.valueOf(z), false);
            }
        }
    }
}
