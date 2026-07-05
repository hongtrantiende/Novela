package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c93  reason: default package */
/* loaded from: classes3.dex */
public final class c93 implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h93 b;

    public /* synthetic */ c93(h93 h93Var, int i) {
        this.a = i;
        this.b = h93Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.f34 r6, defpackage.m42 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.f93
            if (r0 == 0) goto L13
            r0 = r7
            f93 r0 = (defpackage.f93) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            f93 r0 = new f93
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            h93 r5 = r5.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            cza r6 = r0.b
            f34 r0 = r0.a
            defpackage.hre.r(r7)
            goto L4e
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r3
        L32:
            defpackage.hre.r(r7)
            cza r7 = r5.N
            klc r1 = r5.V
            r0.a = r6
            r0.b = r7
            r0.e = r2
            plc r1 = (defpackage.plc) r1
            java.lang.Integer r0 = r1.i()
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r4 = r0
            r0 = r6
            r6 = r7
            r7 = r4
        L4e:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 != r2) goto L5b
            if (r0 == 0) goto L5b
            java.lang.String r7 = r0.h
            goto L5c
        L5b:
            r7 = r3
        L5c:
            r6.m(r7)
            cza r5 = r5.H
            if (r0 == 0) goto L66
            java.util.Map r6 = r0.r
            goto L67
        L66:
            r6 = r3
        L67:
            if (r6 != 0) goto L6b
            ls3 r6 = defpackage.ls3.a
        L6b:
            r5.getClass()
            r5.n(r3, r6)
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c93.a(f34, m42):java.lang.Object");
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        Object value;
        Object value2;
        switch (this.a) {
            case 0:
                moc mocVar = (moc) obj;
                Object obj2 = mocVar.a;
                Object obj3 = mocVar.b;
                oia oiaVar = (oia) mocVar.c;
                List list = (List) obj3;
                ((Number) obj2).longValue();
                boolean isEmpty = list.isEmpty();
                cza czaVar = this.b.W;
                if (!isEmpty) {
                    if (czaVar != null) {
                        do {
                            value2 = czaVar.getValue();
                        } while (!czaVar.l(value2, xq6.a((xq6) value2, 0L, false, false, null, false, oiaVar.b, oiaVar.c, false, null, list, 413)));
                    }
                } else if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, xq6.a((xq6) value, 0L, false, false, null, false, oiaVar.b, oiaVar.c, false, null, list, 413)));
                }
                return pvc.a;
            default:
                return a((f34) obj, m42Var);
        }
    }
}
