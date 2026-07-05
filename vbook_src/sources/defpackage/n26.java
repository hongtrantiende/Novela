package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n26  reason: default package */
/* loaded from: classes.dex */
public final class n26 {
    public static final /* synthetic */ r76[] d;
    public final String a;
    public final ThreadLocal b;
    public final ng2 c;

    static {
        q89 q89Var = new q89(n26.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        cm9.a.getClass();
        d = new r76[]{q89Var};
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [m26] */
    public n26(Context context, String str) {
        context.getClass();
        this.a = str;
        this.b = new ThreadLocal();
        this.c = (ng2) nmd.E(str, new bp9(new xt4(this) { // from class: m26
            public final /* synthetic */ n26 b;

            {
                this.b = this;
            }

            @Override // defpackage.xt4
            public final Object invoke(Object obj) {
                int i = r2;
                n26 n26Var = this.b;
                switch (i) {
                    case 0:
                        u82 u82Var = (u82) obj;
                        u82Var.getClass();
                        String g = cm9.a(n26.class).g();
                        Log.w(g, "CorruptionException in " + n26Var.a + " DataStore running in process " + Process.myPid(), u82Var);
                        return new pv7(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = n26Var.a;
                        LinkedHashSet linkedHashSet = xga.a;
                        linkedHashSet.getClass();
                        return tl1.A(new wga(context2, str2, yga.a, new py4(linkedHashSet, null, 1), new u7(3, 7, (m42) null)));
                }
            }
        }, 0), new xt4(this) { // from class: m26
            public final /* synthetic */ n26 b;

            {
                this.b = this;
            }

            @Override // defpackage.xt4
            public final Object invoke(Object obj) {
                int i = r2;
                n26 n26Var = this.b;
                switch (i) {
                    case 0:
                        u82 u82Var = (u82) obj;
                        u82Var.getClass();
                        String g = cm9.a(n26.class).g();
                        Log.w(g, "CorruptionException in " + n26Var.a + " DataStore running in process " + Process.myPid(), u82Var);
                        return new pv7(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = n26Var.a;
                        LinkedHashSet linkedHashSet = xga.a;
                        linkedHashSet.getClass();
                        return tl1.A(new wga(context2, str2, yga.a, new py4(linkedHashSet, null, 1), new u7(3, 7, (m42) null)));
                }
            }
        }, 8).a(d[0], context);
    }

    public final void a(xt4 xt4Var) {
        pv7 pv7Var = (pv7) z87.C(gs3.a, new c95(this, xt4Var, (m42) null, 11));
    }
}
