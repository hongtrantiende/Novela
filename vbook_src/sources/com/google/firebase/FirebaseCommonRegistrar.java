package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        ot1 b = pt1.b(ty2.class);
        b.a(new x13(2, 0, sc0.class));
        b.f = new ls2(13);
        arrayList.add(b.b());
        mf9 mf9Var = new mf9(ag0.class, Executor.class);
        ot1 ot1Var = new ot1(cu2.class, new Class[]{k55.class, l55.class});
        ot1Var.a(x13.b(Context.class));
        ot1Var.a(x13.b(qf4.class));
        ot1Var.a(new x13(2, 0, j55.class));
        ot1Var.a(new x13(1, 1, ty2.class));
        ot1Var.a(new x13(mf9Var, 1, 0));
        ot1Var.f = new au2(mf9Var, 0);
        arrayList.add(ot1Var.b());
        arrayList.add(rte.l("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(rte.l("fire-core", "22.1.0"));
        arrayList.add(rte.l("device-name", a(Build.PRODUCT)));
        arrayList.add(rte.l("device-model", a(Build.DEVICE)));
        arrayList.add(rte.l("device-brand", a(Build.BRAND)));
        arrayList.add(rte.n("android-target-sdk", new fb4(3)));
        arrayList.add(rte.n("android-min-sdk", new fb4(4)));
        arrayList.add(rte.n("android-platform", new fb4(5)));
        arrayList.add(rte.n("android-installer", new fb4(6)));
        try {
            x96.b.getClass();
            str = "2.4.0";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(rte.l("kotlin", str));
        }
        return arrayList;
    }
}
