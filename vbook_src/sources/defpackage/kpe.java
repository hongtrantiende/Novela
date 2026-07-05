package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kpe  reason: default package */
/* loaded from: classes.dex */
public final class kpe extends qpe {
    public final int d;
    public final int e;

    public kpe(byte[] bArr, int i, int i2) {
        super(bArr);
        qpe.g(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.qpe
    public final byte a(int i) {
        int i2 = this.e;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(a82.j(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(rs8.k("Index > length: ", i, i2, ", "));
        }
        return this.b[this.d + i];
    }

    @Override // defpackage.qpe
    public final byte b(int i) {
        return this.b[this.d + i];
    }

    @Override // defpackage.qpe
    public final int c() {
        return this.d;
    }

    @Override // defpackage.qpe
    public final int d() {
        return this.e;
    }

    @Override // defpackage.qpe
    public final void e(byte[] bArr, int i) {
        System.arraycopy(this.b, this.d, bArr, 0, i);
    }
}
