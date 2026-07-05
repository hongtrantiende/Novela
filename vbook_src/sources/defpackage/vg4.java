package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vg4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vg4 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ vg4(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                File o = bbe.o(context, "firebaseSessions/sessionConfigsDataStore.data");
                wg4.c(o);
                return o;
            default:
                File o2 = bbe.o(context, "firebaseSessions/sessionDataStore.data");
                wg4.c(o2);
                return o2;
        }
    }
}
