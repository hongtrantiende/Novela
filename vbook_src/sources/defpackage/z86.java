package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z86  reason: default package */
/* loaded from: classes3.dex */
public final class z86 {
    public final int a;
    public final m82 b;
    public final bsa c;
    public final hm8 d;
    public final hm8 e;
    public final hm8 f;
    public final hm8 g;
    public final cza h;
    public boolean i;
    public int j;
    public iya k;

    public z86(int i, m82 m82Var, bsa bsaVar) {
        m82Var.getClass();
        this.a = i;
        this.b = m82Var;
        this.c = bsaVar;
        Boolean bool = Boolean.FALSE;
        this.d = yae.z(bool);
        this.e = yae.z(bool);
        this.f = yae.z(0);
        this.g = yae.z(0);
        this.h = dza.a(0);
        this.i = true;
        this.j = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.z86 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.w86
            if (r0 == 0) goto L13
            r0 = r5
            w86 r0 = (defpackage.w86) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            w86 r0 = new w86
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r5)
            goto L42
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r5)
            cza r4 = r4.h
            mx r5 = new mx
            r1 = 5
            r5.<init>(r4, r1)
            r0.c = r2
            java.lang.Object r4 = defpackage.z1d.C(r5, r0)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L42
            return r5
        L42:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z86.a(z86, n42):java.lang.Object");
    }

    public final void b() {
        z87.v(this.b, null, null, new y86(this, null, 0), 3);
    }

    public final int c() {
        return ((Number) this.f.getValue()).intValue();
    }

    public final boolean d() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    public final void f(int i) {
        if (this.i) {
            this.f.setValue(Integer.valueOf(i));
        }
        hm8 hm8Var = this.d;
        if (i == 0) {
            hm8Var.setValue(Boolean.FALSE);
        } else if (this.i && !d()) {
            hm8Var.setValue(Boolean.TRUE);
            if (e()) {
                iya iyaVar = this.k;
                if (iyaVar != null) {
                    iyaVar.cancel(null);
                }
                this.k = z87.v(this.b, null, null, new y86(this, null, 3), 3);
            }
        }
        Integer valueOf = Integer.valueOf(i);
        cza czaVar = this.h;
        czaVar.getClass();
        czaVar.n(null, valueOf);
    }

    public final void g() {
        z87.v(this.b, null, null, new y86(this, null, 2), 3);
    }
}
