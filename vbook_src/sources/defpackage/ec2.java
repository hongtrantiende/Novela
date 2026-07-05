package defpackage;

import android.os.CancellationSignal;
import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ec2  reason: default package */
/* loaded from: classes.dex */
public final class ec2 {
    public static boolean a(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            if (cancellationSignal.isCanceled()) {
                Log.i("PlayServicesImpl", "the flow has been canceled");
                return true;
            }
            return false;
        }
        Log.i("PlayServicesImpl", "No cancellationSignal found");
        return false;
    }

    public static void b(CancellationSignal cancellationSignal, vt4 vt4Var) {
        if (!a(cancellationSignal)) {
            vt4Var.invoke();
        }
    }
}
