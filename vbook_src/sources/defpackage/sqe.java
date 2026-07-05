package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sqe  reason: default package */
/* loaded from: classes.dex */
public final class sqe implements sbe {
    public static final byte[] d = lre.p("7a806c");
    public static final byte[] e = lre.p("46bb91c3c5");
    public static final byte[] f = lre.p("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] g = lre.p("bae8e37fc83441b16034566b");
    public static final byte[] h = lre.p("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    public final mp8 a;
    public final SecretKeySpec b;
    public final byte[] c;

    public sqe(byte[] bArr, byte[] bArr2, mp8 mp8Var) {
        this.c = bArr2;
        ase.F(bArr.length);
        this.b = new SecretKeySpec(bArr, "AES");
        this.a = mp8Var;
    }

    public static boolean c(Cipher cipher) {
        try {
            byte[] bArr = g;
            cipher.init(2, new SecretKeySpec(f, "AES"), new GCMParameterSpec(Token.CASE, bArr, 0, bArr.length));
            cipher.updateAAD(e);
            byte[] bArr2 = h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // defpackage.sbe
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.c;
        if (length >= bArr3.length + 28) {
            if (k7f.b(bArr3, bArr)) {
                this.a.getClass();
                Cipher e2 = mp8.e();
                e2.init(2, this.b, new GCMParameterSpec(Token.CASE, bArr, bArr3.length, 12));
                if (bArr2 != null && bArr2.length != 0) {
                    e2.updateAAD(bArr2);
                }
                return e2.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
            }
            hfd.j("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        hfd.j("ciphertext too short");
        return null;
    }

    @Override // defpackage.sbe
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        this.a.getClass();
        Cipher e2 = mp8.e();
        int length = bArr.length;
        byte[] bArr3 = this.c;
        if (length <= 2147483619 - bArr3.length) {
            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + bArr.length + 16);
            byte[] a = u6f.a(12);
            System.arraycopy(a, 0, copyOf, bArr3.length, 12);
            e2.init(1, this.b, new GCMParameterSpec(Token.CASE, a, 0, a.length));
            if (bArr2 != null && bArr2.length != 0) {
                e2.updateAAD(bArr2);
            }
            int doFinal = e2.doFinal(bArr, 0, bArr.length, copyOf, bArr3.length + 12);
            if (doFinal == bArr.length + 16) {
                return copyOf;
            }
            throw new GeneralSecurityException(hl5.l("encryption failed; AES-GCM-SIV tag must be 16 bytes, but got only ", " bytes", doFinal - bArr.length));
        }
        hfd.j("plaintext too long");
        return null;
    }
}
