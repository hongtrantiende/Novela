package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements gv5 {
    @Override // defpackage.gv5
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ep4, yp3] */
    @Override // defpackage.gv5
    public final Object b(Context context) {
        Object obj;
        ?? yp3Var = new yp3(new lv2(context, 1));
        yp3Var.a = 1;
        if (cq3.k == null) {
            synchronized (cq3.j) {
                try {
                    if (cq3.k == null) {
                        cq3.k = new cq3(yp3Var);
                    }
                } finally {
                }
            }
        }
        ij1 C = ij1.C(context);
        C.getClass();
        synchronized (ij1.f) {
            try {
                obj = ((HashMap) C.b).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = C.v(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        xn6 k = ((un6) obj).k();
        k.a(new dq3(this, k));
        return Boolean.TRUE;
    }
}
