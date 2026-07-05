package defpackage;

import android.util.Log;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eha  reason: default package */
/* loaded from: classes.dex */
public final class eha {
    public final wba a;
    public final eba b;
    public final dba c;
    public final t9c d;
    public final ng2 e;
    public final n69 f;
    public final d82 g;
    public vaa h;
    public boolean i;
    public boolean j;
    public String k;

    public eha(wba wbaVar, eba ebaVar, dba dbaVar, t9c t9cVar, ng2 ng2Var, n69 n69Var, d82 d82Var) {
        wbaVar.getClass();
        ebaVar.getClass();
        dbaVar.getClass();
        t9cVar.getClass();
        ng2Var.getClass();
        n69Var.getClass();
        d82Var.getClass();
        this.a = wbaVar;
        this.b = ebaVar;
        this.c = dbaVar;
        this.d = t9cVar;
        this.e = ng2Var;
        this.f = n69Var;
        this.g = d82Var;
        this.k = "";
        z87.v(k27.a(d82Var), null, null, new aha(this, null, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.eha r5, java.lang.String r6, defpackage.bha r7, defpackage.m42 r8) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eha.a(eha, java.lang.String, bha, m42):java.lang.Object");
    }

    public final void b() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        z87.v(k27.a(this.g), null, null, new aha(this, null, 1), 3);
    }

    public final void c() {
        this.i = true;
        vaa vaaVar = this.h;
        if (vaaVar == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
        } else if (vaaVar != null) {
            Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
            if (!e(vaaVar) && !d(vaaVar)) {
                return;
            }
            z87.v(k27.a(this.g), null, null, new z38(this, vaaVar, null, 25), 3);
        } else {
            c16.w("localSessionData");
            throw null;
        }
    }

    public final boolean d(vaa vaaVar) {
        Map map = vaaVar.c;
        boolean z = true;
        n69 n69Var = this.f;
        if (map != null) {
            n69Var.getClass();
            l69 l69Var = (l69) map.get(n69Var.a());
            if (l69Var != null && l69Var.a == n69Var.c && c16.i(l69Var.b, (String) n69Var.d.getValue())) {
                z = false;
            }
            if (z) {
                Log.d("FirebaseSessions", "Process " + n69Var.a() + " is stale");
            }
            return z;
        }
        Log.d("FirebaseSessions", "No process data for " + n69Var.a());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (defpackage.wl3.g(r8) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (defpackage.wl3.g(r8) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.vaa r11) {
        /*
            r10 = this;
            f9c r0 = r11.b
            zaa r11 = r11.a
            java.lang.String r1 = "Session "
            java.lang.String r2 = "FirebaseSessions"
            r3 = 0
            if (r0 == 0) goto L77
            t9c r4 = r10.d
            r4.getClass()
            f9c r4 = defpackage.t9c.a()
            hq7 r5 = defpackage.wl3.b
            long r4 = r4.a
            long r6 = r0.a
            long r4 = r4 - r6
            am3 r0 = defpackage.am3.MILLISECONDS
            long r4 = defpackage.jue.P(r4, r0)
            wba r10 = r10.a
            fea r0 = r10.a
            wl3 r0 = r0.c()
            r6 = 0
            if (r0 == 0) goto L3a
            long r8 = r0.a
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L3a
            boolean r0 = defpackage.wl3.g(r8)
            if (r0 != 0) goto L3a
            goto L57
        L3a:
            fea r10 = r10.b
            wl3 r10 = r10.c()
            if (r10 == 0) goto L4f
            long r8 = r10.a
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto L4f
            boolean r10 = defpackage.wl3.g(r8)
            if (r10 != 0) goto L4f
            goto L57
        L4f:
            r10 = 30
            am3 r0 = defpackage.am3.MINUTES
            long r8 = defpackage.jue.O(r10, r0)
        L57:
            int r10 = defpackage.wl3.c(r4, r8)
            if (r10 <= 0) goto L5e
            r3 = 1
        L5e:
            if (r3 == 0) goto L76
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r1)
            java.lang.String r11 = r11.a
            r10.append(r11)
            java.lang.String r11 = " is expired"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r2, r10)
        L76:
            return r3
        L77:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r1)
            java.lang.String r11 = r11.a
            r10.append(r11)
            java.lang.String r11 = " has not backgrounded yet"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r2, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eha.e(vaa):boolean");
    }
}
