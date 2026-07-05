package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n6c  reason: default package */
/* loaded from: classes3.dex */
public final class n6c implements i6c {
    public static final /* synthetic */ int s = 0;
    public final dx a;
    public final cza b;
    public final cza c;
    public final cza d;
    public final cza e;
    public final cza f;
    public final cza g;
    public final cza h;
    public final cza i;
    public final cza j;
    public final cza k;
    public final cza l;
    public final cza m;
    public final cza n;
    public final cza o;
    public final cza p;
    public final cza q;
    public final m41 r;

    static {
        r76[] r76VarArr = dx.W;
    }

    public n6c(dx dxVar) {
        mv mvVar;
        float f;
        u68 u68Var = dxVar.f;
        this.a = dxVar;
        u68 u68Var2 = dxVar.c;
        r76[] r76VarArr = dx.W;
        String str = (String) u68Var2.c(r76VarArr[1], dxVar);
        String str2 = (String) dxVar.d.c(r76VarArr[2], dxVar);
        String obj = k4b.N0((String) dxVar.e.c(r76VarArr[3], dxVar)).toString();
        if (!k4b.j0(obj)) {
            mv.b.getClass();
            mvVar = hq7.j(obj);
        } else if (!k4b.j0((String) u68Var.c(r76VarArr[4], dxVar))) {
            mvVar = mv.d;
        } else {
            mvVar = mv.c;
        }
        this.b = dza.a(new c6c(str, str2, mvVar.a));
        this.c = dza.a(Integer.valueOf(((Number) dxVar.h.c(r76VarArr[6], dxVar)).intValue()));
        this.d = dza.a(Float.valueOf(((Number) dxVar.i.c(r76VarArr[7], dxVar)).floatValue()));
        this.e = dza.a(null);
        this.f = dza.a(b());
        this.g = dza.a(Integer.valueOf(((Number) dxVar.j.c(r76VarArr[8], dxVar)).intValue()));
        dza.a("");
        dza.a("appPreferences.themeColor");
        Boolean bool = (Boolean) dxVar.k.c(r76VarArr[9], dxVar);
        bool.getClass();
        this.h = dza.a(bool);
        Boolean bool2 = (Boolean) dxVar.l.c(r76VarArr[10], dxVar);
        bool2.getClass();
        this.i = dza.a(bool2);
        Boolean bool3 = (Boolean) dxVar.m.c(r76VarArr[11], dxVar);
        bool3.booleanValue();
        this.j = dza.a(bool3);
        Boolean bool4 = (Boolean) dxVar.n.c(r76VarArr[12], dxVar);
        bool4.getClass();
        this.k = dza.a(bool4);
        this.l = dza.a((String) dxVar.o.c(r76VarArr[13], dxVar));
        float floatValue = ((Number) dxVar.p.c(r76VarArr[14], dxVar)).floatValue();
        Float valueOf = floatValue <= nae.e ? null : Float.valueOf(floatValue);
        if (valueOf != null) {
            f = valueOf.floatValue();
        } else {
            f = 1.0f;
        }
        this.m = dza.a(Float.valueOf(f));
        float floatValue2 = ((Number) dxVar.q.c(r76VarArr[15], dxVar)).floatValue();
        Float valueOf2 = floatValue2 <= nae.e ? null : Float.valueOf(floatValue2);
        this.n = dza.a(Float.valueOf(valueOf2 != null ? valueOf2.floatValue() : 1.0f));
        this.o = dza.a(Integer.valueOf(((Number) dxVar.r.c(r76VarArr[16], dxVar)).intValue()));
        this.p = dza.a((String) u68Var.c(r76VarArr[4], dxVar));
        this.q = dza.a(Float.valueOf(((Number) dxVar.g.c(r76VarArr[5], dxVar)).floatValue()));
        sw2 sw2Var = ab3.a;
        m41 a = k27.a(ru2.c);
        this.r = a;
        z87.v(a, null, null, new q4c(this, (m42) null, 5), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[LOOP:0: B:18:0x006a->B:20:0x0070, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(defpackage.n6c r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.m6c
            if (r0 == 0) goto L13
            r0 = r5
            m6c r0 = (defpackage.m6c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            m6c r0 = new m6c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r4 = r0.b
            int r5 = r0.d
            r1 = 1
            if (r5 == 0) goto L2e
            if (r5 != r1) goto L27
            q36 r5 = r0.a
            defpackage.hre.r(r4)
            goto L44
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r4)
            q36 r5 = defpackage.r36.d
            r0.a = r5
            r0.d = r1
            tza r4 = defpackage.fr9.a
            java.lang.String r4 = "composeResources/com.reader.resources/files/theme.json"
            java.lang.Object r4 = defpackage.ns2.b(r4)
            n82 r0 = defpackage.n82.a
            if (r4 != r0) goto L44
            return r0
        L44:
            byte[] r4 = (byte[]) r4
            java.lang.String r4 = defpackage.r4b.F(r4)
            r5.getClass()
            sz r0 = new sz
            c4b r1 = defpackage.c4b.a
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Object r4 = r5.a(r0, r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.tl1.s(r4, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L6a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            c6c r1 = new c6c
            java.lang.String r2 = "none"
            r1.<init>(r0, r0, r2)
            r5.add(r1)
            goto L6a
        L81:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n6c.a(n6c, n42):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [gs9] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final List b() {
        Object gs9Var;
        ?? gs9Var2;
        String str;
        String str2;
        dx dxVar = this.a;
        String str3 = (String) dxVar.s.c(dx.W[17], dxVar);
        boolean j0 = k4b.j0(str3);
        ks3 ks3Var = ks3.a;
        if (j0) {
            return ks3Var;
        }
        try {
            q36 q36Var = r36.d;
            q36Var.getClass();
            gs9Var = (List) q36Var.a(new sz(c6c.Companion.serializer(), 0), str3);
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (hs9.a(gs9Var) != null) {
            try {
                q36 q36Var2 = r36.d;
                q36Var2.getClass();
                Iterable<l6c> iterable = (Iterable) q36Var2.a(new sz(l6c.Companion.serializer(), 0), str3);
                gs9Var2 = new ArrayList(tl1.s(iterable, 10));
                for (l6c l6cVar : iterable) {
                    hq7 hq7Var = mv.b;
                    String str4 = l6cVar.c;
                    hq7Var.getClass();
                    mv j = hq7.j(str4);
                    String str5 = l6cVar.a;
                    String str6 = l6cVar.b;
                    if (j == mv.c && (str2 = l6cVar.c) != null && !k4b.j0(str2)) {
                        str = "image";
                        gs9Var2.add(new c6c(str5, str6, str));
                    }
                    str = j.a;
                    gs9Var2.add(new c6c(str5, str6, str));
                }
            } catch (Throwable th2) {
                gs9Var2 = new gs9(th2);
            }
            if (!(gs9Var2 instanceof gs9)) {
                ks3Var = gs9Var2;
            }
            gs9Var = ks3Var;
        }
        return (List) gs9Var;
    }

    public final void c(String str, String str2, mv mvVar) {
        str.getClass();
        str2.getClass();
        dx dxVar = this.a;
        u68 u68Var = dxVar.c;
        r76[] r76VarArr = dx.W;
        u68Var.e(r76VarArr[1], str);
        dxVar.d.e(r76VarArr[2], str2);
        String str3 = mvVar.a;
        dxVar.e.e(r76VarArr[3], str3);
        c6c c6cVar = new c6c(str, str2, str3);
        cza czaVar = this.b;
        czaVar.getClass();
        czaVar.n(null, c6cVar);
    }
}
