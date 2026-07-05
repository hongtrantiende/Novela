package defpackage;

import android.os.Build;
import java.nio.charset.Charset;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: spe  reason: default package */
/* loaded from: classes.dex */
public abstract class spe {
    public static final ro a = new ro(6);

    public static AlgorithmParameterSpec a(byte[] bArr, int i, int i2) {
        Integer valueOf;
        Charset charset = k7f.a;
        if (!Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        }
        if (valueOf != null && valueOf.intValue() <= 19) {
            return new IvParameterSpec(bArr, i, i2);
        }
        return new GCMParameterSpec(Token.CASE, bArr, i, i2);
    }

    public static Cipher b() {
        return (Cipher) a.get();
    }

    public static SecretKeySpec c(byte[] bArr) {
        ase.F(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
