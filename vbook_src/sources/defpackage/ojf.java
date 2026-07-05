package defpackage;

import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ojf  reason: default package */
/* loaded from: classes.dex */
public final class ojf implements sbe {
    public static final ro e = new ro(12);
    public final byte[] a;
    public final s9f b;
    public final SecretKeySpec c;
    public final int d;

    public ojf(int i, byte[] bArr, byte[] bArr2) {
        if (eub.d(1)) {
            if (i != 12 && i != 16) {
                vs.m("IV size should be either 12 or 16 bytes");
                throw null;
            }
            this.d = i;
            ase.F(bArr.length);
            this.c = new SecretKeySpec(bArr, "AES");
            this.b = qre.y(o9f.D(i9f.b(bArr.length), new xk9(hlf.a(bArr), 26)));
            this.a = bArr2;
            return;
        }
        hfd.j("Can not use AES-EAX in FIPS-mode.");
        throw null;
    }

    @Override // defpackage.sbe
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.a;
        int length2 = length - bArr3.length;
        int i = this.d;
        int i2 = (length2 - i) - 16;
        if (i2 >= 0) {
            if (k7f.b(bArr3, bArr)) {
                byte[] c = c(0, bArr, bArr3.length, i);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] c2 = c(1, bArr2, 0, bArr2.length);
                byte[] c3 = c(2, bArr, bArr3.length + i, i2);
                int length3 = bArr.length - 16;
                byte b = 0;
                for (int i3 = 0; i3 < 16; i3++) {
                    b = (byte) (b | (((bArr[length3 + i3] ^ c2[i3]) ^ c[i3]) ^ c3[i3]));
                }
                if (b == 0) {
                    Cipher cipher = (Cipher) e.get();
                    cipher.init(1, this.c, new IvParameterSpec(c));
                    return cipher.doFinal(bArr, bArr3.length + i, i2);
                }
                throw new AEADBadTagException("tag mismatch");
            }
            hfd.j("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        hfd.j("ciphertext too short");
        return null;
    }

    @Override // defpackage.sbe
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.a;
        int length2 = Integer.MAX_VALUE - bArr3.length;
        int i = this.d;
        if (length <= (length2 - i) - 16) {
            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i + bArr.length + 16);
            byte[] a = u6f.a(i);
            System.arraycopy(a, 0, copyOf, bArr3.length, i);
            byte[] c = c(0, a, 0, a.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] c2 = c(1, bArr2, 0, bArr2.length);
            Cipher cipher = (Cipher) e.get();
            cipher.init(1, this.c, new IvParameterSpec(c));
            cipher.doFinal(bArr, 0, bArr.length, copyOf, bArr3.length + i);
            byte[] c3 = c(2, copyOf, bArr3.length + i, bArr.length);
            int length3 = bArr3.length + bArr.length + i;
            for (int i2 = 0; i2 < 16; i2++) {
                copyOf[length3 + i2] = (byte) ((c2[i2] ^ c[i2]) ^ c3[i2]);
            }
            return copyOf;
        }
        hfd.j("plaintext too long");
        return null;
    }

    public final byte[] c(int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i2, bArr2, 16, i3);
        return this.b.c(bArr2, 16);
    }
}
