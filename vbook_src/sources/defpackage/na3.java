package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: na3  reason: default package */
/* loaded from: classes.dex */
public final class na3 implements r41 {
    public final oj9 a;

    public na3(long j, hn8 hn8Var) {
        m66 m66Var = pe4.a;
        m66 m66Var2 = pe4.a;
        if (j > 0) {
            this.a = new oj9(j, m66Var2, hn8Var);
        } else {
            vs.m("size must be > 0.");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [my0, java.lang.Object] */
    public final byte[] b(String str) {
        Object gs9Var;
        Throwable th;
        str.getClass();
        Object obj = null;
        try {
            nj9 b = this.a.b(str);
            if (b != null) {
                osa k1 = pe4.a.k1(b.q());
                try {
                    ?? obj2 = new Object();
                    obj2.J(k1);
                    gs9Var = obj2.p0(obj2.b);
                    try {
                        ((qw5) k1).close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        ((qw5) k1).close();
                    } catch (Throwable th4) {
                        pye.e(th3, th4);
                    }
                    th = th3;
                    gs9Var = null;
                }
                if (th == null) {
                    dxe.r(b, null);
                } else {
                    throw th;
                }
            } else {
                gs9Var = null;
            }
        } catch (Throwable th5) {
            gs9Var = new gs9(th5);
        }
        if (!(gs9Var instanceof gs9)) {
            obj = gs9Var;
        }
        return (byte[]) obj;
    }

    public final hn8 c(String str) {
        Object gs9Var;
        str.getClass();
        Object obj = null;
        try {
            nj9 b = this.a.b(str);
            if (b != null) {
                gs9Var = b.q();
                dxe.r(b, null);
            } else {
                gs9Var = null;
            }
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (!(gs9Var instanceof gs9)) {
            obj = gs9Var;
        }
        return (hn8) obj;
    }

    @Override // defpackage.r41
    /* renamed from: d */
    public final void a(String str, byte[] bArr) {
        str.getClass();
        bArr.getClass();
        k57 k57Var = null;
        th = null;
        try {
            k57 a = this.a.a(str);
            if (a != null) {
                try {
                    lj9 p = tl1.p(pe4.a.b1(((o40) a.b).e(1)));
                    p.write(bArr);
                    try {
                        p.close();
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th == null) {
                        ((o40) a.b).b(true);
                        return;
                    }
                    throw th;
                } catch (Exception unused) {
                    k57Var = a;
                    if (k57Var != null) {
                        try {
                            ((o40) k57Var.b).b(false);
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        } catch (Exception unused3) {
        }
    }
}
