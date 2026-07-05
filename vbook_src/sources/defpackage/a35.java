package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a35  reason: default package */
/* loaded from: classes.dex */
public final class a35 implements fp3 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final q5a a;
    public final km8 b;
    public final boolean[] c = new boolean[4];
    public final y25 d;
    public final n04 e;
    public z25 f;
    public long g;
    public String h;
    public fjc i;
    public boolean j;
    public long k;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, y25] */
    public a35(q5a q5aVar) {
        this.a = q5aVar;
        ?? obj = new Object();
        obj.e = new byte[Token.CASE];
        this.d = obj;
        this.k = -9223372036854775807L;
        this.e = new n04((int) Token.ARROW);
        this.b = new km8();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    @Override // defpackage.fp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.km8 r20) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a35.b(km8):void");
    }

    @Override // defpackage.fp3
    public final void c() {
        dae.g(this.c);
        y25 y25Var = this.d;
        y25Var.a = false;
        y25Var.c = 0;
        y25Var.b = 0;
        z25 z25Var = this.f;
        if (z25Var != null) {
            z25Var.b = false;
            z25Var.c = false;
            z25Var.d = false;
            z25Var.e = -1;
        }
        n04 n04Var = this.e;
        if (n04Var != null) {
            n04Var.f();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.fp3
    public final void d(boolean z) {
        this.f.getClass();
        if (z) {
            this.f.b(this.g, 0, this.j);
            z25 z25Var = this.f;
            z25Var.b = false;
            z25Var.c = false;
            z25Var.d = false;
            z25Var.e = -1;
        }
    }

    @Override // defpackage.fp3
    public final void e(int i, long j) {
        this.k = j;
    }

    @Override // defpackage.fp3
    public final void f(t94 t94Var, zc7 zc7Var) {
        zc7Var.a();
        zc7Var.b();
        this.h = (String) zc7Var.e;
        zc7Var.b();
        fjc s = t94Var.s(zc7Var.c, 2);
        this.i = s;
        this.f = new z25(s);
        this.a.b(t94Var, zc7Var);
    }
}
