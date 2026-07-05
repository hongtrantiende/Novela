package defpackage;

import android.app.Notification;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p48  reason: default package */
/* loaded from: classes.dex */
public final class p48 extends c3e {
    public int[] b;
    public MediaSessionCompat$Token c;

    @Override // defpackage.c3e
    public final void m(oaa oaaVar) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) oaaVar.c;
        if (i >= 34) {
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            int[] iArr = this.b;
            MediaSessionCompat$Token mediaSessionCompat$Token = this.c;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            if (mediaSessionCompat$Token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) mediaSessionCompat$Token.b);
            }
            builder.setStyle(mediaStyle);
            return;
        }
        Notification.MediaStyle mediaStyle2 = new Notification.MediaStyle();
        int[] iArr2 = this.b;
        MediaSessionCompat$Token mediaSessionCompat$Token2 = this.c;
        if (iArr2 != null) {
            mediaStyle2.setShowActionsInCompactView(iArr2);
        }
        if (mediaSessionCompat$Token2 != null) {
            mediaStyle2.setMediaSession((MediaSession.Token) mediaSessionCompat$Token2.b);
        }
        builder.setStyle(mediaStyle2);
    }
}
