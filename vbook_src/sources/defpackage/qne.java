package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qne  reason: default package */
/* loaded from: classes.dex */
public final class qne extends xne {
    public final char[] e;

    public qne(mne mneVar) {
        super(mneVar, (Character) null);
        this.e = new char[512];
        char[] cArr = mneVar.b;
        if (cArr.length == 16) {
            for (int i = 0; i < 256; i++) {
                char[] cArr2 = this.e;
                cArr2[i] = cArr[i >>> 4];
                cArr2[i | 256] = cArr[i & 15];
            }
            return;
        }
        p1a.g();
        throw null;
    }

    @Override // defpackage.xne
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        ctd.C(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
