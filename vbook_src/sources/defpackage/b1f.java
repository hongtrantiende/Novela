package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b1f  reason: default package */
/* loaded from: classes.dex */
public final class b1f extends fne {
    public ahe C;
    public volatile boolean D;
    public volatile s0f E;
    public s0f F;
    public boolean G;
    public final Object H;
    public volatile s0f c;
    public volatile s0f d;
    public s0f e;
    public final ConcurrentHashMap f;

    public b1f(lte lteVar) {
        super(lteVar);
        this.H = new Object();
        this.f = new ConcurrentHashMap();
    }

    @Override // defpackage.fne
    public final boolean a0() {
        return false;
    }

    public final s0f b0(boolean z) {
        Y();
        W();
        s0f s0fVar = this.e;
        if (!z) {
            return s0fVar;
        }
        if (s0fVar != null) {
            return s0fVar;
        }
        return this.F;
    }

    public final String c0(String str) {
        String str2;
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        lte lteVar = (lte) this.a;
        int length2 = str2.length();
        lteVar.d.getClass();
        if (length2 > 500) {
            lteVar.d.getClass();
            return str2.substring(0, 500);
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0(defpackage.s0f r20, defpackage.s0f r21, long r22, boolean r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1f.d0(s0f, s0f, long, boolean, android.os.Bundle):void");
    }

    public final void e0(ahe aheVar, Bundle bundle) {
        Bundle bundle2;
        if (((lte) this.a).d.m0() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f.put(Integer.valueOf(aheVar.a), new s0f(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
        }
    }

    public final void f0(String str, s0f s0fVar, boolean z) {
        s0f s0fVar2;
        s0f s0fVar3;
        String str2;
        if (this.c == null) {
            s0fVar2 = this.d;
        } else {
            s0fVar2 = this.c;
        }
        s0f s0fVar4 = s0fVar2;
        if (s0fVar.b == null) {
            if (str != null) {
                str2 = c0(str);
            } else {
                str2 = null;
            }
            s0fVar3 = new s0f(s0fVar.a, str2, s0fVar.c, s0fVar.e, s0fVar.f, s0fVar.g);
        } else {
            s0fVar3 = s0fVar;
        }
        this.d = this.c;
        this.c = s0fVar3;
        lte lteVar = (lte) this.a;
        lteVar.G.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ete eteVar = lteVar.C;
        lte.m(eteVar);
        eteVar.g0(new u0f(this, s0fVar3, s0fVar4, elapsedRealtime, z));
    }

    public final void g0(s0f s0fVar, boolean z, long j) {
        boolean z2;
        lte lteVar = (lte) this.a;
        gge ggeVar = lteVar.J;
        lte.j(ggeVar);
        lteVar.G.getClass();
        ggeVar.a0(SystemClock.elapsedRealtime());
        if (s0fVar != null && s0fVar.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        f4f f4fVar = lteVar.D;
        lte.l(f4fVar);
        if (f4fVar.f.n(j, z2, z) && s0fVar != null) {
            s0fVar.d = false;
        }
    }

    public final s0f h0(ahe aheVar) {
        am8.s(aheVar);
        Integer valueOf = Integer.valueOf(aheVar.a);
        ConcurrentHashMap concurrentHashMap = this.f;
        s0f s0fVar = (s0f) concurrentHashMap.get(valueOf);
        if (s0fVar == null) {
            String c0 = c0(aheVar.b);
            l6f l6fVar = ((lte) this.a).E;
            lte.k(l6fVar);
            s0f s0fVar2 = new s0f(l6fVar.W0(), null, c0);
            concurrentHashMap.put(valueOf, s0fVar2);
            s0fVar = s0fVar2;
        }
        if (this.E != null) {
            return this.E;
        }
        return s0fVar;
    }
}
