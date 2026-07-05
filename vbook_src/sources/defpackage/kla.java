package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kla  reason: default package */
/* loaded from: classes3.dex */
public final class kla {
    public yla a;
    public final byte[] b = new byte[1024];

    public kla(int i) {
        this.a = new yla(i);
    }

    public final void a(byte[] bArr, int i, int i2) {
        int numberOfLeadingZeros;
        int i3;
        bArr.getClass();
        yla ylaVar = this.a;
        if (i2 > ylaVar.f) {
            int i4 = ylaVar.g + i2;
            if (i4 == 0) {
                numberOfLeadingZeros = -1;
            } else {
                numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i4);
            }
            yla ylaVar2 = new yla(numberOfLeadingZeros + 2);
            yla ylaVar3 = this.a;
            int i5 = ylaVar3.b;
            while (true) {
                int i6 = ylaVar3.g;
                if (i6 > 0) {
                    int min = Math.min(i6, ylaVar3.a - (ylaVar3.d & i5));
                    int i7 = ylaVar2.f;
                    int i8 = ylaVar2.e;
                    int i9 = ylaVar2.b;
                    int min2 = Math.min(min, Math.min(i7, ylaVar2.a - (i8 & i9)));
                    que.l(ylaVar3.d & i5, i9 & ylaVar2.e, min2, ylaVar3.c, ylaVar2.c);
                    if (min2 < 0 || min2 > (i3 = ylaVar3.g)) {
                        break;
                    }
                    ylaVar3.d += min2;
                    ylaVar3.g = i3 - min2;
                    ylaVar3.f += min2;
                    ylaVar2.a(min2);
                } else {
                    this.a = ylaVar2;
                    break;
                }
            }
            vs.k("Try to write more than available");
            return;
        }
        this.a.d(bArr, i, i2);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof kla) && this.a.equals(((kla) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        yla ylaVar = this.a;
        int i = ylaVar.g;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 7) + ylaVar.c[(ylaVar.d + i3) & ylaVar.b];
        }
        return i2;
    }
}
