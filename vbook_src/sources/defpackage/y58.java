package defpackage;

import java.util.HashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y58  reason: default package */
/* loaded from: classes3.dex */
public final class y58 extends aab implements lu4 {
    public final /* synthetic */ fp1 C;
    public final /* synthetic */ pta D;
    public final /* synthetic */ sm2 E;
    public final /* synthetic */ qw7 F;
    public final /* synthetic */ xl9 G;
    public final /* synthetic */ HashSet H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public qw7 a;
    public HashSet b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y58(fp1 fp1Var, pta ptaVar, sm2 sm2Var, qw7 qw7Var, xl9 xl9Var, HashSet hashSet, int i, int i2, m42 m42Var) {
        super(2, m42Var);
        this.C = fp1Var;
        this.D = ptaVar;
        this.E = sm2Var;
        this.F = qw7Var;
        this.G = xl9Var;
        this.H = hashSet;
        this.I = i;
        this.J = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        y58 y58Var = new y58(this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, m42Var);
        y58Var.f = obj;
        return y58Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((y58) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r9 == r7) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f
            m82 r0 = (defpackage.m82) r0
            int r1 = r8.e
            java.util.HashSet r2 = r8.H
            fp1 r3 = r8.C
            r4 = 2
            r5 = 1
            r6 = 0
            n82 r7 = defpackage.n82.a
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L27
            if (r1 != r4) goto L21
            int r1 = r8.d
            int r4 = r8.c
            java.util.HashSet r5 = r8.b
            qw7 r7 = r8.a
            defpackage.hre.r(r9)
            goto L62
        L21:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r6
        L27:
            defpackage.hre.r(r9)
            goto L3d
        L2b:
            defpackage.hre.r(r9)
            r8.f = r0
            r8.e = r5
            pta r9 = r8.D
            sm2 r1 = r8.E
            java.lang.Object r9 = defpackage.fp1.b(r3, r9, r1, r8)
            if (r9 != r7) goto L3d
            goto L5d
        L3d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L74
            r8.f = r0
            qw7 r9 = r8.F
            r8.a = r9
            r8.b = r2
            int r1 = r8.I
            r8.c = r1
            int r5 = r8.J
            r8.d = r5
            r8.e = r4
            java.lang.Object r4 = r9.o(r8)
            if (r4 != r7) goto L5e
        L5d:
            return r7
        L5e:
            r7 = r9
            r4 = r1
            r1 = r5
            r5 = r2
        L62:
            int r4 = r4 + r1
            java.lang.Integer r9 = new java.lang.Integer     // Catch: java.lang.Throwable -> L6f
            r9.<init>(r4)     // Catch: java.lang.Throwable -> L6f
            r5.remove(r9)     // Catch: java.lang.Throwable -> L6f
            r7.q(r6)
            goto L74
        L6f:
            r8 = move-exception
            r7.q(r6)
            throw r8
        L74:
            boolean r9 = defpackage.k27.v(r0)
            if (r9 == 0) goto L8a
            bm1 r9 = r3.j
            xl9 r8 = r8.G
            int r0 = r8.a
            int r1 = r2.size()
            int r0 = r0 - r1
            int r8 = r8.a
            r9.N(r0, r8)
        L8a:
            pvc r8 = defpackage.pvc.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y58.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
