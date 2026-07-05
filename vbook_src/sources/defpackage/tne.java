package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tne  reason: default package */
/* loaded from: classes.dex */
public final class tne extends xne {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tne(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            mne r0 = new mne
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r2 = 61
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r1.<init>(r0, r2)
            int r1 = r3.length
            r2 = 64
            if (r1 != r2) goto L18
            return
        L18:
            defpackage.p1a.g()
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tne.<init>(java.lang.String, java.lang.String):void");
    }

    @Override // defpackage.xne
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        ctd.C(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            mne mneVar = this.a;
            char[] cArr = mneVar.b;
            char[] cArr2 = mneVar.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            b(sb, bArr, i2, i - i2);
        }
    }
}
