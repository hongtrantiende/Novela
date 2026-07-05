package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wr0  reason: default package */
/* loaded from: classes3.dex */
public final class wr0 extends aab implements lu4 {
    public final /* synthetic */ AtomicInteger C;
    public final /* synthetic */ List D;
    public int a;
    public int b;
    public final /* synthetic */ zr0 c;
    public final /* synthetic */ hk2 d;
    public final /* synthetic */ lu4 e;
    public final /* synthetic */ lu4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr0(zr0 zr0Var, hk2 hk2Var, lu4 lu4Var, lu4 lu4Var2, AtomicInteger atomicInteger, List list, m42 m42Var) {
        super(2, m42Var);
        this.c = zr0Var;
        this.d = hk2Var;
        this.e = lu4Var;
        this.f = lu4Var2;
        this.C = atomicInteger;
        this.D = list;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new wr0(this.c, this.d, this.e, this.f, this.C, this.D, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((wr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r15 == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
        if (r1 == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
        return r6;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.b
            pvc r1 = defpackage.pvc.a
            r2 = 2
            zr0 r3 = r14.c
            r4 = 1
            hk2 r5 = r14.d
            n82 r6 = defpackage.n82.a
            if (r0 == 0) goto L24
            if (r0 == r4) goto L20
            if (r0 != r2) goto L19
            int r0 = r14.a
            defpackage.hre.r(r15)
            goto L9a
        L19:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r14)
            r14 = 0
            return r14
        L20:
            defpackage.hre.r(r15)
            goto L30
        L24:
            defpackage.hre.r(r15)
            r14.b = r4
            java.lang.Object r15 = defpackage.zr0.a(r3, r5, r14)
            if (r15 != r6) goto L30
            goto L99
        L30:
            java.lang.Number r15 = (java.lang.Number) r15
            int r0 = r15.intValue()
            if (r0 <= 0) goto La4
            klc r15 = r3.g
            java.util.Map r7 = r5.b
            java.lang.String r8 = r5.a
            java.lang.String r9 = r5.l
            plc r15 = (defpackage.plc) r15
            java.lang.String r15 = r15.f(r7, r8, r9)
            a58 r3 = r3.f
            int r7 = r5.e
            r14.a = r0
            r14.b = r2
            d58 r3 = (defpackage.d58) r3
            e56 r2 = new e56
            r2.<init>()
            java.lang.String r9 = "book_id"
            defpackage.z87.y(r2, r9, r8)
            java.lang.String r8 = "book_name"
            defpackage.z87.y(r2, r8, r15)
            java.lang.Integer r15 = new java.lang.Integer
            r15.<init>(r7)
            java.lang.String r7 = "book_type"
            defpackage.z87.x(r2, r7, r15)
            java.lang.Integer r15 = new java.lang.Integer
            r15.<init>(r0)
            java.lang.String r7 = "new_chapter_count"
            defpackage.z87.x(r2, r7, r15)
            d56 r15 = r2.a()
            java.lang.String r12 = r15.toString()
            ii2 r15 = r3.a
            gk2 r15 = r15.M
            java.lang.String r11 = defpackage.ube.B()
            yj1 r2 = defpackage.by5.a
            zx5 r2 = r2.k()
            long r9 = r2.b()
            to2 r7 = new to2
            r8 = 1
            r13 = 0
            r7.<init>(r8, r9, r11, r12, r13)
            r15.C0(r7)
            if (r1 != r6) goto L9a
        L99:
            return r6
        L9a:
            java.lang.Integer r15 = new java.lang.Integer
            r15.<init>(r0)
            lu4 r0 = r14.e
            r0.invoke(r5, r15)
        La4:
            java.util.concurrent.atomic.AtomicInteger r15 = r14.C
            int r15 = r15.addAndGet(r4)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r15)
            java.util.List r15 = r14.D
            int r15 = r15.size()
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r15)
            lu4 r14 = r14.f
            r14.invoke(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
