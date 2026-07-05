package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cue  reason: default package */
/* loaded from: classes.dex */
public final class cue implements sbe {
    public final byte[] a;
    public final int b;
    public final s9f c;

    public cue(byte[] bArr, hlf hlfVar, int i) {
        this.c = qre.y(o9f.D(i9f.b(bArr.length), new xk9(hlf.a(bArr), 26)));
        this.a = hlfVar.b();
        this.b = i;
    }

    @Override // defpackage.sbe
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.a;
            int length2 = bArr3.length;
            int i = this.b;
            if (length >= length2 + i + 28) {
                if (k7f.b(bArr3, bArr)) {
                    int length3 = bArr3.length + i;
                    byte[] c = c(Arrays.copyOfRange(bArr, bArr3.length, length3));
                    if (eub.b(2)) {
                        SecretKeySpec c2 = spe.c(c);
                        int i2 = length3 + 12;
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, length3, i2);
                        if (copyOfRange.length == 12) {
                            if (bArr.length >= length3 + 28) {
                                AlgorithmParameterSpec a = spe.a(copyOfRange, 0, copyOfRange.length);
                                Cipher b = spe.b();
                                b.init(2, c2, a);
                                if (bArr2 != null && bArr2.length != 0) {
                                    b.updateAAD(bArr2);
                                }
                                return b.doFinal(bArr, i2, bArr.length - i2);
                            }
                            hfd.j("ciphertext too short");
                            return null;
                        }
                        hfd.j("iv is wrong size");
                        return null;
                    }
                    hfd.j("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                    return null;
                }
                hfd.j("Decryption failed (OutputPrefix mismatch).");
                return null;
            }
            hfd.j("ciphertext too short");
            return null;
        }
        xk5.k("ciphertext is null");
        return null;
    }

    @Override // defpackage.sbe
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int i = this.b;
            int i2 = i + 12;
            byte[] a = u6f.a(i2);
            byte[] copyOf = Arrays.copyOf(a, i);
            byte[] copyOfRange = Arrays.copyOfRange(a, i, i2);
            byte[] c = c(copyOf);
            if (eub.b(2)) {
                SecretKeySpec c2 = spe.c(c);
                byte[] bArr3 = this.a;
                int length = bArr3.length + i + copyOfRange.length;
                if (copyOfRange.length == 12) {
                    AlgorithmParameterSpec a2 = spe.a(copyOfRange, 0, copyOfRange.length);
                    Cipher b = spe.b();
                    b.init(1, c2, a2);
                    if (bArr2 != null && bArr2.length != 0) {
                        b.updateAAD(bArr2);
                    }
                    int outputSize = b.getOutputSize(bArr.length);
                    if (outputSize <= Integer.MAX_VALUE - length) {
                        byte[] bArr4 = new byte[length + outputSize];
                        if (b.doFinal(bArr, 0, bArr.length, bArr4, length) == outputSize) {
                            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                            System.arraycopy(a, 0, bArr4, bArr3.length, a.length);
                            return bArr4;
                        }
                        hfd.j("not enough data written");
                        return null;
                    }
                    hfd.j("plaintext too long");
                    return null;
                }
                hfd.j("iv is wrong size");
                return null;
            }
            hfd.j("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        xk5.k("plaintext is null");
        return null;
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length <= 12 && bArr.length >= 8) {
            System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
            System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
            byte[] bArr4 = new byte[32];
            s9f s9fVar = this.c;
            System.arraycopy(s9fVar.c(bArr2, 16), 0, bArr4, 0, 16);
            System.arraycopy(s9fVar.c(bArr3, 16), 0, bArr4, 16, 16);
            return bArr4;
        }
        hfd.j("invalid salt size");
        return null;
    }
}
