package defpackage;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sde  reason: default package */
/* loaded from: classes.dex */
public final class sde {
    public static sde c;
    public static sde d;
    public final String a;
    public final fz4 b;

    public sde(Context context, String str) {
        fz4 fz4Var;
        sk8 sk8Var;
        String concat;
        this.a = str;
        try {
            dze.a();
            sk8Var = new sk8(4);
            concat = "com.google.firebase.auth.api.crypto.".concat(str);
        } catch (IOException e) {
            e = e;
            String message = e.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + message);
            fz4Var = null;
            this.b = fz4Var;
            return;
        } catch (GeneralSecurityException e2) {
            e = e2;
            String message2 = e.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + message2);
            fz4Var = null;
            this.b = fz4Var;
            return;
        }
        if (context != null) {
            sk8Var.a = context;
            sk8Var.b = "GenericIdpKeyset";
            sk8Var.c = concat;
            sk8Var.g = qze.a;
            String concat2 = "android-keystore://firebear_master_key_id.".concat(str);
            if (concat2.startsWith("android-keystore://")) {
                sk8Var.d = concat2;
                fz4Var = sk8Var.g();
                this.b = fz4Var;
                return;
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        throw new IllegalArgumentException("need an Android context");
    }

    public static sde c(Context context, String str) {
        fz4 fz4Var;
        sde sdeVar = c;
        if (sdeVar == null || !sdeVar.a.equals(str)) {
            try {
                wge.a();
                fz4Var = e(context, str);
            } catch (IOException | GeneralSecurityException e) {
                String message = e.getMessage();
                Log.e("FirebearStorageCryptoHelper", "Exception encountered during crypto setup:\n" + message);
                if (e instanceof GeneralSecurityException) {
                    context.getSharedPreferences("com.google.firebase.auth.api.crypto.".concat(str), 0).edit().remove("StorageCryptoKeyset").apply();
                    try {
                        fz4Var = e(context, str);
                    } catch (IOException | GeneralSecurityException e2) {
                        String message2 = e2.getMessage();
                        Log.e("FirebearStorageCryptoHelper", "Exception encountered during second attempt to crypto setup:\n" + message2);
                        fz4Var = null;
                        c = new sde(str, fz4Var);
                        return c;
                    }
                }
                fz4Var = null;
            }
            c = new sde(str, fz4Var);
        }
        return c;
    }

    public static sde d(Context context, String str) {
        sde sdeVar = d;
        if (sdeVar == null || !sdeVar.a.equals(str)) {
            d = new sde(context, str);
        }
        return d;
    }

    public static fz4 e(Context context, String str) {
        sk8 sk8Var = new sk8(4);
        String concat = "com.google.firebase.auth.api.crypto.".concat(str);
        if (context != null) {
            sk8Var.a = context;
            sk8Var.b = "StorageCryptoKeyset";
            sk8Var.c = concat;
            sk8Var.g = che.b;
            String concat2 = "android-keystore://firebear_main_key_id_for_storage_crypto.".concat(str);
            if (concat2.startsWith("android-keystore://")) {
                sk8Var.d = concat2;
                return sk8Var.g();
            }
            vs.m("key URI must start with android-keystore://");
            return null;
        }
        vs.m("need an Android context");
        return null;
    }

    public String a() {
        if (this.b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        l97 l97Var = new l97(byteArrayOutputStream);
        try {
            synchronized (this.b) {
                this.b.E0().I().D(l97Var);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e) {
            String message = e.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + message);
            return null;
        }
    }

    public String b(String str) {
        String str2;
        fz4 fz4Var = this.b;
        if (fz4Var == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (fz4Var) {
                hvc E0 = this.b.E0();
                try {
                    if (!lve.a()) {
                        str2 = new String(((hce) E0.s(cze.a, hce.class)).zza(Base64.decode(str, 8)), StandardCharsets.UTF_8);
                    } else {
                        throw new GeneralSecurityException("Cannot use non-FIPS-compliant HybridConfigurationV1 in FIPS mode");
                    }
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            }
            return str2;
        } catch (GeneralSecurityException e2) {
            String message = e2.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + message);
            return null;
        }
    }

    public sde(String str, fz4 fz4Var) {
        this.a = str;
        this.b = fz4Var;
    }
}
