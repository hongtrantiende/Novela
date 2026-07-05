package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pe3  reason: default package */
/* loaded from: classes3.dex */
public final class pe3 {
    public final int[] a;
    public final int[] b;
    public final int c;

    public /* synthetic */ pe3(int[] iArr, int[] iArr2, int i) {
        this.a = iArr;
        this.b = iArr2;
        this.c = i;
    }

    public int a(int i, int i2, CharSequence charSequence) {
        charSequence.getClass();
        if (this.c != 0) {
            if (i2 <= 0) {
                i2 = charSequence.length();
            }
            int[] iArr = this.b;
            int i3 = iArr[0];
            int i4 = i2 + i;
            while (true) {
                int[] iArr2 = this.a;
                if (i < i4) {
                    int charAt = charSequence.charAt(i) + i3 + 1;
                    if (i3 == iArr2[charAt]) {
                        i3 = iArr[charAt];
                        i++;
                    } else {
                        return -1;
                    }
                } else {
                    int i5 = iArr[i3];
                    if (i3 == iArr2[i3] && i5 < 0) {
                        return (-i5) - 1;
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
    }
}
