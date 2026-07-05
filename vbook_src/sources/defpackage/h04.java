package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h04  reason: default package */
/* loaded from: classes.dex */
public final class h04 {
    public final WeakReference a;
    public final f04 b;
    public final /* synthetic */ i04 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.function.IntConsumer, f04] */
    public h04(i04 i04Var, Context context) {
        this.c = i04Var;
        this.a = new WeakReference(context);
        ?? r0 = new IntConsumer() { // from class: f04
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                i04 i04Var2 = h04.this.c;
                if (i04Var2.k0) {
                    return;
                }
                i04Var2.J(1, Integer.valueOf(i), 19);
            }
        };
        this.b = r0;
        context.registerDeviceIdChangeListener(new g04(i04Var.u.a(i04Var.s, null), 0), r0);
    }

    public static void a(h04 h04Var) {
        Context context = (Context) h04Var.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(h04Var.b);
    }
}
