package defpackage;

import android.content.Context;
import android.os.Bundle;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vwe  reason: default package */
/* loaded from: classes.dex */
public final class vwe {
    public final Context a;
    public final Boolean b;
    public final long c;
    public final xge d;
    public final boolean e;
    public final Long f;
    public final Long g;
    public final String h;

    public vwe(Context context, xge xgeVar, Long l, Long l2) {
        this.e = true;
        am8.s(context);
        Context applicationContext = context.getApplicationContext();
        am8.s(applicationContext);
        this.a = applicationContext;
        this.f = l;
        this.g = l2;
        if (xgeVar != null) {
            this.d = xgeVar;
            this.e = xgeVar.c;
            this.c = xgeVar.b;
            this.h = xgeVar.e;
            Bundle bundle = xgeVar.d;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
