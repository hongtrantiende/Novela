package defpackage;

import android.os.Bundle;
import java.util.HashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jge  reason: default package */
/* loaded from: classes.dex */
public final class jge implements rwe {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jge(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rwe
    public final void a(String str, String str2, Bundle bundle, long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                rwa rwaVar = (rwa) obj;
                if (((HashSet) rwaVar.b).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    ts5 ts5Var = gde.a;
                    String r = bce.r(str2, ctd.i, ctd.d);
                    if (r != null) {
                        str2 = r;
                    }
                    bundle2.putString("events", str2);
                    ((s6f) rwaVar.c).H(2, bundle2);
                    return;
                }
                return;
            default:
                if (str != null && !gde.a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((s6f) ((k57) obj).b).H(3, bundle3);
                    return;
                }
                return;
        }
    }
}
