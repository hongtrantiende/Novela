package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yud  reason: default package */
/* loaded from: classes.dex */
public final class yud extends ovd {
    public final Context a;
    public final /* synthetic */ uz4 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yud(defpackage.uz4 r2, android.content.Context r3) {
        /*
            r1 = this;
            r1.b = r2
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto Ld
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r2 = android.os.Looper.myLooper()
        L11:
            r0 = 0
            r1.<init>(r2, r0)
            android.content.Context r2 = r3.getApplicationContext()
            r1.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yud.<init>(uz4, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = vz4.a;
        uz4 uz4Var = this.b;
        Context context = this.a;
        int c = uz4Var.c(context, i2);
        int i3 = s05.e;
        if (c != 1 && c != 2 && c != 3 && c != 9) {
            return;
        }
        Intent a = uz4Var.a(context, "n", c);
        if (a == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(context, 0, a, 201326592);
        }
        uz4Var.h(context, c, activity);
    }
}
