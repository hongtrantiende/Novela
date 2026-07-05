package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vlc  reason: default package */
/* loaded from: classes3.dex */
public final class vlc implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zlc b;

    public /* synthetic */ vlc(zlc zlcVar, int i) {
        this.a = i;
        this.b = zlcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
        if (r8 == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0065 -> B:21:0x0066). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(boolean r9, defpackage.m42 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ulc
            if (r0 == 0) goto L13
            r0 = r10
            ulc r0 = (defpackage.ulc) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.E = r1
            goto L18
        L13:
            ulc r0 = new ulc
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.C
            int r1 = r0.E
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 != r3) goto L32
            boolean r8 = r0.b
            boolean r9 = r0.a
            rlc r1 = r0.f
            java.lang.Object r4 = r0.e
            bw7 r5 = r0.d
            zlc r6 = r0.c
            defpackage.hre.r(r10)
            goto L66
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r2
        L38:
            defpackage.hre.r(r10)
            zlc r8 = r8.b
            cza r10 = r8.d
            if (r10 == 0) goto L79
            r6 = r8
            r5 = r10
        L43:
            java.lang.Object r4 = r5.getValue()
            r1 = r4
            rlc r1 = (defpackage.rlc) r1
            klc r8 = r6.c
            r0.c = r6
            r0.d = r5
            r0.e = r4
            r0.f = r1
            r0.a = r9
            r0.b = r9
            r0.E = r3
            plc r8 = (defpackage.plc) r8
            java.lang.Integer r10 = r8.i()
            n82 r8 = defpackage.n82.a
            if (r10 != r8) goto L65
            return r8
        L65:
            r8 = r9
        L66:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r7 = 4
            rlc r8 = defpackage.rlc.a(r1, r8, r10, r2, r7)
            cza r5 = (defpackage.cza) r5
            boolean r8 = r5.l(r4, r8)
            if (r8 == 0) goto L43
        L79:
            pvc r8 = defpackage.pvc.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlc.a(boolean, m42):java.lang.Object");
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        Object value;
        rlc rlcVar;
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                return a(((Boolean) obj).booleanValue(), m42Var);
            default:
                List list = (List) obj;
                cza czaVar = this.b.d;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                        rlcVar = (rlc) value;
                        arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (!((tmc) obj2).a.equals("qt")) {
                                arrayList.add(obj2);
                            }
                        }
                    } while (!czaVar.l(value, rlc.a(rlcVar, false, 0, arrayList, 3)));
                    return pvc.a;
                }
                return pvc.a;
        }
    }
}
