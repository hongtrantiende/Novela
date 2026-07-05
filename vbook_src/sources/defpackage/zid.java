package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zid  reason: default package */
/* loaded from: classes.dex */
public final class zid {
    public yid a;

    public zid(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new xid(vid.b(i, interpolator, j));
        } else {
            this.a = new yid(i, interpolator, j);
        }
    }
}
