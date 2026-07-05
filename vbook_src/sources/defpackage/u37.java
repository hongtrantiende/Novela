package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u37  reason: default package */
/* loaded from: classes.dex */
public final class u37 {
    public static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);
    public final s37 a;

    public u37(Context context, ComponentName componentName, yv yvVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new s37(context, componentName, yvVar);
        } else {
            this.a = new s37(context, componentName, yvVar);
        }
    }
}
