package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z3  reason: default package */
/* loaded from: classes.dex */
public final class z3 implements fp3 {
    public final /* synthetic */ int a;
    public final ea1 b;
    public final km8 c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public fjc h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public vq4 m;
    public int n;
    public long o;

    public z3(String str, int i, int i2, String str2) {
        this.a = i2;
        switch (i2) {
            case 1:
                ea1 ea1Var = new ea1(new byte[16], 16);
                this.b = ea1Var;
                this.c = new km8(ea1Var.b);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                return;
            default:
                ea1 ea1Var2 = new ea1(new byte[Token.CASE], (int) Token.CASE);
                this.b = ea1Var2;
                this.c = new km8(ea1Var2.b);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x040c  */
    @Override // defpackage.fp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.km8 r31) {
        /*
            Method dump skipped, instructions count: 1334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3.b(km8):void");
    }

    @Override // defpackage.fp3
    public final void c() {
        switch (this.a) {
            case 0:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                return;
            default:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                return;
        }
    }

    @Override // defpackage.fp3
    public final void d(boolean z) {
        int i = this.a;
    }

    @Override // defpackage.fp3
    public final void e(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                return;
            default:
                this.o = j;
                return;
        }
    }

    @Override // defpackage.fp3
    public final void f(t94 t94Var, zc7 zc7Var) {
        switch (this.a) {
            case 0:
                zc7Var.a();
                zc7Var.b();
                this.g = (String) zc7Var.e;
                zc7Var.b();
                this.h = t94Var.s(zc7Var.c, 1);
                return;
            default:
                zc7Var.a();
                zc7Var.b();
                this.g = (String) zc7Var.e;
                zc7Var.b();
                this.h = t94Var.s(zc7Var.c, 1);
                return;
        }
    }

    private final void a(boolean z) {
    }

    private final void g(boolean z) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z3(String str) {
        this(null, 0, 0, str);
        this.a = 0;
    }
}
