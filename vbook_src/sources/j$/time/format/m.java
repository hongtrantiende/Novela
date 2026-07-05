package j$.time.format;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class m extends n {
    @Override // j$.time.format.n
    public final boolean b(char c, char c2) {
        return v.b(c, c2);
    }

    @Override // j$.time.format.n
    public final n d(String str, String str2, n nVar) {
        return new n(str, str2, nVar);
    }

    @Override // j$.time.format.n
    public final boolean e(CharSequence charSequence, int i, int i2) {
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length > 0) {
                int i5 = i3 + 1;
                int i6 = i + 1;
                if (!v.b(this.a.charAt(i3), charSequence.charAt(i))) {
                    return false;
                }
                i = i6;
                length = i4;
                i3 = i5;
            } else {
                return true;
            }
        }
    }
}
