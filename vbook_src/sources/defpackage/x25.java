package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x25  reason: default package */
/* loaded from: classes.dex */
public final class x25 implements fp3 {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public fjc b;
    public final q5a c;
    public final String d;
    public final km8 e;
    public final n04 f;
    public final boolean[] g = new boolean[4];
    public final w25 h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, w25] */
    public x25(q5a q5aVar, String str) {
        this.c = q5aVar;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[Token.CASE];
        this.h = obj;
        if (q5aVar != null) {
            this.f = new n04((int) Token.ARROW);
            this.e = new km8();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0205  */
    @Override // defpackage.fp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.km8 r23) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x25.b(km8):void");
    }

    @Override // defpackage.fp3
    public final void c() {
        dae.g(this.g);
        w25 w25Var = this.h;
        w25Var.a = false;
        w25Var.b = 0;
        w25Var.c = 0;
        n04 n04Var = this.f;
        if (n04Var != null) {
            n04Var.f();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // defpackage.fp3
    public final void d(boolean z) {
        this.b.getClass();
        if (z) {
            boolean z2 = this.p;
            this.b.a(this.o, z2 ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // defpackage.fp3
    public final void e(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.fp3
    public final void f(t94 t94Var, zc7 zc7Var) {
        zc7Var.a();
        zc7Var.b();
        this.a = (String) zc7Var.e;
        zc7Var.b();
        this.b = t94Var.s(zc7Var.c, 2);
        q5a q5aVar = this.c;
        if (q5aVar != null) {
            q5aVar.b(t94Var, zc7Var);
        }
    }
}
