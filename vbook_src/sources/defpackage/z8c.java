package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z8c  reason: default package */
/* loaded from: classes.dex */
public final class z8c {
    public final qw6 a;
    public final g7b b;
    public final v7c c;
    public final k57 d;
    public final wn5 e;
    public final long f;
    public final long g;
    public final w6b h;
    public final w6b i;
    public final w6b j;
    public final f82 k;
    public final m41 l;
    public Float m;
    public int n;
    public vy5 o;
    public w26 p;
    public int q;
    public u7c r;
    public final ArrayList s;
    public int t;
    public vy5 u;
    public List v;
    public List w;

    public z8c(qw6 qw6Var, g7b g7bVar, v7c v7cVar, hq7 hq7Var, k57 k57Var, wn5 wn5Var, long j, long j2, w6b w6bVar, w6b w6bVar2, w6b w6bVar3) {
        long e;
        qw6Var.getClass();
        g7bVar.getClass();
        v7cVar.getClass();
        wn5Var.getClass();
        this.a = qw6Var;
        this.b = g7bVar;
        this.c = v7cVar;
        this.d = k57Var;
        this.e = wn5Var;
        this.f = j;
        this.g = j2;
        this.h = w6bVar;
        this.i = w6bVar2;
        this.j = w6bVar3;
        sw2 sw2Var = ab3.a;
        this.k = ru2.c.j0(2);
        this.l = k27.a(nq2.C(rse.b(), zz6.a));
        this.q = 39;
        this.r = u7c.a;
        this.u = vy5.e;
        ks3 ks3Var = ks3.a;
        this.v = ks3Var;
        this.w = ks3Var;
        long j3 = wn5Var.a;
        int w = nq2.w(1.0f, j3, j);
        ArrayList arrayList = new ArrayList();
        int i = az5.c;
        char c = ' ';
        int i2 = (int) (j3 >> 32);
        long j4 = 4294967295L;
        int i3 = (int) (j3 & 4294967295L);
        int i4 = 1;
        if (i2 > i3) {
            int A = k27.A((i3 / i2) * 50.0f);
            e = uaf.e(50, A < 1 ? 1 : A);
        } else {
            int A2 = k27.A((i2 / i3) * 50.0f);
            e = uaf.e(A2 < 1 ? 1 : A2, 50);
        }
        int i5 = 1;
        while (true) {
            int i6 = az5.c;
            float f = i2;
            float f2 = i5;
            char c2 = c;
            int ceil = (int) Math.ceil((f / f2) / ((int) (j2 >> c2)));
            float f3 = i3;
            long j5 = j4;
            int ceil2 = (int) Math.ceil((f3 / f2) / ((int) (j2 & j5)));
            long e2 = uaf.e(ceil < i4 ? i4 : ceil, ceil2 < i4 ? i4 : ceil2);
            int i7 = i2;
            int i8 = (int) (e2 >> c2);
            int i9 = (int) (e >> c2);
            i8 = i8 > i9 ? i9 : i8;
            int i10 = (int) (e2 & j5);
            int i11 = (int) (e & j5);
            long e3 = uaf.e(i8, i10 > i11 ? i11 : i10);
            int i12 = (int) (e3 >> c2);
            int n = dce.n((int) Math.ceil(f / i12), 1, i7);
            int i13 = (int) (e3 & j5);
            int n2 = dce.n((int) Math.ceil(f3 / i13), 1, i3);
            int i14 = i12 * i13;
            ArrayList arrayList2 = new ArrayList(i14);
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = 0;
                while (i16 < i12) {
                    int i17 = n2;
                    int i18 = i12;
                    long e4 = uaf.e(i16, i15);
                    int i19 = i13;
                    int i20 = n;
                    int i21 = i16 * i20;
                    long j6 = e;
                    int i22 = i15 * i17;
                    i16++;
                    int i23 = i16 * i20;
                    i23 = i23 > i7 ? i7 : i23;
                    int i24 = i7;
                    int i25 = (i15 + 1) * i17;
                    if (i25 > i3) {
                        i25 = i3;
                    }
                    arrayList2.add(new t7c(i5, e4, new vy5(i21, i22, i23, i25)));
                    n2 = i17;
                    i13 = i19;
                    n = i20;
                    e = j6;
                    i7 = i24;
                    i12 = i18;
                }
            }
            int i26 = i7;
            long j7 = e;
            arrayList.add(new hx9(i5, arrayList2));
            i5 *= 2;
            if (i14 <= 1) {
                break;
            }
            j4 = j5;
            e = j7;
            i2 = i26;
            i4 = 1;
            c = c2;
        }
        List u0 = sl1.u0(arrayList, new oo1(new tsa(15, (byte) 0), 7));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : u0) {
            if (((hx9) obj).a <= w) {
                arrayList3.add(obj);
            }
        }
        this.s = arrayList3;
        qw6 qw6Var2 = this.a;
        t93 t93Var = new t93(this, w, 10);
        qw6Var2.getClass();
        mw6 mw6Var = mw6.a;
        qw6Var2.b(mw6Var, t93Var);
        int size = arrayList3.size();
        int i27 = 0;
        while (i27 < size) {
            Object obj2 = arrayList3.get(i27);
            i27++;
            qw6 qw6Var3 = this.a;
            a0b a0bVar = new a0b(15, (hx9) obj2, this);
            qw6Var3.getClass();
            qw6Var3.b(mw6Var, a0bVar);
        }
    }

    public final void a(String str) {
        w26 w26Var = this.p;
        g7b g7bVar = this.b;
        mw6 mw6Var = mw6.b;
        qw6 qw6Var = this.a;
        if (w26Var != null && w26Var.isActive()) {
            qw6Var.getClass();
            if (qw6Var.a(mw6Var)) {
                StringBuilder o = a82.o("TileManager. cleanTiles:", str, ". cancel updateTileSnapshotListJob. '");
                o.append(g7bVar.a());
                String sb = o.toString();
                pj pjVar = qw6Var.b;
                String str2 = qw6Var.a;
                pjVar.getClass();
                pj.a(mw6Var, str2, sb);
            }
            k27.o(w26Var, "clean:".concat(str), null);
            this.p = null;
        }
        if (this.t != 0) {
            ArrayList arrayList = this.s;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                i2 += c(((hx9) obj).b);
            }
            qw6Var.getClass();
            if (qw6Var.a(mw6Var)) {
                StringBuilder s = s21.s("TileManager. cleanTiles:", str, ". freeCount=", i2, ". '");
                s.append(g7bVar.a());
                String sb2 = s.toString();
                pj pjVar2 = qw6Var.b;
                String str3 = qw6Var.a;
                pjVar2.getClass();
                pj.a(mw6Var, str3, sb2);
            }
            if (i2 > 0) {
                d("clean:".concat(str));
            }
        }
    }

    public final boolean b(t7c t7cVar) {
        if (t7cVar.g == 0) {
            return false;
        }
        t7cVar.g = 0;
        hz2 hz2Var = t7cVar.d;
        if (hz2Var != null && hz2Var.isActive()) {
            hz2Var.cancel(null);
            t7cVar.d = null;
        }
        if (t7cVar.e != null) {
            qw6 qw6Var = this.a;
            qw6Var.getClass();
            mw6 mw6Var = mw6.a;
            if (qw6Var.a(mw6Var)) {
                StringBuilder sb = new StringBuilder("TileManager. freeTile. ");
                sb.append(t7cVar);
                sb.append(". '");
                String h = rs8.h(this.b, sb, '\'');
                pj pjVar = qw6Var.b;
                String str = qw6Var.a;
                pjVar.getClass();
                pj.a(mw6Var, str, h);
            }
            t7cVar.a();
        }
        return true;
    }

    public final int c(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (b((t7c) obj)) {
                i++;
            }
        }
        return i;
    }

    public final void d(String str) {
        w26 w26Var = this.p;
        g7b g7bVar = this.b;
        mw6 mw6Var = mw6.a;
        qw6 qw6Var = this.a;
        if (w26Var != null && w26Var.isActive()) {
            qw6Var.getClass();
            if (qw6Var.a(mw6Var)) {
                String h = rs8.h(g7bVar, a82.o("TileManager. updateTileSnapshotList:", str, ". skipped, notifyTileSnapshotListJob is running. '"), '\'');
                pj pjVar = qw6Var.b;
                String str2 = qw6Var.a;
                pjVar.getClass();
                pj.a(mw6Var, str2, h);
                return;
            }
            return;
        }
        qw6Var.getClass();
        if (qw6Var.a(mw6Var)) {
            String h2 = rs8.h(g7bVar, a82.o("TileManager. updateTileSnapshotList:", str, ". launched. '"), '\'');
            pj pjVar2 = qw6Var.b;
            String str3 = qw6Var.a;
            pjVar2.getClass();
            pj.a(mw6Var, str3, h2);
        }
        this.p = z87.v(this.l, null, null, new byb(this, str, (m42) null, 5), 3);
    }
}
