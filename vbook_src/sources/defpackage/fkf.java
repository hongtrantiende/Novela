package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fkf  reason: default package */
/* loaded from: classes.dex */
public final class fkf implements sbe {
    public final mjf a;
    public final elf b;
    public final int c;
    public final byte[] d;

    public fkf(mjf mjfVar, elf elfVar, int i, byte[] bArr) {
        this.a = mjfVar;
        this.b = elfVar;
        this.c = i;
        this.d = bArr;
    }

    public static fkf c(mhe mheVar) {
        byte[] b = ((hlf) mheVar.g.b).b();
        bie bieVar = mheVar.f;
        mjf mjfVar = new mjf(b, bieVar.c);
        vdf vdfVar = new vdf("HMAC".concat(String.valueOf(bieVar.f)), new SecretKeySpec(((hlf) mheVar.h.b).b(), "HMAC"));
        int i = bieVar.d;
        return new fkf(mjfVar, new elf(i, vdfVar), i, mheVar.i.b());
    }

    @Override // defpackage.sbe
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.d;
        int length2 = bArr3.length;
        int i = this.c;
        if (length >= length2 + i) {
            if (k7f.b(bArr3, bArr)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr3.length, bArr.length - i);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                if (MessageDigest.isEqual(this.b.b(yqe.H(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
                    int length3 = copyOfRange.length;
                    mjf mjfVar = this.a;
                    int i2 = mjfVar.b;
                    if (length3 >= i2) {
                        byte[] bArr4 = new byte[i2];
                        System.arraycopy(copyOfRange, 0, bArr4, 0, i2);
                        int length4 = copyOfRange.length;
                        int i3 = mjfVar.b;
                        byte[] bArr5 = new byte[length4 - i3];
                        mjfVar.a(copyOfRange, i3, copyOfRange.length - i3, bArr5, 0, bArr4, false);
                        return bArr5;
                    }
                    hfd.j("ciphertext too short");
                    return null;
                }
                hfd.j("invalid MAC");
                return null;
            }
            hfd.j("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        hfd.j("Decryption failed (ciphertext too short).");
        return null;
    }

    @Override // defpackage.sbe
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        mjf mjfVar = this.a;
        int i = mjfVar.b;
        int i2 = Integer.MAX_VALUE - i;
        if (length <= i2) {
            byte[] bArr3 = new byte[bArr.length + i];
            byte[] a = u6f.a(i);
            System.arraycopy(a, 0, bArr3, 0, i);
            mjfVar.a(bArr, 0, bArr.length, bArr3, mjfVar.b, a, true);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            return yqe.H(this.d, bArr3, this.b.b(yqe.H(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
        }
        throw new GeneralSecurityException(a82.j(i2, "plaintext length can not exceed "));
    }
}
