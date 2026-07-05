package defpackage;

import android.app.Notification;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jq4  reason: default package */
/* loaded from: classes.dex */
public final class jq4 {
    public final int a;
    public final int b;
    public final Notification c;

    public jq4(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jq4.class != obj.getClass()) {
            return false;
        }
        jq4 jq4Var = (jq4) obj;
        if (this.a != jq4Var.a || this.b != jq4Var.b) {
            return false;
        }
        return this.c.equals(jq4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
