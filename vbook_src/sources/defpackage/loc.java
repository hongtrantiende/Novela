package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: loc  reason: default package */
/* loaded from: classes.dex */
public final class loc extends eh0 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.eh0
    public final v50 a(v50 v50Var) {
        if (a2d.M(v50Var.c)) {
            this.k = true;
            if (this.i == 0 && this.j == 0) {
                return v50.e;
            }
            return v50Var;
        }
        throw new x50(v50Var);
    }

    @Override // defpackage.eh0
    public final void b() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.eh0, defpackage.y50
    public final boolean c() {
        if (super.c() && this.n == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.eh0, defpackage.y50
    public final ByteBuffer d() {
        int i;
        if (super.c() && (i = this.n) > 0) {
            l(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.d();
    }

    @Override // defpackage.y50
    public final void f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.l);
            this.o += min / this.b.d;
            this.l -= min;
            byteBuffer.position(position + min);
            if (this.l > 0) {
                return;
            }
            int i2 = i - min;
            int length = (this.n + i2) - this.m.length;
            ByteBuffer l = l(length);
            int i3 = a2d.i(length, 0, this.n);
            l.put(this.m, 0, i3);
            int i4 = a2d.i(length - i3, 0, i2);
            byteBuffer.limit(byteBuffer.position() + i4);
            l.put(byteBuffer);
            byteBuffer.limit(limit);
            int i5 = i2 - i4;
            int i6 = this.n - i3;
            this.n = i6;
            byte[] bArr = this.m;
            System.arraycopy(bArr, i3, bArr, 0, i6);
            byteBuffer.get(this.m, this.n, i5);
            this.n += i5;
            l.flip();
        }
    }

    @Override // defpackage.y50
    public final long i(long j) {
        return Math.max(0L, j - a2d.W(this.b.a, this.j + this.i));
    }

    @Override // defpackage.eh0
    public final void j() {
        int i;
        if (this.k) {
            if (this.n > 0) {
                this.o += i / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.eh0
    public final void k() {
        this.m = a2d.b;
    }
}
