package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v9f  reason: default package */
/* loaded from: classes.dex */
public final class v9f implements s9f {
    public static final ro d = new ro(9);
    public final SecretKeySpec a;
    public final byte[] b;
    public final byte[] c;

    public v9f(byte[] bArr) {
        ase.F(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.a = secretKeySpec;
        if (eub.d(1)) {
            Cipher cipher = (Cipher) d.get();
            cipher.init(1, secretKeySpec);
            byte[] F = ipe.F(cipher.doFinal(new byte[16]));
            this.b = F;
            this.c = ipe.F(F);
            return;
        }
        hfd.j("Can not use AES-CMAC in FIPS-mode.");
        throw null;
    }

    @Override // defpackage.s9f
    public final byte[] c(byte[] bArr, int i) {
        int i2;
        byte[] G;
        if (i <= 16) {
            if (eub.d(1)) {
                Cipher cipher = (Cipher) d.get();
                cipher.init(1, this.a);
                int length = bArr.length;
                if (length == 0) {
                    i2 = 1;
                } else {
                    i2 = ((length - 1) / 16) + 1;
                }
                if ((i2 << 4) == bArr.length) {
                    G = yqe.F(bArr, (i2 - 1) << 4, this.b, 16);
                } else {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, (i2 - 1) << 4, bArr.length);
                    if (copyOfRange.length < 16) {
                        byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                        copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                        G = yqe.G(copyOf, this.c);
                    } else {
                        vs.m("x must be smaller than a block.");
                        return null;
                    }
                }
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[16];
                for (int i3 = 0; i3 < i2 - 1; i3++) {
                    int i4 = i3 << 4;
                    for (int i5 = 0; i5 < 16; i5++) {
                        bArr3[i5] = (byte) (bArr2[i5] ^ bArr[i5 + i4]);
                    }
                    if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                        vs.k("Cipher didn't write full block");
                        return null;
                    }
                }
                for (int i6 = 0; i6 < 16; i6++) {
                    bArr3[i6] = (byte) (bArr2[i6] ^ G[i6]);
                }
                if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
                    if (16 == i) {
                        return bArr2;
                    }
                    return Arrays.copyOf(bArr2, i);
                }
                vs.k("Cipher didn't write full block");
                return null;
            }
            hfd.j("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
