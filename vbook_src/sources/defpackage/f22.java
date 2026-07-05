package defpackage;

import android.graphics.Point;
import android.graphics.pdf.models.selection.SelectionBoundary;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f22  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f22 {
    public static /* synthetic */ SelectionBoundary a() {
        return new SelectionBoundary(0);
    }

    public static /* synthetic */ SelectionBoundary b(int i) {
        return new SelectionBoundary(i);
    }

    public static /* synthetic */ SelectionBoundary c(Point point) {
        return new SelectionBoundary(point);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ SelectionBoundary e() {
        return new SelectionBoundary(Integer.MAX_VALUE);
    }
}
