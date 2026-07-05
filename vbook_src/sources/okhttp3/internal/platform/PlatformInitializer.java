package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class PlatformInitializer implements gv5 {
    @Override // defpackage.gv5
    public final List a() {
        return ks3.a;
    }

    @Override // defpackage.gv5
    public final Object b(Context context) {
        ContextAwarePlatform contextAwarePlatform;
        context.getClass();
        Platform platform = Platform.a;
        Platform platform2 = Platform.a;
        if (platform2 != null) {
            contextAwarePlatform = (ContextAwarePlatform) platform2;
        } else {
            contextAwarePlatform = null;
        }
        if (contextAwarePlatform != null) {
            contextAwarePlatform.a(context);
        }
        return Platform.a;
    }
}
