package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a25  reason: default package */
/* loaded from: classes.dex */
public final class a25 implements d0a, vb8, qy3 {
    public static final String K = r95.r("GreedyScheduler");
    public final v69 C;
    public final rwa D;
    public final xy1 E;
    public Boolean G;
    public final hy H;
    public final omd I;
    public final oaa J;
    public final Context a;
    public final e03 c;
    public boolean d;
    public final HashMap b = new HashMap();
    public final Object e = new Object();
    public final s26 f = new s26(new r18(2));
    public final HashMap F = new HashMap();

    public a25(Context context, xy1 xy1Var, ojc ojcVar, v69 v69Var, rwa rwaVar, omd omdVar) {
        this.a = context;
        mce mceVar = xy1Var.g;
        this.c = new e03(this, mceVar, xy1Var.d);
        this.J = new oaa(mceVar, rwaVar);
        this.I = omdVar;
        this.H = new hy(ojcVar);
        this.E = xy1Var;
        this.C = v69Var;
        this.D = rwaVar;
    }

    @Override // defpackage.vb8
    public final void a(ymd ymdVar, d12 d12Var) {
        hmd s = dxe.s(ymdVar);
        boolean z = d12Var instanceof b12;
        rwa rwaVar = this.D;
        oaa oaaVar = this.J;
        String str = K;
        s26 s26Var = this.f;
        if (z) {
            if (!s26Var.r(s)) {
                r95 n = r95.n();
                n.c(str, "Constraints met: Scheduling work ID " + s);
                qya T = s26Var.T(s);
                oaaVar.S(T);
                rwaVar.getClass();
                rwaVar.t(T, null);
                return;
            }
            return;
        }
        r95 n2 = r95.n();
        n2.c(str, "Constraints not met: Cancelling work ID " + s);
        qya N = s26Var.N(s);
        if (N != null) {
            oaaVar.p(N);
            int i = ((c12) d12Var).a;
            rwaVar.getClass();
            rwaVar.u(N, i);
        }
    }

    @Override // defpackage.qy3
    public final void b(hmd hmdVar, boolean z) {
        w26 w26Var;
        qya N = this.f.N(hmdVar);
        if (N != null) {
            this.J.p(N);
        }
        synchronized (this.e) {
            w26Var = (w26) this.b.remove(hmdVar);
        }
        if (w26Var != null) {
            r95 n = r95.n();
            String str = K;
            n.c(str, "Stopping tracking for " + hmdVar);
            w26Var.cancel(null);
        }
        if (!z) {
            synchronized (this.e) {
                this.F.remove(hmdVar);
            }
        }
    }

    @Override // defpackage.d0a
    public final boolean c() {
        return false;
    }

    @Override // defpackage.d0a
    public final void d(String str) {
        List<qya> c;
        Runnable runnable;
        String str2 = K;
        if (this.G == null) {
            this.G = Boolean.valueOf(u69.a(this.a, this.E));
        }
        if (!this.G.booleanValue()) {
            r95.n().p(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.d) {
            this.C.a(this);
            this.d = true;
        }
        r95 n = r95.n();
        n.c(str2, "Cancelling work ID " + str);
        e03 e03Var = this.c;
        if (e03Var != null && (runnable = (Runnable) e03Var.d.remove(str)) != null) {
            ((Handler) e03Var.b.a).removeCallbacks(runnable);
        }
        s26 s26Var = this.f;
        s26Var.getClass();
        str.getClass();
        synchronized (s26Var.c) {
            c = ((r18) s26Var.b).c(str);
        }
        for (qya qyaVar : c) {
            this.J.p(qyaVar);
            rwa rwaVar = this.D;
            rwaVar.getClass();
            rwaVar.u(qyaVar, -512);
        }
    }

    @Override // defpackage.d0a
    public final void e(ymd... ymdVarArr) {
        long max;
        if (this.G == null) {
            this.G = Boolean.valueOf(u69.a(this.a, this.E));
        }
        if (!this.G.booleanValue()) {
            r95.n().p(K, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.d) {
            this.C.a(this);
            this.d = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (ymd ymdVar : ymdVarArr) {
            if (!this.f.r(dxe.s(ymdVar))) {
                synchronized (this.e) {
                    try {
                        hmd s = dxe.s(ymdVar);
                        z15 z15Var = (z15) this.F.get(s);
                        if (z15Var == null) {
                            int i = ymdVar.k;
                            this.E.d.getClass();
                            z15Var = new z15(i, System.currentTimeMillis());
                            this.F.put(s, z15Var);
                        }
                        max = (Math.max((ymdVar.k - z15Var.a) - 5, 0) * 30000) + z15Var.b;
                    } finally {
                    }
                }
                long max2 = Math.max(ymdVar.a(), max);
                this.E.d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (ymdVar.b == jmd.a) {
                    if (currentTimeMillis < max2) {
                        e03 e03Var = this.c;
                        if (e03Var != null) {
                            mce mceVar = e03Var.b;
                            HashMap hashMap = e03Var.d;
                            Runnable runnable = (Runnable) hashMap.remove(ymdVar.a);
                            if (runnable != null) {
                                ((Handler) mceVar.a).removeCallbacks(runnable);
                            }
                            bv4 bv4Var = new bv4(e03Var, false, ymdVar, 3);
                            hashMap.put(ymdVar.a, bv4Var);
                            e03Var.c.getClass();
                            ((Handler) mceVar.a).postDelayed(bv4Var, max2 - System.currentTimeMillis());
                        }
                    } else if (!c16.i(w02.j, ymdVar.j)) {
                        w02 w02Var = ymdVar.j;
                        if (w02Var.d) {
                            r95.n().c(K, "Ignoring " + ymdVar + ". Requires device idle.");
                        } else if (!w02Var.i.isEmpty()) {
                            r95.n().c(K, "Ignoring " + ymdVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(ymdVar);
                            hashSet2.add(ymdVar.a);
                        }
                    } else if (!this.f.r(dxe.s(ymdVar))) {
                        r95.n().c(K, "Starting work for " + ymdVar.a);
                        s26 s26Var = this.f;
                        s26Var.getClass();
                        qya T = s26Var.T(dxe.s(ymdVar));
                        this.J.S(T);
                        rwa rwaVar = this.D;
                        rwaVar.getClass();
                        rwaVar.t(T, null);
                    }
                }
            }
        }
        synchronized (this.e) {
            try {
                if (!hashSet.isEmpty()) {
                    r95.n().c(K, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ymd ymdVar2 = (ymd) it.next();
                        hmd s2 = dxe.s(ymdVar2);
                        if (!this.b.containsKey(s2)) {
                            this.b.put(s2, zld.a(this.H, ymdVar2, this.I.b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }
}
