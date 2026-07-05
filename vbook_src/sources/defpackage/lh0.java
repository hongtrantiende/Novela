package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lh0  reason: default package */
/* loaded from: classes.dex */
public final class lh0 extends nh0 {
    public final char[] f;

    public lh0(kh0 kh0Var) {
        super(kh0Var, (Character) null);
        boolean z;
        this.f = new char[512];
        char[] cArr = kh0Var.b;
        if (cArr.length == 16) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // defpackage.nh0
    public final void c(StringBuilder sb, byte[] bArr, int i) {
        wq9.B(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
