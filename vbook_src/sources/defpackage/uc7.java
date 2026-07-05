package defpackage;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uc7  reason: default package */
/* loaded from: classes.dex */
public final class uc7 {
    public static final Object b = new Object();
    public static uc7 c;
    public qu1 a;

    public static uc7 b() {
        boolean z;
        uc7 uc7Var;
        synchronized (b) {
            if (c != null) {
                z = true;
            } else {
                z = false;
            }
            am8.u("MlKitContext has not been initialized", z);
            uc7Var = c;
            am8.s(uc7Var);
        }
        return uc7Var;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [uc7, java.lang.Object] */
    public static uc7 c(Context context, Executor executor) {
        boolean z;
        uc7 uc7Var;
        synchronized (b) {
            if (c == null) {
                z = true;
            } else {
                z = false;
            }
            am8.u("MlKitContext is already initialized", z);
            ?? obj = new Object();
            c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList o = new kw5(10, context, new mce(MlKitComponentDiscoveryService.class)).o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            vm1 vm1Var = ju1.j;
            arrayList.addAll(o);
            arrayList2.add(pt1.c(context, Context.class, new Class[0]));
            arrayList2.add(pt1.c(obj, uc7.class, new Class[0]));
            qu1 qu1Var = new qu1(executor, arrayList, arrayList2, vm1Var);
            obj.a = qu1Var;
            qu1Var.u(true);
            uc7Var = c;
        }
        return uc7Var;
    }

    public final Object a(Class cls) {
        boolean z;
        if (c == this) {
            z = true;
        } else {
            z = false;
        }
        am8.u("MlKitContext has been deleted", z);
        am8.s(this.a);
        return this.a.a(cls);
    }
}
