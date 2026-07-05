package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.vbook.android.R;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o48  reason: default package */
/* loaded from: classes.dex */
public final class o48 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public c3e l;
    public int m;
    public int n;
    public boolean o;
    public String p;
    public Bundle r;
    public String u;
    public final boolean v;
    public final Notification w;
    public final ArrayList x;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean k = true;
    public boolean q = false;
    public int s = 0;
    public int t = 0;

    public o48(Context context, String str) {
        Notification notification = new Notification();
        this.w = notification;
        this.a = context;
        this.u = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.x = new ArrayList();
        this.v = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final void a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.b.add(new k48(i, charSequence, pendingIntent));
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        String y;
        oaa oaaVar = new oaa(this);
        o48 o48Var = (o48) oaaVar.d;
        c3e c3eVar = o48Var.l;
        if (c3eVar != null) {
            c3eVar.m(oaaVar);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) oaaVar.c;
        if (i >= 26) {
            build = builder.build();
        } else {
            build = builder.build();
        }
        if (c3eVar != null) {
            o48Var.l.getClass();
        }
        if (c3eVar != null && (bundle = build.extras) != null && (y = c3eVar.y()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", y);
        }
        return build;
    }

    public final void d(int i, boolean z) {
        Notification notification = this.w;
        if (z) {
            notification.flags = i | notification.flags;
            return;
        }
        notification.flags = (~i) & notification.flags;
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void f(c3e c3eVar) {
        if (this.l != c3eVar) {
            this.l = c3eVar;
            if (((o48) c3eVar.a) != this) {
                c3eVar.a = this;
                f(c3eVar);
            }
        }
    }
}
