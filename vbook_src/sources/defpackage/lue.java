package defpackage;

import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lue  reason: default package */
/* loaded from: classes.dex */
public final class lue implements sbe {
    public final byte[] a;
    public final byte[] b;
    public final Provider c;

    public lue(byte[] bArr, byte[] bArr2, Provider provider) {
        if (eub.d(1)) {
            if (bArr.length == 32) {
                this.a = bArr;
                this.b = bArr2;
                this.c = provider;
                return;
            }
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        hfd.j("Can not use ChaCha20Poly1305 in FIPS-mode.");
        throw null;
    }

    @Override // defpackage.sbe
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.b;
            if (length >= bArr3.length + 40) {
                if (k7f.b(bArr3, bArr)) {
                    byte[] bArr4 = new byte[24];
                    System.arraycopy(bArr, bArr3.length, bArr4, 0, 24);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(mse.c(this.a, bArr4), "ChaCha20");
                    byte[] bArr5 = new byte[12];
                    System.arraycopy(bArr4, 16, bArr5, 4, 8);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
                    byte[] bArr6 = ore.d;
                    Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
                    cipher.init(2, secretKeySpec, ivParameterSpec);
                    if (bArr2 != null && bArr2.length != 0) {
                        cipher.updateAAD(bArr2);
                    }
                    return cipher.doFinal(bArr, bArr3.length + 24, (bArr.length - bArr3.length) - 24);
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
            byte[] a = u6f.a(24);
            SecretKeySpec secretKeySpec = new SecretKeySpec(mse.c(this.a, a), "ChaCha20");
            byte[] bArr3 = new byte[12];
            System.arraycopy(a, 16, bArr3, 4, 8);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
            byte[] bArr4 = ore.d;
            Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
            cipher.init(1, secretKeySpec, ivParameterSpec);
            if (bArr2 != null && bArr2.length != 0) {
                cipher.updateAAD(bArr2);
            }
            int outputSize = cipher.getOutputSize(bArr.length);
            byte[] bArr5 = this.b;
            if (outputSize <= 2147483623 - bArr5.length) {
                byte[] copyOf = Arrays.copyOf(bArr5, bArr5.length + 24 + outputSize);
                System.arraycopy(a, 0, copyOf, bArr5.length, 24);
                if (cipher.doFinal(bArr, 0, bArr.length, copyOf, bArr5.length + 24) == outputSize) {
                    return copyOf;
                }
                hfd.j("not enough data written");
                return null;
            }
            hfd.j("plaintext too long");
            return null;
        }
        xk5.k("plaintext is null");
        return null;
    }
}
