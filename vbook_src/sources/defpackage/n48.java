package defpackage;

import android.app.Notification;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n48  reason: default package */
/* loaded from: classes.dex */
public final class n48 extends c3e {
    public CharSequence b;

    @Override // defpackage.c3e
    public final void m(oaa oaaVar) {
        new Notification.BigTextStyle((Notification.Builder) oaaVar.c).setBigContentTitle(null).bigText(this.b);
    }

    @Override // defpackage.c3e
    public final String y() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
