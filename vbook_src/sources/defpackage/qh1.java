package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qh1  reason: default package */
/* loaded from: classes3.dex */
public final class qh1 extends rse {
    public static final qh1 k = new qh1(0);
    public static final qh1 l = new qh1(1);
    public static final qh1 m = new qh1(2);
    public final /* synthetic */ int j;

    public /* synthetic */ qh1(int i) {
        this.j = i;
    }

    @Override // defpackage.rse
    public void d(byte[] bArr, int i, int i2) {
        switch (this.j) {
            case 0:
                return;
            case 1:
                int length = bArr.length;
                while (i < length) {
                    bArr[i] = (byte) i2;
                    i++;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.rse
    public int h(int i) {
        switch (this.j) {
            case 0:
                if (i % 16 == 0) {
                    return 0;
                }
                vs.l(hl5.s("Data (", ") is not multiple of 16, and padding was set to ", i), k);
                return 0;
            default:
                return super.h(i);
        }
    }

    @Override // defpackage.rse
    public int i(byte[] bArr) {
        switch (this.j) {
            case 0:
                return bArr.length;
            case 1:
            default:
                return super.i(bArr);
            case 2:
                int i = 0;
                for (int length = bArr.length - 1; -1 < length && bArr[length] == 0; length--) {
                    i++;
                }
                return bArr.length - i;
        }
    }

    private final void k(byte[] bArr, int i, int i2) {
    }
}
