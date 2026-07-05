package defpackage;

import android.os.Build;
import android.widget.RemoteViews;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oy  reason: default package */
/* loaded from: classes.dex */
public final class oy {
    public static final oy a = new Object();

    public final void a(RemoteViews remoteViews, int i, a73 a73Var) {
        remoteViews.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.setBoolean(i, "setClipToOutline", true);
            if (a73Var instanceof t63) {
                remoteViews.setViewOutlinePreferredRadius(i, ((t63) a73Var).a, 1);
                return;
            } else {
                cp8.u(a73Var.getClass().getCanonicalName(), "Rounded corners should not be ");
                return;
            }
        }
        throw new IllegalArgumentException(("setClipToOutline is only available on SDK 31 and higher").toString());
    }

    public final void b(RemoteViews remoteViews, int i, a73 a73Var) {
        if (a73Var instanceof y63) {
            remoteViews.setViewLayoutHeight(i, -2.0f, 0);
        } else if (a73Var instanceof u63) {
            remoteViews.setViewLayoutHeight(i, nae.e, 0);
        } else if (a73Var instanceof t63) {
            remoteViews.setViewLayoutHeight(i, ((t63) a73Var).a, 1);
        } else if (c16.i(a73Var, v63.a)) {
            remoteViews.setViewLayoutHeight(i, -1.0f, 0);
        } else {
            xk5.o();
        }
    }

    public final void c(RemoteViews remoteViews, int i, a73 a73Var) {
        if (a73Var instanceof y63) {
            remoteViews.setViewLayoutWidth(i, -2.0f, 0);
        } else if (a73Var instanceof u63) {
            remoteViews.setViewLayoutWidth(i, nae.e, 0);
        } else if (a73Var instanceof t63) {
            remoteViews.setViewLayoutWidth(i, ((t63) a73Var).a, 1);
        } else if (c16.i(a73Var, v63.a)) {
            remoteViews.setViewLayoutWidth(i, -1.0f, 0);
        } else {
            xk5.o();
        }
    }
}
