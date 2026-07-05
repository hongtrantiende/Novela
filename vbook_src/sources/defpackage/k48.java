package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k48  reason: default package */
/* loaded from: classes.dex */
public final class k48 {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public k48(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat d;
        if (i == 0) {
            d = null;
        } else {
            d = IconCompat.d(i);
        }
        Bundle bundle = new Bundle();
        this.d = true;
        this.b = d;
        if (d != null && d.g() == 2) {
            this.e = d.e();
        }
        this.f = o48.c(charSequence);
        this.g = pendingIntent;
        this.a = bundle;
        this.c = true;
        this.d = true;
    }
}
