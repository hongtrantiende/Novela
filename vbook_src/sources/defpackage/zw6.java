package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zw6  reason: default package */
/* loaded from: classes3.dex */
public final class zw6 extends aab implements mu4 {
    public final /* synthetic */ List C;
    public final /* synthetic */ ew6 D;
    public final /* synthetic */ hq7 E;
    public ArrayList a;
    public int b;
    public /* synthetic */ rr9 c;
    public /* synthetic */ oh5 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ nw6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw6(boolean z, nw6 nw6Var, List list, ew6 ew6Var, hq7 hq7Var, m42 m42Var) {
        super(3, m42Var);
        this.e = z;
        this.f = nw6Var;
        this.C = list;
        this.D = ew6Var;
        this.E = hq7Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        ew6 ew6Var = this.D;
        hq7 hq7Var = this.E;
        zw6 zw6Var = new zw6(this.e, this.f, this.C, ew6Var, hq7Var, (m42) obj3);
        zw6Var.c = (rr9) obj;
        zw6Var.d = (oh5) obj2;
        return zw6Var.invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (r6.a.d(r16, r0) == r9) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r5 = r16
            rr9 r6 = r5.c
            oh5 r3 = r5.d
            int r0 = r5.b
            r7 = 2
            r1 = 1
            r8 = 0
            n82 r9 = defpackage.n82.a
            if (r0 == 0) goto L26
            if (r0 == r1) goto L1d
            if (r0 != r7) goto L17
            defpackage.hre.r(r17)
            goto L77
        L17:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            return r8
        L1d:
            java.util.ArrayList r0 = r5.a
            defpackage.hre.r(r17)
            r10 = r0
            r0 = r17
            goto L48
        L26:
            defpackage.hre.r(r17)
            boolean r0 = r5.e
            if (r0 == 0) goto L77
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5.c = r6
            r5.d = r3
            r5.a = r4
            r5.b = r1
            java.util.List r0 = r5.C
            ew6 r1 = r5.D
            hq7 r2 = r5.E
            java.lang.Object r0 = defpackage.hx6.i(r0, r1, r2, r3, r4, r5)
            if (r0 != r9) goto L47
            goto L76
        L47:
            r10 = r4
        L48:
            oh5 r0 = (defpackage.oh5) r0
            int r1 = r10.size()
            if (r1 <= 0) goto L60
            r14 = 0
            r15 = 62
            java.lang.String r11 = "\n"
            r12 = 0
            r13 = 0
            java.lang.String r1 = defpackage.sl1.i0(r10, r11, r12, r13, r14, r15)
            nw6 r2 = r5.f
            r2.m(r1)
        L60:
            boolean r1 = defpackage.c16.i(r0, r3)
            if (r1 != 0) goto L77
            r5.c = r8
            r5.d = r8
            r5.a = r8
            r5.b = r7
            qv8 r1 = r6.a
            java.lang.Object r0 = r1.d(r5, r0)
            if (r0 != r9) goto L77
        L76:
            return r9
        L77:
            pvc r0 = defpackage.pvc.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
