package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x04  reason: default package */
/* loaded from: classes.dex */
public final class x04 implements AutoCloseable {
    public w26 C;
    public final u04 D;
    public final i04 E;
    public final cza F;
    public final sz3 G;
    public final sz3 H;
    public final ny8 I;
    public final nt5 J;
    public final cza K;
    public final uwd L;
    public final d82 a;
    public final cza b;
    public final cza c;
    public final sw7 d;
    public final sw7 e;
    public final cza f;

    public x04(Context context, d82 d82Var) {
        sw2 sw2Var = ab3.a;
        sw2Var.getClass();
        this.a = sw2Var;
        this.b = dza.a(py8.c);
        this.c = dza.a(null);
        this.d = new sw7();
        this.e = new sw7();
        this.f = dza.a(Boolean.FALSE);
        m41 a = k27.a(d82Var.plus(new y26((w26) d82Var.get(r0f.I))));
        k27.r(a.b).invokeOnCompletion(new cq2(this, 21));
        w04 w04Var = new w04(context, this);
        u04 u04Var = new u04(this);
        this.D = u04Var;
        qz3 qz3Var = new qz3(context);
        wq9.D(!qz3Var.y);
        qz3Var.e = new nv2(w04Var, 1);
        wq9.D(!qz3Var.y);
        qz3Var.y = true;
        i04 i04Var = new i04(qz3Var);
        i04Var.M(true);
        i04Var.m.a(u04Var);
        this.E = i04Var;
        this.F = dza.a(null);
        sz3 sz3Var = new sz3(0);
        this.G = sz3Var;
        sz3 sz3Var2 = new sz3(1);
        this.H = sz3Var2;
        ny8 ny8Var = new ny8(i04Var);
        this.I = ny8Var;
        this.J = new nt5(1);
        a14 a14Var = new a14();
        this.K = dza.a(0L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(r0f.K, ny8Var);
        linkedHashMap.put(j55.c, sz3Var);
        linkedHashMap.put(abf.D, sz3Var2);
        linkedHashMap.put(tn3.L, a14Var);
        this.L = new uwd(o17.y(linkedHashMap), 28);
        n35 n35Var = zz6.a;
        z87.v(a, n35Var, null, new r04(this, null, 0), 2);
        z87.v(a, n35Var, null, new r04(this, null, 1), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r2 != 4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (r8 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
        if (r8.compareTo(r6) >= 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(defpackage.x04 r9) {
        /*
            i04 r0 = r9.E
            cza r1 = r9.b
            java.lang.Object r2 = r1.getValue()
            py8 r2 = (defpackage.py8) r2
            py8 r3 = defpackage.py8.d
            int r2 = r2.compareTo(r3)
            sz3 r4 = r9.G
            r5 = 0
            if (r2 > 0) goto L22
            java.lang.Object r9 = r4.a
            cza r9 = (defpackage.cza) r9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.getClass()
            r9.n(r5, r0)
            return
        L22:
            java.lang.Object r2 = r4.a
            cza r2 = (defpackage.cza) r2
            int r4 = r0.r()
            r6 = 1
            r7 = 2
            if (r4 != r7) goto L30
            r4 = r6
            goto L31
        L30:
            r4 = 0
        L31:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.getClass()
            r2.n(r5, r4)
            nt5 r9 = r9.J
            int r2 = r0.r()
            boolean r4 = r0.q()
            boolean r0 = r0.x()
            java.lang.Object r8 = r1.getValue()
            py8 r8 = (defpackage.py8) r8
            r9.getClass()
            r8.getClass()
            if (r0 == 0) goto L5c
            r9.b = r6
            py8 r3 = defpackage.py8.C
            goto L84
        L5c:
            py8 r0 = defpackage.py8.D
            py8 r6 = defpackage.py8.e
            if (r2 == r7) goto L79
            r7 = 3
            if (r2 == r7) goto L6a
            r9 = 4
            if (r2 == r9) goto L84
        L68:
            r3 = r5
            goto L84
        L6a:
            boolean r9 = r9.b
            if (r9 != 0) goto L70
            r3 = r6
            goto L84
        L70:
            if (r4 != 0) goto L75
            py8 r3 = defpackage.py8.f
            goto L84
        L75:
            if (r8 != r0) goto L68
        L77:
            r3 = r0
            goto L84
        L79:
            boolean r9 = r9.b
            if (r9 == 0) goto L68
            int r9 = r8.compareTo(r6)
            if (r9 >= 0) goto L77
            goto L68
        L84:
            if (r3 != 0) goto L87
            return
        L87:
            r1.n(r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x04.o(x04):void");
    }

    public final void C() {
        py8 py8Var = (py8) this.b.getValue();
        if (py8Var == py8.e || py8Var == py8.f) {
            int ordinal = ((py8) this.b.getValue()).ordinal();
            i04 i04Var = this.E;
            if (ordinal != 4) {
                if (ordinal == 5) {
                    i04Var.M(true);
                    i04Var.M(true);
                    return;
                }
                return;
            }
            s04 s04Var = (s04) this.c.getValue();
            if (s04Var == null) {
                return;
            }
            s04Var.b.invoke();
            i04Var.D();
            i04Var.M(true);
        }
    }

    public final void G(long j) {
        if (((py8) this.b.getValue()).compareTo(py8.e) >= 0 && this.c.getValue() != null) {
            Long valueOf = Long.valueOf(j);
            cza czaVar = this.K;
            czaVar.getClass();
            czaVar.n(null, valueOf);
            i04 i04Var = this.E;
            i04Var.G(j, i04Var.i(), false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Type inference failed for: r12v0, types: [z47, y47] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.s04 Q(defpackage.pyc r18, defpackage.n42 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof defpackage.v04
            if (r3 == 0) goto L19
            r3 = r2
            v04 r3 = (defpackage.v04) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            v04 r3 = new v04
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.a
            int r3 = r3.c
            r4 = 0
            if (r3 == 0) goto L32
            r0 = 1
            if (r3 == r0) goto L2e
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            return r4
        L2e:
            defpackage.hre.r(r2)
            throw r4
        L32:
            defpackage.hre.r(r2)
            boolean r2 = r1 instanceof defpackage.pyc
            if (r2 == 0) goto Lae
            nt5 r2 = r0.J
            r3 = 0
            r2.b = r3
            java.util.Map r2 = r1.b
            fr2 r3 = new fr2
            r3.<init>()
            xkf r4 = new xkf
            r4.<init>()
            java.util.List r9 = java.util.Collections.EMPTY_LIST
            mm9 r4 = defpackage.mm9.e
            a57 r4 = new a57
            r4.<init>()
            d57 r16 = defpackage.d57.a
            java.lang.String r5 = r1.a
            android.net.Uri r6 = android.net.Uri.parse(r5)
            x47 r5 = r1.c
            java.util.List r5 = r5.a
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.tl1.s(r5, r8)
            r7.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
            boolean r8 = r5.hasNext()
            if (r8 != 0) goto La9
            qs5 r10 = defpackage.qs5.l(r7)
            r8 = 0
            if (r6 == 0) goto L88
            c57 r5 = new c57
            r7 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13 = r5
            goto L89
        L88:
            r13 = r8
        L89:
            f57 r10 = new f57
            z47 r12 = new z47
            r12.<init>(r3)
            b57 r14 = new b57
            r14.<init>(r4)
            j57 r15 = defpackage.j57.B
            java.lang.String r11 = ""
            r10.<init>(r11, r12, r13, r14, r15, r16)
            s04 r3 = new s04
            se0 r4 = new se0
            r5 = 12
            r4.<init>(r5, r0, r2, r10)
            r3.<init>(r1, r4)
            return r3
        La9:
            java.lang.ClassCastException r0 = defpackage.rs8.f(r5)
            throw r0
        Lae:
            defpackage.xk5.o()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x04.Q(pyc, n42):s04");
    }

    public final void S() {
        l09 l09Var;
        aac aacVar;
        boolean z;
        int i;
        Pair B;
        this.J.b = false;
        cza czaVar = this.b;
        py8 py8Var = py8.d;
        czaVar.getClass();
        czaVar.n(null, py8Var);
        cza czaVar2 = (cza) this.G.a;
        Boolean bool = Boolean.FALSE;
        czaVar2.getClass();
        czaVar2.n(null, bool);
        i04 i04Var = this.E;
        i04Var.X();
        i04Var.S(null);
        mm9 mm9Var = mm9.e;
        long j = i04Var.q0.s;
        i04Var.g0 = new ud2(mm9Var);
        ArrayList arrayList = i04Var.p;
        i04Var.X();
        int size = arrayList.size();
        int min = Math.min(Integer.MAX_VALUE, size);
        if (size > 0 && min != 0) {
            ly8 ly8Var = i04Var.q0;
            int o = i04Var.o(ly8Var);
            long f = i04Var.f(ly8Var);
            aac aacVar2 = ly8Var.a;
            i04Var.I++;
            for (int i2 = min - 1; i2 >= 0; i2--) {
                arrayList.remove(i2);
            }
            ska skaVar = i04Var.P;
            int[] iArr = skaVar.b;
            int[] iArr2 = new int[iArr.length - min];
            int i3 = 0;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 >= 0 && i5 < min) {
                    i3++;
                } else {
                    int i6 = i4 - i3;
                    if (i5 >= 0) {
                        i5 -= min;
                    }
                    iArr2[i6] = i5;
                }
            }
            i04Var.P = new ska(iArr2, new Random(skaVar.a.nextLong()));
            l09 l09Var2 = new l09(i04Var.p, i04Var.P);
            if (aacVar2.p() || l09Var2.p()) {
                l09Var = l09Var2;
                aacVar = aacVar2;
                long j2 = f;
                if (!aacVar.p() && l09Var.p()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = -1;
                } else {
                    i = o;
                }
                if (z) {
                    j2 = -9223372036854775807L;
                }
                B = i04Var.B(l09Var, i, j2);
            } else {
                Pair i7 = aacVar2.i(i04Var.a, i04Var.o, o, a2d.Q(f));
                aacVar = aacVar2;
                Object obj = i7.first;
                if (l09Var2.b(obj) != -1) {
                    l09Var = l09Var2;
                    B = i7;
                } else {
                    int T = q04.T(i04Var.a, i04Var.o, i04Var.G, i04Var.H, obj, aacVar, l09Var2);
                    l09Var = l09Var2;
                    if (T != -1) {
                        z9c z9cVar = i04Var.a;
                        l09Var.m(T, z9cVar, 0L);
                        B = i04Var.B(l09Var, T, a2d.e0(z9cVar.k));
                    } else {
                        B = i04Var.B(l09Var, -1, -9223372036854775807L);
                    }
                }
            }
            ly8 A = i04Var.A(ly8Var, l09Var, B);
            int i8 = A.e;
            if (i8 != 1 && i8 != 4 && o >= 0 && o < min) {
                if (q04.T(i04Var.a, i04Var.o, i04Var.G, i04Var.H, ly8Var.b.a, aacVar, l09Var) == -1) {
                    A = i04.z(A, 4);
                }
            }
            q04 q04Var = i04Var.l;
            ska skaVar2 = i04Var.P;
            ggb ggbVar = q04Var.D;
            ggbVar.getClass();
            fgb c = ggb.c();
            c.a = ggbVar.a.obtainMessage(20, 0, min, skaVar2);
            c.b();
            i04Var.V(A, 0, !A.b.a.equals(i04Var.q0.b.a), 4, i04Var.l(A), -1, false);
        }
        cza czaVar3 = this.K;
        czaVar3.getClass();
        czaVar3.n(null, 0L);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Object value;
        Boolean bool;
        String str;
        boolean z;
        cza czaVar = this.f;
        do {
            value = czaVar.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!czaVar.l(value, Boolean.TRUE));
        if (!bool.booleanValue()) {
            py8 py8Var = py8.a;
            if (((py8) this.b.getValue()).compareTo(py8Var) <= 0) {
                return;
            }
            cza czaVar2 = this.c;
            s04 s04Var = (s04) czaVar2.getValue();
            czaVar2.m(null);
            if (s04Var != null) {
                s04Var.a();
            }
            this.J.b = false;
            cza czaVar3 = this.b;
            czaVar3.getClass();
            czaVar3.n(null, py8Var);
            cza czaVar4 = (cza) this.G.a;
            Boolean bool2 = Boolean.FALSE;
            czaVar4.getClass();
            czaVar4.n(null, bool2);
            cza czaVar5 = this.K;
            czaVar5.getClass();
            czaVar5.n(null, 0L);
            this.E.E(this.D);
            i04 i04Var = this.E;
            i04Var.X();
            i04Var.S(null);
            mm9 mm9Var = mm9.e;
            long j = i04Var.q0.s;
            i04Var.g0 = new ud2(mm9Var);
            i04 i04Var2 = this.E;
            i04Var2.getClass();
            StringBuilder sb = new StringBuilder("Release ");
            sb.append(Integer.toHexString(System.identityHashCode(i04Var2)));
            sb.append(" [AndroidXMedia3/1.10.1] [");
            sb.append(a2d.a);
            sb.append("] [");
            HashSet hashSet = g57.a;
            synchronized (g57.class) {
                str = g57.b;
            }
            sb.append(str);
            sb.append("]");
            st0.l("ExoPlayerImpl", sb.toString());
            i04Var2.X();
            i04Var2.x.i();
            i04Var2.y.b(false);
            i04Var2.z.f(false);
            h04 h04Var = i04Var2.D;
            if (h04Var != null && Build.VERSION.SDK_INT >= 34) {
                h04.a(h04Var);
            }
            kn knVar = i04Var2.C;
            ((ggb) knVar.C).a.removeCallbacksAndMessages(null);
            ((i04) knVar.b).E((b5b) knVar.c);
            q04 q04Var = i04Var2.l;
            if (!q04Var.f0 && q04Var.F.getThread().isAlive()) {
                q04Var.f0 = true;
                vy1 vy1Var = new vy1(q04Var.L);
                q04Var.D.b(7, vy1Var).b();
                z = vy1Var.b(q04Var.Q);
            } else {
                z = true;
            }
            if (!z) {
                i04Var2.m.e(10, new ls2(27));
            }
            i04Var2.m.d();
            i04Var2.j.a.removeCallbacksAndMessages(null);
            ys2 ys2Var = i04Var2.t;
            ms2 ms2Var = i04Var2.r;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ys2Var.c.b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                xg0 xg0Var = (xg0) it.next();
                if (xg0Var.b == ms2Var) {
                    xg0Var.c = true;
                    copyOnWriteArrayList.remove(xg0Var);
                }
            }
            ly8 ly8Var = i04Var2.q0;
            if (ly8Var.p) {
                i04Var2.q0 = ly8Var.a();
            }
            ly8 z2 = i04.z(i04Var2.q0, 1);
            i04Var2.q0 = z2;
            ly8 c = z2.c(z2.b);
            i04Var2.q0 = c;
            c.q = c.s;
            i04Var2.q0.r = 0L;
            ms2 ms2Var2 = i04Var2.r;
            ggb ggbVar = ms2Var2.h;
            ggbVar.getClass();
            ggbVar.d(new x0(ms2Var2, 14));
            i04Var2.F();
            Surface surface = i04Var2.W;
            if (surface != null) {
                surface.release();
                i04Var2.W = null;
            }
            i04Var2.g0 = ud2.c;
            i04Var2.k0 = true;
        }
    }

    public final void q() {
        if (((py8) this.b.getValue()).compareTo(py8.f) > 0) {
            i04 i04Var = this.E;
            i04Var.M(false);
            i04Var.M(false);
        }
    }
}
