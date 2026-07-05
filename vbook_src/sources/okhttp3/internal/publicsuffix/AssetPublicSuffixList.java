package okhttp3.internal.publicsuffix;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.InputStream;
import okhttp3.internal.platform.ContextAwarePlatform;
import okhttp3.internal.platform.Platform;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class AssetPublicSuffixList extends BasePublicSuffixList {
    public final String f = "PublicSuffixDatabase.list";

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public final osa b() {
        ContextAwarePlatform contextAwarePlatform;
        Context context;
        AssetManager assetManager;
        Platform platform = Platform.a;
        Platform platform2 = Platform.a;
        if (platform2 != null) {
            contextAwarePlatform = (ContextAwarePlatform) platform2;
        } else {
            contextAwarePlatform = null;
        }
        if (contextAwarePlatform != null) {
            context = contextAwarePlatform.b();
        } else {
            context = null;
        }
        if (context != null) {
            assetManager = context.getAssets();
        } else {
            assetManager = null;
        }
        if (assetManager == null) {
            if (Build.FINGERPRINT == null) {
                fb4.k("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
                return null;
            }
            fb4.k("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
            return null;
        }
        InputStream open = assetManager.open(this.f);
        open.getClass();
        return tl1.K(open);
    }
}
