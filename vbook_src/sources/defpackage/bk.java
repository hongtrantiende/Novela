package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bk  reason: default package */
/* loaded from: classes.dex */
public final class bk {
    public final PathMeasure a;

    public bk(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, yj yjVar) {
        if (yjVar != null) {
            this.a.getSegment(f, f2, yjVar.a, true);
            return;
        }
        xk5.q("Unable to obtain android.graphics.Path");
    }

    public final void b(yj yjVar) {
        Path path;
        if (yjVar != null) {
            path = yjVar.a;
        } else {
            path = null;
        }
        this.a.setPath(path, false);
    }
}
