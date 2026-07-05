package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.jetbrains.compose.resources.AndroidContextProvider;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ns2  reason: default package */
/* loaded from: classes3.dex */
public final class ns2 {
    public static final ns2 a = new Object();

    public static InputStream a(String str) {
        AssetManager assetManager;
        AssetManager assetManager2;
        InputStream open;
        try {
            try {
                try {
                    Context context = AndroidContextProvider.a;
                    if (context != null) {
                        assetManager2 = context.getAssets();
                    } else {
                        assetManager2 = null;
                    }
                    if (assetManager2 != null && (open = assetManager2.open(str)) != null) {
                        return open;
                    }
                    throw new FileNotFoundException("Current AssetManager is null.");
                } catch (NoClassDefFoundError unused) {
                    Log.d("ResourceReader", "Android Instrumentation context is not available.");
                    assetManager = null;
                    if (assetManager != null || (r2 = assetManager.open(str)) == null) {
                        throw new FileNotFoundException("Current AssetManager is null.");
                    }
                    return r2;
                }
            } catch (FileNotFoundException unused2) {
                ClassLoader classLoader = ns2.class.getClassLoader();
                if (classLoader != null) {
                    InputStream open2 = classLoader.getResourceAsStream(str);
                    if (open2 == null) {
                        if (AndroidContextProvider.a == null) {
                            throw new e60(16, "Missing resource with path: ".concat(str.concat(". Android context is not initialized. If it happens in the Preview mode then call PreviewContextConfigurationEffect() function.")), false);
                        }
                        throw new e60(16, "Missing resource with path: ".concat(str), false);
                    }
                    return open2;
                }
                vs.k("Cannot find class loader");
                return null;
            }
        } catch (FileNotFoundException unused3) {
            assetManager = nh.b().getAssets();
            if (assetManager != null) {
            }
            throw new FileNotFoundException("Current AssetManager is null.");
        }
    }

    public static Object b(String str) {
        InputStream a2 = a(str);
        try {
            byte[] n = gae.n(a2);
            a2.close();
            return n;
        } finally {
        }
    }
}
