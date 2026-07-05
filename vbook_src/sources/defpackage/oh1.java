package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oh1  reason: default package */
/* loaded from: classes3.dex */
public final class oh1 extends c41 {
    public static final oh1 d = new oh1("CBC", 0);
    public static final oh1 e = new oh1("ECB", 1);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh1(String str, int i) {
        super(str, 2);
        this.c = i;
    }

    @Override // defpackage.c41
    public final byte[] a(byte[] bArr, h hVar, rse rseVar, byte[] bArr2) {
        switch (this.c) {
            case 0:
                byte[] c = hse.c(bArr2);
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                byte[] bArr3 = new byte[16];
                int j = vae.j(0, copyOf.length - 1, 16);
                if (j >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 16;
                        b00.U(0, i, i2, copyOf, bArr3);
                        hVar.a(copyOf, i, 16);
                        int length = c.length;
                        for (int i3 = 0; i3 < length; i3++) {
                            int i4 = i + i3;
                            copyOf[i4] = (byte) (copyOf[i4] ^ c[i3]);
                        }
                        b00.U(0, 0, 16, bArr3, c);
                        if (i != j) {
                            i = i2;
                        }
                    }
                }
                return Arrays.copyOf(Arrays.copyOf(copyOf, copyOf.length), rseVar.i(copyOf));
            default:
                hVar.a(bArr, 0, bArr.length);
                return Arrays.copyOf(Arrays.copyOf(bArr, bArr.length), rseVar.i(bArr));
        }
    }

    @Override // defpackage.c41
    public final byte[] b(byte[] bArr, h hVar, rse rseVar, byte[] bArr2) {
        switch (this.c) {
            case 0:
                byte[] c = hse.c(bArr2);
                int h = rseVar.h(bArr.length);
                int length = bArr.length + h;
                byte[] bArr3 = new byte[length];
                b00.U(0, 0, bArr.length, bArr, bArr3);
                rseVar.d(bArr3, bArr.length, h);
                int j = vae.j(0, length - 1, 16);
                if (j >= 0) {
                    int i = 0;
                    while (true) {
                        int length2 = c.length;
                        for (int i2 = 0; i2 < length2; i2++) {
                            int i3 = i + i2;
                            bArr3[i3] = (byte) (bArr3[i3] ^ c[i2]);
                        }
                        hVar.c(bArr3, i, 16);
                        int i4 = i + 16;
                        b00.U(0, i, i4, bArr3, c);
                        if (i != j) {
                            i = i4;
                        }
                    }
                }
                return bArr3;
            default:
                int h2 = rseVar.h(bArr.length);
                int length3 = bArr.length + h2;
                byte[] bArr4 = new byte[length3];
                b00.U(0, 0, bArr.length, bArr, bArr4);
                rseVar.d(bArr4, bArr.length, h2);
                hVar.c(bArr4, 0, length3);
                return bArr4;
        }
    }
}
