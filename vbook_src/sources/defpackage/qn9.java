package defpackage;

import android.widget.RemoteViews;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qn9  reason: default package */
/* loaded from: classes.dex */
public final class qn9 {
    public final RemoteViews a;
    public final bx5 b;

    public qn9(RemoteViews remoteViews, bx5 bx5Var) {
        this.a = remoteViews;
        this.b = bx5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qn9) {
                qn9 qn9Var = (qn9) obj;
                if (!this.a.equals(qn9Var.a) || !this.b.equals(qn9Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.a + ", view=" + this.b + ')';
    }
}
