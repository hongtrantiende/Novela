package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hh8  reason: default package */
/* loaded from: classes3.dex */
public final class hh8 implements f76 {
    public final /* synthetic */ int a;
    public final Object b;

    public hh8(bx8 bx8Var, int i) {
        this.a = i;
        bx8Var.getClass();
        switch (i) {
            case 1:
                this.b = bx8Var;
                return;
            default:
                this.b = bx8Var;
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v2, types: [my0, java.lang.Object] */
    @Override // defpackage.f76
    public final Object a(m42 m42Var) {
        Throwable th;
        int i = this.a;
        byte[] bArr = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                sw2 sw2Var = ab3.a;
                return z87.E(ru2.c, new rg0((bx8) obj, null, 17), m42Var);
            case 1:
                sw2 sw2Var2 = ab3.a;
                return z87.E(ru2.c, new rg0((bx8) obj, null, 17), m42Var);
            default:
                pe4.a.getClass();
                qw5 J = tl1.J(((hn8) obj).toFile());
                ?? obj2 = new Object();
                try {
                    obj2.J(J);
                    byte[] p0 = obj2.p0(obj2.b);
                    try {
                        J.close();
                        obj2.o();
                    } catch (Throwable th2) {
                        bArr = th2;
                    }
                    byte[] bArr2 = bArr;
                    bArr = p0;
                    th = bArr2;
                } catch (Throwable th3) {
                    try {
                        J.close();
                        obj2.o();
                        th = th3;
                    } catch (Throwable th4) {
                        pye.e(th3, th4);
                        th = th3;
                    }
                }
                if (th == null) {
                    return bArr;
                }
                throw th;
        }
    }

    @Override // defpackage.f76
    public final String b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return fpe.p((bx8) obj);
            case 1:
                return fpe.p((bx8) obj);
            default:
                return ((hn8) obj).a.t();
        }
    }

    @Override // defpackage.f76
    public final String getName() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return fpe.o((bx8) obj);
            case 1:
                return fpe.o((bx8) obj);
            default:
                String b = ((hn8) obj).b();
                int i2 = yyc.a;
                return yyc.a(b);
        }
    }

    @Override // defpackage.f76
    public final Object v() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new qw5(fpe.v((bx8) obj));
            case 1:
                return new qw5(fpe.v((bx8) obj));
            default:
                pe4.a.getClass();
                return tl1.J(((hn8) obj).toFile());
        }
    }

    public hh8(hn8 hn8Var) {
        this.a = 2;
        this.b = hn8Var;
    }
}
