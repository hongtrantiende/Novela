package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lsa  reason: default package */
/* loaded from: classes.dex */
public final class lsa implements y50 {
    public int b;
    public float c;
    public float d;
    public v50 e;
    public v50 f;
    public v50 g;
    public v50 h;
    public boolean i;
    public ksa j;
    public ByteBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    @Override // defpackage.y50
    public final boolean c() {
        boolean z;
        if (this.o) {
            ksa ksaVar = this.j;
            if (ksaVar != null) {
                if (ksaVar.k >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                wq9.D(z);
                if (ksaVar.i.o() * ksaVar.k * ksaVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.y50
    public final ByteBuffer d() {
        boolean z;
        ksa ksaVar = this.j;
        if (ksaVar != null) {
            jsa jsaVar = ksaVar.i;
            int i = ksaVar.b;
            boolean z2 = true;
            if (ksaVar.k >= 0) {
                z = true;
            } else {
                z = false;
            }
            wq9.D(z);
            int o = jsaVar.o() * ksaVar.k * i;
            if (o > 0) {
                if (this.k.capacity() < o) {
                    this.k = ByteBuffer.allocateDirect(o).order(ByteOrder.nativeOrder());
                } else {
                    this.k.clear();
                }
                ByteBuffer byteBuffer = this.k;
                if (ksaVar.k < 0) {
                    z2 = false;
                }
                wq9.D(z2);
                int min = Math.min(byteBuffer.remaining() / (jsaVar.o() * i), ksaVar.k);
                jsaVar.b(min, byteBuffer);
                ksaVar.k -= min;
                System.arraycopy(jsaVar.h(), min * i, jsaVar.h(), 0, ksaVar.k * i);
                this.k.flip();
                this.n += o;
                this.l = this.k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = y50.a;
        return byteBuffer2;
    }

    @Override // defpackage.y50
    public final void e(w50 w50Var) {
        boolean z;
        if (isActive()) {
            v50 v50Var = this.e;
            this.g = v50Var;
            v50 v50Var2 = this.f;
            this.h = v50Var2;
            if (this.i) {
                int i = v50Var.a;
                int i2 = v50Var.b;
                float f = this.c;
                float f2 = this.d;
                int i3 = v50Var2.a;
                if (v50Var.c == 4) {
                    z = true;
                } else {
                    z = false;
                }
                this.j = new ksa(i, i2, f, f2, i3, z);
            } else {
                ksa ksaVar = this.j;
                if (ksaVar != null) {
                    ksaVar.j = 0;
                    ksaVar.k = 0;
                    ksaVar.l = 0;
                    ksaVar.m = 0;
                    ksaVar.n = 0;
                    ksaVar.o = 0;
                    ksaVar.p = 0;
                    ksaVar.q = 0.0d;
                    ksaVar.i.flush();
                }
            }
        }
        this.l = y50.a;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // defpackage.y50
    public final void f(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ksa ksaVar = this.j;
        ksaVar.getClass();
        this.m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i = ksaVar.b;
        jsa jsaVar = ksaVar.i;
        int o = remaining / (jsaVar.o() * i);
        jsaVar.p(o);
        jsaVar.a(remaining, byteBuffer);
        ksaVar.j += o;
        ksaVar.b();
    }

    @Override // defpackage.y50
    public final v50 g(v50 v50Var) {
        int i = v50Var.c;
        if (i != 2 && i != 4) {
            throw new x50(v50Var);
        }
        int i2 = this.b;
        if (i2 == -1) {
            i2 = v50Var.a;
        }
        this.e = v50Var;
        v50 v50Var2 = new v50(i2, v50Var.b, i);
        this.f = v50Var2;
        this.i = true;
        return v50Var2;
    }

    @Override // defpackage.y50
    public final void h() {
        ksa ksaVar = this.j;
        if (ksaVar != null) {
            int i = ksaVar.j;
            float f = ksaVar.c;
            float f2 = ksaVar.d;
            int i2 = ksaVar.o;
            int i3 = ksaVar.k + ((int) (((((((i - i2) / (f / f2)) + i2) + ksaVar.q) + ksaVar.l) / (ksaVar.e * f2)) + 0.5d));
            ksaVar.q = 0.0d;
            jsa jsaVar = ksaVar.i;
            int i4 = ksaVar.h * 2;
            jsaVar.p(i4 + i);
            jsaVar.c(i * ksaVar.b, i4);
            ksaVar.j = i4 + ksaVar.j;
            ksaVar.b();
            if (ksaVar.k > i3) {
                ksaVar.k = Math.max(i3, 0);
            }
            ksaVar.j = 0;
            ksaVar.o = 0;
            ksaVar.l = 0;
        }
        this.o = true;
    }

    @Override // defpackage.y50
    public final long i(long j) {
        if (this.n >= 1024) {
            long j2 = this.m;
            ksa ksaVar = this.j;
            ksaVar.getClass();
            long o = j2 - (ksaVar.i.o() * (ksaVar.j * ksaVar.b));
            int i = this.h.a;
            int i2 = this.g.a;
            long j3 = this.n;
            if (i == i2) {
                return a2d.Y(j, j3, o, RoundingMode.DOWN);
            }
            return a2d.Y(j, j3 * i2, o * i, RoundingMode.DOWN);
        }
        return (long) (j / this.c);
    }

    @Override // defpackage.y50
    public final boolean isActive() {
        if (this.f.a != -1) {
            if (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.y50
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        v50 v50Var = v50.e;
        this.e = v50Var;
        this.f = v50Var;
        this.g = v50Var;
        this.h = v50Var;
        ByteBuffer byteBuffer = y50.a;
        this.k = byteBuffer;
        this.l = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }
}
