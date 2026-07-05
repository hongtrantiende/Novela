package defpackage;

import android.content.Context;
import android.os.Looper;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nt5  reason: default package */
/* loaded from: classes.dex */
public final class nt5 implements ura, w35, aaa, z8f {
    public static final nt5 c = new nt5(0, true);
    public static final nt5 d = new nt5(0, false);
    public final /* synthetic */ int a;
    public boolean b;

    public nt5(x78 x78Var, w78 w78Var) {
        boolean z;
        boolean z2;
        int i;
        this.a = 4;
        int i2 = w78Var.a;
        ByteBuffer byteBuffer = w78Var.b;
        if (i2 != 6 && i2 != 3) {
            z = false;
        } else {
            z = true;
        }
        wq9.s(z);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        ea1 ea1Var = new ea1(bArr, min);
        if (!x78Var.a) {
            if (ea1Var.f()) {
                this.b = false;
                return;
            }
            int g = ea1Var.g(2);
            boolean f = ea1Var.f();
            if (!x78Var.b) {
                if (!f) {
                    this.b = true;
                    return;
                }
                if (g != 3 && g != 0) {
                    z2 = ea1Var.f();
                } else {
                    z2 = true;
                }
                ea1Var.n();
                if (x78Var.d) {
                    if (ea1Var.f()) {
                        if (x78Var.e) {
                            ea1Var.n();
                        } else {
                            throw new Exception();
                        }
                    }
                    if (!x78Var.c) {
                        if (g != 3) {
                            ea1Var.n();
                        }
                        ea1Var.o(x78Var.f);
                        if (g != 2 && g != 0 && !z2) {
                            ea1Var.o(3);
                        }
                        if (g != 3 && g != 0) {
                            i = ea1Var.g(8);
                        } else {
                            i = 255;
                        }
                        this.b = i != 0;
                        return;
                    }
                    throw new Exception();
                }
                throw new Exception();
            }
            throw new Exception();
        }
        throw new Exception();
    }

    @Override // defpackage.w35
    public boolean b(cna cnaVar) {
        return this.b;
    }

    @Override // defpackage.z8f
    public /* bridge */ /* synthetic */ Object d(x8f x8fVar) {
        o2f a;
        InputStream u = r1d.u(x8fVar);
        try {
            int i = 4096;
            if (this.b) {
                if (u instanceof w9f) {
                    long length = ((w9f) u).zza().length();
                    if (length == 0) {
                        i = 512;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                a = o2f.a(dcc.n(u, i), true);
            } else {
                a = o2f.a(dcc.n(u, 4096), false);
            }
            bue.d(u, null);
            return a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                bue.d(u, th);
                throw th2;
            }
        }
    }

    public void f(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
    }

    @Override // defpackage.w35
    public boolean g() {
        return this.b;
    }

    @Override // defpackage.aaa
    public void h(gi1 gi1Var, gi1 gi1Var2, s76 s76Var) {
        bze e = s76Var.e().e();
        if (!(e instanceof l19) && !c16.i(e, s9a.f)) {
            if (this.b) {
                if (!c16.i(e, a5b.g) && !c16.i(e, a5b.h) && !(e instanceof w59) && !(e instanceof t9a)) {
                    return;
                }
                String g = gi1Var2.g();
                throw new IllegalArgumentException("Serializer for " + g + " of kind " + e + " cannot be serialized polymorphically with class discriminator.");
            }
            return;
        }
        String g2 = gi1Var2.g();
        throw new IllegalArgumentException("Serializer for " + g2 + " can't be registered as a subclass for polymorphic serialization because its kind " + e + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }

    @Override // defpackage.aaa
    public void i(gi1 gi1Var, xt4 xt4Var) {
        gi1Var.getClass();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return rs8.m("}", new StringBuilder("IncorrectFragmentation{expected="), !this.b);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.aaa
    public void c(gi1 gi1Var, xt4 xt4Var) {
    }

    @Override // defpackage.aaa
    public void e(gi1 gi1Var, xt4 xt4Var) {
    }

    public /* synthetic */ nt5(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public nt5(a46 a46Var) {
        this.a = 3;
        this.b = a46Var.l != yh1.a;
    }

    public nt5(Context context, Looper looper, xfb xfbVar) {
        this.a = 6;
        new d38(context.getApplicationContext());
        xfbVar.a(looper, null);
        xfbVar.a(Looper.getMainLooper(), null);
    }

    public /* synthetic */ nt5(int i) {
        this.a = i;
    }
}
