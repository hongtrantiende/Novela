package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u6e  reason: default package */
/* loaded from: classes.dex */
public final class u6e extends v6e {
    public final byte[] d;
    public final int e;
    public final int f;

    public u6e(byte[] bArr, int i, int i2) {
        s6e.c(i, i + i2, bArr.length);
        this.d = bArr;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.s6e
    public final byte a(int i) {
        return this.d[this.e + i];
    }

    @Override // defpackage.s6e
    public final int b() {
        return this.f;
    }

    @Override // defpackage.s6e
    public final v6e d(int i, int i2) {
        int c = s6e.c(i, i2, this.f);
        if (c == 0) {
            return s6e.b;
        }
        return new u6e(this.d, this.e + i, c);
    }

    @Override // defpackage.s6e
    public final void f(byte[] bArr, int i) {
        System.arraycopy(this.d, this.e, bArr, 0, i);
    }

    @Override // defpackage.s6e
    public final boolean h(s6e s6eVar) {
        if (!(s6eVar instanceof w6e) && !(s6eVar instanceof u6e)) {
            return s6eVar.h(this);
        }
        int b = s6eVar.b();
        int i = this.f;
        if (i <= b) {
            if (i <= s6eVar.b()) {
                boolean z = s6eVar instanceof w6e;
                byte[] bArr = this.d;
                int i2 = this.e;
                if (z) {
                    return s6e.g(i2, 0, i, bArr, ((w6e) s6eVar).d);
                }
                if (s6eVar instanceof u6e) {
                    u6e u6eVar = (u6e) s6eVar;
                    return s6e.g(i2, u6eVar.e, i, bArr, u6eVar.d);
                }
                return s6eVar.d(0, i).equals(d(i2, i + i2));
            }
            vs.m(rs8.k("Ran off end of other: 0, ", i, s6eVar.b(), ", "));
            return false;
        }
        throw new IllegalArgumentException("Length too large: " + i + i);
    }

    @Override // defpackage.s6e
    public final void j(e7e e7eVar) {
        e7eVar.i(this.d, this.e, this.f);
    }

    @Override // defpackage.s6e
    public final int k(int i, int i2) {
        return n7e.a(i, this.d, this.e, i2);
    }

    @Override // defpackage.s6e
    public final x6e l() {
        return xb1.M(this.d, this.e, this.f);
    }
}
