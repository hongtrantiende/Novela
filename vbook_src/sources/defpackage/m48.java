package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m48  reason: default package */
/* loaded from: classes.dex */
public final class m48 extends c3e {
    public IconCompat b;
    public IconCompat c;
    public boolean d;

    @Override // defpackage.c3e
    public final void m(oaa oaaVar) {
        Bitmap c;
        Context context = (Context) oaaVar.b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) oaaVar.c).setBigContentTitle(null);
        IconCompat iconCompat = this.b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                l48.a(bigContentTitle, iconCompat.j(context));
            } else if (iconCompat.g() == 1) {
                IconCompat iconCompat2 = this.b;
                int i = iconCompat2.a;
                if (i == -1) {
                    Object obj = iconCompat2.b;
                    if (obj instanceof Bitmap) {
                        c = (Bitmap) obj;
                    } else {
                        c = null;
                    }
                } else if (i == 1) {
                    c = (Bitmap) iconCompat2.b;
                } else if (i == 5) {
                    c = IconCompat.c((Bitmap) iconCompat2.b, true);
                } else {
                    cp8.t(iconCompat2, "called getBitmap() on ");
                    return;
                }
                bigContentTitle = bigContentTitle.bigPicture(c);
            }
        }
        if (this.d) {
            IconCompat iconCompat3 = this.c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.j(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            l48.c(bigContentTitle, false);
            l48.b(bigContentTitle, null);
        }
    }

    @Override // defpackage.c3e
    public final String y() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
