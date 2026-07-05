package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: swd  reason: default package */
/* loaded from: classes.dex */
public abstract class swd {
    public static final kj a = new kj("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        uwd.C(context).D();
        Set set = qud.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            synchronized (yz4.N) {
                try {
                    yz4 yz4Var = yz4.O;
                    if (yz4Var != null) {
                        yz4Var.E.incrementAndGet();
                        ovd ovdVar = yz4Var.J;
                        ovdVar.sendMessageAtFrontOfQueue(ovdVar.obtainMessage(10));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ((qud) it.next()).getClass();
        cp8.q();
    }
}
