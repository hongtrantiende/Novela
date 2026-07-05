package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w21  reason: default package */
/* loaded from: classes.dex */
public final class w21 extends c31 {
    public final int e;
    public final int f;

    public w21(byte[] bArr, int i, int i2) {
        super(bArr);
        c31.b(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.c31
    public final byte a(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(a82.j(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(rs8.k("Index > length: ", i, i2, ", "));
        }
        return this.b[this.e + i];
    }

    @Override // defpackage.c31
    public final void d(byte[] bArr, int i) {
        System.arraycopy(this.b, this.e, bArr, 0, i);
    }

    @Override // defpackage.c31
    public final int e() {
        return this.e;
    }

    @Override // defpackage.c31
    public final byte f(int i) {
        return this.b[this.e + i];
    }

    @Override // defpackage.c31
    public final int size() {
        return this.f;
    }
}
