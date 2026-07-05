package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ilb  reason: default package */
/* loaded from: classes3.dex */
public final class ilb implements u27 {
    public final x44 a;
    public final d56 b;

    public ilb(x44 x44Var) {
        this.a = x44Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i56 a = l46.a("object");
        a.getClass();
        k46 k46Var = (k46) linkedHashMap.put("type", a);
        e56 e56Var = new e56();
        n4f.s(e56Var);
        z87.z(e56Var, "input", new dw3(24));
        k46 k46Var2 = (k46) linkedHashMap.put("properties", e56Var.a());
        dw3 dw3Var = new dw3(23);
        u36 u36Var = new u36();
        dw3Var.invoke(u36Var);
        k46 k46Var3 = (k46) linkedHashMap.put("required", new t36(u36Var.a));
        this.b = new d56(linkedHashMap);
    }

    @Override // defpackage.u27
    public final d56 a() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    @Override // defpackage.u27
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.d56 r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.hlb
            if (r0 == 0) goto L13
            r0 = r6
            hlb r0 = (defpackage.hlb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            hlb r0 = new hlb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.hre.r(r6)
            goto L40
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2c:
            defpackage.hre.r(r6)
            java.lang.String r5 = r5.toString()
            r0.c = r3
            x44 r4 = r4.a
            java.lang.Object r6 = r4.e(r5, r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L40
            return r4
        L40:
            s44 r6 = (defpackage.s44) r6
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.String r5 = r6.a()
            i56 r5 = defpackage.l46.a(r5)
            r5.getClass()
            java.lang.String r0 = "log"
            java.lang.Object r5 = r4.put(r0, r5)
            k46 r5 = (defpackage.k46) r5
            boolean r5 = r6 instanceof defpackage.r44
            if (r5 == 0) goto L72
            r44 r6 = (defpackage.r44) r6
            java.lang.String r5 = r6.b
            i56 r5 = defpackage.l46.a(r5)
            r5.getClass()
            java.lang.String r6 = "data"
            java.lang.Object r5 = r4.put(r6, r5)
            k46 r5 = (defpackage.k46) r5
            goto L89
        L72:
            boolean r5 = r6 instanceof defpackage.q44
            if (r5 == 0) goto L97
            q44 r6 = (defpackage.q44) r6
            java.lang.String r5 = r6.b
            i56 r5 = defpackage.l46.a(r5)
            r5.getClass()
            java.lang.String r6 = "error"
            java.lang.Object r5 = r4.put(r6, r5)
            k46 r5 = (defpackage.k46) r5
        L89:
            d56 r5 = new d56
            r5.<init>(r4)
            java.lang.String r4 = r5.toString()
            d56 r4 = defpackage.qye.l(r4)
            return r4
        L97:
            defpackage.xk5.o()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilb.b(d56, n42):java.lang.Object");
    }

    @Override // defpackage.u27
    public final String getDescription() {
        return "Run an extension script from a dev payload; returns logs and the result JSON.";
    }

    @Override // defpackage.u27
    public final String getName() {
        return "testExtension";
    }
}
