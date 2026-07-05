package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static wc lambda$getComponents$0(du1 du1Var) {
        qf4 qf4Var = (qf4) du1Var.a(qf4.class);
        Context context = (Context) du1Var.a(Context.class);
        r7b r7bVar = (r7b) du1Var.a(r7b.class);
        am8.s(qf4Var);
        am8.s(context);
        am8.s(r7bVar);
        am8.s(context.getApplicationContext());
        if (xc.c == null) {
            synchronized (xc.class) {
                try {
                    if (xc.c == null) {
                        Bundle bundle = new Bundle(1);
                        qf4Var.a();
                        if ("[DEFAULT]".equals(qf4Var.b)) {
                            ((hx3) r7bVar).a(f73.d, iv8.b);
                            bundle.putBoolean("dataCollectionDefaultEnabled", qf4Var.j());
                        }
                        xc.c = new xc(qke.c(context, bundle).b);
                    }
                } finally {
                }
            }
        }
        return xc.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pt1> getComponents() {
        ot1 b = pt1.b(wc.class);
        b.a(x13.b(qf4.class));
        b.a(x13.b(Context.class));
        b.a(x13.b(r7b.class));
        b.f = jf8.b;
        b.c(2);
        return Arrays.asList(b.b(), rte.l("fire-analytics", "23.2.0"));
    }
}
