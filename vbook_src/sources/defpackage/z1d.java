package defpackage;

import android.text.TextUtils;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z1d  reason: default package */
/* loaded from: classes3.dex */
public abstract class z1d {
    public static y1d a = null;
    public static boolean b = false;
    public static final tu1 c = new tu1(new ov1(4), false, 1813170848);
    public static final ure d = new ure("id");
    public static final ure e = new ure("type");

    public static final sj4 A(sj4 sj4Var) {
        if (sj4Var instanceof aza) {
            return sj4Var;
        }
        return gwe.i(sj4Var, gwe.k, gwe.l);
    }

    public static final Object B(tj4 tj4Var, sj4 sj4Var, aab aabVar) {
        if (!(tj4Var instanceof l7c)) {
            Object a2 = sj4Var.a(tj4Var, aabVar);
            if (a2 == n82.a) {
                return a2;
            }
            return pvc.a;
        }
        throw ((l7c) tj4Var).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Type inference failed for: r1v1, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [zl9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(defpackage.sj4 r7, defpackage.m42 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.cl4
            if (r0 == 0) goto L13
            r0 = r8
            cl4 r0 = (defpackage.cl4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cl4 r0 = new cl4
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.d
            r2 = 0
            lie r3 = defpackage.p68.a
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto L2e
            zk4 r7 = r0.b
            zl9 r1 = r0.a
            defpackage.hre.r(r8)     // Catch: defpackage.y -> L2c
            goto L62
        L2c:
            r8 = move-exception
            goto L57
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r2
        L34:
            defpackage.hre.r(r8)
            zl9 r1 = new zl9
            r1.<init>()
            r1.a = r3
            zk4 r8 = new zk4
            r5 = 0
            r8.<init>(r5, r1)
            r0.a = r1     // Catch: defpackage.y -> L53
            r0.b = r8     // Catch: defpackage.y -> L53
            r0.d = r4     // Catch: defpackage.y -> L53
            java.lang.Object r7 = r7.a(r8, r0)     // Catch: defpackage.y -> L53
            n82 r8 = defpackage.n82.a
            if (r7 != r8) goto L62
            return r8
        L53:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L57:
            java.lang.Object r4 = r8.a
            if (r4 != r7) goto L6d
            d82 r7 = r0.getContext()
            defpackage.k27.q(r7)
        L62:
            java.lang.Object r7 = r1.a
            if (r7 == r3) goto L67
            return r7
        L67:
            java.lang.String r7 = "Expected at least one element"
            defpackage.p1a.l(r7)
            return r2
        L6d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1d.C(sj4, m42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Type inference failed for: r8v2, types: [zl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(defpackage.sj4 r6, defpackage.lu4 r7, defpackage.m42 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.dl4
            if (r0 == 0) goto L13
            r0 = r8
            dl4 r0 = (defpackage.dl4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dl4 r0 = new dl4
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.d
            r2 = 0
            lie r3 = defpackage.p68.a
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto L2e
            bl4 r6 = r0.b
            zl9 r7 = r0.a
            defpackage.hre.r(r8)     // Catch: defpackage.y -> L2c
            goto L64
        L2c:
            r8 = move-exception
            goto L59
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L34:
            defpackage.hre.r(r8)
            zl9 r8 = new zl9
            r8.<init>()
            r8.a = r3
            bl4 r1 = new bl4
            r5 = 0
            r1.<init>(r7, r8, r5)
            r0.a = r8     // Catch: defpackage.y -> L55
            r0.b = r1     // Catch: defpackage.y -> L55
            r0.d = r4     // Catch: defpackage.y -> L55
            java.lang.Object r6 = r6.a(r1, r0)     // Catch: defpackage.y -> L55
            n82 r7 = defpackage.n82.a
            if (r6 != r7) goto L53
            return r7
        L53:
            r7 = r8
            goto L64
        L55:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r1
        L59:
            java.lang.Object r1 = r8.a
            if (r1 != r6) goto L6f
            d82 r6 = r0.getContext()
            defpackage.k27.q(r6)
        L64:
            java.lang.Object r6 = r7.a
            if (r6 == r3) goto L69
            return r6
        L69:
            java.lang.String r6 = "Expected at least one element matching the predicate"
            defpackage.p1a.l(r6)
            return r2
        L6f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1d.D(sj4, lu4, m42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Type inference failed for: r1v1, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [zl9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(defpackage.sj4 r5, defpackage.m42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.fl4
            if (r0 == 0) goto L13
            r0 = r6
            fl4 r0 = (defpackage.fl4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fl4 r0 = new fl4
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            zk4 r5 = r0.b
            zl9 r1 = r0.a
            defpackage.hre.r(r6)     // Catch: defpackage.y -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L52
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L32:
            defpackage.hre.r(r6)
            zl9 r1 = new zl9
            r1.<init>()
            zk4 r6 = new zk4
            r6.<init>(r2, r1)
            r0.a = r1     // Catch: defpackage.y -> L4e
            r0.b = r6     // Catch: defpackage.y -> L4e
            r0.d = r2     // Catch: defpackage.y -> L4e
            java.lang.Object r5 = r5.a(r6, r0)     // Catch: defpackage.y -> L4e
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L5d
            return r6
        L4e:
            r5 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L52:
            java.lang.Object r2 = r6.a
            if (r2 != r5) goto L60
            d82 r5 = r0.getContext()
            defpackage.k27.q(r5)
        L5d:
            java.lang.Object r5 = r1.a
            return r5
        L60:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1d.E(sj4, m42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Type inference failed for: r6v2, types: [zl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(defpackage.sj4 r4, defpackage.lu4 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.gl4
            if (r0 == 0) goto L13
            r0 = r6
            gl4 r0 = (defpackage.gl4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gl4 r0 = new gl4
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            bl4 r4 = r0.b
            zl9 r5 = r0.a
            defpackage.hre.r(r6)     // Catch: defpackage.y -> L29
            goto L5f
        L29:
            r6 = move-exception
            goto L54
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L32:
            defpackage.hre.r(r6)
            zl9 r6 = new zl9
            r6.<init>()
            bl4 r1 = new bl4
            r1.<init>(r5, r6, r2)
            r0.a = r6     // Catch: defpackage.y -> L50
            r0.b = r1     // Catch: defpackage.y -> L50
            r0.d = r2     // Catch: defpackage.y -> L50
            java.lang.Object r4 = r4.a(r1, r0)     // Catch: defpackage.y -> L50
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L4e
            return r5
        L4e:
            r5 = r6
            goto L5f
        L50:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r1
        L54:
            java.lang.Object r1 = r6.a
            if (r1 != r4) goto L62
            d82 r4 = r0.getContext()
            defpackage.k27.q(r4)
        L5f:
            java.lang.Object r4 = r5.a
            return r4
        L62:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1d.F(sj4, lu4, n42):java.lang.Object");
    }

    public static final sj4 G(sj4 sj4Var, d82 d82Var) {
        if (d82Var.get(r0f.I) == null) {
            if (d82Var.equals(gs3.a)) {
                return sj4Var;
            }
            if (sj4Var instanceof zu4) {
                return zu4.d((zu4) sj4Var, d82Var, 0, null, 6);
            }
            return new ab1(sj4Var, d82Var, 0, null, 12);
        }
        cy7.h(d82Var, "Flow context cannot contain job in it. Had ");
        return null;
    }

    public static final void H(sj4 sj4Var, m82 m82Var) {
        z87.v(m82Var, null, null, new o54(sj4Var, (m42) null, 2), 3);
    }

    public static final do3 I(rv4 rv4Var) {
        Object[] objArr = new Object[0];
        yy9 yy9Var = do3.f;
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = new qx6(23);
            rv4Var.o0(P);
        }
        return (do3) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 384);
    }

    public static final String J(Object obj) {
        String simpleName;
        if (obj.getClass().isAnonymousClass()) {
            simpleName = obj.getClass().getName();
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        return eub.o(simpleName, "@", String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
    }

    public static final jj9 K(sj4 sj4Var, m82 m82Var, vha vhaVar, Object obj) {
        eb5 eb5Var;
        p82 p82Var;
        wa1 wa1Var;
        sj4 j;
        ta1.i.getClass();
        sa1 sa1Var = sa1.a;
        if ((sj4Var instanceof wa1) && (j = (wa1Var = (wa1) sj4Var).j()) != null) {
            if (wa1Var.b != -3) {
            }
            eb5Var = new eb5(28, j, wa1Var.a);
        } else {
            eb5Var = new eb5(28, sj4Var, gs3.a);
        }
        cza a2 = dza.a(obj);
        d82 d82Var = (d82) eb5Var.c;
        sj4 sj4Var2 = (sj4) eb5Var.b;
        if (vhaVar.equals(uha.a)) {
            p82Var = p82.a;
        } else {
            p82Var = p82.d;
        }
        return new jj9(a2, z87.u(m82Var, d82Var, p82Var, new l(vhaVar, sj4Var2, a2, obj, (m42) null)));
    }

    public static final sk4 L(sj4 sj4Var, int i) {
        if (i > 0) {
            return new sk4(sj4Var, i, 0);
        }
        p1a.k(hl5.l("Requested element count ", " should be positive", i));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M(defpackage.sj4 r4, java.util.ArrayList r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.zj4
            if (r0 == 0) goto L13
            r0 = r6
            zj4 r0 = (defpackage.zj4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zj4 r0 = new zj4
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.util.ArrayList r4 = r0.a
            defpackage.hre.r(r6)
            return r4
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r6)
            bb r6 = new bb
            r1 = 23
            r6.<init>(r5, r1)
            r0.a = r5
            r0.c = r2
            java.lang.Object r4 = r4.a(r6, r0)
            n82 r6 = defpackage.n82.a
            if (r4 != r6) goto L45
            return r6
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1d.M(sj4, java.util.ArrayList, n42):java.lang.Object");
    }

    public static final eb1 N(sj4 sj4Var, mu4 mu4Var) {
        int i = yk4.a;
        return new eb1(mu4Var, sj4Var, gs3.a, -2, py0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [su8] */
    public static ArrayList O(List list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x4e x4eVar = (x4e) it.next();
                iic iicVar = null;
                if (x4eVar != null) {
                    if (!TextUtils.isEmpty(x4eVar.a)) {
                        String str = x4eVar.b;
                        String str2 = x4eVar.c;
                        long j = x4eVar.d;
                        String str3 = x4eVar.a;
                        am8.p(str3);
                        iicVar = new su8(j, str, str2, str3);
                    } else {
                        s5e s5eVar = x4eVar.e;
                        if (s5eVar != null) {
                            iicVar = new iic(x4eVar.b, x4eVar.c, x4eVar.d, s5eVar);
                        }
                    }
                }
                if (iicVar != null) {
                    arrayList.add(iicVar);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static final void a(ja0 ja0Var, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        nq7Var.getClass();
        rv4Var.g0(279020156);
        if (rv4Var.f(ja0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            if (((Boolean) ja0Var.e.getValue()).booleanValue()) {
                rv4Var.e0(1527966483);
                Object[] objArr = new Object[0];
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (P == obj) {
                    P = new mz(26);
                    rv4Var.o0(P);
                }
                aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
                Object[] objArr2 = new Object[0];
                Object P2 = rv4Var.P();
                if (P2 == obj) {
                    P2 = new mz(28);
                    rv4Var.o0(P2);
                }
                aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
                Boolean bool = (Boolean) aw7Var.getValue();
                bool.booleanValue();
                boolean f = rv4Var.f(aw7Var2) | rv4Var.f(aw7Var);
                Object P3 = rv4Var.P();
                if (f || P3 == obj) {
                    P3 = new aa0(aw7Var2, aw7Var, (m42) null, 1);
                    rv4Var.o0(P3);
                }
                yte.g((lu4) P3, rv4Var, bool);
                ze4 ze4Var = pna.c;
                b37 d2 = fu0.d(kh5.a, false);
                int hashCode = Long.hashCode(rv4Var.T);
                xt8 l = rv4Var.l();
                nq7 p = lye.p(rv4Var, ze4Var);
                rw1.k.getClass();
                vt4 vt4Var = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(vt4Var);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, d2);
                jce.F(qw1.e, rv4Var, l);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p);
                if (ja0Var.b()) {
                    rv4Var.e0(1549926677);
                    boolean f2 = rv4Var.f(aw7Var);
                    Object P4 = rv4Var.P();
                    if (f2 || P4 == obj) {
                        P4 = new en(aw7Var, 2);
                        rv4Var.o0(P4);
                    }
                    d(ja0Var, nq7Var, (vt4) P4, rv4Var, i5 & Token.ELSE);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(1550204282);
                    boolean f3 = rv4Var.f(aw7Var);
                    Object P5 = rv4Var.P();
                    if (f3 || P5 == obj) {
                        P5 = new en(aw7Var, 4);
                        rv4Var.o0(P5);
                    }
                    k(ja0Var, nq7Var, (vt4) P5, rv4Var, i5 & Token.ELSE);
                    rv4Var.q(false);
                }
                boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                boolean c2 = ja0Var.c();
                float floatValue = ((Number) ja0Var.h.getValue()).floatValue();
                nq7 z7 = zbe.z(pna.u(mwe.u(pu0.a.a(kq7.a, kh5.D), false, 15), nae.e, 460.0f, 1), 24.0f, 12.0f);
                int i6 = i5 & 14;
                if (i6 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i5 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z8 = z3 | z2;
                Object P6 = rv4Var.P();
                if (z8 || P6 == obj) {
                    P6 = new k0(5, ja0Var, xt4Var);
                    rv4Var.o0(P6);
                }
                xt4 xt4Var2 = (xt4) P6;
                if (i6 == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object P7 = rv4Var.P();
                if (z4 || P7 == obj) {
                    P7 = new z90(ja0Var, 0);
                    rv4Var.o0(P7);
                }
                vt4 vt4Var2 = (vt4) P7;
                if (i6 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object P8 = rv4Var.P();
                if (z5 || P8 == obj) {
                    P8 = new z90(ja0Var, 1);
                    rv4Var.o0(P8);
                }
                vt4 vt4Var3 = (vt4) P8;
                if (i6 == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Object P9 = rv4Var.P();
                if (z6 || P9 == obj) {
                    P9 = new z90(ja0Var, 2);
                    rv4Var.o0(P9);
                }
                fxe.a(booleanValue, c2, floatValue, z7, xt4Var2, vt4Var2, vt4Var3, (vt4) P9, rv4Var, 0);
                rv4Var.q(true);
                rv4Var.q(false);
            } else {
                rv4Var.e0(1529768358);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ax(ja0Var, nq7Var, xt4Var, i, 8);
        }
    }

    public static final void b(final boolean z, final boolean z2, final rk9 rk9Var, final ddd dddVar, final rk9 rk9Var2, final rk9 rk9Var3, final cs5 cs5Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        boolean z4;
        ddd dddVar2;
        boolean z5;
        boolean z6;
        boolean z7;
        lu4 caVar;
        int i9;
        boolean z8;
        aw7 aw7Var;
        lh9 lh9Var;
        int i10;
        cs5 cs5Var2;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Object[] objArr;
        final rk9 rk9Var4 = rk9Var;
        rk9Var2.getClass();
        rk9Var3.getClass();
        cs5Var.getClass();
        rv4Var.g0(-1437205937);
        if (rv4Var.g(true)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i11 = i | i2;
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i12 = i11 | i3;
        if (rv4Var.g(z2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i13 = i12 | i4;
        if (rv4Var.f(rk9Var4)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i14 = i13 | i5;
        if (rv4Var.f(rk9Var2)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i15 = i14 | i6;
        if (rv4Var.f(rk9Var3)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i16 = i15 | i7;
        if (rv4Var.f(cs5Var)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i17 = i16 | i8;
        if ((4793491 & i17) == 4793490 && rv4Var.E()) {
            rv4Var.X();
        } else if (rk9Var4.l()) {
            ek9 u = rv4Var.u();
            if (u != null) {
                u.d = new lu4(z, z2, rk9Var4, dddVar, rk9Var2, rk9Var3, cs5Var, i, 0) { // from class: bd2
                    public final /* synthetic */ rk9 C;
                    public final /* synthetic */ cs5 D;
                    public final /* synthetic */ int a;
                    public final /* synthetic */ boolean b;
                    public final /* synthetic */ boolean c;
                    public final /* synthetic */ rk9 d;
                    public final /* synthetic */ ddd e;
                    public final /* synthetic */ rk9 f;

                    {
                        this.a = r9;
                    }

                    @Override // defpackage.lu4
                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = this.a;
                        pvc pvcVar = pvc.a;
                        switch (i18) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int p = xoe.p(24577);
                                z1d.b(this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p);
                                return pvcVar;
                            default:
                                ((Integer) obj2).getClass();
                                int p2 = xoe.p(24577);
                                z1d.b(this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p2);
                                return pvcVar;
                        }
                    }
                };
                return;
            }
            return;
        } else {
            rv4Var.e0(-1746271574);
            int i18 = i17 & 458752;
            if (i18 == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i19 = i17 & 7168;
            if (i19 == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z13 = z3 | z4;
            Object P = rv4Var.P();
            lh9 lh9Var2 = ax1.a;
            if (!z13 && P != lh9Var2) {
                dddVar2 = dddVar;
            } else {
                dddVar2 = dddVar;
                P = new r7(18, dddVar2, rk9Var2, rk9Var4);
                rv4Var.o0(P);
            }
            rv4Var.q(false);
            yte.b(pvc.a, (xt4) P, rv4Var);
            rv4Var.e0(1849434622);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var2) {
                P2 = yae.z(Boolean.FALSE);
                rv4Var.o0(P2);
            }
            aw7 aw7Var2 = (aw7) P2;
            rv4Var.q(false);
            rv4Var.e0(1849434622);
            Object P3 = rv4Var.P();
            if (P3 == lh9Var2) {
                P3 = yae.z(Boolean.TRUE);
                rv4Var.o0(P3);
            }
            aw7 aw7Var3 = (aw7) P3;
            rv4Var.q(false);
            if (z2) {
                aw7Var3.setValue(Boolean.FALSE);
            }
            rv4Var.e0(5004770);
            Object P4 = rv4Var.P();
            if (P4 == lh9Var2) {
                P4 = new cd2(aw7Var3, null, 0);
                rv4Var.o0(P4);
            }
            rv4Var.q(false);
            yte.h(rk9Var2, rk9Var4, (lu4) P4, rv4Var);
            rv4Var.e0(-1224400529);
            if ((3670016 & i17) == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((29360128 & i17) != 8388608) {
                z6 = false;
            } else {
                z6 = true;
            }
            boolean z14 = z5 | z6;
            if (i19 == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z15 = z14 | z7;
            Object P5 = rv4Var.P();
            if (!z15 && P5 != lh9Var2) {
                i9 = i17;
                caVar = P5;
                z8 = false;
                aw7Var = aw7Var3;
                i10 = i19;
                lh9Var = lh9Var2;
                cs5Var2 = cs5Var;
            } else {
                i9 = i17;
                ddd dddVar3 = dddVar2;
                z8 = false;
                aw7Var = aw7Var3;
                lh9Var = lh9Var2;
                i10 = i19;
                caVar = new ca(dddVar3, rk9Var3, cs5Var, rk9Var4, null, 4);
                cs5Var2 = cs5Var;
                rk9Var4 = rk9Var4;
                rv4Var.o0(caVar);
            }
            rv4Var.q(z8);
            cs5 cs5Var3 = cs5.d;
            yte.h(rk9Var4, cs5Var2, caVar, rv4Var);
            Object[] objArr2 = {Boolean.valueOf(z2), Boolean.valueOf(z), rk9Var4, rk9Var2};
            rv4Var.e0(-1224400529);
            if ((i9 & 896) == 256) {
                z9 = true;
            } else {
                z9 = z8;
            }
            if ((i9 & Token.ASSIGN_MOD) == 32) {
                z10 = true;
            } else {
                z10 = z8;
            }
            boolean z16 = z9 | z10;
            if (i18 == 131072) {
                z11 = true;
            } else {
                z11 = z8;
            }
            boolean z17 = z16 | z11;
            if (i10 == 2048) {
                z12 = true;
            } else {
                z12 = z8;
            }
            boolean z18 = z17 | z12;
            Object P6 = rv4Var.P();
            if (!z18 && P6 != lh9Var) {
                objArr = objArr2;
            } else {
                objArr = objArr2;
                g42 g42Var = new g42(z2, z, dddVar, rk9Var2, rk9Var4, aw7Var, aw7Var2, null);
                rv4Var.o0(g42Var);
                P6 = g42Var;
            }
            rv4Var.q(z8);
            yte.j(objArr, (lu4) P6, rv4Var);
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new lu4(z, z2, rk9Var, dddVar, rk9Var2, rk9Var3, cs5Var, i, 1) { // from class: bd2
                public final /* synthetic */ rk9 C;
                public final /* synthetic */ cs5 D;
                public final /* synthetic */ int a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ rk9 d;
                public final /* synthetic */ ddd e;
                public final /* synthetic */ rk9 f;

                {
                    this.a = r9;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    int i182 = this.a;
                    pvc pvcVar = pvc.a;
                    switch (i182) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int p = xoe.p(24577);
                            z1d.b(this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p);
                            return pvcVar;
                        default:
                            ((Integer) obj2).getClass();
                            int p2 = xoe.p(24577);
                            z1d.b(this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p2);
                            return pvcVar;
                    }
                }
            };
        }
    }

    public static final void c(int i, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var) {
        int i2;
        int i3;
        int i4;
        boolean z;
        lh9 lh9Var;
        boolean z2;
        boolean z3;
        ps psVar;
        aw7 aw7Var;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1489101404);
        if (rv4Var2.h(vt4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.h(vt4Var2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.f(nq7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i7 & 1, z)) {
            String A = yqe.A((y3b) x2b.Q.getValue(), rv4Var2);
            long j = ((h27) rv4Var2.j(j27.a)).a.a;
            Object P = rv4Var2.P();
            lh9 lh9Var2 = ax1.a;
            if (P == lh9Var2) {
                qa5 qa5Var = qa5.a;
                ps d2 = qa5.d(A);
                ns nsVar = new ns();
                nsVar.d(d2);
                for (os osVar : d2.d(0, d2.b.length())) {
                    nsVar.b(osVar.b, osVar.c, new uva(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    lh9Var2 = lh9Var2;
                }
                lh9Var = lh9Var2;
                P = nsVar.k();
                rv4Var2.o0(P);
            } else {
                lh9Var = lh9Var2;
            }
            ps psVar2 = (ps) P;
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = yae.z(null);
                rv4Var2.o0(P2);
            }
            aw7 aw7Var2 = (aw7) P2;
            if ((i7 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i7 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = z3 | z2;
            Object P3 = rv4Var2.P();
            if (!z4 && P3 != lh9Var) {
                aw7Var = aw7Var2;
                psVar = psVar2;
            } else {
                psVar = psVar2;
                aw7Var = aw7Var2;
                P3 = new ze1(aw7Var, psVar, vt4Var, vt4Var2, 1);
                rv4Var2.o0(P3);
            }
            nq7 b2 = dab.b(kq7.a, pvc.a, (PointerInputEventHandler) P3);
            nq7 z5 = zbe.z(st0.d(nmd.v(tte.k(st0.s(nq7Var, 10.0f, r0f.z(rv4Var2).e, 28), r0f.z(rv4Var2).e), zl1.b(0.98f, r0f.y(rv4Var2).p), lre.g), 1.0f, zl1.b(0.08f, r0f.y(rv4Var2).a), r0f.z(rv4Var2).e), 16.0f, 16.0f);
            b37 d3 = fu0.d(kh5.e, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z5);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, d3);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            oyb a2 = oyb.a(r0f.A(rv4Var2).j, r0f.y(rv4Var2).q, 0L, null, null, null, 0L, null, 3, 0L, null, 16744446);
            Object P4 = rv4Var2.P();
            if (P4 == lh9Var) {
                P4 = new g0c(aw7Var, 19);
                rv4Var2.o0(P4);
            }
            cvb.d(psVar, b2, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, (xt4) P4, a2, rv4Var, 6, 12582912, 131068);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new pq5(vt4Var, vt4Var2, nq7Var, i, 1);
        }
    }

    public static final void d(ja0 ja0Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(-332203879);
        if ((i & 6) == 0) {
            if (rv4Var.f(ja0Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(vt4Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if ((i2 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new ba0(0, vt4Var);
                rv4Var.o0(P);
            }
            nq7 b2 = dab.b(nq7Var, pvc.a, (PointerInputEventHandler) P);
            if ((i2 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var.P();
            if (z3 || P2 == lh9Var) {
                P2 = new vi(ja0Var, 1);
                rv4Var.o0(P2);
            }
            fu0.a(dab.b(b2, ja0Var, (PointerInputEventHandler) P2), rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new w90(ja0Var, nq7Var, vt4Var, i, 1);
        }
    }

    public static final void e(zc2 zc2Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        aw7 aw7Var;
        Object obj;
        boolean z;
        Object obj2;
        float[] fArr;
        aw7 aw7Var2;
        pl5 pl5Var;
        int i3;
        float f;
        aw7 aw7Var3;
        zy5 zy5Var;
        long j;
        ed2 ed2Var;
        Object obj3;
        boolean z2;
        long j2;
        Object obj4;
        float f2;
        Object obj5;
        Object obj6;
        Object obj7;
        boolean z3;
        zc2 zc2Var2;
        nq7 nq7Var2;
        boolean z4;
        hm8 hm8Var = zc2Var.j;
        pl5 pl5Var2 = zc2Var.n;
        long j3 = pl5Var2.b;
        rv4Var.g0(-1446806242);
        if (rv4Var.f(zc2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if ((i4 & 19) == 18 && rv4Var.E()) {
            rv4Var.X();
            zc2Var2 = zc2Var;
            nq7Var2 = nq7Var;
        } else {
            ed2 ed2Var2 = (ed2) rv4Var.j(fd2.b);
            Object a2 = zc2Var.a();
            cs5 cs5Var = cs5.d;
            a2.getClass();
            rv4Var.e0(1555126071);
            rv4Var.e0(1849434622);
            Object P = rv4Var.P();
            Object obj8 = ax1.a;
            if (P == obj8) {
                P = yae.z(null);
                rv4Var.o0(P);
            }
            aw7 aw7Var4 = (aw7) P;
            rv4Var.q(false);
            rv4Var.e0(1849434622);
            Object P2 = rv4Var.P();
            if (P2 == obj8) {
                P2 = yae.z(a2);
                rv4Var.o0(P2);
            }
            aw7 aw7Var5 = (aw7) P2;
            rv4Var.q(false);
            rv4Var.e0(-1746271574);
            boolean f3 = rv4Var.f(a2);
            Object P3 = rv4Var.P();
            if (f3 || P3 == obj8) {
                aw7Var = aw7Var5;
                obj = obj8;
                z = false;
                Object qkbVar = new qkb(aw7Var, a2, aw7Var4, null, 17);
                obj2 = null;
                rv4Var.o0(qkbVar);
                P3 = qkbVar;
            } else {
                aw7Var = aw7Var5;
                obj = obj8;
                z = false;
                obj2 = null;
            }
            rv4Var.q(z);
            yte.g((lu4) P3, rv4Var, a2);
            rv4Var.q(z);
            rv4Var.e0(-1633490746);
            boolean f4 = rv4Var.f((cs5) aw7Var.getValue()) | rv4Var.e(j3);
            Object P4 = rv4Var.P();
            if (f4 || P4 == obj) {
                P4 = new l27(dye.g((cs5) aw7Var.getValue(), j3));
                rv4Var.o0(P4);
            }
            float[] fArr2 = ((l27) P4).a;
            rv4Var.q(z);
            rv4Var.e0(1849434622);
            Object P5 = rv4Var.P();
            if (P5 == obj) {
                P5 = new ddd();
                rv4Var.o0(P5);
            }
            ddd dddVar = (ddd) P5;
            rv4Var.q(z);
            rv4Var.e0(1849434622);
            Object P6 = rv4Var.P();
            if (P6 == obj) {
                P6 = yae.z(new zy5(0L));
                rv4Var.o0(P6);
            }
            aw7 aw7Var6 = (aw7) P6;
            rv4Var.q(z);
            rv4Var.e0(1849434622);
            Object P7 = rv4Var.P();
            if (P7 == obj) {
                P7 = yae.z(obj2);
                rv4Var.o0(P7);
            }
            aw7 aw7Var7 = (aw7) P7;
            rv4Var.q(z);
            rv4Var.e0(1849434622);
            Object P8 = rv4Var.P();
            if (P8 == obj) {
                P8 = yae.z(Boolean.FALSE);
                rv4Var.o0(P8);
            }
            aw7 aw7Var8 = (aw7) P8;
            rv4Var.q(z);
            ed2Var2.getClass();
            float L0 = ((r13) rv4Var.j(dy1.h)).L0(20.0f);
            Object b2 = dddVar.b();
            rv4Var.e0(-1633490746);
            boolean f5 = rv4Var.f(b2) | rv4Var.f(fArr2);
            Object P9 = rv4Var.P();
            if (f5 || P9 == obj) {
                P9 = new l27(m27.d(fArr2, dddVar.b()));
                rv4Var.o0(P9);
            }
            float[] fArr3 = ((l27) P9).a;
            rv4Var.q(z);
            long j4 = ((zy5) aw7Var6.getValue()).a;
            fArr3.getClass();
            rv4Var.e0(682382037);
            rv4Var.e0(1849434622);
            Object P10 = rv4Var.P();
            if (P10 == obj) {
                P10 = yae.z(obj2);
                rv4Var.o0(P10);
            }
            aw7 aw7Var9 = (aw7) P10;
            rv4Var.q(false);
            rv4Var.e0(1849434622);
            Object P11 = rv4Var.P();
            if (P11 == obj) {
                P11 = yae.z(obj2);
                rv4Var.o0(P11);
            }
            aw7 aw7Var10 = (aw7) P11;
            rv4Var.q(false);
            zy5 zy5Var2 = new zy5(j4);
            rv4Var.e0(-1746271574);
            boolean f6 = rv4Var.f(pl5Var2) | rv4Var.e(j4);
            Object P12 = rv4Var.P();
            if (f6 || P12 == obj) {
                fArr = fArr3;
                aw7Var2 = aw7Var7;
                pl5Var = pl5Var2;
                i3 = -1633490746;
                f = L0;
                aw7Var3 = aw7Var6;
                zy5Var = zy5Var2;
                j = j4;
                ed2Var = ed2Var2;
                Object o0Var = new o0(j, pl5Var, aw7Var9, (m42) null);
                rv4Var.o0(o0Var);
                obj3 = o0Var;
            } else {
                obj3 = P12;
                fArr = fArr3;
                aw7Var2 = aw7Var7;
                pl5Var = pl5Var2;
                i3 = -1633490746;
                f = L0;
                aw7Var3 = aw7Var6;
                zy5Var = zy5Var2;
                j = j4;
                ed2Var = ed2Var2;
            }
            rv4Var.q(false);
            yte.h(pl5Var, zy5Var, (lu4) obj3, rv4Var);
            zy5 zy5Var3 = new zy5(j);
            l27 l27Var = new l27(fArr);
            if (((sq2) aw7Var9.getValue()) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object[] objArr = {pl5Var, zy5Var3, l27Var, Boolean.valueOf(z2)};
            rv4Var.e0(-1224400529);
            boolean e2 = rv4Var.e(j) | rv4Var.f(pl5Var) | rv4Var.h(fArr);
            Object P13 = rv4Var.P();
            if (e2 || P13 == obj) {
                j2 = j3;
                obj4 = obj;
                float[] fArr4 = fArr;
                f2 = f;
                Object gg1Var = new gg1(j, pl5Var, fArr4, aw7Var9, aw7Var10, (m42) null);
                obj5 = fArr4;
                rv4Var.o0(gg1Var);
                obj6 = gg1Var;
            } else {
                obj6 = P13;
                j2 = j3;
                obj5 = fArr;
                obj4 = obj;
                f2 = f;
            }
            rv4Var.q(false);
            yte.j(objArr, (lu4) obj6, rv4Var);
            Object obj9 = (sq2) aw7Var10.getValue();
            if (obj9 == null) {
                obj9 = (sq2) aw7Var9.getValue();
            }
            rv4Var.q(false);
            Object b3 = zc2Var.b();
            Object b4 = dddVar.b();
            rv4Var.e0(i3);
            boolean f7 = rv4Var.f(b3) | rv4Var.f(b4);
            Object P14 = rv4Var.P();
            if (f7 || P14 == obj4) {
                P14 = l27.d(dddVar.b(), zc2Var.b());
                rv4Var.o0(P14);
            }
            rk9 rk9Var = (rk9) P14;
            rv4Var.q(false);
            rv4Var.e0(i3);
            boolean f8 = rv4Var.f((wc2) hm8Var.getValue()) | rv4Var.f(rk9Var);
            Object P15 = rv4Var.P();
            if (f8 || P15 == obj4) {
                P15 = ((wc2) hm8Var.getValue()).a(rk9Var);
                rv4Var.o0(P15);
            }
            Object obj10 = (yj) P15;
            rv4Var.q(false);
            rv4Var.e0(5004770);
            boolean f9 = rv4Var.f(rk9Var);
            Object P16 = rv4Var.P();
            if (f9 || P16 == obj4) {
                P16 = new rk9(rk9Var.a - 100.0f, rk9Var.b - 100.0f, rk9Var.c + 200.0f, rk9Var.d + 200.0f);
                rv4Var.o0(P16);
            }
            Object obj11 = (rk9) P16;
            rv4Var.q(false);
            long j5 = ((zy5) aw7Var3.getValue()).a;
            rv4Var.e0(i3);
            boolean e3 = rv4Var.e(j2) | rv4Var.e(j5);
            Object P17 = rv4Var.P();
            if (!e3 && P17 != obj4) {
                obj7 = obj4;
            } else {
                obj7 = obj4;
                P17 = new jrd(j2, ((zy5) aw7Var3.getValue()).a);
                rv4Var.o0(P17);
            }
            jrd jrdVar = (jrd) P17;
            rv4Var.q(false);
            if (((ui3) aw7Var2.getValue()) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean booleanValue = ((Boolean) aw7Var8.getValue()).booleanValue();
            ed2 ed2Var3 = ed2Var;
            rk9 n = npe.n(0L, eg0.A(((zy5) aw7Var3.getValue()).a));
            float f10 = -f2;
            Object obj12 = obj7;
            zc2Var2 = zc2Var;
            aw7 aw7Var11 = aw7Var3;
            b(z3, booleanValue, new rk9(n.a - f10, n.b - f10, n.c + f10, n.d + f10), dddVar, zc2Var.b(), zc2Var2.f, zc2Var2.a(), rv4Var, 24576);
            rv4Var.e0(5004770);
            Object P18 = rv4Var.P();
            if (P18 == obj12) {
                P18 = new as1(aw7Var11, 4);
                rv4Var.o0(P18);
            }
            rv4Var.q(false);
            nq7Var2 = nq7Var;
            nq7 v = nmd.v(obe.y(nq7Var2, (xt4) P18), ed2Var3.b, lre.g);
            rv4Var.e0(5004770);
            boolean f11 = rv4Var.f(obj11);
            Object P19 = rv4Var.P();
            if (f11 || P19 == obj12) {
                P19 = new u0(obj11, 18);
                rv4Var.o0(P19);
            }
            xt4 xt4Var = (xt4) P19;
            rv4Var.q(false);
            v.getClass();
            xt4Var.getClass();
            nq7 B = fxe.B(v, xt4Var);
            rk9 b5 = zc2Var2.b();
            rv4Var.e0(5004770);
            if ((i4 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P20 = rv4Var.P();
            if (z4 || P20 == obj12) {
                P20 = new f62(zc2Var2, 3);
                rv4Var.o0(P20);
            }
            xt4 xt4Var2 = (xt4) P20;
            rv4Var.q(false);
            List list = ed2Var3.a;
            ui3 ui3Var = (ui3) aw7Var2.getValue();
            rv4Var.e0(5004770);
            Object P21 = rv4Var.P();
            if (P21 == obj12) {
                P21 = new as1(aw7Var2, 5);
                rv4Var.o0(P21);
            }
            xt4 xt4Var3 = (xt4) P21;
            rv4Var.q(false);
            int i5 = oic.b;
            B.getClass();
            b5.getClass();
            xt4Var2.getClass();
            list.getClass();
            xt4Var3.getClass();
            jrdVar.getClass();
            nq7 j6 = lye.j(B, new nic(dddVar, aw7Var8, jrdVar, list, b5, xt4Var3, ui3Var, xt4Var2));
            rv4Var.e0(-1224400529);
            boolean h = rv4Var.h(obj9) | rv4Var.h(obj5) | rv4Var.f(ed2Var3) | rv4Var.h(obj10) | rv4Var.f(rk9Var);
            Object P22 = rv4Var.P();
            if (h || P22 == obj12) {
                P22 = new p6(obj9, ed2Var3, obj5, obj10, rk9Var, 7);
                rv4Var.o0(P22);
            }
            rv4Var.q(false);
            bce.a(j6, (xt4) P22, rv4Var, 0);
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ah7(zc2Var2, nq7Var2, i, 18);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.ar5 r24, final java.lang.String r25, boolean r26, defpackage.wz0 r27, defpackage.nq7 r28, defpackage.rh8 r29, defpackage.oyb r30, defpackage.wea r31, defpackage.vt4 r32, defpackage.rv4 r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1d.f(ar5, java.lang.String, boolean, wz0, nq7, rh8, oyb, wea, vt4, rv4, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final void g(boolean z, wz0 wz0Var, nq7 nq7Var, rh8 rh8Var, wea weaVar, final lu4 lu4Var, final lu4 lu4Var2, vt4 vt4Var, rv4 rv4Var, int i) {
        Object obj;
        int i2;
        boolean z2;
        rv4 rv4Var2;
        boolean z3;
        wz0 wz0Var2;
        rh8 rh8Var2;
        wea weaVar2;
        wz0 b2;
        int i3;
        boolean z4;
        th8 th8Var;
        su9 su9Var;
        rh8 rh8Var3;
        wea weaVar3;
        rv4 rv4Var3;
        final ?? r0;
        wz0 wz0Var3;
        vs0 vs0Var;
        int i4;
        vt4Var.getClass();
        rv4Var.g0(-85926926);
        int i5 = i | 22;
        if ((i & 384) == 0) {
            obj = nq7Var;
            if (rv4Var.f(obj)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i5 |= i4;
        } else {
            obj = nq7Var;
        }
        int i6 = i5 | 11264;
        if (rv4Var.h(vt4Var)) {
            i2 = 8388608;
        } else {
            i2 = 4194304;
        }
        int i7 = i6 | i2;
        if ((4793491 & i7) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                b2 = wz0Var;
                th8Var = rh8Var;
                su9Var = weaVar;
                i3 = i7 & (-57457);
                z4 = z;
            } else {
                th8 th8Var2 = xz0.a;
                b2 = xz0.b(((h27) rv4Var.j(j27.a)).a);
                i3 = i7 & (-57457);
                z4 = true;
                th8Var = new th8(16.0f, 8.0f, 16.0f, 8.0f);
                su9Var = uu9.a;
            }
            rv4Var.r();
            boolean e2 = nm3.c(rv4Var).e();
            if (!nm3.c(rv4Var).f()) {
                rv4Var.e0(-47982607);
                if (e2) {
                    rv4Var.e0(-47797599);
                    th8 th8Var3 = xz0.a;
                    r0 = 0;
                    wz0 a2 = xz0.a(r0f.y(rv4Var).p, r0f.y(rv4Var).q, 0L, 0L, rv4Var, 12);
                    rv4Var3 = rv4Var;
                    rv4Var3.q(false);
                    wz0Var3 = a2;
                } else {
                    rv4Var3 = rv4Var;
                    r0 = 0;
                    rv4Var3.e0(-47608406);
                    rv4Var3.q(false);
                    wz0Var3 = b2;
                }
                if (e2) {
                    rv4Var3.e0(-47528426);
                    vs0Var = new vs0(1.0f, new esa(r0f.y(rv4Var3).q));
                    rv4Var3.q(r0);
                } else {
                    rv4Var3.e0(-47373364);
                    rv4Var3.q(r0);
                    vs0Var = null;
                }
                weaVar3 = su9Var;
                boolean z5 = z4;
                rv4 rv4Var4 = rv4Var3;
                rh8 rh8Var4 = th8Var;
                nmd.a(vt4Var, obj, z5, weaVar3, wz0Var3, null, vs0Var, rh8Var4, jce.E(1902200701, new mu4() { // from class: b01
                    @Override // defpackage.mu4
                    public final Object c(Object obj2, Object obj3, Object obj4) {
                        boolean z6;
                        boolean z7;
                        int i8 = r0;
                        pvc pvcVar = pvc.a;
                        kq7 kq7Var = kq7.a;
                        lu4 lu4Var3 = lu4Var2;
                        lu4 lu4Var4 = lu4Var;
                        hv9 hv9Var = (hv9) obj2;
                        rv4 rv4Var5 = (rv4) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        switch (i8) {
                            case 0:
                                hv9Var.getClass();
                                if ((intValue & 17) != 16) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (rv4Var5.U(intValue & 1, z6)) {
                                    if (lu4Var4 != null) {
                                        rv4Var5.e0(662612991);
                                        lu4Var4.invoke(rv4Var5, 0);
                                        rv4Var5.q(false);
                                    } else {
                                        rv4Var5.e0(662649509);
                                        rv4Var5.q(false);
                                    }
                                    if (lu4Var4 != null && lu4Var3 != null) {
                                        rv4Var5.e0(662698303);
                                        xbe.i(rv4Var5, pna.n(kq7Var, 8.0f));
                                        rv4Var5.q(false);
                                    } else {
                                        rv4Var5.e0(662765573);
                                        rv4Var5.q(false);
                                    }
                                    if (lu4Var3 != null) {
                                        rv4Var5.e0(662797503);
                                        lu4Var3.invoke(rv4Var5, 0);
                                        rv4Var5.q(false);
                                    } else {
                                        rv4Var5.e0(662834021);
                                        rv4Var5.q(false);
                                    }
                                } else {
                                    rv4Var5.X();
                                }
                                return pvcVar;
                            default:
                                hv9Var.getClass();
                                if ((intValue & 17) != 16) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (rv4Var5.U(intValue & 1, z7)) {
                                    if (lu4Var4 != null) {
                                        rv4Var5.e0(-1208930661);
                                        lu4Var4.invoke(rv4Var5, 0);
                                        rv4Var5.q(false);
                                    } else {
                                        rv4Var5.e0(-1208894143);
                                        rv4Var5.q(false);
                                    }
                                    if (lu4Var4 != null && lu4Var3 != null) {
                                        rv4Var5.e0(-1208845349);
                                        xbe.i(rv4Var5, pna.n(kq7Var, 8.0f));
                                        rv4Var5.q(false);
                                    } else {
                                        rv4Var5.e0(-1208778079);
                                        rv4Var5.q(false);
                                    }
                                    if (lu4Var3 != null) {
                                        rv4Var5.e0(-1208746149);
                                        lu4Var3.invoke(rv4Var5, 0);
                                        rv4Var5.q(false);
                                    } else {
                                        rv4Var5.e0(-1208709631);
                                        rv4Var5.q(false);
                                    }
                                } else {
                                    rv4Var5.X();
                                }
                                return pvcVar;
                        }
                    }
                }, rv4Var3), rv4Var4, ((i3 >> 21) & 14) | 805306368 | ((i3 >> 3) & Token.ASSIGN_MOD) | 12583296, 288);
                z3 = z5;
                rh8Var3 = rh8Var4;
                rv4Var2 = rv4Var4;
                rv4Var2.q(r0);
            } else {
                z3 = z4;
                rh8Var3 = th8Var;
                weaVar3 = su9Var;
                rv4Var.e0(-46999070);
                long j = r0f.y(rv4Var).F;
                boolean e3 = rv4Var.e(j);
                Object P = rv4Var.P();
                if (e3 || P == ax1.a) {
                    P = new th(j, 6);
                    rv4Var.o0(P);
                }
                h(xbe.J((xt4) P, rv4Var), nq7Var, false, weaVar3, z3, r0f.y(rv4Var).a, 0L, vt4Var, jce.E(1651714657, new mu4() { // from class: b01
                    @Override // defpackage.mu4
                    public final Object c(Object obj2, Object obj3, Object obj4) {
                        boolean z6;
                        boolean z7;
                        int i8 = r0;
                        pvc pvcVar = pvc.a;
                        kq7 kq7Var = kq7.a;
                        lu4 lu4Var3 = lu4Var2;
                        lu4 lu4Var4 = lu4Var;
                        hv9 hv9Var = (hv9) obj2;
                        rv4 rv4Var5 = (rv4) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        switch (i8) {
                            case 0:
                                hv9Var.getClass();
                                if ((intValue & 17) != 16) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (rv4Var5.U(intValue & 1, z6)) {
                                    if (lu4Var4 != null) {
                                        rv4Var5.e0(662612991);
                                        lu4Var4.invoke(rv4Var5, 0);
                                        rv4Var5.q(false);
                                    } else {
                                        rv4Var5.e0(662649509);
                                        rv4Var5.q(false);
                                    }
                                    if (lu4Var4 != null && lu4Var3 != null) {
                                        rv4Var5.e0(662698303);
                                        xbe.i(rv4Var5, pna.n(kq7Var, 8.0f));
                                        rv4Var5.q(false);
                                    } else {
                                        rv4Var5.e0(662765573);
                                        rv4Var5.q(false);
                                    }
                                    if (lu4Var3 != null) {
                                        rv4Var5.e0(662797503);
                                        lu4Var3.invoke(rv4Var5, 0);
                                        rv4Var5.q(false);
                                    } else {
                                        rv4Var5.e0(662834021);
                                        rv4Var5.q(false);
                                    }
                                } else {
                                    rv4Var5.X();
                                }
                                return pvcVar;
                            default:
                                hv9Var.getClass();
                                if ((intValue & 17) != 16) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (rv4Var5.U(intValue & 1, z7)) {
                                    if (lu4Var4 != null) {
                                        rv4Var5.e0(-1208930661);
                                        lu4Var4.invoke(rv4Var5, 0);
                                        rv4Var5.q(false);
                                    } else {
                                        rv4Var5.e0(-1208894143);
                                        rv4Var5.q(false);
                                    }
                                    if (lu4Var4 != null && lu4Var3 != null) {
                                        rv4Var5.e0(-1208845349);
                                        xbe.i(rv4Var5, pna.n(kq7Var, 8.0f));
                                        rv4Var5.q(false);
                                    } else {
                                        rv4Var5.e0(-1208778079);
                                        rv4Var5.q(false);
                                    }
                                    if (lu4Var3 != null) {
                                        rv4Var5.e0(-1208746149);
                                        lu4Var3.invoke(rv4Var5, 0);
                                        rv4Var5.q(false);
                                    } else {
                                        rv4Var5.e0(-1208709631);
                                        rv4Var5.q(false);
                                    }
                                } else {
                                    rv4Var5.X();
                                }
                                return pvcVar;
                        }
                    }
                }, rv4Var), rv4Var, ((i3 >> 3) & Token.ASSIGN_MOD) | 100687872 | (i3 & 29360128));
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            }
            rh8Var2 = rh8Var3;
            wz0Var2 = b2;
            weaVar2 = weaVar3;
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
            z3 = z;
            wz0Var2 = wz0Var;
            rh8Var2 = rh8Var;
            weaVar2 = weaVar;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new c01(z3, wz0Var2, nq7Var, rh8Var2, weaVar2, lu4Var, lu4Var2, vt4Var, i);
        }
    }

    public static final void h(final yf0 yf0Var, final nq7 nq7Var, boolean z, final wea weaVar, final boolean z2, final long j, long j2, final vt4 vt4Var, final tu1 tu1Var, rv4 rv4Var, final int i) {
        int i2;
        Object obj;
        boolean z3;
        final boolean z4;
        final long j3;
        long j4;
        boolean z5;
        xt4 xt4Var;
        boolean z6;
        int i3;
        Object obj2;
        boolean z7;
        boolean z8;
        boolean z9;
        long j5;
        Object obj3;
        nq7 nq7Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean h;
        int i9;
        rv4Var.g0(-1772113952);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(yf0Var);
            } else {
                h = rv4Var.h(yf0Var);
            }
            if (h) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj = nq7Var;
            if (rv4Var.f(obj)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        } else {
            obj = nq7Var;
        }
        int i10 = i2 | 384;
        if ((i & 3072) == 0) {
            if (rv4Var.f(weaVar)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i10 |= i7;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.e(j)) {
                i6 = 131072;
            } else {
                i6 = Parser.ARGC_LIMIT;
            }
            i10 |= i6;
        }
        int i11 = i10 | 1572864;
        if ((12582912 & i) == 0) {
            if (rv4Var.h(vt4Var)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i11 |= i5;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var.h(tu1Var)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i11 |= i4;
        }
        if ((38339731 & i11) != 38339730) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i11 & 1, z3)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                z5 = z;
                j4 = j2;
            } else {
                j4 = zl1.i;
                z5 = true;
            }
            rv4Var.r();
            Object P = rv4Var.P();
            Object obj4 = ax1.a;
            Object obj5 = P;
            if (P == obj4) {
                Object s = yte.s(rv4Var);
                rv4Var.o0(s);
                obj5 = s;
            }
            m82 m82Var = (m82) obj5;
            boolean f = rv4Var.f(m82Var);
            Object P2 = rv4Var.P();
            Object obj6 = P2;
            if (f || P2 == obj4) {
                Object oz5Var = new oz5(m82Var);
                rv4Var.o0(oz5Var);
                obj6 = oz5Var;
            }
            oz5 oz5Var2 = (oz5) obj6;
            iu5 iu5Var = null;
            if (z5) {
                rv4Var.e0(692176653);
                boolean h2 = rv4Var.h(oz5Var2);
                Object P3 = rv4Var.P();
                Object obj7 = P3;
                if (h2 || P3 == obj4) {
                    Object h01Var = new h01(oz5Var2, 0);
                    rv4Var.o0(h01Var);
                    obj7 = h01Var;
                }
                xt4Var = (xt4) obj7;
                rv4Var.q(false);
            } else {
                rv4Var.e0(693434230);
                rv4Var.q(false);
                xt4Var = null;
            }
            if ((((i11 & 7168) ^ 3072) > 2048 && rv4Var.f(weaVar)) || (i11 & 3072) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object P4 = rv4Var.P();
            Object obj8 = P4;
            if (z6 || P4 == obj4) {
                Object veVar = new ve(weaVar, 19);
                rv4Var.o0(veVar);
                obj8 = veVar;
            }
            vt4 vt4Var2 = (vt4) obj8;
            Object P5 = rv4Var.P();
            Object obj9 = P5;
            if (P5 == obj4) {
                Object nj0Var = new nj0(26);
                rv4Var.o0(nj0Var);
                obj9 = nj0Var;
            }
            xt4 xt4Var2 = (xt4) obj9;
            Object P6 = rv4Var.P();
            if (P6 == obj4) {
                i3 = i11;
                Object mf0Var = new mf0(21);
                rv4Var.o0(mf0Var);
                obj2 = mf0Var;
            } else {
                i3 = i11;
                obj2 = P6;
            }
            vt4 vt4Var3 = (vt4) obj2;
            if ((i3 & 458752) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z10 = z7;
            if ((i3 & 3670016) == 1048576) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z11 = z10 | z8;
            Object P7 = rv4Var.P();
            if (!z11 && P7 != obj4) {
                j5 = j4;
                z9 = false;
                obj3 = P7;
            } else {
                z9 = false;
                Object i01Var = new i01(j, j4, 0);
                j5 = j4;
                rv4Var.o0(i01Var);
                obj3 = i01Var;
            }
            xt4 xt4Var3 = (xt4) obj3;
            boolean z12 = z9;
            nq7 e2 = rse.e(obj, yf0Var, vt4Var2, xt4Var2, vt4Var3, null, null, xt4Var, xt4Var3, 2992);
            if (z5) {
                rv4Var.e0(694053981);
            } else {
                rv4Var.e0(2100599655);
                iu5Var = (iu5) rv4Var.j(fu5.a);
            }
            rv4Var.q(z12);
            nq7 e3 = lbe.e(e2, null, iu5Var, false, new xt9(z12 ? 1 : 0), vt4Var, 12);
            if (z5) {
                nq7Var2 = oz5Var2.g.a0(oz5Var2.h);
            } else {
                nq7Var2 = kq7.a;
            }
            nq7 A = zbe.A(pna.j(e3.a0(nq7Var2), 36.0f, nae.e, 2), 16.0f, nae.e, 2);
            int i12 = ((i3 >> 15) & 7168) | 432;
            gv9 a2 = ev9.a(lz.e, kh5.G, rv4Var, 54);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, A);
            rw1.k.getClass();
            vt4 vt4Var4 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var4);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            tu1Var.c(jv9.a, rv4Var, Integer.valueOf(((i12 >> 6) & Token.ASSIGN_MOD) | 6));
            rv4Var.q(true);
            z4 = z5;
            j3 = j5;
        } else {
            rv4Var.X();
            z4 = z;
            j3 = j2;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: j01
                @Override // defpackage.lu4
                public final Object invoke(Object obj10, Object obj11) {
                    ((Integer) obj11).getClass();
                    z1d.h(yf0.this, nq7Var, z4, weaVar, z2, j, j3, vt4Var, tu1Var, (rv4) obj10, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void i(final do3 do3Var, mu4 mu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        do3Var.getClass();
        mu4Var.getClass();
        rv4Var.g0(45992351);
        if (rv4Var.f(do3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.h(mu4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            boolean booleanValue = ((Boolean) do3Var.a.getValue()).booleanValue();
            nq7 x = mwe.x(kq7.a, 14);
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new kf7(do3Var, 0);
                rv4Var.o0(P);
            }
            xb.d(booleanValue, (xt4) P, jce.E(-294988853, new lf7(do3Var, mu4Var), rv4Var), null, x, jce.E(-971040280, new lu4() { // from class: mf7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    boolean z4;
                    int i6 = r2;
                    pvc pvcVar = pvc.a;
                    lh9 lh9Var = ax1.a;
                    do3 do3Var2 = do3Var;
                    switch (i6) {
                        case 0:
                            rv4 rv4Var2 = (rv4) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if ((intValue & 3) != 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (rv4Var2.U(intValue & 1, z3)) {
                                boolean f = rv4Var2.f(do3Var2);
                                Object P2 = rv4Var2.P();
                                if (f || P2 == lh9Var) {
                                    P2 = new ez6(do3Var2, 2);
                                    rv4Var2.o0(P2);
                                }
                                nmd.j((vt4) P2, null, false, null, null, null, dye.a, rv4Var2, 805306368, 510);
                            } else {
                                rv4Var2.X();
                            }
                            return pvcVar;
                        default:
                            rv4 rv4Var3 = (rv4) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if ((intValue2 & 3) != 2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (rv4Var3.U(intValue2 & 1, z4)) {
                                Object P3 = rv4Var3.P();
                                if (P3 == lh9Var) {
                                    P3 = s21.e(rv4Var3);
                                }
                                zm4 zm4Var = (zm4) P3;
                                Object P4 = rv4Var3.P();
                                if (P4 == lh9Var) {
                                    P4 = new sr3(zm4Var, null, 8);
                                    rv4Var3.o0(P4);
                                }
                                yte.g((lu4) P4, rv4Var3, zm4Var);
                                kq7 kq7Var = kq7.a;
                                nq7 C = rte.C(pna.f(kq7Var, 1.0f), rte.u(rv4Var3), 14);
                                xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var3, 0);
                                int hashCode = Long.hashCode(rv4Var3.T);
                                xt8 l = rv4Var3.l();
                                nq7 p = lye.p(rv4Var3, C);
                                rw1.k.getClass();
                                zx1 zx1Var = qw1.b;
                                rv4Var3.i0();
                                if (rv4Var3.S) {
                                    rv4Var3.k(zx1Var);
                                } else {
                                    rv4Var3.r0();
                                }
                                jce.F(qw1.f, rv4Var3, a2);
                                jce.F(qw1.e, rv4Var3, l);
                                jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode));
                                jce.C(qw1.h, rv4Var3);
                                jce.F(qw1.d, rv4Var3, p);
                                String str = (String) do3Var2.c.getValue();
                                t86 t86Var = new t86(0, 7, Token.INC);
                                tza tzaVar = j27.a;
                                v72 v72Var = ((h27) rv4Var3.j(tzaVar)).c.b;
                                nq7 n = mwe.n(zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2), zm4Var);
                                boolean f2 = rv4Var3.f(do3Var2);
                                Object P5 = rv4Var3.P();
                                if (f2 || P5 == lh9Var) {
                                    P5 = new kf7(do3Var2, 1);
                                    rv4Var3.o0(P5);
                                }
                                uwe.h(str, (xt4) P5, n, false, false, null, dye.c, null, null, null, false, null, t86Var, null, true, 0, 0, v72Var, null, rv4Var3, 1572864, 12779520, 6127544);
                                xbe.i(rv4Var3, pna.h(kq7Var, 12.0f));
                                String str2 = (String) do3Var2.d.getValue();
                                t86 t86Var2 = new t86(0, 7, Token.INC);
                                v72 v72Var2 = ((h27) rv4Var3.j(tzaVar)).c.b;
                                nq7 A = zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2);
                                boolean f3 = rv4Var3.f(do3Var2);
                                Object P6 = rv4Var3.P();
                                if (f3 || P6 == lh9Var) {
                                    P6 = new kf7(do3Var2, 2);
                                    rv4Var3.o0(P6);
                                }
                                uwe.h(str2, (xt4) P6, A, false, false, null, dye.d, null, null, null, false, null, t86Var2, null, false, 0, 0, v72Var2, null, rv4Var3, 1573248, 196608, 6258616);
                                rs8.u(rv4Var3, true, kq7Var, 12.0f, rv4Var3);
                            } else {
                                rv4Var3.X();
                            }
                            return pvcVar;
                    }
                }
            }, rv4Var), dye.b, null, 0L, 0L, nae.e, false, false, jce.E(-11936653, new lu4() { // from class: mf7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    boolean z4;
                    int i6 = r2;
                    pvc pvcVar = pvc.a;
                    lh9 lh9Var = ax1.a;
                    do3 do3Var2 = do3Var;
                    switch (i6) {
                        case 0:
                            rv4 rv4Var2 = (rv4) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if ((intValue & 3) != 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (rv4Var2.U(intValue & 1, z3)) {
                                boolean f = rv4Var2.f(do3Var2);
                                Object P2 = rv4Var2.P();
                                if (f || P2 == lh9Var) {
                                    P2 = new ez6(do3Var2, 2);
                                    rv4Var2.o0(P2);
                                }
                                nmd.j((vt4) P2, null, false, null, null, null, dye.a, rv4Var2, 805306368, 510);
                            } else {
                                rv4Var2.X();
                            }
                            return pvcVar;
                        default:
                            rv4 rv4Var3 = (rv4) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if ((intValue2 & 3) != 2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (rv4Var3.U(intValue2 & 1, z4)) {
                                Object P3 = rv4Var3.P();
                                if (P3 == lh9Var) {
                                    P3 = s21.e(rv4Var3);
                                }
                                zm4 zm4Var = (zm4) P3;
                                Object P4 = rv4Var3.P();
                                if (P4 == lh9Var) {
                                    P4 = new sr3(zm4Var, null, 8);
                                    rv4Var3.o0(P4);
                                }
                                yte.g((lu4) P4, rv4Var3, zm4Var);
                                kq7 kq7Var = kq7.a;
                                nq7 C = rte.C(pna.f(kq7Var, 1.0f), rte.u(rv4Var3), 14);
                                xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var3, 0);
                                int hashCode = Long.hashCode(rv4Var3.T);
                                xt8 l = rv4Var3.l();
                                nq7 p = lye.p(rv4Var3, C);
                                rw1.k.getClass();
                                zx1 zx1Var = qw1.b;
                                rv4Var3.i0();
                                if (rv4Var3.S) {
                                    rv4Var3.k(zx1Var);
                                } else {
                                    rv4Var3.r0();
                                }
                                jce.F(qw1.f, rv4Var3, a2);
                                jce.F(qw1.e, rv4Var3, l);
                                jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode));
                                jce.C(qw1.h, rv4Var3);
                                jce.F(qw1.d, rv4Var3, p);
                                String str = (String) do3Var2.c.getValue();
                                t86 t86Var = new t86(0, 7, Token.INC);
                                tza tzaVar = j27.a;
                                v72 v72Var = ((h27) rv4Var3.j(tzaVar)).c.b;
                                nq7 n = mwe.n(zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2), zm4Var);
                                boolean f2 = rv4Var3.f(do3Var2);
                                Object P5 = rv4Var3.P();
                                if (f2 || P5 == lh9Var) {
                                    P5 = new kf7(do3Var2, 1);
                                    rv4Var3.o0(P5);
                                }
                                uwe.h(str, (xt4) P5, n, false, false, null, dye.c, null, null, null, false, null, t86Var, null, true, 0, 0, v72Var, null, rv4Var3, 1572864, 12779520, 6127544);
                                xbe.i(rv4Var3, pna.h(kq7Var, 12.0f));
                                String str2 = (String) do3Var2.d.getValue();
                                t86 t86Var2 = new t86(0, 7, Token.INC);
                                v72 v72Var2 = ((h27) rv4Var3.j(tzaVar)).c.b;
                                nq7 A = zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2);
                                boolean f3 = rv4Var3.f(do3Var2);
                                Object P6 = rv4Var3.P();
                                if (f3 || P6 == lh9Var) {
                                    P6 = new kf7(do3Var2, 2);
                                    rv4Var3.o0(P6);
                                }
                                uwe.h(str2, (xt4) P6, A, false, false, null, dye.d, null, null, null, false, null, t86Var2, null, false, 0, 0, v72Var2, null, rv4Var3, 1573248, 196608, 6258616);
                                rs8.u(rv4Var3, true, kq7Var, 12.0f, rv4Var3);
                            } else {
                                rv4Var3.X();
                            }
                            return pvcVar;
                    }
                }
            }, rv4Var), rv4Var, 1769856, 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lf7(do3Var, mu4Var, i);
        }
    }

    public static final void j(boolean z, long j, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        kq7 kq7Var;
        vt4Var.getClass();
        vt4Var2.getClass();
        rv4Var.g0(-98547678);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.e(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3 | 384;
        if (rv4Var.h(vt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(vt4Var2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i5 | i8;
        boolean z3 = false;
        if ((i9 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            nk0 nk0Var = kh5.e;
            ze4 ze4Var = pna.c;
            if ((i9 & 7168) == 2048) {
                z3 = true;
            }
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                P = new nv(11, vt4Var);
                rv4Var.o0(P);
            }
            z87.a(z, (xt4) P, null, null, nk0Var, 0L, false, false, ze4Var, jce.E(452417536, new jk7(j, vt4Var, vt4Var2, 0), rv4Var), rv4Var, (i9 & 14) | 819486720, 44);
            kq7Var = kq7.a;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new wl(z, j, kq7Var, vt4Var, vt4Var2, i);
        }
    }

    public static final void k(ja0 ja0Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(1508880385);
        if ((i & 6) == 0) {
            if (rv4Var.f(ja0Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(vt4Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        boolean z3 = false;
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if ((i2 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new ba0(2, vt4Var);
                rv4Var.o0(P);
            }
            nq7 b2 = dab.b(nq7Var, pvc.a, (PointerInputEventHandler) P);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, b2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            tza tzaVar = j27.a;
            long j = ((h27) rv4Var.j(tzaVar)).a.a;
            long b3 = zl1.b(0.5f, ((h27) rv4Var.j(tzaVar)).a.h);
            nq7 n = pna.n(zbe.y(mwe.u(kq7.a, false, 15), 24.0f), 24.0f);
            if ((i2 & 14) == 4) {
                z3 = true;
            }
            Object P2 = rv4Var.P();
            if (z3 || P2 == lh9Var) {
                P2 = new z90(ja0Var, 3);
                rv4Var.o0(P2);
            }
            r79.b((vt4) P2, n, j, 2.0f, b3, 0, nae.e, rv4Var, 3072, 96);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new w90(ja0Var, nq7Var, vt4Var, i, 0);
        }
    }

    public static final void l(final ar5 ar5Var, final float f, long j, long j2, rv4 rv4Var, final int i) {
        ar5 ar5Var2;
        int i2;
        boolean z;
        final long j3;
        final long j4;
        long j5;
        long g;
        int i3;
        int i4;
        ar5Var.getClass();
        rv4Var.g0(387273573);
        if ((i & 6) == 0) {
            ar5Var2 = ar5Var;
            if (rv4Var.f(ar5Var2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            ar5Var2 = ar5Var;
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i2 & 1155) != 1154) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i3 = i2 & (-8065);
                j5 = j;
                g = j2;
            } else {
                tza tzaVar = j27.a;
                j5 = ((h27) rv4Var.j(tzaVar)).a.q;
                g = rm1.g(((h27) rv4Var.j(tzaVar)).a, 6.0f);
                i3 = i2 & (-8065);
            }
            rv4Var.r();
            kq7 kq7Var = kq7.a;
            nq7 y = zbe.y(kq7Var, 6.0f);
            su9 su9Var = uu9.a;
            nq7 s = st0.s(y, 4.0f, su9Var, 28);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, s);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            j3 = j5;
            nk5.a(ar5Var2, null, zbe.y(nmd.v(tte.k(kq7Var, su9Var), g, lre.g), 4.0f), j3, rv4Var, (i3 & 14) | 48, 0);
            rv4Var.q(true);
            j4 = g;
        } else {
            rv4Var.X();
            j3 = j;
            j4 = j2;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: p39
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z1d.l(ar5.this, f, j3, j4, (rv4) obj, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void m(final ws2 ws2Var, nq7 nq7Var, final boolean z, final boolean z2, float f, float f2, float f3, final vt4 vt4Var, tu1 tu1Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        tu1 tu1Var2;
        final kq7 kq7Var;
        final float f4;
        final float f5;
        final float f6;
        boolean z4;
        boolean z5;
        ws2Var.getClass();
        rv4Var.g0(2087881505);
        if (rv4Var.f(ws2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2 | 384;
        if (rv4Var.g(z)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i7 = i6 | i3;
        if (rv4Var.g(z2)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i8 = i7 | i4 | 14352384;
        if (rv4Var.h(vt4Var)) {
            i5 = 67108864;
        } else {
            i5 = 33554432;
        }
        int i9 = i8 | i5 | 805306368;
        if ((306783379 & i9) == 306783378) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (rv4Var.U(i9 & 1, z3)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(new ok5(0L, nae.e, af0.b, false));
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
            int ordinal = tc6Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    z4 = z2;
                } else {
                    xk5.o();
                    return;
                }
            } else {
                z4 = z;
            }
            int ordinal2 = tc6Var.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    z5 = z;
                } else {
                    xk5.o();
                    return;
                }
            } else {
                z5 = z2;
            }
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new mr3(aw7Var, 9);
                rv4Var.o0(P2);
            }
            mu4 mu4Var = (mu4) P2;
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = new ao7(aw7Var, 15);
                rv4Var.o0(P3);
            }
            s39 s39Var = new s39((vt4) P3, z4, 16.0f, z5, 16.0f, 0.2f, ws2Var, mu4Var, vt4Var);
            kq7 kq7Var2 = kq7.a;
            nq7 d2 = dab.d(kq7Var2, new Object[]{ws2Var, Boolean.valueOf(z4), Boolean.valueOf(z5)}, s39Var);
            b37 d3 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, d2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d3);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            tu1Var2 = tu1Var;
            tu1Var2.invoke(rv4Var, 6);
            rv4Var.e0(-1972688151);
            rte.c(((ok5) aw7Var.getValue()).d, sze.f(kq7Var2, new c29(((ok5) aw7Var.getValue()).a, 1)), zt3.g(null, 3).a(zt3.k(null, nae.e, 0L, 7)), zt3.i(null, 3).a(zt3.m(nae.e, 0L, 7)), null, jce.E(-256523366, new mr3(aw7Var, 10), rv4Var), rv4Var, 200064, 16);
            rv4Var.q(false);
            rv4Var.q(true);
            rv4Var.e0(363964193);
            rv4Var.q(false);
            kq7Var = kq7Var2;
            f5 = 16.0f;
            f6 = 0.2f;
            f4 = 16.0f;
        } else {
            tu1Var2 = tu1Var;
            rv4Var.X();
            kq7Var = nq7Var;
            f4 = f;
            f5 = f2;
            f6 = f3;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            final tu1 tu1Var3 = tu1Var2;
            u.d = new lu4(kq7Var, z, z2, f4, f5, f6, vt4Var, tu1Var3, i) { // from class: q39
                public final /* synthetic */ float C;
                public final /* synthetic */ vt4 D;
                public final /* synthetic */ tu1 E;
                public final /* synthetic */ nq7 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(49);
                    z1d.m(ws2.this, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, (rv4) obj, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static final void n(h2a h2aVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        z82 z82Var;
        ek9 ek9Var;
        int i3;
        int i4;
        rv4Var.g0(1299927555);
        if ((i & 6) == 0) {
            if (rv4Var.f(h2aVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        boolean z2 = false;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            fi8 f = h2aVar.f();
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new fma();
                rv4Var.o0(P);
            }
            fma fmaVar = (fma) P;
            if (((int) (h2aVar.j() >> 32)) != 0 && ((int) (h2aVar.j() & 4294967295L)) != 0) {
                boolean h = rv4Var.h(fmaVar) | rv4Var.d(f.ordinal());
                if ((i2 & 14) == 4) {
                    z2 = true;
                }
                boolean z3 = h | z2;
                Object P2 = rv4Var.P();
                if (z3 || P2 == lh9Var) {
                    P2 = new r6a(4, fmaVar, f, h2aVar);
                    rv4Var.o0(P2);
                }
                bce.a(nq7Var, (xt4) P2, rv4Var, (i2 >> 3) & 14);
            } else {
                ek9Var = rv4Var.u();
                if (ek9Var != null) {
                    z82Var = new z82(h2aVar, nq7Var, i, 3);
                    ek9Var.d = z82Var;
                }
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9Var = rv4Var.u();
        if (ek9Var != null) {
            z82Var = new z82(h2aVar, nq7Var, i, 4);
            ek9Var.d = z82Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x04bc, code lost:
        if (r2 == r1) goto L116;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(int r47, final defpackage.cz7 r48, defpackage.rv4 r49, int r50) {
        /*
            Method dump skipped, instructions count: 1337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1d.o(int, cz7, rv4, int):void");
    }

    public static final void p(final w43 w43Var, final String str, final int i, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, rv4 rv4Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        ek9 u;
        lu4 lu4Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        rv4Var.g0(-1141559750);
        if (rv4Var.h(w43Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (rv4Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if (rv4Var.d(i)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i11 = i10 | i5;
        if (rv4Var.h(vt4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i12 = i11 | i6;
        if (rv4Var.h(vt4Var2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i13 = i12 | i7;
        if (rv4Var.h(vt4Var3)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i8;
        if ((74899 & i14) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i14 & 1, z)) {
            boolean i15 = c16.i(w43Var.e.a, str);
            if (i == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!i15 && !z2) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!i15 && !z3 && !z2) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z3 && !z2) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (!z4 && !z5 && !z6) {
                u = rv4Var.u();
                if (u != null) {
                    lu4Var = new lu4(w43Var, str, i, vt4Var, vt4Var2, vt4Var3, i2, 0) { // from class: bhc
                        public final /* synthetic */ vt4 C;
                        public final /* synthetic */ int a;
                        public final /* synthetic */ w43 b;
                        public final /* synthetic */ String c;
                        public final /* synthetic */ int d;
                        public final /* synthetic */ vt4 e;
                        public final /* synthetic */ vt4 f;

                        {
                            this.a = r8;
                        }

                        @Override // defpackage.lu4
                        public final Object invoke(Object obj, Object obj2) {
                            int i16 = this.a;
                            pvc pvcVar = pvc.a;
                            switch (i16) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int p = xoe.p(9);
                                    z1d.p(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p);
                                    return pvcVar;
                                default:
                                    ((Integer) obj2).getClass();
                                    int p2 = xoe.p(9);
                                    z1d.p(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p2);
                                    return pvcVar;
                            }
                        }
                    };
                    u.d = lu4Var;
                }
                return;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var.o0(P);
            }
            final aw7 aw7Var = (aw7) P;
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, kq7.a);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            ar5 c2 = rp5.c((wk3) ok3.M.getValue(), rv4Var, 0);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new p0c(aw7Var, 21);
                rv4Var.o0(P2);
            }
            kwe.d(c2, null, 0L, (vt4) P2, rv4Var, 3072, 6);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = new p0c(aw7Var, 22);
                rv4Var.o0(P3);
            }
            final boolean z7 = z6;
            final boolean z8 = z4;
            final boolean z9 = z5;
            iue.e(booleanValue, null, 0L, null, nae.e, null, (vt4) P3, jce.E(268041524, new mu4() { // from class: chc
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z10;
                    y3b y3bVar;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((zn1) obj).getClass();
                    boolean z11 = true;
                    if ((intValue & 17) != 16) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z10)) {
                        boolean z12 = z8;
                        aw7 aw7Var2 = aw7Var;
                        Object obj4 = ax1.a;
                        if (z12) {
                            rv4Var2.e0(880882769);
                            String A = yqe.A((y3b) o2b.c.getValue(), rv4Var2);
                            vt4 vt4Var4 = vt4Var;
                            boolean f = rv4Var2.f(vt4Var4);
                            Object P4 = rv4Var2.P();
                            if (f || P4 == obj4) {
                                P4 = new kf3(vt4Var4, aw7Var2, 17);
                                rv4Var2.o0(P4);
                            }
                            iue.g(A, null, bce.e, null, null, (vt4) P4, rv4Var2, 384, 26);
                            rv4Var2.q(false);
                        } else {
                            rv4Var2.e0(881433422);
                            rv4Var2.q(false);
                        }
                        if (z7) {
                            rv4Var2.e0(881485223);
                            if (w43Var.f != 1) {
                                z11 = false;
                            }
                            if (z11) {
                                y3bVar = (y3b) o2b.e.getValue();
                            } else {
                                y3bVar = (y3b) o2b.d.getValue();
                            }
                            String A2 = yqe.A(y3bVar, rv4Var2);
                            tu1 E = jce.E(1347877336, new nd1(z11, 8, (byte) 0), rv4Var2);
                            vt4 vt4Var5 = vt4Var3;
                            boolean f2 = rv4Var2.f(vt4Var5);
                            Object P5 = rv4Var2.P();
                            if (f2 || P5 == obj4) {
                                P5 = new kf3(vt4Var5, aw7Var2, 18);
                                rv4Var2.o0(P5);
                            }
                            iue.g(A2, null, E, null, null, (vt4) P5, rv4Var2, 384, 26);
                            rv4Var2.q(false);
                        } else {
                            rv4Var2.e0(882291502);
                            rv4Var2.q(false);
                        }
                        if (z9) {
                            rv4Var2.e0(882349317);
                            vt4 vt4Var6 = vt4Var2;
                            boolean f3 = rv4Var2.f(vt4Var6);
                            Object P6 = rv4Var2.P();
                            if (f3 || P6 == obj4) {
                                P6 = new kf3(vt4Var6, aw7Var2, 19);
                                rv4Var2.o0(P6);
                            }
                            iue.f(bce.f, bce.g, null, (vt4) P6, rv4Var2, 390, 26);
                            rv4Var2.q(false);
                        } else {
                            rv4Var2.e0(883280526);
                            rv4Var2.q(false);
                        }
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 14155776, 62);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        u = rv4Var.u();
        if (u != null) {
            lu4Var = new lu4(w43Var, str, i, vt4Var, vt4Var2, vt4Var3, i2, 1) { // from class: bhc
                public final /* synthetic */ vt4 C;
                public final /* synthetic */ int a;
                public final /* synthetic */ w43 b;
                public final /* synthetic */ String c;
                public final /* synthetic */ int d;
                public final /* synthetic */ vt4 e;
                public final /* synthetic */ vt4 f;

                {
                    this.a = r8;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    int i16 = this.a;
                    pvc pvcVar = pvc.a;
                    switch (i16) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int p2 = xoe.p(9);
                            z1d.p(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p2);
                            return pvcVar;
                        default:
                            ((Integer) obj2).getClass();
                            int p22 = xoe.p(9);
                            z1d.p(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p22);
                            return pvcVar;
                    }
                }
            };
            u.d = lu4Var;
        }
    }

    public static final jj9 q(bw7 bw7Var) {
        return new jj9(bw7Var, null);
    }

    public static sj4 r(sj4 sj4Var, int i) {
        py0 py0Var;
        if (i < 0 && i != -2 && i != -1) {
            p1a.k(a82.j(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i = 0;
            py0Var = py0.b;
        } else {
            py0Var = py0.a;
        }
        int i2 = i;
        py0 py0Var2 = py0Var;
        if (sj4Var instanceof zu4) {
            return zu4.d((zu4) sj4Var, null, i2, py0Var2, 1);
        }
        return new ab1(sj4Var, null, i2, py0Var2, 2);
    }

    public static final o51 s(lu4 lu4Var) {
        return new o51(lu4Var, gs3.a, -2, py0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Type inference failed for: r7v2, types: [zl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable t(defpackage.sj4 r5, defpackage.tj4 r6, defpackage.n42 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.kk4
            if (r0 == 0) goto L13
            r0 = r7
            kk4 r0 = (defpackage.kk4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kk4 r0 = new kk4
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            zl9 r5 = r0.a
            defpackage.hre.r(r7)     // Catch: java.lang.Throwable -> L28
            return r3
        L28:
            r6 = move-exception
            goto L4f
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r3
        L30:
            defpackage.hre.r(r7)
            zl9 r7 = new zl9
            r7.<init>()
            ia r1 = new ia     // Catch: java.lang.Throwable -> L4d
            r4 = 8
            r1.<init>(r4, r6, r7)     // Catch: java.lang.Throwable -> L4d
            r0.a = r7     // Catch: java.lang.Throwable -> L4d
            r0.c = r2     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r5 = r5.a(r1, r0)     // Catch: java.lang.Throwable -> L4d
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L4c
            return r6
        L4c:
            return r3
        L4d:
            r6 = move-exception
            r5 = r7
        L4f:
            java.lang.Object r5 = r5.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L5b
            boolean r7 = r5.equals(r6)
            if (r7 != 0) goto L7d
        L5b:
            d82 r7 = r0.getContext()
            r0f r0 = defpackage.r0f.I
            b82 r7 = r7.get(r0)
            w26 r7 = (defpackage.w26) r7
            if (r7 == 0) goto L7e
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L70
            goto L7e
        L70:
            java.util.concurrent.CancellationException r7 = r7.getCancellationException()
            if (r7 == 0) goto L7e
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L7d
            goto L7e
        L7d:
            throw r6
        L7e:
            if (r5 != 0) goto L81
            return r6
        L81:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L89
            defpackage.pye.e(r5, r6)
            throw r5
        L89:
            defpackage.pye.e(r6, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1d.t(sj4, tj4, n42):java.io.Serializable");
    }

    public static final Object u(sj4 sj4Var, m42 m42Var) {
        Object a2 = sj4Var.a(d48.a, m42Var);
        if (a2 == n82.a) {
            return a2;
        }
        return pvc.a;
    }

    public static final Object v(sj4 sj4Var, lu4 lu4Var, m42 m42Var) {
        int i = yk4.a;
        Object u = u(r(N(sj4Var, new we1(lu4Var, (m42) null, 2)), 0), m42Var);
        if (u == n82.a) {
            return u;
        }
        return pvc.a;
    }

    public static final ja w(sj4 sj4Var, sj4 sj4Var2, sj4 sj4Var3, sj4 sj4Var4, sj4 sj4Var5, pu4 pu4Var) {
        return new ja(12, new sj4[]{sj4Var, sj4Var2, sj4Var3, sj4Var4, sj4Var5}, pu4Var);
    }

    public static final ja x(sj4 sj4Var, sj4 sj4Var2, sj4 sj4Var3, sj4 sj4Var4, ou4 ou4Var) {
        return new ja(11, new sj4[]{sj4Var, sj4Var2, sj4Var3, sj4Var4}, ou4Var);
    }

    public static final ja y(sj4 sj4Var, sj4 sj4Var2, sj4 sj4Var3, nu4 nu4Var) {
        return new ja(10, new sj4[]{sj4Var, sj4Var2, sj4Var3}, nu4Var);
    }

    public static final sj4 z(sj4 sj4Var, long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return sj4Var;
            }
            return new s02(new dk4(new th(j, 10), sj4Var, null), 3);
        }
        vs.m("Debounce timeout should not be negative");
        return null;
    }
}
