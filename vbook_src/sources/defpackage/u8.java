package defpackage;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u8  reason: default package */
/* loaded from: classes.dex */
public final class u8 implements jg2 {
    public final jg2 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public u8(jg2 jg2Var, byte[] bArr, byte[] bArr2) {
        this.a = jg2Var;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.jg2
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // defpackage.jg2
    public final long d(mg2 mg2Var) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                lg2 lg2Var = new lg2(this.a, mg2Var);
                this.d = new CipherInputStream(lg2Var, cipher);
                lg2Var.o();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                fb4.l(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            fb4.l(e2);
            return 0L;
        }
    }

    @Override // defpackage.jg2
    public final Map o() {
        return this.a.o();
    }

    @Override // defpackage.eg2
    public final int read(byte[] bArr, int i, int i2) {
        this.d.getClass();
        int read = this.d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // defpackage.jg2
    public final Uri t() {
        return this.a.t();
    }

    @Override // defpackage.jg2
    public final void u(ys2 ys2Var) {
        ys2Var.getClass();
        this.a.u(ys2Var);
    }
}
