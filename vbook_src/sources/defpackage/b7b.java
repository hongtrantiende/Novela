package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b7b  reason: default package */
/* loaded from: classes.dex */
public final class b7b {
    public Map A;
    public final qw6 a;
    public final hq7 b;
    public final bp9 c;
    public final k7b d;
    public final k7b e;
    public m41 f;
    public z8c g;
    public v7c h;
    public final k57 i;
    public iya j;
    public final pga k;
    public long l;
    public long m;
    public final an9 n;
    public g7b o;
    public final int p;
    public final u7c q;
    public boolean r;
    public xn6 s;
    public List t;
    public wn5 u;
    public boolean v;
    public List w;
    public List x;
    public int y;
    public vy5 z;

    public b7b(qw6 qw6Var, hq7 hq7Var, bp9 bp9Var, k7b k7bVar, k7b k7bVar2) {
        qw6Var.getClass();
        this.a = qw6Var;
        this.b = hq7Var;
        this.c = bp9Var;
        this.d = k7bVar;
        this.e = k7bVar2;
        this.i = new k57(11, false);
        this.k = qga.a(0, 7, null);
        long j = az5.b;
        this.l = j;
        this.m = j;
        this.n = new an9(this, 2);
        this.p = 39;
        this.q = u7c.a;
        ks3 ks3Var = ks3.a;
        this.t = ks3Var;
        this.w = ks3Var;
        this.x = ks3Var;
        this.z = vy5.e;
        this.A = ls3.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022c  */
    /* JADX WARN: Type inference failed for: r11v18, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v30, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [xl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(defpackage.b7b r33, final java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 1179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b7b.e(b7b, java.lang.String):void");
    }

    public final void a(String str) {
        iya iyaVar = this.j;
        if (iyaVar != null && iyaVar.isActive()) {
            k27.o(iyaVar, "cleanTileDecoder:".concat(str), null);
            this.j = null;
        }
        v7c v7cVar = this.h;
        wn5 wn5Var = this.u;
        if (v7cVar != null) {
            qw6 qw6Var = this.a;
            qw6Var.getClass();
            mw6 mw6Var = mw6.b;
            if (qw6Var.a(mw6Var)) {
                StringBuilder o = a82.o("SubsamplingState. cleanTileDecoder:", str, ". '");
                o.append(c());
                o.append('\'');
                String sb = o.toString();
                pj pjVar = qw6Var.b;
                String str2 = qw6Var.a;
                pjVar.getClass();
                pj.a(mw6Var, str2, sb);
            }
            sw2 sw2Var = ab3.a;
            z87.v(jz4.a, ru2.c, null, new rg0(v7cVar, null, 22), 2);
            this.h = null;
        }
        if (wn5Var != null) {
            this.u = null;
        }
        if (v7cVar != null || wn5Var != null) {
            d(str);
        }
        this.c.z(az5.b);
    }

    public final void b(String str) {
        z8c z8cVar = this.g;
        if (z8cVar != null) {
            qw6 qw6Var = this.a;
            qw6Var.getClass();
            mw6 mw6Var = mw6.b;
            if (qw6Var.a(mw6Var)) {
                StringBuilder o = a82.o("SubsamplingState. cleanTileManager:", str, ". '");
                o.append(c());
                o.append('\'');
                String sb = o.toString();
                pj pjVar = qw6Var.b;
                String str2 = qw6Var.a;
                pjVar.getClass();
                pj.a(mw6Var, str2, sb);
            }
            z8cVar.a(str);
            this.g = null;
            this.A = ls3.a;
            ks3 ks3Var = ks3.a;
            this.w = ks3Var;
            this.x = ks3Var;
            this.y = 0;
            this.z = vy5.e;
            d(str);
            this.e.invoke(this);
        }
    }

    public final String c() {
        String a;
        g7b g7bVar = this.o;
        if (g7bVar != null && (a = g7bVar.a()) != null) {
            return a;
        }
        return "null";
    }

    public final void d(final String str) {
        final boolean z;
        final boolean z2;
        final boolean z3;
        final boolean z4;
        if (this.u != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.g != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.h != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z5 = this.r;
        final boolean z6 = !z5;
        if (z && z2 && z3 && !z5) {
            z4 = true;
        } else {
            z4 = false;
        }
        vt4 vt4Var = new vt4() { // from class: y6b
            @Override // defpackage.vt4
            public final Object invoke() {
                StringBuilder sb = new StringBuilder("SubsamplingState. refreshReadyState:");
                sb.append(str);
                sb.append(". ready=");
                sb.append(z4);
                sb.append(", imageInfoReady=");
                rs8.z(sb, z, ", tileManagerReady=", z2, ", tileDecoderReady=");
                rs8.z(sb, z3, ", stoppedReady=", z6, ". '");
                sb.append(b7b.this.c());
                sb.append('\'');
                return sb.toString();
            }
        };
        qw6 qw6Var = this.a;
        qw6Var.getClass();
        qw6Var.b(mw6.b, vt4Var);
        this.v = z4;
        this.d.invoke(this);
        m41 m41Var = this.f;
        if (m41Var != null) {
            z87.v(m41Var, null, null, new koa(this, str, null, 6), 3);
        }
    }

    public final void f(String str) {
        b(str);
        a(str);
        g7b g7bVar = this.o;
        long j = this.m;
        m41 m41Var = this.f;
        if (g7bVar != null && !eh.q(j) && m41Var != null) {
            this.j = z87.v(m41Var, null, null, new o0(this, g7bVar, j, str, (m42) null, 8), 3);
            return;
        }
        t6b t6bVar = new t6b(this, str, g7bVar, j, m41Var);
        qw6 qw6Var = this.a;
        qw6Var.getClass();
        qw6Var.b(mw6.b, t6bVar);
    }

    public final void g(final String str) {
        b(str);
        final g7b g7bVar = this.o;
        final v7c v7cVar = this.h;
        wn5 wn5Var = this.u;
        final long j = this.l;
        final long j2 = this.m;
        mw6 mw6Var = mw6.b;
        qw6 qw6Var = this.a;
        if (g7bVar != null && v7cVar != null && wn5Var != null && !eh.q(j) && !eh.q(j2)) {
            z8c z8cVar = new z8c(this.a, g7bVar, v7cVar, this.b, this.i, wn5Var, j2, j, new w6b(this, 0), new w6b(this, 1), new w6b(this, 2));
            final wn5 wn5Var2 = wn5Var;
            z8cVar.q = this.p;
            u7c u7cVar = this.q;
            u7cVar.getClass();
            z8cVar.r = u7cVar;
            ArrayList arrayList = z8cVar.s;
            int k = p17.k(tl1.s(arrayList, 10));
            if (k < 16) {
                k = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(k);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                hx9 hx9Var = (hx9) obj;
                Integer valueOf = Integer.valueOf(hx9Var.a);
                long j3 = ((t7c) sl1.j0(hx9Var.b)).a;
                linkedHashMap.put(valueOf, new qy5(uaf.e(((int) (j3 >> 32)) + 1, ((int) (j3 & 4294967295L)) + 1)));
                wn5Var2 = wn5Var2;
                z8cVar = z8cVar;
            }
            final z8c z8cVar2 = z8cVar;
            this.A = linkedHashMap;
            vt4 vt4Var = new vt4(this) { // from class: x6b
                @Override // defpackage.vt4
                public final Object invoke() {
                    StringBuilder o = a82.o("SubsamplingState. resetTileManager:", str, ". success. imageInfo=");
                    o.append(wn5Var2.a());
                    o.append(". preferredTileSize=");
                    o.append(eh.C(j));
                    o.append(", tileGridMap=");
                    o.append(ase.A(z8cVar2.s));
                    o.append(". '");
                    o.append(g7bVar.a());
                    o.append('\'');
                    return o.toString();
                }
            };
            qw6Var.getClass();
            qw6Var.b(mw6Var, vt4Var);
            this.g = z8cVar2;
            d(str);
            return;
        }
        vt4 vt4Var2 = new vt4() { // from class: v6b
            @Override // defpackage.vt4
            public final Object invoke() {
                return "SubsamplingState. resetTileManager:" + str + ". skipped. parameters are not ready yet. subsamplingImage=" + g7bVar + ", contentSize=" + eh.C(j2) + ", preferredTileSize=" + eh.C(j) + ", tileDecoder=" + v7cVar + ", '" + b7b.this.c() + '\'';
            }
        };
        qw6Var.getClass();
        qw6Var.b(mw6Var, vt4Var2);
    }

    public final boolean h(g7b g7bVar) {
        zr1.A();
        if (c16.i(this.o, g7bVar)) {
            return false;
        }
        qw6 qw6Var = this.a;
        qw6Var.getClass();
        mw6 mw6Var = mw6.b;
        if (qw6Var.a(mw6Var)) {
            pj pjVar = qw6Var.b;
            String str = qw6Var.a;
            pjVar.getClass();
            pj.a(mw6Var, str, "SubsamplingState. setImage. '" + this.o + "' -> '" + g7bVar + '\'');
        }
        a("setImage");
        b("setImage");
        this.o = g7bVar;
        if (this.f != null && g7bVar != null) {
            f("setImage");
            return true;
        }
        return true;
    }
}
