package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b2a  reason: default package */
/* loaded from: classes.dex */
public final class b2a {
    public final a2a a;

    public b2a(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new z1a(nestedScrollView);
        } else {
            this.a = new h88(3);
        }
    }
}
