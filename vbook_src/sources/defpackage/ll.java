package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ll  reason: default package */
/* loaded from: classes3.dex */
public final class ll extends aab implements lu4 {
    public /* synthetic */ Object C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Context E;
    public final /* synthetic */ ql F;
    public String a;
    public String[] b;
    public ql c;
    public int d;
    public int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(String str, Context context, ql qlVar, m42 m42Var) {
        super(2, m42Var);
        this.D = str;
        this.E = context;
        this.F = qlVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        ll llVar = new ll(this.D, this.E, this.F, m42Var);
        llVar.C = obj;
        return llVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((ll) create((tj4) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0080 -> B:16:0x0083). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f
            r1 = 47
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 != r2) goto L1b
            int r0 = r9.e
            int r3 = r9.d
            ql r4 = r9.c
            java.lang.String[] r5 = r9.b
            java.lang.String r6 = r9.a
            java.lang.Object r7 = r9.C
            tj4 r7 = (defpackage.tj4) r7
            defpackage.hre.r(r10)
            goto L83
        L1b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            r9 = 0
            return r9
        L22:
            defpackage.hre.r(r10)
            java.lang.Object r10 = r9.C
            tj4 r10 = (defpackage.tj4) r10
            char[] r0 = new char[r2]
            r3 = 0
            r0[r3] = r1
            java.lang.String r4 = r9.D
            java.lang.String r0 = defpackage.k4b.O0(r4, r0)
            android.content.Context r4 = r9.E
            android.content.res.AssetManager r4 = r4.getAssets()
            java.lang.String[] r4 = r4.list(r0)
            if (r4 != 0) goto L42
            java.lang.String[] r4 = new java.lang.String[r3]
        L42:
            int r5 = r4.length
            ql r6 = r9.F
            r7 = r6
            r6 = r0
            r0 = r5
            r5 = r4
            r4 = r7
            r7 = r10
        L4b:
            if (r3 >= r0) goto L85
            r10 = r5[r3]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r1)
            r8.append(r10)
            java.lang.String r10 = r8.toString()
            r4.getClass()
            j6d r8 = r4.k()
            j6d r10 = r8.b(r10)
            r9.C = r7
            r9.a = r6
            r9.b = r5
            r9.c = r4
            r9.d = r3
            r9.e = r0
            r9.f = r2
            java.lang.Object r10 = r7.b(r10, r9)
            n82 r8 = defpackage.n82.a
            if (r10 != r8) goto L83
            return r8
        L83:
            int r3 = r3 + r2
            goto L4b
        L85:
            pvc r9 = defpackage.pvc.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
