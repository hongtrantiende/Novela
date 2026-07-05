package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ore  reason: default package */
/* loaded from: classes.dex */
public final class ore implements sbe {
    public static final byte[] d = lre.p("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    public static final byte[] e = lre.p("070000004041424344454647");
    public static final byte[] f = lre.p("a0784d7a4716f3feb4f64e7f4b39bf04");
    public final SecretKeySpec a;
    public final byte[] b;
    public final Provider c;

    public ore(byte[] bArr, byte[] bArr2, Provider provider) {
        if (eub.d(1)) {
            if (bArr.length == 32) {
                this.a = new SecretKeySpec(bArr, "ChaCha20");
                this.b = bArr2;
                this.c = provider;
                return;
            }
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        hfd.j("Can not use ChaCha20Poly1305 in FIPS-mode.");
        throw null;
    }

    public static Cipher c() {
        Cipher cipher = (Cipher) kkf.b.a.zza("ChaCha20-Poly1305");
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(e);
            byte[] bArr = d;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f;
            if (cipher.doFinal(bArr2).length == 0) {
                cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                if (cipher.doFinal(bArr2).length == 0) {
                    return cipher;
                }
            }
        } catch (GeneralSecurityException unused) {
        }
        hfd.j("JCE does not support algorithm: ChaCha20-Poly1305");
        return null;
    }

    @Override // defpackage.sbe
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.b;
            if (length >= bArr3.length + 28) {
                if (k7f.b(bArr3, bArr)) {
                    byte[] bArr4 = new byte[12];
                    System.arraycopy(bArr, bArr3.length, bArr4, 0, 12);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
                    Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
                    cipher.init(2, this.a, ivParameterSpec);
                    if (bArr2 != null && bArr2.length != 0) {
                        cipher.updateAAD(bArr2);
                    }
                    return cipher.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
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
            byte[] a = u6f.a(12);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(a);
            Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
            cipher.init(1, this.a, ivParameterSpec);
            if (bArr2 != null && bArr2.length != 0) {
                cipher.updateAAD(bArr2);
            }
            int outputSize = cipher.getOutputSize(bArr.length);
            byte[] bArr3 = this.b;
            if (outputSize <= 2147483635 - bArr3.length) {
                byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
                System.arraycopy(a, 0, copyOf, bArr3.length, 12);
                if (cipher.doFinal(bArr, 0, bArr.length, copyOf, bArr3.length + 12) == outputSize) {
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
